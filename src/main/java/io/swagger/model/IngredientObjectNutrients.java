package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BrandedFoodObjectNutrientsUsda;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing nutrient information from each source
 */
@ApiModel(description = "An object containing nutrient information from each source")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T15:36:20.847Z[GMT]")
public class IngredientObjectNutrients   {
  @JsonProperty("usda")
  @Valid
  private List<BrandedFoodObjectNutrientsUsda> usda = null;

  public IngredientObjectNutrients usda(List<BrandedFoodObjectNutrientsUsda> usda) {
    this.usda = usda;
    return this;
  }

  public IngredientObjectNutrients addUsdaItem(BrandedFoodObjectNutrientsUsda usdaItem) {
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
    IngredientObjectNutrients ingredientObjectNutrients = (IngredientObjectNutrients) o;
    return Objects.equals(this.usda, ingredientObjectNutrients.usda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectNutrients {\n");
    
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
