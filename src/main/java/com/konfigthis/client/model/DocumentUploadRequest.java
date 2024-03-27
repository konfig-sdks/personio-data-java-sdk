/*
 * Personnel Data
 * API for reading and writing personnel data including data about attendances, absences, documents, etc
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * DocumentUploadRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DocumentUploadRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private Integer employeeId;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File _file;

  public DocumentUploadRequest() {
  }

  public DocumentUploadRequest title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Title of the document. Maximum length is 255 characters.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Title of the document. Maximum length is 255 characters.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public DocumentUploadRequest comment(String comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Optional comment that can be added to the uploaded document.
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional comment that can be added to the uploaded document.")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    
    
    
    this.comment = comment;
  }


  public DocumentUploadRequest employeeId(Integer employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Employee identifier
   * @return employeeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Employee identifier")

  public Integer getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(Integer employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public DocumentUploadRequest categoryId(Integer categoryId) {
    
    
    
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Document Category identifier
   * @return categoryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document Category identifier")

  public Integer getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(Integer categoryId) {
    
    
    
    this.categoryId = categoryId;
  }


  public DocumentUploadRequest date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Optional date can be added to the uploaded document. Must follow the format: Y-m-d
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional date can be added to the uploaded document. Must follow the format: Y-m-d")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public DocumentUploadRequest _file(File _file) {
    
    
    
    
    this._file = _file;
    return this;
  }

   /**
   * The document that shall be uploaded to an employees profile. Maximum file size is 30MB.
   * @return _file
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The document that shall be uploaded to an employees profile. Maximum file size is 30MB.")

  public File getFile() {
    return _file;
  }


  public void setFile(File _file) {
    
    
    
    this._file = _file;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the DocumentUploadRequest instance itself
   */
  public DocumentUploadRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentUploadRequest documentUploadRequest = (DocumentUploadRequest) o;
    return Objects.equals(this.title, documentUploadRequest.title) &&
        Objects.equals(this.comment, documentUploadRequest.comment) &&
        Objects.equals(this.employeeId, documentUploadRequest.employeeId) &&
        Objects.equals(this.categoryId, documentUploadRequest.categoryId) &&
        Objects.equals(this.date, documentUploadRequest.date) &&
        Objects.equals(this._file, documentUploadRequest._file)&&
        Objects.equals(this.additionalProperties, documentUploadRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, comment, employeeId, categoryId, date, _file, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUploadRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("title");
    openapiFields.add("comment");
    openapiFields.add("employee_id");
    openapiFields.add("category_id");
    openapiFields.add("date");
    openapiFields.add("file");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("employee_id");
    openapiRequiredFields.add("category_id");
    openapiRequiredFields.add("file");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentUploadRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocumentUploadRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentUploadRequest is not found in the empty JSON string", DocumentUploadRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocumentUploadRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentUploadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentUploadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentUploadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentUploadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentUploadRequest>() {
           @Override
           public void write(JsonWriter out, DocumentUploadRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentUploadRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DocumentUploadRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentUploadRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentUploadRequest
  * @throws IOException if the JSON string is invalid with respect to DocumentUploadRequest
  */
  public static DocumentUploadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentUploadRequest.class);
  }

 /**
  * Convert an instance of DocumentUploadRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

