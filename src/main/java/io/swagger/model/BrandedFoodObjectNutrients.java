package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BrandedFoodObjectNutrientsChomp;
import io.swagger.model.BrandedFoodObjectNutrientsUsda;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing nutrient information from multiple sources
 */
@ApiModel(description = "An object containing nutrient information from multiple sources")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-21T23:19:12.618Z[GMT]")
public class BrandedFoodObjectNutrients   {
  @JsonProperty("chomp")
  @Valid
  private List<BrandedFoodObjectNutrientsChomp> chomp = null;

  @JsonProperty("usda")
  @Valid
  private List<BrandedFoodObjectNutrientsUsda> usda = null;

  public BrandedFoodObjectNutrients chomp(List<BrandedFoodObjectNutrientsChomp> chomp) {
    this.chomp = chomp;
    return this;
  }

  public BrandedFoodObjectNutrients addChompItem(BrandedFoodObjectNutrientsChomp chompItem) {
    if (this.chomp == null) {
      this.chomp = new ArrayList<BrandedFoodObjectNutrientsChomp>();
    }
    this.chomp.add(chompItem);
    return this;
  }

  /**
   * An array containing an object for each nutrient data point
   * @return chomp
  **/
  @ApiModelProperty(value = "An array containing an object for each nutrient data point")
      @Valid
    public List<BrandedFoodObjectNutrientsChomp> getChomp() {
    return chomp;
  }

  public void setChomp(List<BrandedFoodObjectNutrientsChomp> chomp) {
    this.chomp = chomp;
  }

  public BrandedFoodObjectNutrients usda(List<BrandedFoodObjectNutrientsUsda> usda) {
    this.usda = usda;
    return this;
  }

  public BrandedFoodObjectNutrients addUsdaItem(BrandedFoodObjectNutrientsUsda usdaItem) {
    if (this.usda == null) {
      this.usda = new ArrayList<BrandedFoodObjectNutrientsUsda>();
    }
    this.usda.add(usdaItem);
    return this;
  }

  /**
   * An array containing an object for each nutrient data point as found in the USDA database
   * @return usda
  **/
  @ApiModelProperty(value = "An array containing an object for each nutrient data point as found in the USDA database")
      @Valid
    public List<BrandedFoodObjectNutrientsUsda> getUsda() {
    return usda;
  }

  public void setUsda(List<BrandedFoodObjectNutrientsUsda> usda) {
    this.usda = usda;
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
    return Objects.equals(this.chomp, brandedFoodObjectNutrients.chomp) &&
        Objects.equals(this.usda, brandedFoodObjectNutrients.usda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chomp, usda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrients {\n");
    
    sb.append("    chomp: ").append(toIndentedString(chomp)).append("\n");
    sb.append("    usda: ").append(toIndentedString(usda)).append("\n");
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
