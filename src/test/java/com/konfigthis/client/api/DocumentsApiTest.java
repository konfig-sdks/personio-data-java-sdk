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
import com.konfigthis.client.model.DocumentCategoriesResponse;
import com.konfigthis.client.model.DocumentUploadRequest;
import com.konfigthis.client.model.DocumentUploadSuccessResponse;
import java.io.File;
import java.time.LocalDate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentsApi
 */
@Disabled
public class DocumentsApiTest {

    private static DocumentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DocumentsApi(apiClient);
    }

    /**
     * This endpoint is responsible for fetching all document categories of the company. The result contains a list of document categories.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCategoriesTest() throws ApiException {
        String xPersonioPartnerID = null;
        String xPersonioAppID = null;
        DocumentCategoriesResponse response = api.getCategories()
                .xPersonioPartnerID(xPersonioPartnerID)
                .xPersonioAppID(xPersonioAppID)
                .execute();
        // TODO: test validations
    }

    /**
     * This endpoint is responsible for uploading documents for the company employees.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadForEmployeesTest() throws ApiException {
        String title = null;
        Integer employeeId = null;
        Integer categoryId = null;
        File _file = null;
        String xPersonioPartnerID = null;
        String xPersonioAppID = null;
        String comment = null;
        LocalDate date = null;
        DocumentUploadSuccessResponse response = api.uploadForEmployees(title, employeeId, categoryId, _file)
                .xPersonioPartnerID(xPersonioPartnerID)
                .xPersonioAppID(xPersonioAppID)
                .comment(comment)
                .date(date)
                .execute();
        // TODO: test validations
    }

}
