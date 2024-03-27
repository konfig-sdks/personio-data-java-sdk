# DocumentsApi

All URIs are relative to *https://api.personio.de/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCategories**](DocumentsApi.md#getCategories) | **GET** /company/document-categories |  |
| [**uploadForEmployees**](DocumentsApi.md#uploadForEmployees) | **POST** /company/documents |  |


<a name="getCategories"></a>
# **getCategories**
> DocumentCategoriesResponse getCategories().xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).execute();



This endpoint is responsible for fetching all document categories of the company. The result contains a list of document categories.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
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
    try {
      DocumentCategoriesResponse result = client
              .documents
              .getCategories()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentCategoriesResponse> response = client
              .documents
              .getCategories()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getCategories");
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

### Return type

[**DocumentCategoriesResponse**](DocumentCategoriesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="uploadForEmployees"></a>
# **uploadForEmployees**
> DocumentUploadSuccessResponse uploadForEmployees(title, employeeId, categoryId, _file).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).comment(comment).date(date).documentUploadRequest(documentUploadRequest).execute();



This endpoint is responsible for uploading documents for the company employees.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
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
    String title = "title_example"; // Title of the document. Maximum length is 255 characters.
    Integer employeeId = 56; // Employee identifier
    Integer categoryId = 56; // Document Category identifier
    File _file = new File("/path/to/file"); // The document that shall be uploaded to an employees profile. Maximum file size is 30MB.
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    String comment = "comment_example"; // Optional comment that can be added to the uploaded document.
    LocalDate date = LocalDate.now(); // Optional date can be added to the uploaded document. Must follow the format: Y-m-d
    try {
      DocumentUploadSuccessResponse result = client
              .documents
              .uploadForEmployees(title, employeeId, categoryId, _file)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .comment(comment)
              .date(date)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadForEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentUploadSuccessResponse> response = client
              .documents
              .uploadForEmployees(title, employeeId, categoryId, _file)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .comment(comment)
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadForEmployees");
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
| **title** | **String**| Title of the document. Maximum length is 255 characters. | |
| **employeeId** | **Integer**| Employee identifier | |
| **categoryId** | **Integer**| Document Category identifier | |
| **_file** | **File**| The document that shall be uploaded to an employees profile. Maximum file size is 30MB. | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |
| **comment** | **String**| Optional comment that can be added to the uploaded document. | [optional] |
| **date** | **LocalDate**| Optional date can be added to the uploaded document. Must follow the format: Y-m-d | [optional] |
| **documentUploadRequest** | [**DocumentUploadRequest**](DocumentUploadRequest.md)| Data necessary for document upload. | [optional] |

### Return type

[**DocumentUploadSuccessResponse**](DocumentUploadSuccessResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The document was successfully uploaded to the employees profile |  -  |

