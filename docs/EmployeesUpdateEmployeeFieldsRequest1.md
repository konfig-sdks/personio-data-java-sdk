

# EmployeesUpdateEmployeeFieldsRequest1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeFirstName** | **String** | Employee first name |  [optional] |
|**employeeLastName** | **String** | Employee last name |  [optional] |
|**employeePreferredName** | **String** | Employee preferred name |  [optional] |
|**employeeGender** | [**EmployeeGenderEnum**](#EmployeeGenderEnum) | Employee gender |  [optional] |
|**employeePosition** | **String** | Employee position |  [optional] |
|**employeeDepartment** | **String** | Employee department |  [optional] |
|**employeeHireDate** | **LocalDate** | Employee hire date. Format: yyyy-mm-dd |  [optional] |
|**employeeWeeklyWorkingHours** | **Double** | Employee weekly working hours |  [optional] |
|**employeeSupervisorId** | **Double** | Employee ID of the Supervisor to be assigned. It needs to belong to a current existing employee and not the same as the one of the employee being updated, otherwise an error will be returned. If sent as null, will unset the employee&#39;s supervisor. |  [optional] |
|**employeeStatus** | [**EmployeeStatusEnum**](#EmployeeStatusEnum) | Employee status |  [optional] |



## Enum: EmployeeGenderEnum

| Name | Value |
|---- | -----|
| MALE | &quot;male&quot; |
| FEMALE | &quot;female&quot; |
| DIVERSE | &quot;diverse&quot; |



## Enum: EmployeeStatusEnum

| Name | Value |
|---- | -----|
| ONBOARDING | &quot;onboarding&quot; |
| ACTIVE | &quot;active&quot; |
| LEAVE | &quot;leave&quot; |
| INACTIVE | &quot;inactive&quot; |



