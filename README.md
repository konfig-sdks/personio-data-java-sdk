<div align="left">

[![Visit Personio](./header.png)](https://personio.com)

# [Personio](https://personio.com)

API for reading and writing personnel data including data about attendances, absences, documents, etc

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Personio&serviceName=Data&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>personio-data-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:personio-data-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/personio-data-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.personio.de/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbsencesApi* | [**addAbsenceData**](docs/AbsencesApi.md#addAbsenceData) | **POST** /company/time-offs | 
*AbsencesApi* | [**addAbsencePeriodsData**](docs/AbsencesApi.md#addAbsencePeriodsData) | **POST** /company/absence-periods | 
*AbsencesApi* | [**deleteAbsenceData**](docs/AbsencesApi.md#deleteAbsenceData) | **DELETE** /company/time-offs/{id} | 
*AbsencesApi* | [**deletePeriodData**](docs/AbsencesApi.md#deletePeriodData) | **DELETE** /company/absence-periods/{id} | 
*AbsencesApi* | [**getAbsencePeriod**](docs/AbsencesApi.md#getAbsencePeriod) | **GET** /company/time-offs/{id} | 
*AbsencesApi* | [**getAbsencePeriods**](docs/AbsencesApi.md#getAbsencePeriods) | **GET** /company/time-offs | 
*AbsencesApi* | [**getHourlyPeriods**](docs/AbsencesApi.md#getHourlyPeriods) | **GET** /company/absence-periods | 
*AbsencesApi* | [**listTimeOffTypes**](docs/AbsencesApi.md#listTimeOffTypes) | **GET** /company/time-off-types | 
*AttendancesApi* | [**createMultipleAttendances**](docs/AttendancesApi.md#createMultipleAttendances) | **POST** /company/attendances | 
*AttendancesApi* | [**deleteData**](docs/AttendancesApi.md#deleteData) | **DELETE** /company/attendances/{id} | 
*AttendancesApi* | [**getList**](docs/AttendancesApi.md#getList) | **GET** /company/attendances | 
*AttendancesApi* | [**updateAttendanceData**](docs/AttendancesApi.md#updateAttendanceData) | **PATCH** /company/attendances/{id} | 
*CustomReportsApi* | [**getColumnLabels**](docs/CustomReportsApi.md#getColumnLabels) | **GET** /company/custom-reports/columns | 
*CustomReportsApi* | [**getData**](docs/CustomReportsApi.md#getData) | **GET** /company/custom-reports/reports/{report_id} | 
*CustomReportsApi* | [**getMetadata**](docs/CustomReportsApi.md#getMetadata) | **GET** /company/custom-reports/reports | 
*DocumentsApi* | [**getCategories**](docs/DocumentsApi.md#getCategories) | **GET** /company/document-categories | 
*DocumentsApi* | [**uploadForEmployees**](docs/DocumentsApi.md#uploadForEmployees) | **POST** /company/documents | 
*EmployeesApi* | [**createEmployee**](docs/EmployeesApi.md#createEmployee) | **POST** /company/employees | Create an employee
*EmployeesApi* | [**getAbsenceBalance**](docs/EmployeesApi.md#getAbsenceBalance) | **GET** /company/employees/{employee_id}/absences/balance | 
*EmployeesApi* | [**getCustomAttributes**](docs/EmployeesApi.md#getCustomAttributes) | **GET** /company/employees/custom-attributes | 
*EmployeesApi* | [**getList**](docs/EmployeesApi.md#getList) | **GET** /company/employees | 
*EmployeesApi* | [**listAttributes**](docs/EmployeesApi.md#listAttributes) | **GET** /company/employees/attributes | 
*EmployeesApi* | [**showById**](docs/EmployeesApi.md#showById) | **GET** /company/employees/{employee_id} | 
*EmployeesApi* | [**showProfilePicture**](docs/EmployeesApi.md#showProfilePicture) | **GET** /company/employees/{employee_id}/profile-picture/{width} | 
*EmployeesApi* | [**updateEmployeeFields**](docs/EmployeesApi.md#updateEmployeeFields) | **PATCH** /company/employees/{employee_id} | Update an employee
*ProjectsApi* | [**createProject**](docs/ProjectsApi.md#createProject) | **POST** /company/attendances/projects | 
*ProjectsApi* | [**deleteProject**](docs/ProjectsApi.md#deleteProject) | **DELETE** /company/attendances/projects/{id} | 
*ProjectsApi* | [**getAll**](docs/ProjectsApi.md#getAll) | **GET** /company/attendances/projects | 
*ProjectsApi* | [**updateData**](docs/ProjectsApi.md#updateData) | **PATCH** /company/attendances/projects/{id} | 


## Documentation for Models

 - [Absence](docs/Absence.md)
 - [AbsenceCertificate](docs/AbsenceCertificate.md)
 - [AbsenceEntitlement](docs/AbsenceEntitlement.md)
 - [AbsenceEntitlementValueInner](docs/AbsenceEntitlementValueInner.md)
 - [AbsenceEntitlementValueInnerAttributes](docs/AbsenceEntitlementValueInnerAttributes.md)
 - [AbsenceOverviewAttribute](docs/AbsenceOverviewAttribute.md)
 - [AbsencePeriodAttribute](docs/AbsencePeriodAttribute.md)
 - [AbsencePeriodBreakdown](docs/AbsencePeriodBreakdown.md)
 - [AbsencePeriodResponse](docs/AbsencePeriodResponse.md)
 - [AbsencePeriodResponseAllOf](docs/AbsencePeriodResponseAllOf.md)
 - [AbsencePeriodsResponse](docs/AbsencePeriodsResponse.md)
 - [AbsencePeriodsResponseAllOf](docs/AbsencePeriodsResponseAllOf.md)
 - [AbsencePeriodsResponseAllOfData](docs/AbsencePeriodsResponseAllOfData.md)
 - [AbsenceTimeOffType](docs/AbsenceTimeOffType.md)
 - [AbsenceTimeOffTypeAttributes](docs/AbsenceTimeOffTypeAttributes.md)
 - [AbsenceType](docs/AbsenceType.md)
 - [AbsencesAddAbsenceDataResponse](docs/AbsencesAddAbsenceDataResponse.md)
 - [AbsencesAddAbsencePeriodsDataResponse](docs/AbsencesAddAbsencePeriodsDataResponse.md)
 - [AbsencesListTimeOffTypesResponse](docs/AbsencesListTimeOffTypesResponse.md)
 - [Attendance](docs/Attendance.md)
 - [AttendanceCreateRequest](docs/AttendanceCreateRequest.md)
 - [AttendanceCreateRequestAttendancesInner](docs/AttendanceCreateRequestAttendancesInner.md)
 - [AttendancePeriodsResponse](docs/AttendancePeriodsResponse.md)
 - [AttendancePeriodsResponseAllOf](docs/AttendancePeriodsResponseAllOf.md)
 - [AttendancePeriodsResponseAllOfData](docs/AttendancePeriodsResponseAllOfData.md)
 - [AttendanceProject](docs/AttendanceProject.md)
 - [AttendanceProjectAttributes](docs/AttendanceProjectAttributes.md)
 - [AttendanceUpdateRequest](docs/AttendanceUpdateRequest.md)
 - [CompensationAttribute](docs/CompensationAttribute.md)
 - [CostCenter](docs/CostCenter.md)
 - [CostCenterAttribute](docs/CostCenterAttribute.md)
 - [CostCenterHistoricalAttribute](docs/CostCenterHistoricalAttribute.md)
 - [CostCenters](docs/CostCenters.md)
 - [CostCentersValueInner](docs/CostCentersValueInner.md)
 - [CostCentersValueInnerAttributes](docs/CostCentersValueInnerAttributes.md)
 - [CreateAbsencePeriodRequest](docs/CreateAbsencePeriodRequest.md)
 - [CreateTimeOffPeriodRequest](docs/CreateTimeOffPeriodRequest.md)
 - [CustomReportsErrorResponse](docs/CustomReportsErrorResponse.md)
 - [DECAOPTKSAttribute](docs/DECAOPTKSAttribute.md)
 - [DECAOPTKSAttribute1](docs/DECAOPTKSAttribute1.md)
 - [DECSHistoricalAttribute](docs/DECSHistoricalAttribute.md)
 - [DefaultAttribute](docs/DefaultAttribute.md)
 - [DefaultAttributeCostCentersInner](docs/DefaultAttributeCostCentersInner.md)
 - [DefaultAttributePerformanceTargetsInner](docs/DefaultAttributePerformanceTargetsInner.md)
 - [DefaultHistoricalAttribute](docs/DefaultHistoricalAttribute.md)
 - [DeletedAbsenceResponse](docs/DeletedAbsenceResponse.md)
 - [DeletedAbsenceResponseData](docs/DeletedAbsenceResponseData.md)
 - [DeletedAttendanceResponse](docs/DeletedAttendanceResponse.md)
 - [DeletedAttendanceResponseData](docs/DeletedAttendanceResponseData.md)
 - [Department](docs/Department.md)
 - [DepartmentValue](docs/DepartmentValue.md)
 - [DepartmentValueAttributes](docs/DepartmentValueAttributes.md)
 - [DocumentCategoriesResponse](docs/DocumentCategoriesResponse.md)
 - [DocumentCategoriesResponseAllOf](docs/DocumentCategoriesResponseAllOf.md)
 - [DocumentCategory](docs/DocumentCategory.md)
 - [DocumentCategoryAttributes](docs/DocumentCategoryAttributes.md)
 - [DocumentEmployeeResponseObject](docs/DocumentEmployeeResponseObject.md)
 - [DocumentEmployeeResponseObjectEmail](docs/DocumentEmployeeResponseObjectEmail.md)
 - [DocumentEmployeeResponseObjectFirstName](docs/DocumentEmployeeResponseObjectFirstName.md)
 - [DocumentEmployeeResponseObjectId](docs/DocumentEmployeeResponseObjectId.md)
 - [DocumentEmployeeResponseObjectLastName](docs/DocumentEmployeeResponseObjectLastName.md)
 - [DocumentUploadRequest](docs/DocumentUploadRequest.md)
 - [DocumentUploadSuccessResponse](docs/DocumentUploadSuccessResponse.md)
 - [DocumentUploadSuccessResponseAllOf](docs/DocumentUploadSuccessResponseAllOf.md)
 - [DocumentUploadSuccessResponseAllOfData](docs/DocumentUploadSuccessResponseAllOfData.md)
 - [DocumentUploadSuccessResponseAllOfDataAttributes](docs/DocumentUploadSuccessResponseAllOfDataAttributes.md)
 - [DurationAttribute](docs/DurationAttribute.md)
 - [DurationHistoricalAttribute](docs/DurationHistoricalAttribute.md)
 - [Employee](docs/Employee.md)
 - [EmployeeAbsenceBalance](docs/EmployeeAbsenceBalance.md)
 - [EmployeeAbsenceBalanceDataInner](docs/EmployeeAbsenceBalanceDataInner.md)
 - [EmployeeContractEndDate](docs/EmployeeContractEndDate.md)
 - [EmployeeCreatedAt](docs/EmployeeCreatedAt.md)
 - [EmployeeCreatedResponse](docs/EmployeeCreatedResponse.md)
 - [EmployeeCreatedResponseData](docs/EmployeeCreatedResponseData.md)
 - [EmployeeDynamic21827](docs/EmployeeDynamic21827.md)
 - [EmployeeEmail](docs/EmployeeEmail.md)
 - [EmployeeEmploymentType](docs/EmployeeEmploymentType.md)
 - [EmployeeFirstName](docs/EmployeeFirstName.md)
 - [EmployeeFixSalary](docs/EmployeeFixSalary.md)
 - [EmployeeFixSalaryInterval](docs/EmployeeFixSalaryInterval.md)
 - [EmployeeGender](docs/EmployeeGender.md)
 - [EmployeeHireDate](docs/EmployeeHireDate.md)
 - [EmployeeHourlySalary](docs/EmployeeHourlySalary.md)
 - [EmployeeId](docs/EmployeeId.md)
 - [EmployeeLastModifiedAt](docs/EmployeeLastModifiedAt.md)
 - [EmployeeLastName](docs/EmployeeLastName.md)
 - [EmployeeLastWorkingDay](docs/EmployeeLastWorkingDay.md)
 - [EmployeePosition](docs/EmployeePosition.md)
 - [EmployeePreferredName](docs/EmployeePreferredName.md)
 - [EmployeeProbationPeriodEnd](docs/EmployeeProbationPeriodEnd.md)
 - [EmployeeProfilePicture](docs/EmployeeProfilePicture.md)
 - [EmployeeResponse](docs/EmployeeResponse.md)
 - [EmployeeResponseAllOf](docs/EmployeeResponseAllOf.md)
 - [EmployeeStatus](docs/EmployeeStatus.md)
 - [EmployeeTerminationDate](docs/EmployeeTerminationDate.md)
 - [EmployeeTerminationReason](docs/EmployeeTerminationReason.md)
 - [EmployeeTerminationType](docs/EmployeeTerminationType.md)
 - [EmployeeUpdatedResponse](docs/EmployeeUpdatedResponse.md)
 - [EmployeeUpdatedResponseData](docs/EmployeeUpdatedResponseData.md)
 - [EmployeeVacationDayBalance](docs/EmployeeVacationDayBalance.md)
 - [EmployeeWeeklyWorkingHours](docs/EmployeeWeeklyWorkingHours.md)
 - [EmployeesCreateEmployeeRequest](docs/EmployeesCreateEmployeeRequest.md)
 - [EmployeesCreateEmployeeRequest1](docs/EmployeesCreateEmployeeRequest1.md)
 - [EmployeesCreateEmployeeRequestEmployee](docs/EmployeesCreateEmployeeRequestEmployee.md)
 - [EmployeesCreateEmployeeRequestEmployeeCustomAttributes](docs/EmployeesCreateEmployeeRequestEmployeeCustomAttributes.md)
 - [EmployeesListAttributesResponse](docs/EmployeesListAttributesResponse.md)
 - [EmployeesListAttributesResponseDataInner](docs/EmployeesListAttributesResponseDataInner.md)
 - [EmployeesResponse](docs/EmployeesResponse.md)
 - [EmployeesResponseAllOf](docs/EmployeesResponseAllOf.md)
 - [EmployeesResponseAllOfData](docs/EmployeesResponseAllOfData.md)
 - [EmployeesResponseAllOfMetadata](docs/EmployeesResponseAllOfMetadata.md)
 - [EmployeesUpdateEmployeeFieldsRequest](docs/EmployeesUpdateEmployeeFieldsRequest.md)
 - [EmployeesUpdateEmployeeFieldsRequest1](docs/EmployeesUpdateEmployeeFieldsRequest1.md)
 - [EmployeesUpdateEmployeeFieldsRequestEmployee](docs/EmployeesUpdateEmployeeFieldsRequestEmployee.md)
 - [EmployeesUpdateEmployeeFieldsRequestEmployeeCustomAttributes](docs/EmployeesUpdateEmployeeFieldsRequestEmployeeCustomAttributes.md)
 - [EntityAttribute](docs/EntityAttribute.md)
 - [EntityHistoricalAttribute](docs/EntityHistoricalAttribute.md)
 - [ErrorDetails](docs/ErrorDetails.md)
 - [ErrorMeta](docs/ErrorMeta.md)
 - [HolidayCalendar](docs/HolidayCalendar.md)
 - [HolidayCalendarValue](docs/HolidayCalendarValue.md)
 - [HolidayCalendarValueAttributes](docs/HolidayCalendarValueAttributes.md)
 - [HourlyAbsence](docs/HourlyAbsence.md)
 - [HourlyAbsenceCertificate](docs/HourlyAbsenceCertificate.md)
 - [HourlyAbsencePeriodResponse](docs/HourlyAbsencePeriodResponse.md)
 - [HourlyAbsencePeriodResponseAllOf](docs/HourlyAbsencePeriodResponseAllOf.md)
 - [HourlyAbsencePeriodResponseAttributes](docs/HourlyAbsencePeriodResponseAttributes.md)
 - [HourlyAbsencePeriodResponseAttributesCertificate](docs/HourlyAbsencePeriodResponseAttributesCertificate.md)
 - [HourlyAbsencePeriodsResponse](docs/HourlyAbsencePeriodsResponse.md)
 - [HourlyAbsencePeriodsResponseAllOf](docs/HourlyAbsencePeriodsResponseAllOf.md)
 - [HourlyAbsencePeriodsResponseAllOfData](docs/HourlyAbsencePeriodsResponseAllOfData.md)
 - [NewAttendancePeriodParametersRequest](docs/NewAttendancePeriodParametersRequest.md)
 - [NewAttendancePeriodResponse](docs/NewAttendancePeriodResponse.md)
 - [NewAttendancePeriodResponseAllOf](docs/NewAttendancePeriodResponseAllOf.md)
 - [NewAttendancePeriodResponseAllOfData](docs/NewAttendancePeriodResponseAllOfData.md)
 - [Office](docs/Office.md)
 - [OfficeValue](docs/OfficeValue.md)
 - [OfficeValueAttributes](docs/OfficeValueAttributes.md)
 - [PerformanceKpi](docs/PerformanceKpi.md)
 - [PerformanceKpiAttribute](docs/PerformanceKpiAttribute.md)
 - [PerformanceTarget](docs/PerformanceTarget.md)
 - [PerformanceTargetAttribute](docs/PerformanceTargetAttribute.md)
 - [PerformanceTargetKpi](docs/PerformanceTargetKpi.md)
 - [Project](docs/Project.md)
 - [ProjectAttributes](docs/ProjectAttributes.md)
 - [ProjectsCreateProjectRequest](docs/ProjectsCreateProjectRequest.md)
 - [ProjectsCreateProjectResponse](docs/ProjectsCreateProjectResponse.md)
 - [ProjectsGetAllResponse](docs/ProjectsGetAllResponse.md)
 - [ProjectsUpdateDataRequest](docs/ProjectsUpdateDataRequest.md)
 - [ProjectsUpdateDataResponse](docs/ProjectsUpdateDataResponse.md)
 - [PublicColumnAttributes](docs/PublicColumnAttributes.md)
 - [PublicColumnData](docs/PublicColumnData.md)
 - [PublicHistoricalReportItemsAttributes](docs/PublicHistoricalReportItemsAttributes.md)
 - [PublicHistoricalReportItemsAttributesFiltersInner](docs/PublicHistoricalReportItemsAttributesFiltersInner.md)
 - [PublicHistoricalReportItemsAttributesItemsInner](docs/PublicHistoricalReportItemsAttributesItemsInner.md)
 - [PublicListColumnsResponse](docs/PublicListColumnsResponse.md)
 - [PublicListReportsResponse](docs/PublicListReportsResponse.md)
 - [PublicReportAttributes](docs/PublicReportAttributes.md)
 - [PublicReportAttributesFiltersInner](docs/PublicReportAttributesFiltersInner.md)
 - [PublicReportData](docs/PublicReportData.md)
 - [PublicReportItemsAttributes](docs/PublicReportItemsAttributes.md)
 - [PublicReportItemsAttributesFiltersInner](docs/PublicReportItemsAttributesFiltersInner.md)
 - [PublicReportItemsAttributesItemsInner](docs/PublicReportItemsAttributesItemsInner.md)
 - [PublicReportItemsData](docs/PublicReportItemsData.md)
 - [PublicReportMetaData](docs/PublicReportMetaData.md)
 - [PublicReportResponse](docs/PublicReportResponse.md)
 - [PublicTimeframeReportItemsAttributes](docs/PublicTimeframeReportItemsAttributes.md)
 - [PublicTimeframeReportItemsAttributesFiltersInner](docs/PublicTimeframeReportItemsAttributesFiltersInner.md)
 - [PublicTimeframeReportItemsAttributesItemsInner](docs/PublicTimeframeReportItemsAttributesItemsInner.md)
 - [Response](docs/Response.md)
 - [SalaryAttribute](docs/SalaryAttribute.md)
 - [SalaryHistoricalAttribute](docs/SalaryHistoricalAttribute.md)
 - [ShortEmployee](docs/ShortEmployee.md)
 - [ShortEmployeeAttributes](docs/ShortEmployeeAttributes.md)
 - [ShortEmployeeAttributesFirstName](docs/ShortEmployeeAttributesFirstName.md)
 - [ShortEmployeeAttributesId](docs/ShortEmployeeAttributesId.md)
 - [ShortEmployeeAttributesLastName](docs/ShortEmployeeAttributesLastName.md)
 - [Supervisor](docs/Supervisor.md)
 - [Team](docs/Team.md)
 - [TeamValue](docs/TeamValue.md)
 - [TeamValueAttributes](docs/TeamValueAttributes.md)
 - [TimeOffTypeResource](docs/TimeOffTypeResource.md)
 - [TimeOffTypeResourceAttributes](docs/TimeOffTypeResourceAttributes.md)
 - [TypeEnum](docs/TypeEnum.md)
 - [UpdatedAttendanceResponse](docs/UpdatedAttendanceResponse.md)
 - [UpdatedAttendanceResponseData](docs/UpdatedAttendanceResponseData.md)
 - [WorkSchedule](docs/WorkSchedule.md)
 - [WorkScheduleValue](docs/WorkScheduleValue.md)
 - [WorkScheduleValueAttributes](docs/WorkScheduleValueAttributes.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
