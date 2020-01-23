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
 * An object containing information on an individual ingredient that was flagged as potentially not being compatible with a certain diet
 */
@ApiModel(description = "An object containing information on an individual ingredient that was flagged as potentially not being compatible with a certain diet")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-23T17:11:28.155Z[GMT]")
public class BrandedFoodObjectDietFlags   {
  @JsonProperty("ingredient")
  private String ingredient = null;

  @JsonProperty("ingredient_description")
  private String ingredientDescription = null;

  @JsonProperty("diet_label")
  private String dietLabel = null;

  @JsonProperty("is_compatible")
  private String isCompatible = null;

  @JsonProperty("compatibility_level")
  private Integer compatibilityLevel = null;

  @JsonProperty("compatibility_description")
  private String compatibilityDescription = null;

  @JsonProperty("is_allergen")
  private Boolean isAllergen = null;

  public BrandedFoodObjectDietFlags ingredient(String ingredient) {
    this.ingredient = ingredient;
    return this;
  }

  /**
   * Ingredient name
   * @return ingredient
  **/
  @ApiModelProperty(value = "Ingredient name")
  
    public String getIngredient() {
    return ingredient;
  }

  public void setIngredient(String ingredient) {
    this.ingredient = ingredient;
  }

  public BrandedFoodObjectDietFlags ingredientDescription(String ingredientDescription) {
    this.ingredientDescription = ingredientDescription;
    return this;
  }

  /**
   * Description of the ingredient
   * @return ingredientDescription
  **/
  @ApiModelProperty(value = "Description of the ingredient")
  
    public String getIngredientDescription() {
    return ingredientDescription;
  }

  public void setIngredientDescription(String ingredientDescription) {
    this.ingredientDescription = ingredientDescription;
  }

  public BrandedFoodObjectDietFlags dietLabel(String dietLabel) {
    this.dietLabel = dietLabel;
    return this;
  }

  /**
   * Name of the diet with which this ingredient may not be compatible
   * @return dietLabel
  **/
  @ApiModelProperty(value = "Name of the diet with which this ingredient may not be compatible")
  
    public String getDietLabel() {
    return dietLabel;
  }

  public void setDietLabel(String dietLabel) {
    this.dietLabel = dietLabel;
  }

  public BrandedFoodObjectDietFlags isCompatible(String isCompatible) {
    this.isCompatible = isCompatible;
    return this;
  }

  /**
   * A description of if we believe this ingredient is compatible with the diet
   * @return isCompatible
  **/
  @ApiModelProperty(value = "A description of if we believe this ingredient is compatible with the diet")
  
    public String getIsCompatible() {
    return isCompatible;
  }

  public void setIsCompatible(String isCompatible) {
    this.isCompatible = isCompatible;
  }

  public BrandedFoodObjectDietFlags compatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
    return this;
  }

  /**
   * A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility
   * @return compatibilityLevel
  **/
  @ApiModelProperty(value = "A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility")
  
    public Integer getCompatibilityLevel() {
    return compatibilityLevel;
  }

  public void setCompatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
  }

  public BrandedFoodObjectDietFlags compatibilityDescription(String compatibilityDescription) {
    this.compatibilityDescription = compatibilityDescription;
    return this;
  }

  /**
   * A description of how we graded this ingredient for compatibility with the diet
   * @return compatibilityDescription
  **/
  @ApiModelProperty(value = "A description of how we graded this ingredient for compatibility with the diet")
  
    public String getCompatibilityDescription() {
    return compatibilityDescription;
  }

  public void setCompatibilityDescription(String compatibilityDescription) {
    this.compatibilityDescription = compatibilityDescription;
  }

  public BrandedFoodObjectDietFlags isAllergen(Boolean isAllergen) {
    this.isAllergen = isAllergen;
    return this;
  }

  /**
   * Boolean representing if the ingredient is a known allergen
   * @return isAllergen
  **/
  @ApiModelProperty(value = "Boolean representing if the ingredient is a known allergen")
  
    public Boolean isIsAllergen() {
    return isAllergen;
  }

  public void setIsAllergen(Boolean isAllergen) {
    this.isAllergen = isAllergen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectDietFlags brandedFoodObjectDietFlags = (BrandedFoodObjectDietFlags) o;
    return Objects.equals(this.ingredient, brandedFoodObjectDietFlags.ingredient) &&
        Objects.equals(this.ingredientDescription, brandedFoodObjectDietFlags.ingredientDescription) &&
        Objects.equals(this.dietLabel, brandedFoodObjectDietFlags.dietLabel) &&
        Objects.equals(this.isCompatible, brandedFoodObjectDietFlags.isCompatible) &&
        Objects.equals(this.compatibilityLevel, brandedFoodObjectDietFlags.compatibilityLevel) &&
        Objects.equals(this.compatibilityDescription, brandedFoodObjectDietFlags.compatibilityDescription) &&
        Objects.equals(this.isAllergen, brandedFoodObjectDietFlags.isAllergen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingredient, ingredientDescription, dietLabel, isCompatible, compatibilityLevel, compatibilityDescription, isAllergen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietFlags {\n");
    
    sb.append("    ingredient: ").append(toIndentedString(ingredient)).append("\n");
    sb.append("    ingredientDescription: ").append(toIndentedString(ingredientDescription)).append("\n");
    sb.append("    dietLabel: ").append(toIndentedString(dietLabel)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
    sb.append("    compatibilityLevel: ").append(toIndentedString(compatibilityLevel)).append("\n");
    sb.append("    compatibilityDescription: ").append(toIndentedString(compatibilityDescription)).append("\n");
    sb.append("    isAllergen: ").append(toIndentedString(isAllergen)).append("\n");
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
