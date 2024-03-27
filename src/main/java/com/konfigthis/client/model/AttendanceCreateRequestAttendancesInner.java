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
import java.io.IOException;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * AttendanceCreateRequestAttendancesInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AttendanceCreateRequestAttendancesInner {
  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private Integer employee;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_BREAK = "break";
  @SerializedName(SERIALIZED_NAME_BREAK)
  private Integer _break;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Integer projectId;

  public AttendanceCreateRequestAttendancesInner() {
  }

  public AttendanceCreateRequestAttendancesInner employee(Integer employee) {
    if (employee != null && employee < 1) {
      throw new IllegalArgumentException("Invalid value for employee. Must be greater than or equal to 1.");
    }
    
    
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * minimum: 1
   * @return employee
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")

  public Integer getEmployee() {
    return employee;
  }


  public void setEmployee(Integer employee) {
    if (employee != null && employee < 1) {
      throw new IllegalArgumentException("Invalid value for employee. Must be greater than or equal to 1.");
    }
    
    
    this.employee = employee;
  }


  public AttendanceCreateRequestAttendancesInner date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public AttendanceCreateRequestAttendancesInner startTime(String startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Format: hh:mm
   * @return startTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "08:00", required = true, value = "Format: hh:mm")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    
    
    
    this.startTime = startTime;
  }


  public AttendanceCreateRequestAttendancesInner endTime(String endTime) {
    
    
    
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Format: hh:mm
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1020", value = "Format: hh:mm")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    
    
    
    this.endTime = endTime;
  }


  public AttendanceCreateRequestAttendancesInner _break(Integer _break) {
    if (_break != null && _break < 0) {
      throw new IllegalArgumentException("Invalid value for _break. Must be greater than or equal to 0.");
    }
    
    
    
    this._break = _break;
    return this;
  }

   /**
   * Get _break
   * minimum: 0
   * @return _break
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "60", required = true, value = "")

  public Integer getBreak() {
    return _break;
  }


  public void setBreak(Integer _break) {
    if (_break != null && _break < 0) {
      throw new IllegalArgumentException("Invalid value for _break. Must be greater than or equal to 0.");
    }
    
    
    this._break = _break;
  }


  public AttendanceCreateRequestAttendancesInner comment(String comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "I was productive as hell", value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    
    
    
    this.comment = comment;
  }


  public AttendanceCreateRequestAttendancesInner projectId(Integer projectId) {
    
    
    
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getProjectId() {
    return projectId;
  }


  public void setProjectId(Integer projectId) {
    
    
    
    this.projectId = projectId;
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
   * @return the AttendanceCreateRequestAttendancesInner instance itself
   */
  public AttendanceCreateRequestAttendancesInner putAdditionalProperty(String key, Object value) {
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
    AttendanceCreateRequestAttendancesInner attendanceCreateRequestAttendancesInner = (AttendanceCreateRequestAttendancesInner) o;
    return Objects.equals(this.employee, attendanceCreateRequestAttendancesInner.employee) &&
        Objects.equals(this.date, attendanceCreateRequestAttendancesInner.date) &&
        Objects.equals(this.startTime, attendanceCreateRequestAttendancesInner.startTime) &&
        Objects.equals(this.endTime, attendanceCreateRequestAttendancesInner.endTime) &&
        Objects.equals(this._break, attendanceCreateRequestAttendancesInner._break) &&
        Objects.equals(this.comment, attendanceCreateRequestAttendancesInner.comment) &&
        Objects.equals(this.projectId, attendanceCreateRequestAttendancesInner.projectId)&&
        Objects.equals(this.additionalProperties, attendanceCreateRequestAttendancesInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employee, date, startTime, endTime, _break, comment, projectId, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttendanceCreateRequestAttendancesInner {\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    _break: ").append(toIndentedString(_break)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
    openapiFields.add("employee");
    openapiFields.add("date");
    openapiFields.add("start_time");
    openapiFields.add("end_time");
    openapiFields.add("break");
    openapiFields.add("comment");
    openapiFields.add("project_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employee");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("start_time");
    openapiRequiredFields.add("break");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttendanceCreateRequestAttendancesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AttendanceCreateRequestAttendancesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttendanceCreateRequestAttendancesInner is not found in the empty JSON string", AttendanceCreateRequestAttendancesInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AttendanceCreateRequestAttendancesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (!jsonObj.get("end_time").isJsonNull() && (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonNull()) && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (!jsonObj.get("comment").isJsonNull() && (jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttendanceCreateRequestAttendancesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttendanceCreateRequestAttendancesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttendanceCreateRequestAttendancesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttendanceCreateRequestAttendancesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AttendanceCreateRequestAttendancesInner>() {
           @Override
           public void write(JsonWriter out, AttendanceCreateRequestAttendancesInner value) throws IOException {
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
           public AttendanceCreateRequestAttendancesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AttendanceCreateRequestAttendancesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AttendanceCreateRequestAttendancesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttendanceCreateRequestAttendancesInner
  * @throws IOException if the JSON string is invalid with respect to AttendanceCreateRequestAttendancesInner
  */
  public static AttendanceCreateRequestAttendancesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttendanceCreateRequestAttendancesInner.class);
  }

 /**
  * Convert an instance of AttendanceCreateRequestAttendancesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

