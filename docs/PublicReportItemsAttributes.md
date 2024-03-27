

# PublicReportItemsAttributes


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
|**filters** | [**List&lt;PublicReportItemsAttributesFiltersInner&gt;**](PublicReportItemsAttributesFiltersInner.md) |  |  [optional] |
|**periodType** | [**PeriodTypeEnum**](#PeriodTypeEnum) |  |  [optional] |
|**items** | [**List&lt;PublicReportItemsAttributesItemsInner&gt;**](PublicReportItemsAttributesItemsInner.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| POINT_IN_TIME | &quot;point_in_time&quot; |



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
| LAST_DAY_OF_THIS_WEEK | &quot;last_day_of_this_week&quot; |
| LAST_DAY_OF_LAST_WEEK | &quot;last_day_of_last_week&quot; |
| LAST_DAY_OF_THIS_MONTH | &quot;last_day_of_this_month&quot; |
| LAST_DAY_OF_LAST_MONTH | &quot;last_day_of_last_month&quot; |
| LAST_DAY_OF_THIS_QUARTER | &quot;last_day_of_this_quarter&quot; |
| LAST_DAY_OF_LAST_QUARTER | &quot;last_day_of_last_quarter&quot; |
| LAST_DAY_OF_THIS_YEAR | &quot;last_day_of_this_year&quot; |
| LAST_DAY_OF_LAST_YEAR | &quot;last_day_of_last_year&quot; |



