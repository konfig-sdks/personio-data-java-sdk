# ProjectsApi

All URIs are relative to *https://api.personio.de/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProject**](ProjectsApi.md#createProject) | **POST** /company/attendances/projects |  |
| [**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /company/attendances/projects/{id} |  |
| [**getAll**](ProjectsApi.md#getAll) | **GET** /company/attendances/projects |  |
| [**updateData**](ProjectsApi.md#updateData) | **PATCH** /company/attendances/projects/{id} |  |


<a name="createProject"></a>
# **createProject**
> ProjectsCreateProjectResponse createProject().xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).projectsCreateProjectRequest(projectsCreateProjectRequest).execute();



Creates a project into the company account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    String name = "name_example";
    Boolean active = false;
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    try {
      ProjectsCreateProjectResponse result = client
              .projects
              .createProject(name)
              .active(active)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsCreateProjectResponse> response = client
              .projects
              .createProject(name)
              .active(active)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProject");
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
| **projectsCreateProjectRequest** | [**ProjectsCreateProjectRequest**](ProjectsCreateProjectRequest.md)|  | [optional] |

### Return type

[**ProjectsCreateProjectResponse**](ProjectsCreateProjectResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project created successfully |  -  |

<a name="deleteProject"></a>
# **deleteProject**
> deleteProject(id).execute();



Deletes a project from the company account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    Integer id = 56; // Numeric `id` of the project
    try {
      client
              .projects
              .deleteProject(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .projects
              .deleteProject(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProject");
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
| **id** | **Integer**| Numeric &#x60;id&#x60; of the project | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Project was successfully deleted |  -  |

<a name="getAll"></a>
# **getAll**
> ProjectsGetAllResponse getAll().xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).execute();



Provides a list of all company projects.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
      ProjectsGetAllResponse result = client
              .projects
              .getAll()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsGetAllResponse> response = client
              .projects
              .getAll()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getAll");
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

[**ProjectsGetAllResponse**](ProjectsGetAllResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of projects returned |  -  |

<a name="updateData"></a>
# **updateData**
> ProjectsUpdateDataResponse updateData(id).projectsUpdateDataRequest(projectsUpdateDataRequest).execute();



Updates a project with the given data

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
    Integer id = 56; // Numeric `id` of the project
    String name = "name_example";
    Boolean active = true; // Marks the availability of the project
    try {
      ProjectsUpdateDataResponse result = client
              .projects
              .updateData(id)
              .name(name)
              .active(active)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectsUpdateDataResponse> response = client
              .projects
              .updateData(id)
              .name(name)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateData");
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
| **id** | **Integer**| Numeric &#x60;id&#x60; of the project | |
| **projectsUpdateDataRequest** | [**ProjectsUpdateDataRequest**](ProjectsUpdateDataRequest.md)|  | [optional] |

### Return type

[**ProjectsUpdateDataResponse**](ProjectsUpdateDataResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project updated successfully |  -  |

