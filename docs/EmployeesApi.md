# EmployeesApi

All URIs are relative to *https://api.personio.de/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmployee**](EmployeesApi.md#createEmployee) | **POST** /company/employees | Create an employee |
| [**getAbsenceBalance**](EmployeesApi.md#getAbsenceBalance) | **GET** /company/employees/{employee_id}/absences/balance |  |
| [**getCustomAttributes**](EmployeesApi.md#getCustomAttributes) | **GET** /company/employees/custom-attributes |  |
| [**getList**](EmployeesApi.md#getList) | **GET** /company/employees |  |
| [**listAttributes**](EmployeesApi.md#listAttributes) | **GET** /company/employees/attributes |  |
| [**showById**](EmployeesApi.md#showById) | **GET** /company/employees/{employee_id} |  |
| [**showProfilePicture**](EmployeesApi.md#showProfilePicture) | **GET** /company/employees/{employee_id}/profile-picture/{width} |  |
| [**updateEmployeeFields**](EmployeesApi.md#updateEmployeeFields) | **PATCH** /company/employees/{employee_id} | Update an employee |


<a name="createEmployee"></a>
# **createEmployee**
> EmployeeCreatedResponse createEmployee().xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).employeesCreateEmployeeRequest(employeesCreateEmployeeRequest).execute();

Create an employee

Creates a new employee. If the employee&#39;s status is not provided, it will be set based on the &#x60;hire_date&#x60; value - if it is in the past, status will be &#x60;active&#x60;, otherwise &#x60;onboarding&#x60;. This endpoint responds with the &#x60;id&#x60; of the created employee in case of success. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    EmployeesCreateEmployeeRequestEmployee employee = new EmployeesCreateEmployeeRequestEmployee();
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    try {
      EmployeeCreatedResponse result = client
              .employees
              .createEmployee()
              .employee(employee)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeCreatedResponse> response = client
              .employees
              .createEmployee()
              .employee(employee)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createEmployee");
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
| **employeesCreateEmployeeRequest** | [**EmployeesCreateEmployeeRequest**](EmployeesCreateEmployeeRequest.md)|  | [optional] |

### Return type

[**EmployeeCreatedResponse**](EmployeeCreatedResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful creation of a employee |  -  |

<a name="getAbsenceBalance"></a>
# **getAbsenceBalance**
> EmployeeAbsenceBalance getAbsenceBalance(employeeId).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).execute();



Retrieve the absence balance for a specific employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    Integer employeeId = 56; // Numeric `id` of the employee
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    try {
      EmployeeAbsenceBalance result = client
              .employees
              .getAbsenceBalance(employeeId)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getAbsenceBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeAbsenceBalance> response = client
              .employees
              .getAbsenceBalance(employeeId)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getAbsenceBalance");
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
| **employeeId** | **Integer**| Numeric &#x60;id&#x60; of the employee | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |

### Return type

[**EmployeeAbsenceBalance**](EmployeeAbsenceBalance.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getCustomAttributes"></a>
# **getCustomAttributes**
> getCustomAttributes().xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).execute();



This endpoint is an alias for &#x60;/company/employees/attributes&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
      client
              .employees
              .getCustomAttributes()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getCustomAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employees
              .getCustomAttributes()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getCustomAttributes");
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

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Please refer to &#x60;/company/employees/attributes&#x60; |  -  |

<a name="getList"></a>
# **getList**
> EmployeesResponse getList().xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).limit(limit).offset(offset).email(email).attributes(attributes).updatedSince(updatedSince).execute();



List Company Employees

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    Integer limit = 10; // Pagination attribute to limit the number of employees returned per page.
    Integer offset = 0; // Pagination attribute to identify the first item in the collection to return.
    String email = "email_example"; // Find an employee with the given email address. The response is still a list, containing only the filtered employee. NOTE: when using the updated_since filter, the email filter is ignored.
    List<String> attributes = Arrays.asList(); // A list of attributes that will be returned for the employees, ie. a projection of the employee fields and relationships. In case `updated_since` query parameter is used, this list will additionally be used to exclude the employees that had none of the provided `attributes[]` updated since `updated_since`, ie. a selection filter.
    String updatedSince = "2022-12-24T08:15:30.000Z"; // Filter to select and return only the employees that have been updated after `updated_since`. When it is used together with the `attributes[]` query parameter, the filter will select only the employees that have had any of the provided `attributes[]` updated since `updated_since`. The format is `ISO 8601` (2022-12-24T08:15:30). NOTE: when using the `updated_since` filter, the `email`, `limit`, and `offset` parameters are ignored. <details> <summary><b>Examples with <code>updated_since</code> and <code>attributes[]</code>:</b></summary><br /> In an example company that has 17 employees:<br /><br /> <details>   <summary>   <code class=\"language-html\">?updated_since=2022-12-24T08:15:30</code>   will yield 10 employees that were recently updated:   </summary> <p><pre class=\"prettyprint\"><code language=\"json\" class=\"language-json\"> {   \"success\": true,   \"metadata\": {     \"total_elements\": 10,     \"current_page\": 0,     \"total_pages\": 10   },   \"offset\": 0,   \"limit\": 1,   \"data\": [     {       \"type\": \"Employee\",       \"attributes\": {         \"id\": {           \"label\": \"ID\",           \"value\": 1,           \"type\": \"integer\",           \"universal_id\": \"id\"         },         \"first_name\": {           \"label\": \"First name\",           \"value\": \"Alexander\",           \"type\": \"standard\",           \"universal_id\": \"first_name\"         },         \"last_name\": {           \"label\": \"Last name\",           \"value\": \"Bergmann\",           \"type\": \"standard\",           \"universal_id\": \"last_name\"         },         \"email\": {           \"label\": \"Email\",           \"value\": \"alexander.bergmann@demo.com\",           \"type\": \"standard\",           \"universal_id\": \"email\"         }       }     }, ...   ],   ...   ... } </code></pre></p> </details><br /> <details>   <summary>   <code class=\"language-html\">?attributes[]=first_name</code>   will yield all 17 employees:   </summary> <p><pre class=\"prettyprint\"><code language=\"json\" class=\"language-json\"> {   \"success\": true,   \"metadata\": {     \"total_elements\": 17,     \"current_page\": 0,     \"total_pages\": 17   },   \"offset\": 0,   \"limit\": 1,   \"data\": [     {       \"type\": \"Employee\",       \"attributes\": {         \"id\": {           \"label\": \"ID\",           \"value\": 1,           \"type\": \"integer\",           \"universal_id\": \"id\"         },         \"first_name\": {           \"label\": \"First name\",           \"value\": \"Alexander\",           \"type\": \"standard\",           \"universal_id\": \"first_name\"         }       }     }   ] } </code></pre></p> </details><br /> <details>   <summary>   <code class=\"language-html\">?attributes[]=first_name&updated_since=2022-12-24T08:15:30</code>   will yield 3 employees, ones that had their <code>first_name</code> changed since <code>2022-12-24T08:15:30</code>:   </summary> <p><pre class=\"prettyprint\"><code language=\"json\" class=\"language-json\"> {   \"success\": true,   \"metadata\": {     \"total_elements\": 3,     \"current_page\": 0,     \"total_pages\": 3   },   \"offset\": 0,   \"limit\": 1,   \"data\": [     {       \"type\": \"Employee\",       \"attributes\": {         \"id\": {           \"label\": \"ID\",           \"value\": 1,           \"type\": \"integer\",           \"universal_id\": \"id\"         },         \"first_name\": {           \"label\": \"First name\",           \"value\": \"Alexander\",           \"type\": \"standard\",           \"universal_id\": \"first_name\"         }       }     }   ] } </code></pre></p> </details> </details>
    try {
      EmployeesResponse result = client
              .employees
              .getList()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .limit(limit)
              .offset(offset)
              .email(email)
              .attributes(attributes)
              .updatedSince(updatedSince)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
      System.out.println(result.getMetadata());
      System.out.println(result.getOffset());
      System.out.println(result.getLimit());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesResponse> response = client
              .employees
              .getList()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .limit(limit)
              .offset(offset)
              .email(email)
              .attributes(attributes)
              .updatedSince(updatedSince)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getList");
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
| **limit** | **Integer**| Pagination attribute to limit the number of employees returned per page. | [optional] [default to 10] |
| **offset** | **Integer**| Pagination attribute to identify the first item in the collection to return. | [optional] [default to 0] |
| **email** | **String**| Find an employee with the given email address. The response is still a list, containing only the filtered employee. NOTE: when using the updated_since filter, the email filter is ignored. | [optional] |
| **attributes** | [**List&lt;String&gt;**](String.md)| A list of attributes that will be returned for the employees, ie. a projection of the employee fields and relationships. In case &#x60;updated_since&#x60; query parameter is used, this list will additionally be used to exclude the employees that had none of the provided &#x60;attributes[]&#x60; updated since &#x60;updated_since&#x60;, ie. a selection filter. | [optional] |
| **updatedSince** | **String**| Filter to select and return only the employees that have been updated after &#x60;updated_since&#x60;. When it is used together with the &#x60;attributes[]&#x60; query parameter, the filter will select only the employees that have had any of the provided &#x60;attributes[]&#x60; updated since &#x60;updated_since&#x60;. The format is &#x60;ISO 8601&#x60; (2022-12-24T08:15:30). NOTE: when using the &#x60;updated_since&#x60; filter, the &#x60;email&#x60;, &#x60;limit&#x60;, and &#x60;offset&#x60; parameters are ignored. &lt;details&gt; &lt;summary&gt;&lt;b&gt;Examples with &lt;code&gt;updated_since&lt;/code&gt; and &lt;code&gt;attributes[]&lt;/code&gt;:&lt;/b&gt;&lt;/summary&gt;&lt;br /&gt; In an example company that has 17 employees:&lt;br /&gt;&lt;br /&gt; &lt;details&gt;   &lt;summary&gt;   &lt;code class&#x3D;\&quot;language-html\&quot;&gt;?updated_since&#x3D;2022-12-24T08:15:30&lt;/code&gt;   will yield 10 employees that were recently updated:   &lt;/summary&gt; &lt;p&gt;&lt;pre class&#x3D;\&quot;prettyprint\&quot;&gt;&lt;code language&#x3D;\&quot;json\&quot; class&#x3D;\&quot;language-json\&quot;&gt; {   \&quot;success\&quot;: true,   \&quot;metadata\&quot;: {     \&quot;total_elements\&quot;: 10,     \&quot;current_page\&quot;: 0,     \&quot;total_pages\&quot;: 10   },   \&quot;offset\&quot;: 0,   \&quot;limit\&quot;: 1,   \&quot;data\&quot;: [     {       \&quot;type\&quot;: \&quot;Employee\&quot;,       \&quot;attributes\&quot;: {         \&quot;id\&quot;: {           \&quot;label\&quot;: \&quot;ID\&quot;,           \&quot;value\&quot;: 1,           \&quot;type\&quot;: \&quot;integer\&quot;,           \&quot;universal_id\&quot;: \&quot;id\&quot;         },         \&quot;first_name\&quot;: {           \&quot;label\&quot;: \&quot;First name\&quot;,           \&quot;value\&quot;: \&quot;Alexander\&quot;,           \&quot;type\&quot;: \&quot;standard\&quot;,           \&quot;universal_id\&quot;: \&quot;first_name\&quot;         },         \&quot;last_name\&quot;: {           \&quot;label\&quot;: \&quot;Last name\&quot;,           \&quot;value\&quot;: \&quot;Bergmann\&quot;,           \&quot;type\&quot;: \&quot;standard\&quot;,           \&quot;universal_id\&quot;: \&quot;last_name\&quot;         },         \&quot;email\&quot;: {           \&quot;label\&quot;: \&quot;Email\&quot;,           \&quot;value\&quot;: \&quot;alexander.bergmann@demo.com\&quot;,           \&quot;type\&quot;: \&quot;standard\&quot;,           \&quot;universal_id\&quot;: \&quot;email\&quot;         }       }     }, ...   ],   ...   ... } &lt;/code&gt;&lt;/pre&gt;&lt;/p&gt; &lt;/details&gt;&lt;br /&gt; &lt;details&gt;   &lt;summary&gt;   &lt;code class&#x3D;\&quot;language-html\&quot;&gt;?attributes[]&#x3D;first_name&lt;/code&gt;   will yield all 17 employees:   &lt;/summary&gt; &lt;p&gt;&lt;pre class&#x3D;\&quot;prettyprint\&quot;&gt;&lt;code language&#x3D;\&quot;json\&quot; class&#x3D;\&quot;language-json\&quot;&gt; {   \&quot;success\&quot;: true,   \&quot;metadata\&quot;: {     \&quot;total_elements\&quot;: 17,     \&quot;current_page\&quot;: 0,     \&quot;total_pages\&quot;: 17   },   \&quot;offset\&quot;: 0,   \&quot;limit\&quot;: 1,   \&quot;data\&quot;: [     {       \&quot;type\&quot;: \&quot;Employee\&quot;,       \&quot;attributes\&quot;: {         \&quot;id\&quot;: {           \&quot;label\&quot;: \&quot;ID\&quot;,           \&quot;value\&quot;: 1,           \&quot;type\&quot;: \&quot;integer\&quot;,           \&quot;universal_id\&quot;: \&quot;id\&quot;         },         \&quot;first_name\&quot;: {           \&quot;label\&quot;: \&quot;First name\&quot;,           \&quot;value\&quot;: \&quot;Alexander\&quot;,           \&quot;type\&quot;: \&quot;standard\&quot;,           \&quot;universal_id\&quot;: \&quot;first_name\&quot;         }       }     }   ] } &lt;/code&gt;&lt;/pre&gt;&lt;/p&gt; &lt;/details&gt;&lt;br /&gt; &lt;details&gt;   &lt;summary&gt;   &lt;code class&#x3D;\&quot;language-html\&quot;&gt;?attributes[]&#x3D;first_name&amp;updated_since&#x3D;2022-12-24T08:15:30&lt;/code&gt;   will yield 3 employees, ones that had their &lt;code&gt;first_name&lt;/code&gt; changed since &lt;code&gt;2022-12-24T08:15:30&lt;/code&gt;:   &lt;/summary&gt; &lt;p&gt;&lt;pre class&#x3D;\&quot;prettyprint\&quot;&gt;&lt;code language&#x3D;\&quot;json\&quot; class&#x3D;\&quot;language-json\&quot;&gt; {   \&quot;success\&quot;: true,   \&quot;metadata\&quot;: {     \&quot;total_elements\&quot;: 3,     \&quot;current_page\&quot;: 0,     \&quot;total_pages\&quot;: 3   },   \&quot;offset\&quot;: 0,   \&quot;limit\&quot;: 1,   \&quot;data\&quot;: [     {       \&quot;type\&quot;: \&quot;Employee\&quot;,       \&quot;attributes\&quot;: {         \&quot;id\&quot;: {           \&quot;label\&quot;: \&quot;ID\&quot;,           \&quot;value\&quot;: 1,           \&quot;type\&quot;: \&quot;integer\&quot;,           \&quot;universal_id\&quot;: \&quot;id\&quot;         },         \&quot;first_name\&quot;: {           \&quot;label\&quot;: \&quot;First name\&quot;,           \&quot;value\&quot;: \&quot;Alexander\&quot;,           \&quot;type\&quot;: \&quot;standard\&quot;,           \&quot;universal_id\&quot;: \&quot;first_name\&quot;         }       }     }   ] } &lt;/code&gt;&lt;/pre&gt;&lt;/p&gt; &lt;/details&gt; &lt;/details&gt; | [optional] |

### Return type

[**EmployeesResponse**](EmployeesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listAttributes"></a>
# **listAttributes**
> EmployeesListAttributesResponse listAttributes().xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).execute();



Lists all the allowed atrributes per API credentials including custom (dynamic) attributes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
      EmployeesListAttributesResponse result = client
              .employees
              .listAttributes()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#listAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesListAttributesResponse> response = client
              .employees
              .listAttributes()
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#listAttributes");
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

[**EmployeesListAttributesResponse**](EmployeesListAttributesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="showById"></a>
# **showById**
> EmployeeResponse showById(employeeId).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).execute();



Show employee by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    Integer employeeId = 56; // Numeric `id` of the employee
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    try {
      EmployeeResponse result = client
              .employees
              .showById(employeeId)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#showById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeResponse> response = client
              .employees
              .showById(employeeId)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#showById");
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
| **employeeId** | **Integer**| Numeric &#x60;id&#x60; of the employee | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |

### Return type

[**EmployeeResponse**](EmployeeResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="showProfilePicture"></a>
# **showProfilePicture**
> File showProfilePicture(employeeId, width).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).execute();



Show employee&#39;s profile picture. If profile picture is missing, the 404 error will be thrown. The &#x60;Profile Picture&#x60; attribute has to be whitelisted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    Integer employeeId = 56; // Numeric `id` of the employee
    Integer width = 56; // Width of the image. Default is original size
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    try {
      File result = client
              .employees
              .showProfilePicture(employeeId, width)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#showProfilePicture");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .employees
              .showProfilePicture(employeeId, width)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#showProfilePicture");
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
| **employeeId** | **Integer**| Numeric &#x60;id&#x60; of the employee | |
| **width** | **Integer**| Width of the image. Default is original size | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |

### Return type

[**File**](File.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateEmployeeFields"></a>
# **updateEmployeeFields**
> EmployeeUpdatedResponse updateEmployeeFields(employeeId).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).employeesUpdateEmployeeFieldsRequest(employeesUpdateEmployeeFieldsRequest).execute();

Update an employee

Updates an existing employee. Note: Only the fields that are listed in the body example are updatable. Attributes that are not part of the sample request body but are present inside the request are ignored. It&#39;s not possible to update the Email field. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    Integer employeeId = 56; // Numeric `id` of the employee
    EmployeesUpdateEmployeeFieldsRequestEmployee employee = new EmployeesUpdateEmployeeFieldsRequestEmployee();
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    try {
      EmployeeUpdatedResponse result = client
              .employees
              .updateEmployeeFields(employeeId)
              .employee(employee)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateEmployeeFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeUpdatedResponse> response = client
              .employees
              .updateEmployeeFields(employeeId)
              .employee(employee)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateEmployeeFields");
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
| **employeeId** | **Integer**| Numeric &#x60;id&#x60; of the employee | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |
| **employeesUpdateEmployeeFieldsRequest** | [**EmployeesUpdateEmployeeFieldsRequest**](EmployeesUpdateEmployeeFieldsRequest.md)|  | [optional] |

### Return type

[**EmployeeUpdatedResponse**](EmployeeUpdatedResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Employee is updated |  -  |

