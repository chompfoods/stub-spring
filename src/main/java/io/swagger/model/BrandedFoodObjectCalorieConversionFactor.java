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
 * An object containing the multiplication factors to be used when calculating energy from macronutrients for a specific food.
 */
@ApiModel(description = "An object containing the multiplication factors to be used when calculating energy from macronutrients for a specific food.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T12:55:44.047Z[GMT]")
public class BrandedFoodObjectCalorieConversionFactor   {
  @JsonProperty("protein_value")
  private BigDecimal proteinValue = null;

  @JsonProperty("fat_value")
  private BigDecimal fatValue = null;

  @JsonProperty("carbohydrate_value")
  private BigDecimal carbohydrateValue = null;

  public BrandedFoodObjectCalorieConversionFactor proteinValue(BigDecimal proteinValue) {
    this.proteinValue = proteinValue;
    return this;
  }

  /**
   * The multiplication factor for protein
   * @return proteinValue
  **/
  @ApiModelProperty(value = "The multiplication factor for protein")
  
    @Valid
    public BigDecimal getProteinValue() {
    return proteinValue;
  }

  public void setProteinValue(BigDecimal proteinValue) {
    this.proteinValue = proteinValue;
  }

  public BrandedFoodObjectCalorieConversionFactor fatValue(BigDecimal fatValue) {
    this.fatValue = fatValue;
    return this;
  }

  /**
   * The multiplication factor for fat
   * @return fatValue
  **/
  @ApiModelProperty(value = "The multiplication factor for fat")
  
    @Valid
    public BigDecimal getFatValue() {
    return fatValue;
  }

  public void setFatValue(BigDecimal fatValue) {
    this.fatValue = fatValue;
  }

  public BrandedFoodObjectCalorieConversionFactor carbohydrateValue(BigDecimal carbohydrateValue) {
    this.carbohydrateValue = carbohydrateValue;
    return this;
  }

  /**
   * The multiplication factor for carbohydrates
   * @return carbohydrateValue
  **/
  @ApiModelProperty(value = "The multiplication factor for carbohydrates")
  
    @Valid
    public BigDecimal getCarbohydrateValue() {
    return carbohydrateValue;
  }

  public void setCarbohydrateValue(BigDecimal carbohydrateValue) {
    this.carbohydrateValue = carbohydrateValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectCalorieConversionFactor brandedFoodObjectCalorieConversionFactor = (BrandedFoodObjectCalorieConversionFactor) o;
    return Objects.equals(this.proteinValue, brandedFoodObjectCalorieConversionFactor.proteinValue) &&
        Objects.equals(this.fatValue, brandedFoodObjectCalorieConversionFactor.fatValue) &&
        Objects.equals(this.carbohydrateValue, brandedFoodObjectCalorieConversionFactor.carbohydrateValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proteinValue, fatValue, carbohydrateValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectCalorieConversionFactor {\n");
    
    sb.append("    proteinValue: ").append(toIndentedString(proteinValue)).append("\n");
    sb.append("    fatValue: ").append(toIndentedString(fatValue)).append("\n");
    sb.append("    carbohydrateValue: ").append(toIndentedString(carbohydrateValue)).append("\n");
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
