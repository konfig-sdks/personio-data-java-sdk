

# EmployeesCreateEmployeeRequest1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeEmail** | **String** | Employee email |  |
|**employeeFirstName** | **String** | Employee first name |  |
|**employeeLastName** | **String** | Employee last name |  |
|**employeePreferredName** | **String** | Employee preferred name |  [optional] |
|**employeeGender** | [**EmployeeGenderEnum**](#EmployeeGenderEnum) | Employee gender |  [optional] |
|**employeePosition** | **String** | Employee position |  [optional] |
|**employeeDepartment** | **String** | Employee department |  [optional] |
|**employeeHireDate** | **LocalDate** | Employee hire date. Format: yyyy-mm-dd |  [optional] |
|**employeeWeeklyWorkingHours** | **Double** | Employee weekly working hours |  [optional] |
|**employeeSupervisorId** | **Double** | Employee ID of the Supervisor to be assigned. It needs to belong to a current existing employee, otherwise an error will be returned. If not present, no supervisor will be assigned. |  [optional] |
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



