

# PublicReportAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**authorFirstName** | **String** | Report author |  [optional] |
|**authorLastName** | **String** | Report author |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**startDate** | **LocalDate** |  |  [optional] |
|**endDate** | **LocalDate** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**dataRefreshedAt** | **OffsetDateTime** |  |  [optional] |
|**columns** | **List&lt;String&gt;** |  |  [optional] |
|**filters** | [**List&lt;PublicReportAttributesFiltersInner&gt;**](PublicReportAttributesFiltersInner.md) |  |  [optional] |
|**periodType** | [**PeriodTypeEnum**](#PeriodTypeEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| POINT_IN_TIME | &quot;point_in_time&quot; |
| HISTORICAL_DATA | &quot;historical_data&quot; |
| TIMEFRAME | &quot;timeframe&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UP_TO_DATE | &quot;up_to_date&quot; |
| UPDATING | &quot;updating&quot; |
| UPDATE_FAILED | &quot;update_failed&quot; |



## Enum: PeriodTypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;fixed&quot; |
| TODAY | &quot;today&quot; |
| LAST_DAY_OF_THIS_MONTH | &quot;last_day_of_this_month&quot; |
| THIS_YEAR | &quot;this_year&quot; |
| LAST_MONTH | &quot;last_month&quot; |
| LAST_THIRTY_DAYS | &quot;last_thirty_days&quot; |
| THIS_MONTH | &quot;this_month&quot; |
| YEAR_TO_DATE | &quot;year_to_date&quot; |



