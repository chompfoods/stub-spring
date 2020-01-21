package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BrandedFoodObjectDietLabelsGlutenFree;
import io.swagger.model.BrandedFoodObjectDietLabelsVegan;
import io.swagger.model.BrandedFoodObjectDietLabelsVegetarian;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing this item&#x27;s compatibility grades for each supported diet
 */
@ApiModel(description = "An object containing this item's compatibility grades for each supported diet")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-21T14:08:32.116Z[GMT]")
public class BrandedFoodObjectDietLabels   {
  @JsonProperty("vegan")
  private BrandedFoodObjectDietLabelsVegan vegan = null;

  @JsonProperty("vegetarian")
  private BrandedFoodObjectDietLabelsVegetarian vegetarian = null;

  @JsonProperty("gluten_free")
  private BrandedFoodObjectDietLabelsGlutenFree glutenFree = null;

  public BrandedFoodObjectDietLabels vegan(BrandedFoodObjectDietLabelsVegan vegan) {
    this.vegan = vegan;
    return this;
  }

  /**
   * Get vegan
   * @return vegan
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectDietLabelsVegan getVegan() {
    return vegan;
  }

  public void setVegan(BrandedFoodObjectDietLabelsVegan vegan) {
    this.vegan = vegan;
  }

  public BrandedFoodObjectDietLabels vegetarian(BrandedFoodObjectDietLabelsVegetarian vegetarian) {
    this.vegetarian = vegetarian;
    return this;
  }

  /**
   * Get vegetarian
   * @return vegetarian
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectDietLabelsVegetarian getVegetarian() {
    return vegetarian;
  }

  public void setVegetarian(BrandedFoodObjectDietLabelsVegetarian vegetarian) {
    this.vegetarian = vegetarian;
  }

  public BrandedFoodObjectDietLabels glutenFree(BrandedFoodObjectDietLabelsGlutenFree glutenFree) {
    this.glutenFree = glutenFree;
    return this;
  }

  /**
   * Get glutenFree
   * @return glutenFree
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectDietLabelsGlutenFree getGlutenFree() {
    return glutenFree;
  }

  public void setGlutenFree(BrandedFoodObjectDietLabelsGlutenFree glutenFree) {
    this.glutenFree = glutenFree;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectDietLabels brandedFoodObjectDietLabels = (BrandedFoodObjectDietLabels) o;
    return Objects.equals(this.vegan, brandedFoodObjectDietLabels.vegan) &&
        Objects.equals(this.vegetarian, brandedFoodObjectDietLabels.vegetarian) &&
        Objects.equals(this.glutenFree, brandedFoodObjectDietLabels.glutenFree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vegan, vegetarian, glutenFree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietLabels {\n");
    
    sb.append("    vegan: ").append(toIndentedString(vegan)).append("\n");
    sb.append("    vegetarian: ").append(toIndentedString(vegetarian)).append("\n");
    sb.append("    glutenFree: ").append(toIndentedString(glutenFree)).append("\n");
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
