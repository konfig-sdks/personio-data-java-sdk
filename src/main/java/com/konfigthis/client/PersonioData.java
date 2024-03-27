package com.konfigthis.client;

import com.konfigthis.client.api.AbsencesApi;
import com.konfigthis.client.api.AttendancesApi;
import com.konfigthis.client.api.CustomReportsApi;
import com.konfigthis.client.api.DocumentsApi;
import com.konfigthis.client.api.EmployeesApi;
import com.konfigthis.client.api.ProjectsApi;

public class PersonioData {
    private ApiClient apiClient;
    public final AbsencesApi absences;
    public final AttendancesApi attendances;
    public final CustomReportsApi customReports;
    public final DocumentsApi documents;
    public final EmployeesApi employees;
    public final ProjectsApi projects;

    public PersonioData() {
        this(null);
    }

    public PersonioData(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.absences = new AbsencesApi(this.apiClient);
        this.attendances = new AttendancesApi(this.apiClient);
        this.customReports = new CustomReportsApi(this.apiClient);
        this.documents = new DocumentsApi(this.apiClient);
        this.employees = new EmployeesApi(this.apiClient);
        this.projects = new ProjectsApi(this.apiClient);
    }

}
