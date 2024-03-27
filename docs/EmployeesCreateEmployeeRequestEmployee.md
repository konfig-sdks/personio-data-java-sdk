

# EmployeesCreateEmployeeRequestEmployee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | The e-mail field is required for the employee creation. Updating of this field is not currently supported. |  |
|**firstName** | **String** |  |  |
|**lastName** | **String** |  |  |
|**preferredName** | **String** |  |  [optional] |
|**gender** | **String** |  |  [optional] |
|**position** | **String** |  |  [optional] |
|**subcompany** | **String** | The subcompany employee belongs to. Should be predefined in Personio. Otherwise will be ignored with showing meta error in the response. |  [optional] |
|**department** | **String** | The department employee belongs to. Should be predefined in Personio. Otherwise will be ignored with showing meta error in the response. |  [optional] |
|**office** | **String** | The office employee belongs to. Should be predefined in Personio. Otherwise will be ignored with showing meta error in the response. |  [optional] |
|**hireDate** | **LocalDate** | Employee hire date. Format: \&quot;yyyy-mm-dd\&quot;. If &#x60;status&#x60; is not provided, it will be set to &#x60;active&#x60; if the hire date is in the past, or to &#x60;onboarding&#x60; if it&#39;s in the future. |  [optional] |
|**weeklyWorkingHours** | **Double** |  |  [optional] |
|**status** | **String** | Status of the employee. Overrides the status determined based on the value of &#x60;hire_date&#x60;. |  [optional] |
|**supervisorId** | **Double** | Employee ID of the Supervisor to be assigned. It needs to belong to a current existing employee, otherwise an error will be returned. If not present, no supervisor will be assigned. |  [optional] |
|**customAttributes** | [**EmployeesCreateEmployeeRequestEmployeeCustomAttributes**](EmployeesCreateEmployeeRequestEmployeeCustomAttributes.md) |  |  [optional] |



