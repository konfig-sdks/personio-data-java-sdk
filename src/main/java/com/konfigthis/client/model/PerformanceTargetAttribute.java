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
import com.konfigthis.client.model.DefaultAttributePerformanceTargetsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * PerformanceTargetAttribute
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PerformanceTargetAttribute {
  public static final String SERIALIZED_NAME_ATTRIBUTE_ID = "attribute_id";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_ID)
  private String attributeId;

  /**
   * Gets or Sets dataType
   */
  @JsonAdapter(DataTypeEnum.Adapter.class)
 public enum DataTypeEnum {
    PERFORMANCE_TARGET("PERFORMANCE_TARGET");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataTypeEnum fromValue(String value) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DataTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private DataTypeEnum dataType;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private Integer employeeId;

  public static final String SERIALIZED_NAME_PERFORMANCE_TARGETS = "performance_targets";
  @SerializedName(SERIALIZED_NAME_PERFORMANCE_TARGETS)
  private List<DefaultAttributePerformanceTargetsInner> performanceTargets = null;

  public PerformanceTargetAttribute() {
  }

  public PerformanceTargetAttribute attributeId(String attributeId) {
    
    
    
    
    this.attributeId = attributeId;
    return this;
  }

   /**
   * Get attributeId
   * @return attributeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "performance_target_name", value = "")

  public String getAttributeId() {
    return attributeId;
  }


  public void setAttributeId(String attributeId) {
    
    
    
    this.attributeId = attributeId;
  }


  public PerformanceTargetAttribute dataType(DataTypeEnum dataType) {
    
    
    
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataTypeEnum getDataType() {
    return dataType;
  }


  public void setDataType(DataTypeEnum dataType) {
    
    
    
    this.dataType = dataType;
  }


  public PerformanceTargetAttribute employeeId(Integer employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "17", value = "")

  public Integer getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(Integer employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public PerformanceTargetAttribute performanceTargets(List<DefaultAttributePerformanceTargetsInner> performanceTargets) {
    
    
    
    
    this.performanceTargets = performanceTargets;
    return this;
  }

  public PerformanceTargetAttribute addPerformanceTargetsItem(DefaultAttributePerformanceTargetsInner performanceTargetsItem) {
    if (this.performanceTargets == null) {
      this.performanceTargets = new ArrayList<>();
    }
    this.performanceTargets.add(performanceTargetsItem);
    return this;
  }

   /**
   * Get performanceTargets
   * @return performanceTargets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DefaultAttributePerformanceTargetsInner> getPerformanceTargets() {
    return performanceTargets;
  }


  public void setPerformanceTargets(List<DefaultAttributePerformanceTargetsInner> performanceTargets) {
    
    
    
    this.performanceTargets = performanceTargets;
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
   * @return the PerformanceTargetAttribute instance itself
   */
  public PerformanceTargetAttribute putAdditionalProperty(String key, Object value) {
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
    PerformanceTargetAttribute performanceTargetAttribute = (PerformanceTargetAttribute) o;
    return Objects.equals(this.attributeId, performanceTargetAttribute.attributeId) &&
        Objects.equals(this.dataType, performanceTargetAttribute.dataType) &&
        Objects.equals(this.employeeId, performanceTargetAttribute.employeeId) &&
        Objects.equals(this.performanceTargets, performanceTargetAttribute.performanceTargets)&&
        Objects.equals(this.additionalProperties, performanceTargetAttribute.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeId, dataType, employeeId, performanceTargets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceTargetAttribute {\n");
    sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    performanceTargets: ").append(toIndentedString(performanceTargets)).append("\n");
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
    openapiFields.add("attribute_id");
    openapiFields.add("data_type");
    openapiFields.add("employee_id");
    openapiFields.add("performance_targets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PerformanceTargetAttribute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PerformanceTargetAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PerformanceTargetAttribute is not found in the empty JSON string", PerformanceTargetAttribute.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("attribute_id") != null && !jsonObj.get("attribute_id").isJsonNull()) && !jsonObj.get("attribute_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attribute_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attribute_id").toString()));
      }
      if ((jsonObj.get("data_type") != null && !jsonObj.get("data_type").isJsonNull()) && !jsonObj.get("data_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_type").toString()));
      }
      if (jsonObj.get("performance_targets") != null && !jsonObj.get("performance_targets").isJsonNull()) {
        JsonArray jsonArrayperformanceTargets = jsonObj.getAsJsonArray("performance_targets");
        if (jsonArrayperformanceTargets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("performance_targets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `performance_targets` to be an array in the JSON string but got `%s`", jsonObj.get("performance_targets").toString()));
          }

          // validate the optional field `performance_targets` (array)
          for (int i = 0; i < jsonArrayperformanceTargets.size(); i++) {
            DefaultAttributePerformanceTargetsInner.validateJsonObject(jsonArrayperformanceTargets.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PerformanceTargetAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PerformanceTargetAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PerformanceTargetAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PerformanceTargetAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<PerformanceTargetAttribute>() {
           @Override
           public void write(JsonWriter out, PerformanceTargetAttribute value) throws IOException {
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
           public PerformanceTargetAttribute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PerformanceTargetAttribute instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PerformanceTargetAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PerformanceTargetAttribute
  * @throws IOException if the JSON string is invalid with respect to PerformanceTargetAttribute
  */
  public static PerformanceTargetAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PerformanceTargetAttribute.class);
  }

 /**
  * Convert an instance of PerformanceTargetAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

