package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing this item&#x27;s ingredients in order of highest value to least
 */
@ApiModel(description = "An object containing this item's ingredients in order of highest value to least")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T13:41:42.080Z[GMT]")
public class BrandedFoodObjectIngredients   {
  @JsonProperty("chomp")
  private String chomp = null;

  @JsonProperty("usda")
  private String usda = null;

  public BrandedFoodObjectIngredients chomp(String chomp) {
    this.chomp = chomp;
    return this;
  }

  /**
   * This item's ingredients as seen on ChompThis.com
   * @return chomp
  **/
  @ApiModelProperty(value = "This item's ingredients as seen on ChompThis.com")
  
    public String getChomp() {
    return chomp;
  }

  public void setChomp(String chomp) {
    this.chomp = chomp;
  }

  public BrandedFoodObjectIngredients usda(String usda) {
    this.usda = usda;
    return this;
  }

  /**
   * This branded food item's ingredients according to the USDA
   * @return usda
  **/
  @ApiModelProperty(value = "This branded food item's ingredients according to the USDA")
  
    public String getUsda() {
    return usda;
  }

  public void setUsda(String usda) {
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
    BrandedFoodObjectIngredients brandedFoodObjectIngredients = (BrandedFoodObjectIngredients) o;
    return Objects.equals(this.chomp, brandedFoodObjectIngredients.chomp) &&
        Objects.equals(this.usda, brandedFoodObjectIngredients.usda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chomp, usda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectIngredients {\n");
    
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
