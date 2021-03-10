package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing information for a specific nutrient found in this food item
 */
@Schema(description = "An object containing information for a specific nutrient found in this food item")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-09T22:27:46.582Z[GMT]")


public class IngredientObjectNutrients   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("per_100g")
  private BigDecimal per100g = null;

  @JsonProperty("measurement_unit")
  private String measurementUnit = null;

  @JsonProperty("min")
  private BigDecimal min = null;

  @JsonProperty("max")
  private BigDecimal max = null;

  @JsonProperty("median")
  private BigDecimal median = null;

  @JsonProperty("rank")
  private Integer rank = null;

  @JsonProperty("data_points")
  private Integer dataPoints = null;

  @JsonProperty("footnote")
  private String footnote = null;

  @JsonProperty("description")
  private String description = null;

  public IngredientObjectNutrients name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nutrient name
   * @return name
   **/
  @Schema(description = "Nutrient name")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IngredientObjectNutrients per100g(BigDecimal per100g) {
    this.per100g = per100g;
    return this;
  }

  /**
   * Amount of the nutrient per 100g of food
   * @return per100g
   **/
  @Schema(description = "Amount of the nutrient per 100g of food")
  
    @Valid
    public BigDecimal getPer100g() {
    return per100g;
  }

  public void setPer100g(BigDecimal per100g) {
    this.per100g = per100g;
  }

  public IngredientObjectNutrients measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

  /**
   * The unit used for the measure of this nutrient
   * @return measurementUnit
   **/
  @Schema(description = "The unit used for the measure of this nutrient")
  
    public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public IngredientObjectNutrients min(BigDecimal min) {
    this.min = min;
    return this;
  }

  /**
   * Minimum nutrient value
   * @return min
   **/
  @Schema(description = "Minimum nutrient value")
  
    @Valid
    public BigDecimal getMin() {
    return min;
  }

  public void setMin(BigDecimal min) {
    this.min = min;
  }

  public IngredientObjectNutrients max(BigDecimal max) {
    this.max = max;
    return this;
  }

  /**
   * Maximum nutrient value
   * @return max
   **/
  @Schema(description = "Maximum nutrient value")
  
    @Valid
    public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }

  public IngredientObjectNutrients median(BigDecimal median) {
    this.median = median;
    return this;
  }

  /**
   * Median nutrient value
   * @return median
   **/
  @Schema(description = "Median nutrient value")
  
    @Valid
    public BigDecimal getMedian() {
    return median;
  }

  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  public IngredientObjectNutrients rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Nutrient rank
   * @return rank
   **/
  @Schema(description = "Nutrient rank")
  
    public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public IngredientObjectNutrients dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  /**
   * Number of observations on which the value is based
   * @return dataPoints
   **/
  @Schema(description = "Number of observations on which the value is based")
  
    public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  public IngredientObjectNutrients footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

  /**
   * Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.
   * @return footnote
   **/
  @Schema(description = "Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.")
  
    public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }

  public IngredientObjectNutrients description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the nutrient source
   * @return description
   **/
  @Schema(description = "Description of the nutrient source")
  
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
    IngredientObjectNutrients ingredientObjectNutrients = (IngredientObjectNutrients) o;
    return Objects.equals(this.name, ingredientObjectNutrients.name) &&
        Objects.equals(this.per100g, ingredientObjectNutrients.per100g) &&
        Objects.equals(this.measurementUnit, ingredientObjectNutrients.measurementUnit) &&
        Objects.equals(this.min, ingredientObjectNutrients.min) &&
        Objects.equals(this.max, ingredientObjectNutrients.max) &&
        Objects.equals(this.median, ingredientObjectNutrients.median) &&
        Objects.equals(this.rank, ingredientObjectNutrients.rank) &&
        Objects.equals(this.dataPoints, ingredientObjectNutrients.dataPoints) &&
        Objects.equals(this.footnote, ingredientObjectNutrients.footnote) &&
        Objects.equals(this.description, ingredientObjectNutrients.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, per100g, measurementUnit, min, max, median, rank, dataPoints, footnote, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectNutrients {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
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
