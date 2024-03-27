

# PublicTimeframeReportItemsAttributes


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
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**dataRefreshedAt** | **OffsetDateTime** |  |  [optional] |
|**columns** | **List&lt;String&gt;** |  |  [optional] |
|**filters** | [**List&lt;PublicTimeframeReportItemsAttributesFiltersInner&gt;**](PublicTimeframeReportItemsAttributesFiltersInner.md) |  |  [optional] |
|**periodType** | [**PeriodTypeEnum**](#PeriodTypeEnum) |  |  [optional] |
|**items** | [**List&lt;PublicTimeframeReportItemsAttributesItemsInner&gt;**](PublicTimeframeReportItemsAttributesItemsInner.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
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
| YESTERDAY | &quot;yesterday&quot; |
| THIS_WEEK | &quot;this_week&quot; |
| LAST_WEEK | &quot;last_week&quot; |
| THIS_MONTH | &quot;this_month&quot; |
| LAST_MONTH | &quot;last_month&quot; |
| LAST_THIRTY_DAYS | &quot;last_thirty_days&quot; |
| NEXT_MONTH | &quot;next_month&quot; |
| THIS_QUARTER | &quot;this_quarter&quot; |
| LAST_QUARTER | &quot;last_quarter&quot; |
| THIS_YEAR | &quot;this_year&quot; |
| YEAR_TO_DATE | &quot;year_to_date&quot; |
| LAST_YEAR | &quot;last_year&quot; |
| NEXT_YEAR | &quot;next_year&quot; |



