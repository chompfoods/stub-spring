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
 * BrandedFoodObjectNutrientsChomp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T19:40:24.844Z[GMT]")
public class BrandedFoodObjectNutrientsChomp   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("measurement_unit")
  private String measurementUnit = null;

  @JsonProperty("per_100g")
  private BigDecimal per100g = null;

  @JsonProperty("per_serving")
  private BigDecimal perServing = null;

  @JsonProperty("total")
  private BigDecimal total = null;

  public BrandedFoodObjectNutrientsChomp name(String name) {
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

  public BrandedFoodObjectNutrientsChomp measurementUnit(String measurementUnit) {
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

  public BrandedFoodObjectNutrientsChomp per100g(BigDecimal per100g) {
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

  public BrandedFoodObjectNutrientsChomp perServing(BigDecimal perServing) {
    this.perServing = perServing;
    return this;
  }

  /**
   * Nutrient value per serving
   * @return perServing
  **/
  @ApiModelProperty(value = "Nutrient value per serving")
  
    @Valid
    public BigDecimal getPerServing() {
    return perServing;
  }

  public void setPerServing(BigDecimal perServing) {
    this.perServing = perServing;
  }

  public BrandedFoodObjectNutrientsChomp total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Total nutrient value
   * @return total
  **/
  @ApiModelProperty(value = "Total nutrient value")
  
    @Valid
    public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectNutrientsChomp brandedFoodObjectNutrientsChomp = (BrandedFoodObjectNutrientsChomp) o;
    return Objects.equals(this.name, brandedFoodObjectNutrientsChomp.name) &&
        Objects.equals(this.measurementUnit, brandedFoodObjectNutrientsChomp.measurementUnit) &&
        Objects.equals(this.per100g, brandedFoodObjectNutrientsChomp.per100g) &&
        Objects.equals(this.perServing, brandedFoodObjectNutrientsChomp.perServing) &&
        Objects.equals(this.total, brandedFoodObjectNutrientsChomp.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, measurementUnit, per100g, perServing, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrientsChomp {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    perServing: ").append(toIndentedString(perServing)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
