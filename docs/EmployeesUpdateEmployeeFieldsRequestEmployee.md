

# EmployeesUpdateEmployeeFieldsRequestEmployee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**preferredName** | **String** |  |  [optional] |
|**gender** | **String** |  |  [optional] |
|**position** | **String** |  |  [optional] |
|**subcompany** | **String** | The subcompany employee belongs to. Should be predefined in Personio. Otherwise will be ignored with showing meta error in the response. |  [optional] |
|**department** | **String** | The department employee belongs to. Should be predefined in Personio. Otherwise will be ignored with showing meta error in the response. |  [optional] |
|**office** | **String** | The office employee belongs to. Should be predefined in Personio. Otherwise will be ignored with showing meta error in the response. |  [optional] |
|**hireDate** | **LocalDate** | Employee hire date. Format: \&quot;yyyy-mm-dd\&quot;. Update of the &#x60;hire_date&#x60; will not update employee status on its own (for that you&#39;ll need to update the &#x60;status&#x60; field) |  [optional] |
|**weeklyWorkingHours** | **Double** |  |  [optional] |
|**status** | **String** | Status of the employee. |  [optional] |
|**supervisorId** | **Double** | Employee ID of the Supervisor to be assigned. It needs to belong to a current existing employee and not the same as the one of the employee being updated, otherwise an error will be returned. If sent as null, will unset the employee&#39;s supervisor. |  [optional] |
|**customAttributes** | [**EmployeesUpdateEmployeeFieldsRequestEmployeeCustomAttributes**](EmployeesUpdateEmployeeFieldsRequestEmployeeCustomAttributes.md) |  |  [optional] |



