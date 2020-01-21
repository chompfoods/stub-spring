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
 * An object containing information on a specific food portion found in this item
 */
@ApiModel(description = "An object containing information on a specific food portion found in this item")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-21T23:19:12.618Z[GMT]")
public class BrandedFoodObjectPortions   {
  @JsonProperty("measurement_unit")
  private String measurementUnit = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("modifier")
  private String modifier = null;

  @JsonProperty("gram_weight")
  private BigDecimal gramWeight = null;

  @JsonProperty("data_points")
  private Integer dataPoints = null;

  @JsonProperty("footnote")
  private String footnote = null;

  public BrandedFoodObjectPortions measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

  /**
   * The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)
   * @return measurementUnit
  **/
  @ApiModelProperty(value = "The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)")
  
    public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public BrandedFoodObjectPortions description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.
   * @return description
  **/
  @ApiModelProperty(value = "Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BrandedFoodObjectPortions modifier(String modifier) {
    this.modifier = modifier;
    return this;
  }

  /**
   * Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)
   * @return modifier
  **/
  @ApiModelProperty(value = "Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)")
  
    public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public BrandedFoodObjectPortions gramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
    return this;
  }

  /**
   * The weight of the measure in grams
   * @return gramWeight
  **/
  @ApiModelProperty(value = "The weight of the measure in grams")
  
    @Valid
    public BigDecimal getGramWeight() {
    return gramWeight;
  }

  public void setGramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
  }

  public BrandedFoodObjectPortions dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  /**
   * The number of observations on which the measure is based
   * @return dataPoints
  **/
  @ApiModelProperty(value = "The number of observations on which the measure is based")
  
    public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  public BrandedFoodObjectPortions footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

  /**
   * Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.
   * @return footnote
  **/
  @ApiModelProperty(value = "Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.")
  
    public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectPortions brandedFoodObjectPortions = (BrandedFoodObjectPortions) o;
    return Objects.equals(this.measurementUnit, brandedFoodObjectPortions.measurementUnit) &&
        Objects.equals(this.description, brandedFoodObjectPortions.description) &&
        Objects.equals(this.modifier, brandedFoodObjectPortions.modifier) &&
        Objects.equals(this.gramWeight, brandedFoodObjectPortions.gramWeight) &&
        Objects.equals(this.dataPoints, brandedFoodObjectPortions.dataPoints) &&
        Objects.equals(this.footnote, brandedFoodObjectPortions.footnote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurementUnit, description, modifier, gramWeight, dataPoints, footnote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPortions {\n");
    
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    gramWeight: ").append(toIndentedString(gramWeight)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
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
