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
 * DefaultAttributePerformanceTargetsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DefaultAttributePerformanceTargetsInner {
  public static final String SERIALIZED_NAME_PERFORMANCE_TARGET_ID = "performance_target_id";
  @SerializedName(SERIALIZED_NAME_PERFORMANCE_TARGET_ID)
  private String performanceTargetId;

  public static final String SERIALIZED_NAME_PERFORMANCE_TARGET_VALUE = "performance_target_value";
  @SerializedName(SERIALIZED_NAME_PERFORMANCE_TARGET_VALUE)
  private String performanceTargetValue;

  public DefaultAttributePerformanceTargetsInner() {
  }

  public DefaultAttributePerformanceTargetsInner performanceTargetId(String performanceTargetId) {
    
    
    
    
    this.performanceTargetId = performanceTargetId;
    return this;
  }

   /**
   * Get performanceTargetId
   * @return performanceTargetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public String getPerformanceTargetId() {
    return performanceTargetId;
  }


  public void setPerformanceTargetId(String performanceTargetId) {
    
    
    
    this.performanceTargetId = performanceTargetId;
  }


  public DefaultAttributePerformanceTargetsInner performanceTargetValue(String performanceTargetValue) {
    
    
    
    
    this.performanceTargetValue = performanceTargetValue;
    return this;
  }

   /**
   * Get performanceTargetValue
   * @return performanceTargetValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "")

  public String getPerformanceTargetValue() {
    return performanceTargetValue;
  }


  public void setPerformanceTargetValue(String performanceTargetValue) {
    
    
    
    this.performanceTargetValue = performanceTargetValue;
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
   * @return the DefaultAttributePerformanceTargetsInner instance itself
   */
  public DefaultAttributePerformanceTargetsInner putAdditionalProperty(String key, Object value) {
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
    DefaultAttributePerformanceTargetsInner defaultAttributePerformanceTargetsInner = (DefaultAttributePerformanceTargetsInner) o;
    return Objects.equals(this.performanceTargetId, defaultAttributePerformanceTargetsInner.performanceTargetId) &&
        Objects.equals(this.performanceTargetValue, defaultAttributePerformanceTargetsInner.performanceTargetValue)&&
        Objects.equals(this.additionalProperties, defaultAttributePerformanceTargetsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceTargetId, performanceTargetValue, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultAttributePerformanceTargetsInner {\n");
    sb.append("    performanceTargetId: ").append(toIndentedString(performanceTargetId)).append("\n");
    sb.append("    performanceTargetValue: ").append(toIndentedString(performanceTargetValue)).append("\n");
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
    openapiFields.add("performance_target_id");
    openapiFields.add("performance_target_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DefaultAttributePerformanceTargetsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DefaultAttributePerformanceTargetsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DefaultAttributePerformanceTargetsInner is not found in the empty JSON string", DefaultAttributePerformanceTargetsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("performance_target_id") != null && !jsonObj.get("performance_target_id").isJsonNull()) && !jsonObj.get("performance_target_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `performance_target_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("performance_target_id").toString()));
      }
      if ((jsonObj.get("performance_target_value") != null && !jsonObj.get("performance_target_value").isJsonNull()) && !jsonObj.get("performance_target_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `performance_target_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("performance_target_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DefaultAttributePerformanceTargetsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DefaultAttributePerformanceTargetsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DefaultAttributePerformanceTargetsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DefaultAttributePerformanceTargetsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DefaultAttributePerformanceTargetsInner>() {
           @Override
           public void write(JsonWriter out, DefaultAttributePerformanceTargetsInner value) throws IOException {
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
           public DefaultAttributePerformanceTargetsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DefaultAttributePerformanceTargetsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DefaultAttributePerformanceTargetsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DefaultAttributePerformanceTargetsInner
  * @throws IOException if the JSON string is invalid with respect to DefaultAttributePerformanceTargetsInner
  */
  public static DefaultAttributePerformanceTargetsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DefaultAttributePerformanceTargetsInner.class);
  }

 /**
  * Convert an instance of DefaultAttributePerformanceTargetsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

