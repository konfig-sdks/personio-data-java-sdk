

# AttendanceUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **LocalDate** |  |  [optional] |
|**startTime** | **String** | Format: hh:mm |  [optional] |
|**endTime** | **String** | Format: hh:mm |  [optional] |
|**_break** | **Integer** |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**projectId** | **Integer** |  |  [optional] |
|**skipApproval** | **Boolean** | Optional, default value is true. If set to false, the approval status of the attendance period will be \&quot;pending\&quot; if an approval rule is set for the attendances type. The respective approval flow will be triggered. |  [optional] |



