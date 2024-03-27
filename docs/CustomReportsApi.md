# CustomReportsApi

All URIs are relative to *https://api.personio.de/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getColumnLabels**](CustomReportsApi.md#getColumnLabels) | **GET** /company/custom-reports/columns |  |
| [**getData**](CustomReportsApi.md#getData) | **GET** /company/custom-reports/reports/{report_id} |  |
| [**getMetadata**](CustomReportsApi.md#getMetadata) | **GET** /company/custom-reports/reports |  |


<a name="getColumnLabels"></a>
# **getColumnLabels**
> PublicListColumnsResponse getColumnLabels().xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).columns(columns).locale(locale).reportId(reportId).execute();



This endpoint provides human-readable labels for report table columns. It is particularly important if you get a report with custom attributes or absence data to match the column IDs to the translation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.personio.de/v1";
    PersonioData client = new PersonioData(configuration);
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    List<String> columns = Arrays.asList(); // The columns to filter the results.
    String locale = "en"; // locale used to translate localized fields.
    String reportId = "eea50309-d1b1-47d6-bc7e-27de7a3ab491"; // The ID of the report to filter the result of the columns. If no ID is passed, all columns for the company are returned.
    try {
      PublicListColumnsResponse result = client
              .customReports
              .getColumnLabels()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .columns(columns)
              .locale(locale)
              .reportId(reportId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getMetadata());
      System.out.println(result.getOffset());
      System.out.println(result.getLimit());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomReportsApi#getColumnLabels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicListColumnsResponse> response = client
              .customReports
              .getColumnLabels()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .columns(columns)
              .locale(locale)
              .reportId(reportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomReportsApi#getColumnLabels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |
| **columns** | [**List&lt;String&gt;**](String.md)| The columns to filter the results. | [optional] |
| **locale** | **String**| locale used to translate localized fields. | [optional] |
| **reportId** | **String**| The ID of the report to filter the result of the columns. If no ID is passed, all columns for the company are returned. | [optional] |

### Return type

[**PublicListColumnsResponse**](PublicListColumnsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="getData"></a>
# **getData**
> PublicReportResponse getData(reportId).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).locale(locale).page(page).limit(limit).execute();



This endpoint provides you with the data of an existing Custom Report.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.personio.de/v1";
    PersonioData client = new PersonioData(configuration);
    String reportId = "eea50309-d1b1-47d6-bc7e-27de7a3ab491"; // The ID of the report to filter the result.
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    String locale = "de"; // locale used to translate localized fields.
    Integer page = 1; // Pagination parameter to identify the page to return.
    Integer limit = 10; // Pagination parameter to limit the number of employees returned per page.
    try {
      PublicReportResponse result = client
              .customReports
              .getData(reportId)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .locale(locale)
              .page(page)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getMetadata());
      System.out.println(result.getOffset());
      System.out.println(result.getLimit());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomReportsApi#getData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicReportResponse> response = client
              .customReports
              .getData(reportId)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .locale(locale)
              .page(page)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomReportsApi#getData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportId** | **String**| The ID of the report to filter the result. | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |
| **locale** | **String**| locale used to translate localized fields. | [optional] |
| **page** | **Integer**| Pagination parameter to identify the page to return. | [optional] |
| **limit** | **Integer**| Pagination parameter to limit the number of employees returned per page. | [optional] |

### Return type

[**PublicReportResponse**](PublicReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="getMetadata"></a>
# **getMetadata**
> PublicListReportsResponse getMetadata().xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).reportIds(reportIds).status(status).execute();



This endpoint provides you with metadata about existing custom reports in your Personio account, such as report name, report type, report date / timeframe.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.personio.de/v1";
    PersonioData client = new PersonioData(configuration);
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    List<String> reportIds = Arrays.asList(); // A list of report ID's to filter the results.
    String status = "up_to_date"; // The status of the report to filter the results.
    try {
      PublicListReportsResponse result = client
              .customReports
              .getMetadata()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .reportIds(reportIds)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getMetadata());
      System.out.println(result.getOffset());
      System.out.println(result.getLimit());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomReportsApi#getMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicListReportsResponse> response = client
              .customReports
              .getMetadata()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .reportIds(reportIds)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomReportsApi#getMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |
| **reportIds** | [**List&lt;String&gt;**](String.md)| A list of report ID&#39;s to filter the results. | [optional] |
| **status** | **String**| The status of the report to filter the results. | [optional] |

### Return type

[**PublicListReportsResponse**](PublicListReportsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

