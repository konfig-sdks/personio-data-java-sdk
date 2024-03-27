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
import com.konfigthis.client.model.CostCenter;
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
 * DECSHistoricalAttribute
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DECSHistoricalAttribute {
  public static final String SERIALIZED_NAME_ATTRIBUTE_ID = "attribute_id";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_ID)
  private String attributeId;

  /**
   * Gets or Sets dataType
   */
  @JsonAdapter(DataTypeEnum.Adapter.class)
 public enum DataTypeEnum {
    TEXT("TEXT");

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

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private Integer employeeId;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private String effectiveDate;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_COST_CENTERS = "cost_centers";
  @SerializedName(SERIALIZED_NAME_COST_CENTERS)
  private List<CostCenter> costCenters = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY_SYMBOL = "currency_symbol";
  @SerializedName(SERIALIZED_NAME_CURRENCY_SYMBOL)
  private String currencySymbol;

  public DECSHistoricalAttribute() {
  }

  public DECSHistoricalAttribute attributeId(String attributeId) {
    
    
    
    
    this.attributeId = attributeId;
    return this;
  }

   /**
   * Get attributeId
   * @return attributeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "first_name", value = "")

  public String getAttributeId() {
    return attributeId;
  }


  public void setAttributeId(String attributeId) {
    
    
    
    this.attributeId = attributeId;
  }


  public DECSHistoricalAttribute dataType(DataTypeEnum dataType) {
    
    
    
    
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


  public DECSHistoricalAttribute value(String value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Robert", value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    
    
    
    this.value = value;
  }


  public DECSHistoricalAttribute employeeId(Integer employeeId) {
    
    
    
    
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


  public DECSHistoricalAttribute effectiveDate(String effectiveDate) {
    
    
    
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01T00:00:00.000Z", value = "")

  public String getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(String effectiveDate) {
    
    
    
    this.effectiveDate = effectiveDate;
  }


  public DECSHistoricalAttribute entityId(String entityId) {
    
    
    
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    
    
    
    this.entityId = entityId;
  }


  public DECSHistoricalAttribute duration(Integer duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    
    
    
    this.duration = duration;
  }


  public DECSHistoricalAttribute costCenters(List<CostCenter> costCenters) {
    
    
    
    
    this.costCenters = costCenters;
    return this;
  }

  public DECSHistoricalAttribute addCostCentersItem(CostCenter costCentersItem) {
    if (this.costCenters == null) {
      this.costCenters = new ArrayList<>();
    }
    this.costCenters.add(costCentersItem);
    return this;
  }

   /**
   * Get costCenters
   * @return costCenters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CostCenter> getCostCenters() {
    return costCenters;
  }


  public void setCostCenters(List<CostCenter> costCenters) {
    
    
    
    this.costCenters = costCenters;
  }


  public DECSHistoricalAttribute amount(String amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12.2", value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    
    
    this.amount = amount;
  }


  public DECSHistoricalAttribute currencySymbol(String currencySymbol) {
    
    
    
    
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Get currencySymbol
   * @return currencySymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "$", value = "")

  public String getCurrencySymbol() {
    return currencySymbol;
  }


  public void setCurrencySymbol(String currencySymbol) {
    
    
    
    this.currencySymbol = currencySymbol;
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
   * @return the DECSHistoricalAttribute instance itself
   */
  public DECSHistoricalAttribute putAdditionalProperty(String key, Object value) {
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
    DECSHistoricalAttribute deCSHistoricalAttribute = (DECSHistoricalAttribute) o;
    return Objects.equals(this.attributeId, deCSHistoricalAttribute.attributeId) &&
        Objects.equals(this.dataType, deCSHistoricalAttribute.dataType) &&
        Objects.equals(this.value, deCSHistoricalAttribute.value) &&
        Objects.equals(this.employeeId, deCSHistoricalAttribute.employeeId) &&
        Objects.equals(this.effectiveDate, deCSHistoricalAttribute.effectiveDate) &&
        Objects.equals(this.entityId, deCSHistoricalAttribute.entityId) &&
        Objects.equals(this.duration, deCSHistoricalAttribute.duration) &&
        Objects.equals(this.costCenters, deCSHistoricalAttribute.costCenters) &&
        Objects.equals(this.amount, deCSHistoricalAttribute.amount) &&
        Objects.equals(this.currencySymbol, deCSHistoricalAttribute.currencySymbol)&&
        Objects.equals(this.additionalProperties, deCSHistoricalAttribute.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeId, dataType, value, employeeId, effectiveDate, entityId, duration, costCenters, amount, currencySymbol, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DECSHistoricalAttribute {\n");
    sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    costCenters: ").append(toIndentedString(costCenters)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("employee_id");
    openapiFields.add("effective_date");
    openapiFields.add("entity_id");
    openapiFields.add("duration");
    openapiFields.add("cost_centers");
    openapiFields.add("amount");
    openapiFields.add("currency_symbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DECSHistoricalAttribute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DECSHistoricalAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DECSHistoricalAttribute is not found in the empty JSON string", DECSHistoricalAttribute.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("attribute_id") != null && !jsonObj.get("attribute_id").isJsonNull()) && !jsonObj.get("attribute_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attribute_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attribute_id").toString()));
      }
      if ((jsonObj.get("data_type") != null && !jsonObj.get("data_type").isJsonNull()) && !jsonObj.get("data_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_type").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("effective_date") != null && !jsonObj.get("effective_date").isJsonNull()) && !jsonObj.get("effective_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_date").toString()));
      }
      if ((jsonObj.get("entity_id") != null && !jsonObj.get("entity_id").isJsonNull()) && !jsonObj.get("entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_id").toString()));
      }
      if (jsonObj.get("cost_centers") != null && !jsonObj.get("cost_centers").isJsonNull()) {
        JsonArray jsonArraycostCenters = jsonObj.getAsJsonArray("cost_centers");
        if (jsonArraycostCenters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cost_centers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cost_centers` to be an array in the JSON string but got `%s`", jsonObj.get("cost_centers").toString()));
          }

          // validate the optional field `cost_centers` (array)
          for (int i = 0; i < jsonArraycostCenters.size(); i++) {
            CostCenter.validateJsonObject(jsonArraycostCenters.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("currency_symbol") != null && !jsonObj.get("currency_symbol").isJsonNull()) && !jsonObj.get("currency_symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_symbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DECSHistoricalAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DECSHistoricalAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DECSHistoricalAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DECSHistoricalAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<DECSHistoricalAttribute>() {
           @Override
           public void write(JsonWriter out, DECSHistoricalAttribute value) throws IOException {
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
           public DECSHistoricalAttribute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DECSHistoricalAttribute instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DECSHistoricalAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DECSHistoricalAttribute
  * @throws IOException if the JSON string is invalid with respect to DECSHistoricalAttribute
  */
  public static DECSHistoricalAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DECSHistoricalAttribute.class);
  }

 /**
  * Convert an instance of DECSHistoricalAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

