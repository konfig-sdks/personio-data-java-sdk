# AttendancesApi

All URIs are relative to *https://api.personio.de/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMultipleAttendances**](AttendancesApi.md#createMultipleAttendances) | **POST** /company/attendances |  |
| [**deleteData**](AttendancesApi.md#deleteData) | **DELETE** /company/attendances/{id} |  |
| [**getList**](AttendancesApi.md#getList) | **GET** /company/attendances |  |
| [**updateAttendanceData**](AttendancesApi.md#updateAttendanceData) | **PATCH** /company/attendances/{id} |  |


<a name="createMultipleAttendances"></a>
# **createMultipleAttendances**
> NewAttendancePeriodResponse createMultipleAttendances(attendanceCreateRequest).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).execute();



This endpoint is responsible for adding attendance data for the company employees. It is possible to add attendances for one or many employees at the same time. The payload sent on the request should be a list of attendance periods, in the form of an array containing attendance period objects.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendancesApi;
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
    List<AttendanceCreateRequestAttendancesInner> attendances = Arrays.asList();
    Boolean skipApproval = true; // Optional, default value is true. If set to false, the approval status of the attendance period will be \\\"pending\\\" if an approval rule is set for the attendances type. The respective approval flow will be triggered.
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    try {
      NewAttendancePeriodResponse result = client
              .attendances
              .createMultipleAttendances()
              .attendances(attendances)
              .skipApproval(skipApproval)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendancesApi#createMultipleAttendances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NewAttendancePeriodResponse> response = client
              .attendances
              .createMultipleAttendances()
              .attendances(attendances)
              .skipApproval(skipApproval)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendancesApi#createMultipleAttendances");
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
| **attendanceCreateRequest** | [**AttendanceCreateRequest**](AttendanceCreateRequest.md)| List of attendance periods to create | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |

### Return type

[**NewAttendancePeriodResponse**](NewAttendancePeriodResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The attendance periods are successfully created |  -  |

<a name="deleteData"></a>
# **deleteData**
> DeletedAttendanceResponse deleteData(id).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).skipApproval(skipApproval).execute();



This endpoint is responsible for deleting attendance data for the company employees.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendancesApi;
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
    Integer id = 56; // ID of the attendance period to delete
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    Boolean skipApproval = true; // Optional, default value is true. If set to false, the approval status of the attendance period will be \"pending\" if an approval rule is set for the attendances type. The respective approval flow will be triggered.
    try {
      DeletedAttendanceResponse result = client
              .attendances
              .deleteData(id)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .skipApproval(skipApproval)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendancesApi#deleteData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeletedAttendanceResponse> response = client
              .attendances
              .deleteData(id)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .skipApproval(skipApproval)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendancesApi#deleteData");
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
| **id** | **Integer**| ID of the attendance period to delete | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |
| **skipApproval** | **Boolean**| Optional, default value is true. If set to false, the approval status of the attendance period will be \&quot;pending\&quot; if an approval rule is set for the attendances type. The respective approval flow will be triggered. | [optional] [default to true] |

### Return type

[**DeletedAttendanceResponse**](DeletedAttendanceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |

<a name="getList"></a>
# **getList**
> AttendancePeriodsResponse getList(startDate, endDate).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).updatedFrom(updatedFrom).updatedTo(updatedTo).includePending(includePending).employees(employees).limit(limit).offset(offset).execute();



Fetch attendance data for the company employees. The result can be &#x60;paginated&#x60; and &#x60;filtered&#x60; by period, the date and/or time they were updated, and/or specific employee/employees. The result contains a list of attendances.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendancesApi;
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
    LocalDate startDate = LocalDate.now(); // First day of the period to be queried. It is inclusive, so the day specified as start_date will also be considered on the results
    LocalDate endDate = LocalDate.now(); // Last day of the period to be queried. It is inclusive, so the day specified as end_date will also be considered on the results.
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    String updatedFrom = "updatedFrom_example"; // Datetime from when the queried periods have been updated. Same format as updated_at. It is inclusive, so the day specified as updated_from will also be considered on the results. Can be just the date, or the date and the time, with or without the timezone.
    String updatedTo = "updatedTo_example"; // Datetime until when the queried periods have been updated. Same format as updated_at. It is inclusive, so the day specified as updated_to will also be considered on the results. Can be just the date, or the date and the time, with or without the timezone.
    Boolean includePending = true; // Returns AttendancePeriods with a status of pending, rejected and confirmed. For pending periods, the end_date attribute is nullable. The status of each period is included in the response.
    List<Integer> employees = Arrays.asList(); // A list of Personio employee ID's to filter the results. The result filters including only attendances of provided employees.
    Integer limit = 200; // Pagination attribute to limit how many attendances are per page
    Integer offset = 0; // The offset from the first record that would be returned. With 3 results [A, B, C] and an offset of 1, the following two results will be returned [B, C].
    try {
      AttendancePeriodsResponse result = client
              .attendances
              .getList(startDate, endDate)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .updatedFrom(updatedFrom)
              .updatedTo(updatedTo)
              .includePending(includePending)
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
      System.err.println("Exception when calling AttendancesApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttendancePeriodsResponse> response = client
              .attendances
              .getList(startDate, endDate)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .updatedFrom(updatedFrom)
              .updatedTo(updatedTo)
              .includePending(includePending)
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
      System.err.println("Exception when calling AttendancesApi#getList");
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
| **startDate** | **LocalDate**| First day of the period to be queried. It is inclusive, so the day specified as start_date will also be considered on the results | |
| **endDate** | **LocalDate**| Last day of the period to be queried. It is inclusive, so the day specified as end_date will also be considered on the results. | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |
| **updatedFrom** | **String**| Datetime from when the queried periods have been updated. Same format as updated_at. It is inclusive, so the day specified as updated_from will also be considered on the results. Can be just the date, or the date and the time, with or without the timezone. | [optional] |
| **updatedTo** | **String**| Datetime until when the queried periods have been updated. Same format as updated_at. It is inclusive, so the day specified as updated_to will also be considered on the results. Can be just the date, or the date and the time, with or without the timezone. | [optional] |
| **includePending** | **Boolean**| Returns AttendancePeriods with a status of pending, rejected and confirmed. For pending periods, the end_date attribute is nullable. The status of each period is included in the response. | [optional] |
| **employees** | [**List&lt;Integer&gt;**](Integer.md)| A list of Personio employee ID&#39;s to filter the results. The result filters including only attendances of provided employees. | [optional] |
| **limit** | **Integer**| Pagination attribute to limit how many attendances are per page | [optional] [default to 200] |
| **offset** | **Integer**| The offset from the first record that would be returned. With 3 results [A, B, C] and an offset of 1, the following two results will be returned [B, C]. | [optional] [default to 0] |

### Return type

[**AttendancePeriodsResponse**](AttendancePeriodsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Attendance periods matching the provided filters |  -  |

<a name="updateAttendanceData"></a>
# **updateAttendanceData**
> UpdatedAttendanceResponse updateAttendanceData(id, attendanceUpdateRequest).xPersonioPartnerID(xPersonioPartnerID).xPersonioAppID(xPersonioAppID).execute();



This endpoint is responsible for updating attendance data for the company employees. Attributes are not required and if not specified, the current value will be used. It is not possible to change the employee id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PersonioData;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendancesApi;
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
    Integer id = 56; // ID of the attendance period to update
    LocalDate date = LocalDate.now();
    String startTime = "startTime_example"; // Format: hh:mm
    String endTime = "endTime_example"; // Format: hh:mm
    Integer _break = 56;
    String comment = "comment_example";
    Integer projectId = 56;
    Boolean skipApproval = true; // Optional, default value is true. If set to false, the approval status of the attendance period will be \\\"pending\\\" if an approval rule is set for the attendances type. The respective approval flow will be triggered.
    String xPersonioPartnerID = "xPersonioPartnerID_example"; // The partner identifier
    String xPersonioAppID = "xPersonioAppID_example"; // The application identifier
    try {
      UpdatedAttendanceResponse result = client
              .attendances
              .updateAttendanceData(id)
              .date(date)
              .startTime(startTime)
              .endTime(endTime)
              ._break(_break)
              .comment(comment)
              .projectId(projectId)
              .skipApproval(skipApproval)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendancesApi#updateAttendanceData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdatedAttendanceResponse> response = client
              .attendances
              .updateAttendanceData(id)
              .date(date)
              .startTime(startTime)
              .endTime(endTime)
              ._break(_break)
              .comment(comment)
              .projectId(projectId)
              .skipApproval(skipApproval)
              .xPersonioPartnerID(xPersonioPartnerID)
              .xPersonioAppID(xPersonioAppID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendancesApi#updateAttendanceData");
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
| **id** | **Integer**| ID of the attendance period to update | |
| **attendanceUpdateRequest** | [**AttendanceUpdateRequest**](AttendanceUpdateRequest.md)| Attendance period data to update. At least one of the properties (&#x60;date&#x60;, &#x60;start_time&#x60;, &#x60;end_time&#x60;, &#x60;break&#x60;, &#x60;comment&#x60;, &#x60;project_id&#x60;, &#x60;skip_approval&#x60;) is required. | |
| **xPersonioPartnerID** | **String**| The partner identifier | [optional] |
| **xPersonioAppID** | **String**| The application identifier | [optional] |

### Return type

[**UpdatedAttendanceResponse**](UpdatedAttendanceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |

