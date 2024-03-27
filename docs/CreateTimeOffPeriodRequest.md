

# CreateTimeOffPeriodRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **Integer** | Employee identifier |  |
|**timeOffTypeId** | **Integer** | Time-off type identifier |  |
|**startDate** | **LocalDate** | Absence start date. Format: yyyy-mm-dd |  |
|**endDate** | **LocalDate** | Absence end date. Format: yyyy-mm-dd |  |
|**halfDayStart** | **Boolean** | Whether the start date is a half-day off. |  |
|**halfDayEnd** | **Boolean** | Whether the end date is a half-day off. |  |
|**comment** | **String** | Optional comment |  [optional] |
|**skipApproval** | **Boolean** | Optional, default value is true. If set to false, the approval status of the absence request will be \&quot;pending\&quot; if an approval rule is set for the absence type in Personio. The respective approval flow will be triggered. |  [optional] |



