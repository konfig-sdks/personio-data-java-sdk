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
import com.konfigthis.client.model.HourlyAbsencePeriodResponseAttributesCertificate;
import com.konfigthis.client.model.ShortEmployee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * HourlyAbsencePeriodResponseAttributes
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class HourlyAbsencePeriodResponseAttributes {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Gets or Sets measurementUnit
   */
  @JsonAdapter(MeasurementUnitEnum.Adapter.class)
 public enum MeasurementUnitEnum {
    MINUTES("minutes");

    private String value;

    MeasurementUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MeasurementUnitEnum fromValue(String value) {
      for (MeasurementUnitEnum b : MeasurementUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MeasurementUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MeasurementUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MeasurementUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MeasurementUnitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MEASUREMENT_UNIT = "measurement_unit";
  @SerializedName(SERIALIZED_NAME_MEASUREMENT_UNIT)
  private MeasurementUnitEnum measurementUnit;

  public static final String SERIALIZED_NAME_EFFECTIVE_DURATION = "effective_duration";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DURATION)
  private Integer effectiveDuration;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private ShortEmployee employee;

  public static final String SERIALIZED_NAME_ABSENCE_TYPE_ID = "absence_type_id";
  @SerializedName(SERIALIZED_NAME_ABSENCE_TYPE_ID)
  private AbsenceType absenceTypeId;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private HourlyAbsencePeriodResponseAttributesCertificate certificate;

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

  /**
   * Gets or Sets origin
   */
  @JsonAdapter(OriginEnum.Adapter.class)
 public enum OriginEnum {
    WEB("web"),
    
    API("api"),
    
    MOBILE("mobile"),
    
    SLACK("slack"),
    
    MSTEAMS("msteams");

    private String value;

    OriginEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OriginEnum fromValue(String value) {
      for (OriginEnum b : OriginEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OriginEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OriginEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OriginEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private OriginEnum origin;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Integer createdBy;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_APPROVED_AT = "approved_at";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT)
  private OffsetDateTime approvedAt;

  public static final String SERIALIZED_NAME_BREAKDOWNS = "breakdowns";
  @SerializedName(SERIALIZED_NAME_BREAKDOWNS)
  private List<AbsencePeriodBreakdown> breakdowns = new ArrayList<>();

  public HourlyAbsencePeriodResponseAttributes() {
  }

  public HourlyAbsencePeriodResponseAttributes id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "9bba303f-0fbc-4514-9958-0befa21923fb", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public HourlyAbsencePeriodResponseAttributes measurementUnit(MeasurementUnitEnum measurementUnit) {
    
    
    
    
    this.measurementUnit = measurementUnit;
    return this;
  }

   /**
   * Get measurementUnit
   * @return measurementUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MINUTES", value = "")

  public MeasurementUnitEnum getMeasurementUnit() {
    return measurementUnit;
  }


  public void setMeasurementUnit(MeasurementUnitEnum measurementUnit) {
    
    
    
    this.measurementUnit = measurementUnit;
  }


  public HourlyAbsencePeriodResponseAttributes effectiveDuration(Integer effectiveDuration) {
    
    
    
    
    this.effectiveDuration = effectiveDuration;
    return this;
  }

   /**
   * Period effective duration in minutes
   * @return effectiveDuration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "60", required = true, value = "Period effective duration in minutes")

  public Integer getEffectiveDuration() {
    return effectiveDuration;
  }


  public void setEffectiveDuration(Integer effectiveDuration) {
    
    
    
    this.effectiveDuration = effectiveDuration;
  }


  public HourlyAbsencePeriodResponseAttributes employee(ShortEmployee employee) {
    
    
    
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ShortEmployee getEmployee() {
    return employee;
  }


  public void setEmployee(ShortEmployee employee) {
    
    
    
    this.employee = employee;
  }


  public HourlyAbsencePeriodResponseAttributes absenceTypeId(AbsenceType absenceTypeId) {
    
    
    
    
    this.absenceTypeId = absenceTypeId;
    return this;
  }

   /**
   * Get absenceTypeId
   * @return absenceTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AbsenceType getAbsenceTypeId() {
    return absenceTypeId;
  }


  public void setAbsenceTypeId(AbsenceType absenceTypeId) {
    
    
    
    this.absenceTypeId = absenceTypeId;
  }


  public HourlyAbsencePeriodResponseAttributes certificate(HourlyAbsencePeriodResponseAttributesCertificate certificate) {
    
    
    
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public HourlyAbsencePeriodResponseAttributesCertificate getCertificate() {
    return certificate;
  }


  public void setCertificate(HourlyAbsencePeriodResponseAttributesCertificate certificate) {
    
    
    
    this.certificate = certificate;
  }


  public HourlyAbsencePeriodResponseAttributes start(OffsetDateTime start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
    
    
    
    this.start = start;
  }


  public HourlyAbsencePeriodResponseAttributes end(OffsetDateTime end) {
    
    
    
    
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


  public HourlyAbsencePeriodResponseAttributes halfDayStart(Boolean halfDayStart) {
    
    
    
    
    this.halfDayStart = halfDayStart;
    return this;
  }

   /**
   * Get halfDayStart
   * @return halfDayStart
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHalfDayStart() {
    return halfDayStart;
  }


  public void setHalfDayStart(Boolean halfDayStart) {
    
    
    
    this.halfDayStart = halfDayStart;
  }


  public HourlyAbsencePeriodResponseAttributes halfDayEnd(Boolean halfDayEnd) {
    
    
    
    
    this.halfDayEnd = halfDayEnd;
    return this;
  }

   /**
   * Get halfDayEnd
   * @return halfDayEnd
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHalfDayEnd() {
    return halfDayEnd;
  }


  public void setHalfDayEnd(Boolean halfDayEnd) {
    
    
    
    this.halfDayEnd = halfDayEnd;
  }


  public HourlyAbsencePeriodResponseAttributes comment(String comment) {
    
    
    
    
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


  public HourlyAbsencePeriodResponseAttributes origin(OriginEnum origin) {
    
    
    
    
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WEB", required = true, value = "")

  public OriginEnum getOrigin() {
    return origin;
  }


  public void setOrigin(OriginEnum origin) {
    
    
    
    this.origin = origin;
  }


  public HourlyAbsencePeriodResponseAttributes status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "approved", required = true, value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public HourlyAbsencePeriodResponseAttributes createdBy(Integer createdBy) {
    
    
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of the employee who created the absence period.
   * @return createdBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "ID of the employee who created the absence period.")

  public Integer getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Integer createdBy) {
    
    
    
    this.createdBy = createdBy;
  }


  public HourlyAbsencePeriodResponseAttributes createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public HourlyAbsencePeriodResponseAttributes updatedAt(OffsetDateTime updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
  }


  public HourlyAbsencePeriodResponseAttributes approvedAt(OffsetDateTime approvedAt) {
    
    
    
    
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


  public HourlyAbsencePeriodResponseAttributes breakdowns(List<AbsencePeriodBreakdown> breakdowns) {
    
    
    
    
    this.breakdowns = breakdowns;
    return this;
  }

  public HourlyAbsencePeriodResponseAttributes addBreakdownsItem(AbsencePeriodBreakdown breakdownsItem) {
    this.breakdowns.add(breakdownsItem);
    return this;
  }

   /**
   * Breakdowns of effective duration by day of absence.
   * @return breakdowns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Breakdowns of effective duration by day of absence.")

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
   * @return the HourlyAbsencePeriodResponseAttributes instance itself
   */
  public HourlyAbsencePeriodResponseAttributes putAdditionalProperty(String key, Object value) {
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
    HourlyAbsencePeriodResponseAttributes hourlyAbsencePeriodResponseAttributes = (HourlyAbsencePeriodResponseAttributes) o;
    return Objects.equals(this.id, hourlyAbsencePeriodResponseAttributes.id) &&
        Objects.equals(this.measurementUnit, hourlyAbsencePeriodResponseAttributes.measurementUnit) &&
        Objects.equals(this.effectiveDuration, hourlyAbsencePeriodResponseAttributes.effectiveDuration) &&
        Objects.equals(this.employee, hourlyAbsencePeriodResponseAttributes.employee) &&
        Objects.equals(this.absenceTypeId, hourlyAbsencePeriodResponseAttributes.absenceTypeId) &&
        Objects.equals(this.certificate, hourlyAbsencePeriodResponseAttributes.certificate) &&
        Objects.equals(this.start, hourlyAbsencePeriodResponseAttributes.start) &&
        Objects.equals(this.end, hourlyAbsencePeriodResponseAttributes.end) &&
        Objects.equals(this.halfDayStart, hourlyAbsencePeriodResponseAttributes.halfDayStart) &&
        Objects.equals(this.halfDayEnd, hourlyAbsencePeriodResponseAttributes.halfDayEnd) &&
        Objects.equals(this.comment, hourlyAbsencePeriodResponseAttributes.comment) &&
        Objects.equals(this.origin, hourlyAbsencePeriodResponseAttributes.origin) &&
        Objects.equals(this.status, hourlyAbsencePeriodResponseAttributes.status) &&
        Objects.equals(this.createdBy, hourlyAbsencePeriodResponseAttributes.createdBy) &&
        Objects.equals(this.createdAt, hourlyAbsencePeriodResponseAttributes.createdAt) &&
        Objects.equals(this.updatedAt, hourlyAbsencePeriodResponseAttributes.updatedAt) &&
        Objects.equals(this.approvedAt, hourlyAbsencePeriodResponseAttributes.approvedAt) &&
        Objects.equals(this.breakdowns, hourlyAbsencePeriodResponseAttributes.breakdowns)&&
        Objects.equals(this.additionalProperties, hourlyAbsencePeriodResponseAttributes.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, measurementUnit, effectiveDuration, employee, absenceTypeId, certificate, start, end, halfDayStart, halfDayEnd, comment, origin, status, createdBy, createdAt, updatedAt, approvedAt, breakdowns, additionalProperties);
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
    sb.append("class HourlyAbsencePeriodResponseAttributes {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    effectiveDuration: ").append(toIndentedString(effectiveDuration)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    absenceTypeId: ").append(toIndentedString(absenceTypeId)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    halfDayStart: ").append(toIndentedString(halfDayStart)).append("\n");
    sb.append("    halfDayEnd: ").append(toIndentedString(halfDayEnd)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("absence_type_id");
    openapiFields.add("certificate");
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("half_day_start");
    openapiFields.add("half_day_end");
    openapiFields.add("comment");
    openapiFields.add("origin");
    openapiFields.add("status");
    openapiFields.add("created_by");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("approved_at");
    openapiFields.add("breakdowns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("effective_duration");
    openapiRequiredFields.add("employee");
    openapiRequiredFields.add("absence_type_id");
    openapiRequiredFields.add("certificate");
    openapiRequiredFields.add("start");
    openapiRequiredFields.add("half_day_start");
    openapiRequiredFields.add("half_day_end");
    openapiRequiredFields.add("origin");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("created_by");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("breakdowns");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HourlyAbsencePeriodResponseAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HourlyAbsencePeriodResponseAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HourlyAbsencePeriodResponseAttributes is not found in the empty JSON string", HourlyAbsencePeriodResponseAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HourlyAbsencePeriodResponseAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("measurement_unit") != null && !jsonObj.get("measurement_unit").isJsonNull()) && !jsonObj.get("measurement_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `measurement_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("measurement_unit").toString()));
      }
      // validate the required field `employee`
      ShortEmployee.validateJsonObject(jsonObj.getAsJsonObject("employee"));
      // validate the required field `absence_type_id`
      AbsenceType.validateJsonObject(jsonObj.getAsJsonObject("absence_type_id"));
      // validate the required field `certificate`
      HourlyAbsencePeriodResponseAttributesCertificate.validateJsonObject(jsonObj.getAsJsonObject("certificate"));
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if (!jsonObj.get("origin").isJsonNull() && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("breakdowns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `breakdowns` to be an array in the JSON string but got `%s`", jsonObj.get("breakdowns").toString()));
      }

      JsonArray jsonArraybreakdowns = jsonObj.getAsJsonArray("breakdowns");
      // validate the required field `breakdowns` (array)
      for (int i = 0; i < jsonArraybreakdowns.size(); i++) {
        AbsencePeriodBreakdown.validateJsonObject(jsonArraybreakdowns.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HourlyAbsencePeriodResponseAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HourlyAbsencePeriodResponseAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HourlyAbsencePeriodResponseAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HourlyAbsencePeriodResponseAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<HourlyAbsencePeriodResponseAttributes>() {
           @Override
           public void write(JsonWriter out, HourlyAbsencePeriodResponseAttributes value) throws IOException {
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
           public HourlyAbsencePeriodResponseAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             HourlyAbsencePeriodResponseAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of HourlyAbsencePeriodResponseAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HourlyAbsencePeriodResponseAttributes
  * @throws IOException if the JSON string is invalid with respect to HourlyAbsencePeriodResponseAttributes
  */
  public static HourlyAbsencePeriodResponseAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HourlyAbsencePeriodResponseAttributes.class);
  }

 /**
  * Convert an instance of HourlyAbsencePeriodResponseAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
