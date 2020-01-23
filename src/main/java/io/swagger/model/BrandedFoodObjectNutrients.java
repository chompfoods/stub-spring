package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing information for a specific nutrient found in this food item
 */
@ApiModel(description = "An object containing information for a specific nutrient found in this food item")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-23T17:11:28.155Z[GMT]")
public class BrandedFoodObjectNutrients   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("per_100g")
  private BigDecimal per100g = null;

  @JsonProperty("measurement_unit")
  private String measurementUnit = null;

  @JsonProperty("rank")
  private Integer rank = null;

  @JsonProperty("data_points")
  private Integer dataPoints = null;

  @JsonProperty("description")
  private String description = null;

  public BrandedFoodObjectNutrients name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nutrient name
   * @return name
  **/
  @ApiModelProperty(value = "Nutrient name")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrandedFoodObjectNutrients per100g(BigDecimal per100g) {
    this.per100g = per100g;
    return this;
  }

  /**
   * Amount of the nutrient per 100g of food
   * @return per100g
  **/
  @ApiModelProperty(value = "Amount of the nutrient per 100g of food")
  
    @Valid
    public BigDecimal getPer100g() {
    return per100g;
  }

  public void setPer100g(BigDecimal per100g) {
    this.per100g = per100g;
  }

  public BrandedFoodObjectNutrients measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

  /**
   * The unit used for the measure of this nutrient
   * @return measurementUnit
  **/
  @ApiModelProperty(value = "The unit used for the measure of this nutrient")
  
    public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public BrandedFoodObjectNutrients rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Nutrient rank
   * @return rank
  **/
  @ApiModelProperty(value = "Nutrient rank")
  
    public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public BrandedFoodObjectNutrients dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  /**
   * Number of observations on which the value is based
   * @return dataPoints
  **/
  @ApiModelProperty(value = "Number of observations on which the value is based")
  
    public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  public BrandedFoodObjectNutrients description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the nutrient source
   * @return description
  **/
  @ApiModelProperty(value = "Description of the nutrient source")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectNutrients brandedFoodObjectNutrients = (BrandedFoodObjectNutrients) o;
    return Objects.equals(this.name, brandedFoodObjectNutrients.name) &&
        Objects.equals(this.per100g, brandedFoodObjectNutrients.per100g) &&
        Objects.equals(this.measurementUnit, brandedFoodObjectNutrients.measurementUnit) &&
        Objects.equals(this.rank, brandedFoodObjectNutrients.rank) &&
        Objects.equals(this.dataPoints, brandedFoodObjectNutrients.dataPoints) &&
        Objects.equals(this.description, brandedFoodObjectNutrients.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, per100g, measurementUnit, rank, dataPoints, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrients {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
