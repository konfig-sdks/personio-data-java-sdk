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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.AttendanceCreateRequest;
import com.konfigthis.client.model.AttendanceCreateRequestAttendancesInner;
import com.konfigthis.client.model.AttendancePeriodsResponse;
import com.konfigthis.client.model.AttendanceUpdateRequest;
import com.konfigthis.client.model.DeletedAttendanceResponse;
import java.time.LocalDate;
import com.konfigthis.client.model.NewAttendancePeriodParametersRequest;
import com.konfigthis.client.model.NewAttendancePeriodResponse;
import com.konfigthis.client.model.UpdatedAttendanceResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttendancesApi
 */
@Disabled
public class AttendancesApiTest {

    private static AttendancesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AttendancesApi(apiClient);
    }

    /**
     * This endpoint is responsible for adding attendance data for the company employees. It is possible to add attendances for one or many employees at the same time. The payload sent on the request should be a list of attendance periods, in the form of an array containing attendance period objects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMultipleAttendancesTest() throws ApiException {
        List<AttendanceCreateRequestAttendancesInner> attendances = null;
        Boolean skipApproval = null;
        String xPersonioPartnerID = null;
        String xPersonioAppID = null;
        NewAttendancePeriodResponse response = api.createMultipleAttendances()
                .attendances(attendances)
                .skipApproval(skipApproval)
                .xPersonioPartnerID(xPersonioPartnerID)
                .xPersonioAppID(xPersonioAppID)
                .execute();
        // TODO: test validations
    }

    /**
     * This endpoint is responsible for deleting attendance data for the company employees.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDataTest() throws ApiException {
        Integer id = null;
        String xPersonioPartnerID = null;
        String xPersonioAppID = null;
        Boolean skipApproval = null;
        DeletedAttendanceResponse response = api.deleteData(id)
                .xPersonioPartnerID(xPersonioPartnerID)
                .xPersonioAppID(xPersonioAppID)
                .skipApproval(skipApproval)
                .execute();
        // TODO: test validations
    }

    /**
     * Fetch attendance data for the company employees. The result can be &#x60;paginated&#x60; and &#x60;filtered&#x60; by period, the date and/or time they were updated, and/or specific employee/employees. The result contains a list of attendances.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        LocalDate startDate = null;
        LocalDate endDate = null;
        String xPersonioPartnerID = null;
        String xPersonioAppID = null;
        String updatedFrom = null;
        String updatedTo = null;
        Boolean includePending = null;
        List<Integer> employees = null;
        Integer limit = null;
        Integer offset = null;
        AttendancePeriodsResponse response = api.getList(startDate, endDate)
                .xPersonioPartnerID(xPersonioPartnerID)
                .xPersonioAppID(xPersonioAppID)
                .updatedFrom(updatedFrom)
                .updatedTo(updatedTo)
                .includePending(includePending)
                .employees(employees)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * This endpoint is responsible for updating attendance data for the company employees. Attributes are not required and if not specified, the current value will be used. It is not possible to change the employee id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAttendanceDataTest() throws ApiException {
        Integer id = null;
        LocalDate date = null;
        String startTime = null;
        String endTime = null;
        Integer _break = null;
        String comment = null;
        Integer projectId = null;
        Boolean skipApproval = null;
        String xPersonioPartnerID = null;
        String xPersonioAppID = null;
        UpdatedAttendanceResponse response = api.updateAttendanceData(id)
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
        // TODO: test validations
    }

}