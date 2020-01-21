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
 * BrandedFoodObjectNutrientsUsda
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-21T23:19:12.618Z[GMT]")
public class BrandedFoodObjectNutrientsUsda   {
  @JsonProperty("id")
  private Integer id = null;

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

  public BrandedFoodObjectNutrientsUsda id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Nutrient ID
   * @return id
  **/
  @ApiModelProperty(value = "Nutrient ID")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BrandedFoodObjectNutrientsUsda name(String name) {
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

  public BrandedFoodObjectNutrientsUsda per100g(BigDecimal per100g) {
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

  public BrandedFoodObjectNutrientsUsda measurementUnit(String measurementUnit) {
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

  public BrandedFoodObjectNutrientsUsda min(BigDecimal min) {
    this.min = min;
    return this;
  }

  /**
   * Minimum nutrient value
   * @return min
  **/
  @ApiModelProperty(value = "Minimum nutrient value")
  
    @Valid
    public BigDecimal getMin() {
    return min;
  }

  public void setMin(BigDecimal min) {
    this.min = min;
  }

  public BrandedFoodObjectNutrientsUsda max(BigDecimal max) {
    this.max = max;
    return this;
  }

  /**
   * Maximum nutrient value
   * @return max
  **/
  @ApiModelProperty(value = "Maximum nutrient value")
  
    @Valid
    public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }

  public BrandedFoodObjectNutrientsUsda median(BigDecimal median) {
    this.median = median;
    return this;
  }

  /**
   * Median nutrient value
   * @return median
  **/
  @ApiModelProperty(value = "Median nutrient value")
  
    @Valid
    public BigDecimal getMedian() {
    return median;
  }

  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  public BrandedFoodObjectNutrientsUsda rank(Integer rank) {
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

  public BrandedFoodObjectNutrientsUsda dataPoints(Integer dataPoints) {
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

  public BrandedFoodObjectNutrientsUsda footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

  /**
   * Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.
   * @return footnote
  **/
  @ApiModelProperty(value = "Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.")
  
    public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }

  public BrandedFoodObjectNutrientsUsda description(String description) {
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
    BrandedFoodObjectNutrientsUsda brandedFoodObjectNutrientsUsda = (BrandedFoodObjectNutrientsUsda) o;
    return Objects.equals(this.id, brandedFoodObjectNutrientsUsda.id) &&
        Objects.equals(this.name, brandedFoodObjectNutrientsUsda.name) &&
        Objects.equals(this.per100g, brandedFoodObjectNutrientsUsda.per100g) &&
        Objects.equals(this.measurementUnit, brandedFoodObjectNutrientsUsda.measurementUnit) &&
        Objects.equals(this.min, brandedFoodObjectNutrientsUsda.min) &&
        Objects.equals(this.max, brandedFoodObjectNutrientsUsda.max) &&
        Objects.equals(this.median, brandedFoodObjectNutrientsUsda.median) &&
        Objects.equals(this.rank, brandedFoodObjectNutrientsUsda.rank) &&
        Objects.equals(this.dataPoints, brandedFoodObjectNutrientsUsda.dataPoints) &&
        Objects.equals(this.footnote, brandedFoodObjectNutrientsUsda.footnote) &&
        Objects.equals(this.description, brandedFoodObjectNutrientsUsda.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, per100g, measurementUnit, min, max, median, rank, dataPoints, footnote, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrientsUsda {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
