

# Attendance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employee** | **Integer** |  |  [optional] |
|**date** | **LocalDate** |  |  [optional] |
|**startTime** | **String** |  |  [optional] |
|**endTime** | **String** |  |  [optional] |
|**_break** | **Integer** |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**isHoliday** | **Boolean** |  |  [optional] |
|**isOnTimeOff** | **Boolean** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**project** | [**AttendanceProject**](AttendanceProject.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONFIRMED | &quot;confirmed&quot; |
| PENDING | &quot;pending&quot; |
| REJECTED | &quot;rejected&quot; |



