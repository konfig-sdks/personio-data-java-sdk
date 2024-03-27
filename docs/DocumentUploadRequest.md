

# DocumentUploadRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title of the document. Maximum length is 255 characters. |  |
|**comment** | **String** | Optional comment that can be added to the uploaded document. |  [optional] |
|**employeeId** | **Integer** | Employee identifier |  |
|**categoryId** | **Integer** | Document Category identifier |  |
|**date** | **LocalDate** | Optional date can be added to the uploaded document. Must follow the format: Y-m-d |  [optional] |
|**_file** | **File** | The document that shall be uploaded to an employees profile. Maximum file size is 30MB. |  |



