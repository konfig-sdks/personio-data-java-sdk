

# HourlyAbsencePeriodResponseAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**measurementUnit** | [**MeasurementUnitEnum**](#MeasurementUnitEnum) |  |  [optional] |
|**effectiveDuration** | **Integer** | Period effective duration in minutes |  |
|**employee** | [**ShortEmployee**](ShortEmployee.md) |  |  |
|**absenceTypeId** | [**AbsenceType**](AbsenceType.md) |  |  |
|**certificate** | [**HourlyAbsencePeriodResponseAttributesCertificate**](HourlyAbsencePeriodResponseAttributesCertificate.md) |  |  |
|**start** | **OffsetDateTime** |  |  |
|**end** | **OffsetDateTime** |  |  [optional] |
|**halfDayStart** | **Boolean** |  |  |
|**halfDayEnd** | **Boolean** |  |  |
|**comment** | **String** |  |  [optional] |
|**origin** | [**OriginEnum**](#OriginEnum) |  |  |
|**status** | **String** |  |  |
|**createdBy** | **Integer** | ID of the employee who created the absence period. |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**approvedAt** | **OffsetDateTime** |  |  [optional] |
|**breakdowns** | [**List&lt;AbsencePeriodBreakdown&gt;**](AbsencePeriodBreakdown.md) | Breakdowns of effective duration by day of absence. |  |



## Enum: MeasurementUnitEnum

| Name | Value |
|---- | -----|
| MINUTES | &quot;minutes&quot; |



## Enum: OriginEnum

| Name | Value |
|---- | -----|
| WEB | &quot;web&quot; |
| API | &quot;api&quot; |
| MOBILE | &quot;mobile&quot; |
| SLACK | &quot;slack&quot; |
| MSTEAMS | &quot;msteams&quot; |



