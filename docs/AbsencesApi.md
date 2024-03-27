# AbsencesApi

All URIs are relative to *https://api.personio.de/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAbsenceData**](AbsencesApi.md#addAbsenceData) | **POST** /company/time-offs |  |
| [**addAbsencePeriodsData**](AbsencesApi.md#addAbsencePeriodsData) | **POST** /company/absence-periods |  |
| [**deleteAbsenceData**](AbsencesApi.md#deleteAbsenceData) | **DELETE** /company/time-offs/{id} |  |
| [**deletePeriodData**](AbsencesApi.md#deletePeriodData) | **DELETE** /company/absence-periods/{id} |  |
| [**getAbsencePeriod**](AbsencesApi.md#getAbsencePeriod) | **GET** /company/time-offs/{id} |  |
| [**getAbsencePeriods**](AbsencesApi.md#getAbsencePeriods) | **GET** /company/time-offs |  |
| [**getHourlyPeriods**](AbsencesApi.md#getHourlyPeriods) | **GET** /company/absence-periods |  |
| [**listTimeOffTypes**](AbsencesApi.md#listTimeOffTypes) | **GET** /company/time-off-types |  |


<a name="addAbsenceData"></a>
# **addAbsenceData**
> AbsencesAddAbsenceDataResponse addAbsenceData(employeeId, timeOffTypeId, startDate, endDate, halfDayStart, halfDayEnd, createTimeOffPeriodRequest).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).comment(comment).skipApproval(skipApproval).execute();



Adds absence data for absence types with **time unit** set to **days**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.personio.de/v1";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    PersonioData client = new PersonioData(configuration);
    Integer employeeId = 56; // Employee identifier
    Integer timeOffTypeId = 56; // Time-off type identifier
    LocalDate startDate = LocalDate.now(); // Absence start date. Format: yyyy-mm-dd
    LocalDate endDate = LocalDate.now(); // Absence end date. Format: yyyy-mm-dd
    Boolean halfDayStart = true; // Whether the start date is a half-day off.
    Boolean halfDayEnd = true; // Whether the end date is a half-day off.
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    String comment = "comment_example"; // Optional comment
    Boolean skipApproval = true; // Optional, default value is true. If set to false, the approval status of the absence request will be \\\"pending\\\" if an approval rule is set for the absence type in Personio. The respective approval flow will be triggered.
    try {
      AbsencesAddAbsenceDataResponse result = client
              .absences
              .addAbsenceData(employeeId, timeOffTypeId, startDate, endDate, halfDayStart, halfDayEnd)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .comment(comment)
              .skipApproval(skipApproval)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#addAbsenceData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsencesAddAbsenceDataResponse> response = client
              .absences
              .addAbsenceData(employeeId, timeOffTypeId, startDate, endDate, halfDayStart, halfDayEnd)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .comment(comment)
              .skipApproval(skipApproval)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#addAbsenceData");
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
| **employeeId** | **Integer**| Employee identifier | |
| **timeOffTypeId** | **Integer**| Time-off type identifier | |
| **startDate** | **LocalDate**| Absence start date. Format: yyyy-mm-dd | |
| **endDate** | **LocalDate**| Absence end date. Format: yyyy-mm-dd | |
| **halfDayStart** | **Boolean**| Whether the start date is a half-day off. | |
| **halfDayEnd** | **Boolean**| Whether the end date is a half-day off. | |
| **createTimeOffPeriodRequest** | [**CreateTimeOffPeriodRequest**](CreateTimeOffPeriodRequest.md)| Absence data | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |
| **comment** | **String**| Optional comment | [optional] |
| **skipApproval** | **Boolean**| Optional, default value is true. If set to false, the approval status of the absence request will be \\\&quot;pending\\\&quot; if an approval rule is set for the absence type in Personio. The respective approval flow will be triggered. | [optional] |

### Return type

[**AbsencesAddAbsenceDataResponse**](AbsencesAddAbsenceDataResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The absence period is successfully created |  -  |

<a name="addAbsencePeriodsData"></a>
# **addAbsencePeriodsData**
> AbsencesAddAbsencePeriodsDataResponse addAbsencePeriodsData(employeeId, timeOffTypeId, startDate, endDate, createAbsencePeriodRequest).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).startTime(startTime).endTime(endTime).halfDayStart(halfDayStart).halfDayEnd(halfDayEnd).comment(comment).skipApproval(skipApproval).execute();



Adds absence data for absence types with **time unit** set to **hours**. Note that creating periods for absence types with certificate requirement enabled is not supported!

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.personio.de/v1";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    PersonioData client = new PersonioData(configuration);
    Integer employeeId = 56; // Employee identifier
    Integer timeOffTypeId = 56; // Time-off type identifier
    LocalDate startDate = LocalDate.now(); // Absence start date. Format: yyyy-mm-dd
    LocalDate endDate = LocalDate.now(); // Absence end date. Format: yyyy-mm-dd
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    LocalDate startTime = LocalDate.now(); // Absence start time. Format: HH:mm (hours and minutes) and only required if the start_date and end_date are the same (partial-day absence)
    LocalDate endTime = LocalDate.now(); // Absence end time. Format: HH:mm (hours and minutes) and only required if the start_date and end_date are the same (partial-day absence)
    Boolean halfDayStart = true; // Whether the start date is a half-day off, only considered if the start_date and end_date are not the same (more than one day absence)
    Boolean halfDayEnd = true; // Whether the end date is a half-day off, only considered if the start_date and end_date are not the same (more than one day absence)
    String comment = "comment_example"; // Optional comment
    Boolean skipApproval = true; // Optional, default value is true. If set to false, the approval status of the absence request will be \\\"pending\\\" if an approval rule is set for the absence type in Personio. The respective approval flow will be triggered.
    try {
      AbsencesAddAbsencePeriodsDataResponse result = client
              .absences
              .addAbsencePeriodsData(employeeId, timeOffTypeId, startDate, endDate)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .startTime(startTime)
              .endTime(endTime)
              .halfDayStart(halfDayStart)
              .halfDayEnd(halfDayEnd)
              .comment(comment)
              .skipApproval(skipApproval)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#addAbsencePeriodsData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsencesAddAbsencePeriodsDataResponse> response = client
              .absences
              .addAbsencePeriodsData(employeeId, timeOffTypeId, startDate, endDate)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .startTime(startTime)
              .endTime(endTime)
              .halfDayStart(halfDayStart)
              .halfDayEnd(halfDayEnd)
              .comment(comment)
              .skipApproval(skipApproval)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#addAbsencePeriodsData");
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
| **employeeId** | **Integer**| Employee identifier | |
| **timeOffTypeId** | **Integer**| Time-off type identifier | |
| **startDate** | **LocalDate**| Absence start date. Format: yyyy-mm-dd | |
| **endDate** | **LocalDate**| Absence end date. Format: yyyy-mm-dd | |
| **createAbsencePeriodRequest** | [**CreateAbsencePeriodRequest**](CreateAbsencePeriodRequest.md)| Absence data | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |
| **startTime** | **LocalDate**| Absence start time. Format: HH:mm (hours and minutes) and only required if the start_date and end_date are the same (partial-day absence) | [optional] |
| **endTime** | **LocalDate**| Absence end time. Format: HH:mm (hours and minutes) and only required if the start_date and end_date are the same (partial-day absence) | [optional] |
| **halfDayStart** | **Boolean**| Whether the start date is a half-day off, only considered if the start_date and end_date are not the same (more than one day absence) | [optional] |
| **halfDayEnd** | **Boolean**| Whether the end date is a half-day off, only considered if the start_date and end_date are not the same (more than one day absence) | [optional] |
| **comment** | **String**| Optional comment | [optional] |
| **skipApproval** | **Boolean**| Optional, default value is true. If set to false, the approval status of the absence request will be \\\&quot;pending\\\&quot; if an approval rule is set for the absence type in Personio. The respective approval flow will be triggered. | [optional] |

### Return type

[**AbsencesAddAbsencePeriodsDataResponse**](AbsencesAddAbsencePeriodsDataResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The absence period was successfully created |  -  |

<a name="deleteAbsenceData"></a>
# **deleteAbsenceData**
> DeletedAbsenceResponse deleteAbsenceData(id).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).execute();



Deletes absence period data for absence types with **time unit** set to **days**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.personio.de/v1";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    PersonioData client = new PersonioData(configuration);
    Integer id = 56; // ID of the absence period to delete
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    try {
      DeletedAbsenceResponse result = client
              .absences
              .deleteAbsenceData(id)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#deleteAbsenceData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeletedAbsenceResponse> response = client
              .absences
              .deleteAbsenceData(id)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#deleteAbsenceData");
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
| **id** | **Integer**| ID of the absence period to delete | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |

### Return type

[**DeletedAbsenceResponse**](DeletedAbsenceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |

<a name="deletePeriodData"></a>
# **deletePeriodData**
> DeletedAbsenceResponse deletePeriodData(id).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).execute();



Deletes absence period data for absence types with **time unit** set to **hours**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.personio.de/v1";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    PersonioData client = new PersonioData(configuration);
    UUID id = UUID.fromString("61fe126b-a7b3-449a-b5ee-3865a6fcc546"); // ID of the absence period to delete
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    try {
      DeletedAbsenceResponse result = client
              .absences
              .deletePeriodData(id)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#deletePeriodData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeletedAbsenceResponse> response = client
              .absences
              .deletePeriodData(id)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#deletePeriodData");
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
| **id** | **UUID**| ID of the absence period to delete | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |

### Return type

[**DeletedAbsenceResponse**](DeletedAbsenceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |

<a name="getAbsencePeriod"></a>
# **getAbsencePeriod**
> AbsencePeriodResponse getAbsencePeriod(id).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).execute();



Gets an absence period for absences with **time unit** set to **days**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.personio.de/v1";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    PersonioData client = new PersonioData(configuration);
    Integer id = 56; // Numeric `id` of the absence period
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    try {
      AbsencePeriodResponse result = client
              .absences
              .getAbsencePeriod(id)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#getAbsencePeriod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsencePeriodResponse> response = client
              .absences
              .getAbsencePeriod(id)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#getAbsencePeriod");
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
| **id** | **Integer**| Numeric &#x60;id&#x60; of the absence period | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |

### Return type

[**AbsencePeriodResponse**](AbsencePeriodResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getAbsencePeriods"></a>
# **getAbsencePeriods**
> AbsencePeriodsResponse getAbsencePeriods().xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).startDate(startDate).endDate(endDate).updatedFrom(updatedFrom).updatedTo(updatedTo).employees(employees).limit(limit).offset(offset).execute();



Fetches absence periods for absences with **time unit** set to **days**. The result can be &#x60;paginated&#x60; and &#x60;filtered&#x60; by period and/or specific employee/employees. The result contains a list of absence periods.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.personio.de/v1";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    PersonioData client = new PersonioData(configuration);
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    LocalDate startDate = LocalDate.now(); // First day of the period to be queried. It is inclusive, so the result starts from and including the provided `start_date`
    LocalDate endDate = LocalDate.now(); // Last day of the period to be queried. It is inclusive, so the result ends on `end_date` including absences from the `end_date`
    LocalDate updatedFrom = LocalDate.now(); // Query the periods that created or modified from the date `updated_from`. It is inclusive, so all the periods created or modified from the beginning of the `updated_from` will be included in the results
    LocalDate updatedTo = LocalDate.now(); // Query the periods that created or modified until the date `updated_to`. It is inclusive, so all the periods created or modified until the end of the `updated_to` will be included in the results
    List<Integer> employees = Arrays.asList(); // A list of Personio employee ID's to filter the results. The result filters including only absences of provided employees
    Integer limit = 200; // Pagination attribute to limit the number of absence periods per page
    Integer offset = 0; // Pagination attribute to identify which page number you are requesting
    try {
      AbsencePeriodsResponse result = client
              .absences
              .getAbsencePeriods()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .startDate(startDate)
              .endDate(endDate)
              .updatedFrom(updatedFrom)
              .updatedTo(updatedTo)
              .employees(employees)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
      System.out.println(result.getMetadata());
      System.out.println(result.getOffset());
      System.out.println(result.getLimit());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#getAbsencePeriods");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsencePeriodsResponse> response = client
              .absences
              .getAbsencePeriods()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .startDate(startDate)
              .endDate(endDate)
              .updatedFrom(updatedFrom)
              .updatedTo(updatedTo)
              .employees(employees)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#getAbsencePeriods");
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
| **startDate** | **LocalDate**| First day of the period to be queried. It is inclusive, so the result starts from and including the provided &#x60;start_date&#x60; | [optional] |
| **endDate** | **LocalDate**| Last day of the period to be queried. It is inclusive, so the result ends on &#x60;end_date&#x60; including absences from the &#x60;end_date&#x60; | [optional] |
| **updatedFrom** | **LocalDate**| Query the periods that created or modified from the date &#x60;updated_from&#x60;. It is inclusive, so all the periods created or modified from the beginning of the &#x60;updated_from&#x60; will be included in the results | [optional] |
| **updatedTo** | **LocalDate**| Query the periods that created or modified until the date &#x60;updated_to&#x60;. It is inclusive, so all the periods created or modified until the end of the &#x60;updated_to&#x60; will be included in the results | [optional] |
| **employees** | [**List&lt;Integer&gt;**](Integer.md)| A list of Personio employee ID&#39;s to filter the results. The result filters including only absences of provided employees | [optional] |
| **limit** | **Integer**| Pagination attribute to limit the number of absence periods per page | [optional] [default to 200] |
| **offset** | **Integer**| Pagination attribute to identify which page number you are requesting | [optional] [default to 0] |

### Return type

[**AbsencePeriodsResponse**](AbsencePeriodsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getHourlyPeriods"></a>
# **getHourlyPeriods**
> HourlyAbsencePeriodsResponse getHourlyPeriods().xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).startDate(startDate).endDate(endDate).updatedFrom(updatedFrom).updatedTo(updatedTo).employees(employees).absenceTypes(absenceTypes).absencePeriods(absencePeriods).limit(limit).offset(offset).execute();



Fetches absence periods for absences with **time unit** set to **hours**. The result can be &#x60;paginated&#x60; and &#x60;filtered&#x60; by period and/or specific employee/employees. The result contains a list of hourly absence periods.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.personio.de/v1";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    PersonioData client = new PersonioData(configuration);
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    LocalDate startDate = LocalDate.now(); // Filter by absence periods that start at or before given date.
    LocalDate endDate = LocalDate.now(); // Filter by absence periods that start at or before given date.
    OffsetDateTime updatedFrom = OffsetDateTime.now(); // Filter by periods that were created or modified from the date updated_from. It is inclusive, so all the periods created or modified from the beginning of the updated_from will be included in the results.
    OffsetDateTime updatedTo = OffsetDateTime.now(); // Filter by periods that were created or modified until the date updated_to. It is inclusive, so all the periods created or modified until the end of the updated_to will be included in the results.
    List<Integer> employees = Arrays.asList(); // A list of Personio employee ID's to filter the results. The result filters including only absences of provided employees
    List<String> absenceTypes = Arrays.asList(); // A list of Personio absence type IDs to filter the results. The result filters including only absences of provided absence types.
    List<String> absencePeriods = Arrays.asList(); // A list of Personio absence period IDs to filter the results. The result filters including only absences containing the provided ids.
    Integer limit = 200; // Pagination attribute to limit how many absence periods are returned per page.
    Integer offset = 0; // Pagination attribute to identify which page you are requesting, by the form of telling an offset from the first record that would be returned.
    try {
      HourlyAbsencePeriodsResponse result = client
              .absences
              .getHourlyPeriods()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .startDate(startDate)
              .endDate(endDate)
              .updatedFrom(updatedFrom)
              .updatedTo(updatedTo)
              .employees(employees)
              .absenceTypes(absenceTypes)
              .absencePeriods(absencePeriods)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
      System.out.println(result.getMetadata());
      System.out.println(result.getOffset());
      System.out.println(result.getLimit());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#getHourlyPeriods");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HourlyAbsencePeriodsResponse> response = client
              .absences
              .getHourlyPeriods()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .startDate(startDate)
              .endDate(endDate)
              .updatedFrom(updatedFrom)
              .updatedTo(updatedTo)
              .employees(employees)
              .absenceTypes(absenceTypes)
              .absencePeriods(absencePeriods)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#getHourlyPeriods");
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
| **startDate** | **LocalDate**| Filter by absence periods that start at or before given date. | [optional] |
| **endDate** | **LocalDate**| Filter by absence periods that start at or before given date. | [optional] |
| **updatedFrom** | **OffsetDateTime**| Filter by periods that were created or modified from the date updated_from. It is inclusive, so all the periods created or modified from the beginning of the updated_from will be included in the results. | [optional] |
| **updatedTo** | **OffsetDateTime**| Filter by periods that were created or modified until the date updated_to. It is inclusive, so all the periods created or modified until the end of the updated_to will be included in the results. | [optional] |
| **employees** | [**List&lt;Integer&gt;**](Integer.md)| A list of Personio employee ID&#39;s to filter the results. The result filters including only absences of provided employees | [optional] |
| **absenceTypes** | [**List&lt;String&gt;**](String.md)| A list of Personio absence type IDs to filter the results. The result filters including only absences of provided absence types. | [optional] |
| **absencePeriods** | [**List&lt;String&gt;**](String.md)| A list of Personio absence period IDs to filter the results. The result filters including only absences containing the provided ids. | [optional] |
| **limit** | **Integer**| Pagination attribute to limit how many absence periods are returned per page. | [optional] [default to 200] |
| **offset** | **Integer**| Pagination attribute to identify which page you are requesting, by the form of telling an offset from the first record that would be returned. | [optional] [default to 0] |

### Return type

[**HourlyAbsencePeriodsResponse**](HourlyAbsencePeriodsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listTimeOffTypes"></a>
# **listTimeOffTypes**
> AbsencesListTimeOffTypesResponse listTimeOffTypes().xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).limit(limit).offset(offset).execute();



Provides a list of absence types for absences **time unit** set to either **days** or **hours**. For example &#39;Paid vacation&#39;, &#39;Parental leave&#39; or &#39;Home office&#39;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.personio.de/v1";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    PersonioData client = new PersonioData(configuration);
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    Integer limit = 200; // Pagination attribute to limit how many records will be returned per page
    Integer offset = 0; // Pagination attribute to identify which page you are requesting, by the form of telling an offset from the first record that would be returned.
    try {
      AbsencesListTimeOffTypesResponse result = client
              .absences
              .listTimeOffTypes()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#listTimeOffTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsencesListTimeOffTypesResponse> response = client
              .absences
              .listTimeOffTypes()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#listTimeOffTypes");
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
| **limit** | **Integer**| Pagination attribute to limit how many records will be returned per page | [optional] [default to 200] |
| **offset** | **Integer**| Pagination attribute to identify which page you are requesting, by the form of telling an offset from the first record that would be returned. | [optional] [default to 0] |

### Return type

[**AbsencesListTimeOffTypesResponse**](AbsencesListTimeOffTypesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

