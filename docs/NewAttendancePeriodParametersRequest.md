

# NewAttendancePeriodParametersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attendancesEmployee** | **Integer** | Employee identifier |  |
|**attendancesDate** | **LocalDate** | Attendance date. Format: yyyy-mm-dd |  |
|**attendancesStartTime** | **String** | Start time. Format: hh:mm |  |
|**attendancesEndTime** | **String** | End time. Format: hh:mm |  [optional] |
|**attendancesBreak** | **Integer** | Break in minutes |  |
|**attendancesComment** | **String** | Optional comment |  [optional] |
|**skipApproval** | **Boolean** | Optional, default value is true. If set to false, the approval status of the attendance period will be \&quot;pending\&quot; if an approval rule is set for the attendances type. The respective approval flow will be triggered. |  [optional] |
|**projectId** | **Integer** | The ID of the project |  [optional] |



