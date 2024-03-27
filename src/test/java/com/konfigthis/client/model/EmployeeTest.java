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


package com.konfigthis.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.AbsenceEntitlement;
import com.konfigthis.client.model.CostCenters;
import com.konfigthis.client.model.Department;
import com.konfigthis.client.model.EmployeeContractEndDate;
import com.konfigthis.client.model.EmployeeCreatedAt;
import com.konfigthis.client.model.EmployeeDynamic21827;
import com.konfigthis.client.model.EmployeeEmail;
import com.konfigthis.client.model.EmployeeEmploymentType;
import com.konfigthis.client.model.EmployeeFirstName;
import com.konfigthis.client.model.EmployeeFixSalary;
import com.konfigthis.client.model.EmployeeFixSalaryInterval;
import com.konfigthis.client.model.EmployeeGender;
import com.konfigthis.client.model.EmployeeHireDate;
import com.konfigthis.client.model.EmployeeHourlySalary;
import com.konfigthis.client.model.EmployeeId;
import com.konfigthis.client.model.EmployeeLastModifiedAt;
import com.konfigthis.client.model.EmployeeLastName;
import com.konfigthis.client.model.EmployeeLastWorkingDay;
import com.konfigthis.client.model.EmployeePosition;
import com.konfigthis.client.model.EmployeePreferredName;
import com.konfigthis.client.model.EmployeeProbationPeriodEnd;
import com.konfigthis.client.model.EmployeeProfilePicture;
import com.konfigthis.client.model.EmployeeStatus;
import com.konfigthis.client.model.EmployeeTerminationDate;
import com.konfigthis.client.model.EmployeeTerminationReason;
import com.konfigthis.client.model.EmployeeTerminationType;
import com.konfigthis.client.model.EmployeeVacationDayBalance;
import com.konfigthis.client.model.EmployeeWeeklyWorkingHours;
import com.konfigthis.client.model.HolidayCalendar;
import com.konfigthis.client.model.Office;
import com.konfigthis.client.model.Supervisor;
import com.konfigthis.client.model.Team;
import com.konfigthis.client.model.WorkSchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for Employee
 */
public class EmployeeTest {
    private final Employee model = new Employee();

    /**
     * Model tests for Employee
     */
    @Test
    public void testEmployee() {
        // TODO: test Employee
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'firstName'
     */
    @Test
    public void firstNameTest() {
        // TODO: test firstName
    }

    /**
     * Test the property 'lastName'
     */
    @Test
    public void lastNameTest() {
        // TODO: test lastName
    }

    /**
     * Test the property 'preferredName'
     */
    @Test
    public void preferredNameTest() {
        // TODO: test preferredName
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'gender'
     */
    @Test
    public void genderTest() {
        // TODO: test gender
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'position'
     */
    @Test
    public void positionTest() {
        // TODO: test position
    }

    /**
     * Test the property 'supervisor'
     */
    @Test
    public void supervisorTest() {
        // TODO: test supervisor
    }

    /**
     * Test the property 'employmentType'
     */
    @Test
    public void employmentTypeTest() {
        // TODO: test employmentType
    }

    /**
     * Test the property 'weeklyWorkingHours'
     */
    @Test
    public void weeklyWorkingHoursTest() {
        // TODO: test weeklyWorkingHours
    }

    /**
     * Test the property 'hireDate'
     */
    @Test
    public void hireDateTest() {
        // TODO: test hireDate
    }

    /**
     * Test the property 'contractEndDate'
     */
    @Test
    public void contractEndDateTest() {
        // TODO: test contractEndDate
    }

    /**
     * Test the property 'terminationDate'
     */
    @Test
    public void terminationDateTest() {
        // TODO: test terminationDate
    }

    /**
     * Test the property 'terminationType'
     */
    @Test
    public void terminationTypeTest() {
        // TODO: test terminationType
    }

    /**
     * Test the property 'terminationReason'
     */
    @Test
    public void terminationReasonTest() {
        // TODO: test terminationReason
    }

    /**
     * Test the property 'probationPeriodEnd'
     */
    @Test
    public void probationPeriodEndTest() {
        // TODO: test probationPeriodEnd
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'lastModifiedAt'
     */
    @Test
    public void lastModifiedAtTest() {
        // TODO: test lastModifiedAt
    }

    /**
     * Test the property 'subcompany'
     */
    @Test
    public void subcompanyTest() {
        // TODO: test subcompany
    }

    /**
     * Test the property 'office'
     */
    @Test
    public void officeTest() {
        // TODO: test office
    }

    /**
     * Test the property 'department'
     */
    @Test
    public void departmentTest() {
        // TODO: test department
    }

    /**
     * Test the property 'costCenters'
     */
    @Test
    public void costCentersTest() {
        // TODO: test costCenters
    }

    /**
     * Test the property 'holidayCalendar'
     */
    @Test
    public void holidayCalendarTest() {
        // TODO: test holidayCalendar
    }

    /**
     * Test the property 'workSchedule'
     */
    @Test
    public void workScheduleTest() {
        // TODO: test workSchedule
    }

    /**
     * Test the property 'absenceEntitlement'
     */
    @Test
    public void absenceEntitlementTest() {
        // TODO: test absenceEntitlement
    }

    /**
     * Test the property 'team'
     */
    @Test
    public void teamTest() {
        // TODO: test team
    }

    /**
     * Test the property 'fixSalary'
     */
    @Test
    public void fixSalaryTest() {
        // TODO: test fixSalary
    }

    /**
     * Test the property 'fixSalaryInterval'
     */
    @Test
    public void fixSalaryIntervalTest() {
        // TODO: test fixSalaryInterval
    }

    /**
     * Test the property 'hourlySalary'
     */
    @Test
    public void hourlySalaryTest() {
        // TODO: test hourlySalary
    }

    /**
     * Test the property 'vacationDayBalance'
     */
    @Test
    public void vacationDayBalanceTest() {
        // TODO: test vacationDayBalance
    }

    /**
     * Test the property 'lastWorkingDay'
     */
    @Test
    public void lastWorkingDayTest() {
        // TODO: test lastWorkingDay
    }

    /**
     * Test the property 'profilePicture'
     */
    @Test
    public void profilePictureTest() {
        // TODO: test profilePicture
    }

    /**
     * Test the property 'dynamic21827'
     */
    @Test
    public void dynamic21827Test() {
        // TODO: test dynamic21827
    }

}
