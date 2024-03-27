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
import com.konfigthis.client.model.AbsencePeriodBreakdown;
import com.konfigthis.client.model.AbsenceType;
import com.konfigthis.client.model.HourlyAbsenceCertificate;
import com.konfigthis.client.model.ShortEmployee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
 * HourlyAbsence
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class HourlyAbsence {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_MEASUREMENT_UNIT = "measurement_unit";
  @SerializedName(SERIALIZED_NAME_MEASUREMENT_UNIT)
  private String measurementUnit;

  public static final String SERIALIZED_NAME_EFFECTIVE_DURATION = "effective_duration";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DURATION)
  private Integer effectiveDuration;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private ShortEmployee employee;

  public static final String SERIALIZED_NAME_ABSENCE_TYPE = "absence_type";
  @SerializedName(SERIALIZED_NAME_ABSENCE_TYPE)
  private AbsenceType absenceType;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private HourlyAbsenceCertificate certificate;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private OffsetDateTime end;

  public static final String SERIALIZED_NAME_HALF_DAY_START = "half_day_start";
  @SerializedName(SERIALIZED_NAME_HALF_DAY_START)
  private Boolean halfDayStart;

  public static final String SERIALIZED_NAME_HALF_DAY_END = "half_day_end";
  @SerializedName(SERIALIZED_NAME_HALF_DAY_END)
  private Boolean halfDayEnd;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Integer createdBy;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_APPROVED_AT = "approved_at";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT)
  private OffsetDateTime approvedAt;

  public static final String SERIALIZED_NAME_BREAKDOWNS = "breakdowns";
  @SerializedName(SERIALIZED_NAME_BREAKDOWNS)
  private List<AbsencePeriodBreakdown> breakdowns = null;

  public HourlyAbsence() {
  }

  public HourlyAbsence id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "61fe126b-a7b3-449a-b5ee-3865a6fcc546", value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public HourlyAbsence measurementUnit(String measurementUnit) {
    
    
    
    
    this.measurementUnit = measurementUnit;
    return this;
  }

   /**
   * Get measurementUnit
   * @return measurementUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hours", value = "")

  public String getMeasurementUnit() {
    return measurementUnit;
  }


  public void setMeasurementUnit(String measurementUnit) {
    
    
    
    this.measurementUnit = measurementUnit;
  }


  public HourlyAbsence effectiveDuration(Integer effectiveDuration) {
    
    
    
    
    this.effectiveDuration = effectiveDuration;
    return this;
  }

   /**
   * Period effective duration in minutes
   * @return effectiveDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16", value = "Period effective duration in minutes")

  public Integer getEffectiveDuration() {
    return effectiveDuration;
  }


  public void setEffectiveDuration(Integer effectiveDuration) {
    
    
    
    this.effectiveDuration = effectiveDuration;
  }


  public HourlyAbsence employee(ShortEmployee employee) {
    
    
    
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShortEmployee getEmployee() {
    return employee;
  }


  public void setEmployee(ShortEmployee employee) {
    
    
    
    this.employee = employee;
  }


  public HourlyAbsence absenceType(AbsenceType absenceType) {
    
    
    
    
    this.absenceType = absenceType;
    return this;
  }

   /**
   * Get absenceType
   * @return absenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AbsenceType getAbsenceType() {
    return absenceType;
  }


  public void setAbsenceType(AbsenceType absenceType) {
    
    
    
    this.absenceType = absenceType;
  }


  public HourlyAbsence certificate(HourlyAbsenceCertificate certificate) {
    
    
    
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HourlyAbsenceCertificate getCertificate() {
    return certificate;
  }


  public void setCertificate(HourlyAbsenceCertificate certificate) {
    
    
    
    this.certificate = certificate;
  }


  public HourlyAbsence start(OffsetDateTime start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
    
    
    
    this.start = start;
  }


  public HourlyAbsence end(OffsetDateTime end) {
    
    
    
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEnd() {
    return end;
  }


  public void setEnd(OffsetDateTime end) {
    
    
    
    this.end = end;
  }


  public HourlyAbsence halfDayStart(Boolean halfDayStart) {
    
    
    
    
    this.halfDayStart = halfDayStart;
    return this;
  }

   /**
   * Get halfDayStart
   * @return halfDayStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHalfDayStart() {
    return halfDayStart;
  }


  public void setHalfDayStart(Boolean halfDayStart) {
    
    
    
    this.halfDayStart = halfDayStart;
  }


  public HourlyAbsence halfDayEnd(Boolean halfDayEnd) {
    
    
    
    
    this.halfDayEnd = halfDayEnd;
    return this;
  }

   /**
   * Get halfDayEnd
   * @return halfDayEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHalfDayEnd() {
    return halfDayEnd;
  }


  public void setHalfDayEnd(Boolean halfDayEnd) {
    
    
    
    this.halfDayEnd = halfDayEnd;
  }


  public HourlyAbsence comment(String comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    
    
    
    this.comment = comment;
  }


  public HourlyAbsence origin(String origin) {
    
    
    
    
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "web", value = "")

  public String getOrigin() {
    return origin;
  }


  public void setOrigin(String origin) {
    
    
    
    this.origin = origin;
  }


  public HourlyAbsence status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "approved", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public HourlyAbsence timezone(String timezone) {
    
    
    
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Europe/Berlin", value = "")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    
    
    
    this.timezone = timezone;
  }


  public HourlyAbsence createdBy(Integer createdBy) {
    
    
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of the employee who created the absence period.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "ID of the employee who created the absence period.")

  public Integer getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Integer createdBy) {
    
    
    
    this.createdBy = createdBy;
  }


  public HourlyAbsence createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-17T10:32:18+0100", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public HourlyAbsence updatedAt(String updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-17T10:32:18+0100", value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
  }


  public HourlyAbsence approvedAt(OffsetDateTime approvedAt) {
    
    
    
    
    this.approvedAt = approvedAt;
    return this;
  }

   /**
   * Get approvedAt
   * @return approvedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getApprovedAt() {
    return approvedAt;
  }


  public void setApprovedAt(OffsetDateTime approvedAt) {
    
    
    
    this.approvedAt = approvedAt;
  }


  public HourlyAbsence breakdowns(List<AbsencePeriodBreakdown> breakdowns) {
    
    
    
    
    this.breakdowns = breakdowns;
    return this;
  }

  public HourlyAbsence addBreakdownsItem(AbsencePeriodBreakdown breakdownsItem) {
    if (this.breakdowns == null) {
      this.breakdowns = new ArrayList<>();
    }
    this.breakdowns.add(breakdownsItem);
    return this;
  }

   /**
   * Breakdowns of effective duration by day of absence.
   * @return breakdowns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Breakdowns of effective duration by day of absence.")

  public List<AbsencePeriodBreakdown> getBreakdowns() {
    return breakdowns;
  }


  public void setBreakdowns(List<AbsencePeriodBreakdown> breakdowns) {
    
    
    
    this.breakdowns = breakdowns;
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
   * @return the HourlyAbsence instance itself
   */
  public HourlyAbsence putAdditionalProperty(String key, Object value) {
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
    HourlyAbsence hourlyAbsence = (HourlyAbsence) o;
    return Objects.equals(this.id, hourlyAbsence.id) &&
        Objects.equals(this.measurementUnit, hourlyAbsence.measurementUnit) &&
        Objects.equals(this.effectiveDuration, hourlyAbsence.effectiveDuration) &&
        Objects.equals(this.employee, hourlyAbsence.employee) &&
        Objects.equals(this.absenceType, hourlyAbsence.absenceType) &&
        Objects.equals(this.certificate, hourlyAbsence.certificate) &&
        Objects.equals(this.start, hourlyAbsence.start) &&
        Objects.equals(this.end, hourlyAbsence.end) &&
        Objects.equals(this.halfDayStart, hourlyAbsence.halfDayStart) &&
        Objects.equals(this.halfDayEnd, hourlyAbsence.halfDayEnd) &&
        Objects.equals(this.comment, hourlyAbsence.comment) &&
        Objects.equals(this.origin, hourlyAbsence.origin) &&
        Objects.equals(this.status, hourlyAbsence.status) &&
        Objects.equals(this.timezone, hourlyAbsence.timezone) &&
        Objects.equals(this.createdBy, hourlyAbsence.createdBy) &&
        Objects.equals(this.createdAt, hourlyAbsence.createdAt) &&
        Objects.equals(this.updatedAt, hourlyAbsence.updatedAt) &&
        Objects.equals(this.approvedAt, hourlyAbsence.approvedAt) &&
        Objects.equals(this.breakdowns, hourlyAbsence.breakdowns)&&
        Objects.equals(this.additionalProperties, hourlyAbsence.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, measurementUnit, effectiveDuration, employee, absenceType, certificate, start, end, halfDayStart, halfDayEnd, comment, origin, status, timezone, createdBy, createdAt, updatedAt, approvedAt, breakdowns, additionalProperties);
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
    sb.append("class HourlyAbsence {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    effectiveDuration: ").append(toIndentedString(effectiveDuration)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    absenceType: ").append(toIndentedString(absenceType)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    halfDayStart: ").append(toIndentedString(halfDayStart)).append("\n");
    sb.append("    halfDayEnd: ").append(toIndentedString(halfDayEnd)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    approvedAt: ").append(toIndentedString(approvedAt)).append("\n");
    sb.append("    breakdowns: ").append(toIndentedString(breakdowns)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("measurement_unit");
    openapiFields.add("effective_duration");
    openapiFields.add("employee");
    openapiFields.add("absence_type");
    openapiFields.add("certificate");
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("half_day_start");
    openapiFields.add("half_day_end");
    openapiFields.add("comment");
    openapiFields.add("origin");
    openapiFields.add("status");
    openapiFields.add("timezone");
    openapiFields.add("created_by");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("approved_at");
    openapiFields.add("breakdowns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HourlyAbsence
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HourlyAbsence.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HourlyAbsence is not found in the empty JSON string", HourlyAbsence.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("measurement_unit") != null && !jsonObj.get("measurement_unit").isJsonNull()) && !jsonObj.get("measurement_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `measurement_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("measurement_unit").toString()));
      }
      // validate the optional field `employee`
      if (jsonObj.get("employee") != null && !jsonObj.get("employee").isJsonNull()) {
        ShortEmployee.validateJsonObject(jsonObj.getAsJsonObject("employee"));
      }
      // validate the optional field `absence_type`
      if (jsonObj.get("absence_type") != null && !jsonObj.get("absence_type").isJsonNull()) {
        AbsenceType.validateJsonObject(jsonObj.getAsJsonObject("absence_type"));
      }
      // validate the optional field `certificate`
      if (jsonObj.get("certificate") != null && !jsonObj.get("certificate").isJsonNull()) {
        HourlyAbsenceCertificate.validateJsonObject(jsonObj.getAsJsonObject("certificate"));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if (jsonObj.get("breakdowns") != null && !jsonObj.get("breakdowns").isJsonNull()) {
        JsonArray jsonArraybreakdowns = jsonObj.getAsJsonArray("breakdowns");
        if (jsonArraybreakdowns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("breakdowns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `breakdowns` to be an array in the JSON string but got `%s`", jsonObj.get("breakdowns").toString()));
          }

          // validate the optional field `breakdowns` (array)
          for (int i = 0; i < jsonArraybreakdowns.size(); i++) {
            AbsencePeriodBreakdown.validateJsonObject(jsonArraybreakdowns.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HourlyAbsence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HourlyAbsence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HourlyAbsence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HourlyAbsence.class));

       return (TypeAdapter<T>) new TypeAdapter<HourlyAbsence>() {
           @Override
           public void write(JsonWriter out, HourlyAbsence value) throws IOException {
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
           public HourlyAbsence read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             HourlyAbsence instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of HourlyAbsence given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HourlyAbsence
  * @throws IOException if the JSON string is invalid with respect to HourlyAbsence
  */
  public static HourlyAbsence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HourlyAbsence.class);
  }

 /**
  * Convert an instance of HourlyAbsence to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
