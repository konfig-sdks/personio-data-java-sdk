/*
 * Personnel Data
 * API for reading and writing personnel data including data about attendances, absences, documents, etc
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);

        /**
         * For the "type: number" schema we accept both Double and Integer
         * In the case that we pass "1.0" or "1" we serialize the JsonPrimitive
         * as the "1" literal. This is useful when the server expects an integer.
         */
        gsonBuilder.registerTypeAdapter(Double.class, new JsonSerializer<Double>() {

            @Override
            public JsonElement serialize(Double src, Type typeOfSrc, JsonSerializationContext context) {
                if (src == src.longValue())
                    return new JsonPrimitive(src.longValue());
                return new JsonPrimitive(src);
            }
        });
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Absence.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsenceCertificate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsenceEntitlement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsenceEntitlementValueInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsenceEntitlementValueInnerAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsenceOverviewAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsencePeriodAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsencePeriodBreakdown.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsencePeriodResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsencePeriodResponseAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsencePeriodsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsencePeriodsResponseAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsencePeriodsResponseAllOfData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsenceTimeOffType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsenceTimeOffTypeAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsenceType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsencesAddAbsenceDataResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsencesAddAbsencePeriodsDataResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AbsencesListTimeOffTypesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Attendance.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AttendanceCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AttendanceCreateRequestAttendancesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AttendancePeriodsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AttendancePeriodsResponseAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AttendancePeriodsResponseAllOfData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AttendanceProject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AttendanceProjectAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AttendanceUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CompensationAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CostCenter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CostCenterAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CostCenterHistoricalAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CostCenters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CostCentersValueInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CostCentersValueInnerAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CreateAbsencePeriodRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CreateTimeOffPeriodRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CustomReportsErrorResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DECAOPTKSAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DECAOPTKSAttribute1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DECSHistoricalAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DefaultAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DefaultAttributeCostCentersInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DefaultAttributePerformanceTargetsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DefaultHistoricalAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DeletedAbsenceResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DeletedAbsenceResponseData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DeletedAttendanceResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DeletedAttendanceResponseData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Department.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DepartmentValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DepartmentValueAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentCategoriesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentCategoriesResponseAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentCategory.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentCategoryAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentEmployeeResponseObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentEmployeeResponseObjectEmail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentEmployeeResponseObjectFirstName.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentEmployeeResponseObjectId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentEmployeeResponseObjectLastName.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentUploadRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentUploadSuccessResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentUploadSuccessResponseAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentUploadSuccessResponseAllOfData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentUploadSuccessResponseAllOfDataAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DurationAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DurationHistoricalAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Employee.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeAbsenceBalance.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeAbsenceBalanceDataInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeContractEndDate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeCreatedAt.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeCreatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeCreatedResponseData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeDynamic21827.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeEmail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeEmploymentType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeFirstName.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeFixSalary.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeFixSalaryInterval.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeGender.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeHireDate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeHourlySalary.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeLastModifiedAt.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeLastName.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeLastWorkingDay.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeePosition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeePreferredName.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeProbationPeriodEnd.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeProfilePicture.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeResponseAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeTerminationDate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeTerminationReason.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeTerminationType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeUpdatedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeUpdatedResponseData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeVacationDayBalance.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeWeeklyWorkingHours.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesCreateEmployeeRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesCreateEmployeeRequest1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesCreateEmployeeRequestEmployee.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesCreateEmployeeRequestEmployeeCustomAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesListAttributesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesListAttributesResponseDataInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesResponseAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesResponseAllOfData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesResponseAllOfMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesUpdateEmployeeFieldsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesUpdateEmployeeFieldsRequest1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesUpdateEmployeeFieldsRequestEmployee.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesUpdateEmployeeFieldsRequestEmployeeCustomAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EntityAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EntityHistoricalAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ErrorDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ErrorMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.HolidayCalendar.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.HolidayCalendarValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.HolidayCalendarValueAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.HourlyAbsence.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.HourlyAbsenceCertificate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.HourlyAbsencePeriodResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.HourlyAbsencePeriodResponseAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.HourlyAbsencePeriodResponseAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.HourlyAbsencePeriodResponseAttributesCertificate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.HourlyAbsencePeriodsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.HourlyAbsencePeriodsResponseAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.HourlyAbsencePeriodsResponseAllOfData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.NewAttendancePeriodParametersRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.NewAttendancePeriodResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.NewAttendancePeriodResponseAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.NewAttendancePeriodResponseAllOfData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Office.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.OfficeValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.OfficeValueAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PerformanceKpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PerformanceKpiAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PerformanceTarget.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PerformanceTargetAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PerformanceTargetKpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Project.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ProjectAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ProjectsCreateProjectRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ProjectsCreateProjectResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ProjectsGetAllResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ProjectsUpdateDataRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ProjectsUpdateDataResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicColumnAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicColumnData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicHistoricalReportItemsAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicHistoricalReportItemsAttributesFiltersInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicHistoricalReportItemsAttributesItemsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicListColumnsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicListReportsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicReportAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicReportAttributesFiltersInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicReportData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicReportItemsAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicReportItemsAttributesFiltersInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicReportItemsAttributesItemsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicReportItemsData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicReportMetaData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicReportResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicTimeframeReportItemsAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicTimeframeReportItemsAttributesFiltersInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PublicTimeframeReportItemsAttributesItemsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.SalaryAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.SalaryHistoricalAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ShortEmployee.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ShortEmployeeAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ShortEmployeeAttributesFirstName.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ShortEmployeeAttributesId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ShortEmployeeAttributesLastName.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Supervisor.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Team.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.TeamValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.TeamValueAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.TimeOffTypeResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.TimeOffTypeResourceAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.UpdatedAttendanceResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.UpdatedAttendanceResponseData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.WorkSchedule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.WorkScheduleValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.WorkScheduleValueAttributes.CustomTypeAdapterFactory());
        gsonBuilder.disableHtmlEscaping();
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}