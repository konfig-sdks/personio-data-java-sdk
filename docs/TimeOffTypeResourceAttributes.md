

# TimeOffTypeResourceAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | identifier |  [optional] |
|**name** | **String** |  |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) |  |  [optional] |
|**legacyCategory** | [**LegacyCategoryEnum**](#LegacyCategoryEnum) |  |  [optional] |
|**unit** | [**UnitEnum**](#UnitEnum) |  |  [optional] |
|**halfDayRequestsEnabled** | **Boolean** |  |  [optional] |
|**certificationRequired** | **Boolean** |  |  [optional] |
|**certificationSubmissionTimeframe** | **Integer** | The timeframe in days under which the employee needs to submit the certification |  [optional] |
|**substituteOption** | [**SubstituteOptionEnum**](#SubstituteOptionEnum) |  |  [optional] |
|**approvalRequired** | **Boolean** |  |  [optional] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| FAMILY_CARE | &quot;family_care&quot; |
| MATERNITY_PARENTAL_LEAVE | &quot;maternity_parental_leave&quot; |
| CHILD_CARE | &quot;child_care&quot; |
| SHORT_TIME_ALLOWANCE | &quot;short_time_allowance&quot; |
| QUARANTINE | &quot;quarantine&quot; |
| LOCKOUT | &quot;lockout&quot; |
| IRREVOCABLE_EXEMPTION | &quot;irrevocable_exemption&quot; |
| SICK_LEAVE | &quot;sick_leave&quot; |
| VOLUNTARY_MILITARY_SERVICE | &quot;voluntary_military_service&quot; |
| UNLAWFUL_STRIKE | &quot;unlawful_strike&quot; |
| LAWFUL_STRIKE | &quot;lawful_strike&quot; |
| PAID_VACATION | &quot;paid_vacation&quot; |
| UNPAID_VACATION | &quot;unpaid_vacation&quot; |
| UNEXCUSED_ABSENCE | &quot;unexcused_absence&quot; |
| OFFSITE_WORK | &quot;offsite_work&quot; |
| OTHER | &quot;other&quot; |
| UNDEFINED | &quot;undefined&quot; |



## Enum: LegacyCategoryEnum

| Name | Value |
|---- | -----|
| FAMILY_CARE_SICK_LEAVE | &quot;family_care_sick_leave&quot; |
| INDIVIDUAL_PROHIBITION_OF_EMPLOYMENT | &quot;individual_prohibition_of_employment&quot; |
| MATERNITY_PROTECTION_PERIOD | &quot;maternity_protection_period&quot; |
| OTHER | &quot;other&quot; |
| PAID_VACATION | &quot;paid_vacation&quot; |
| PARENTAL_LEAVE | &quot;parental_leave&quot; |
| SICK_LEAVE | &quot;sick_leave&quot; |
| LAWFUL_STRIKE | &quot;lawful_strike&quot; |
| UNLAWFUL_STRIKE | &quot;unlawful_strike&quot; |
| TREATMENT | &quot;treatment&quot; |
| UNEXCUSED_ABSENCE | &quot;unexcused_absence&quot; |
| UNPAID_VACATION | &quot;unpaid_vacation&quot; |
| VOLUNTARY_MILITARY_SERVICE | &quot;voluntary_military_service&quot; |
| OFFSITE_WORK | &quot;offsite_work&quot; |
| FAMILY_CARE_LONG_TERM | &quot;family_care_long_term&quot; |
| PAID_CHILD_SICK | &quot;paid_child_sick&quot; |
| UNPAID_CHILD_SICK | &quot;unpaid_child_sick&quot; |
| UNDEFINED | &quot;undefined&quot; |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| DAY | &quot;day&quot; |
| HOUR | &quot;hour&quot; |



## Enum: SubstituteOptionEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| OPTIONAL | &quot;optional&quot; |
| REQUIRED | &quot;required&quot; |



