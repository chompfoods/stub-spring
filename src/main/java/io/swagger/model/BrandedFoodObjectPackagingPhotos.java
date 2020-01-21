package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BrandedFoodObjectPackagingPhotosFront;
import io.swagger.model.BrandedFoodObjectPackagingPhotosIngredients;
import io.swagger.model.BrandedFoodObjectPackagingPhotosNutrition;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A object containing a collection of photos of this item&#x27;s packaging
 */
@ApiModel(description = "A object containing a collection of photos of this item's packaging")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-21T14:08:32.116Z[GMT]")
public class BrandedFoodObjectPackagingPhotos   {
  @JsonProperty("front")
  private BrandedFoodObjectPackagingPhotosFront front = null;

  @JsonProperty("nutrition")
  private BrandedFoodObjectPackagingPhotosNutrition nutrition = null;

  @JsonProperty("ingredients")
  private BrandedFoodObjectPackagingPhotosIngredients ingredients = null;

  public BrandedFoodObjectPackagingPhotos front(BrandedFoodObjectPackagingPhotosFront front) {
    this.front = front;
    return this;
  }

  /**
   * Get front
   * @return front
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectPackagingPhotosFront getFront() {
    return front;
  }

  public void setFront(BrandedFoodObjectPackagingPhotosFront front) {
    this.front = front;
  }

  public BrandedFoodObjectPackagingPhotos nutrition(BrandedFoodObjectPackagingPhotosNutrition nutrition) {
    this.nutrition = nutrition;
    return this;
  }

  /**
   * Get nutrition
   * @return nutrition
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectPackagingPhotosNutrition getNutrition() {
    return nutrition;
  }

  public void setNutrition(BrandedFoodObjectPackagingPhotosNutrition nutrition) {
    this.nutrition = nutrition;
  }

  public BrandedFoodObjectPackagingPhotos ingredients(BrandedFoodObjectPackagingPhotosIngredients ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  /**
   * Get ingredients
   * @return ingredients
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectPackagingPhotosIngredients getIngredients() {
    return ingredients;
  }

  public void setIngredients(BrandedFoodObjectPackagingPhotosIngredients ingredients) {
    this.ingredients = ingredients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectPackagingPhotos brandedFoodObjectPackagingPhotos = (BrandedFoodObjectPackagingPhotos) o;
    return Objects.equals(this.front, brandedFoodObjectPackagingPhotos.front) &&
        Objects.equals(this.nutrition, brandedFoodObjectPackagingPhotos.nutrition) &&
        Objects.equals(this.ingredients, brandedFoodObjectPackagingPhotos.ingredients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(front, nutrition, ingredients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackagingPhotos {\n");
    
    sb.append("    front: ").append(toIndentedString(front)).append("\n");
    sb.append("    nutrition: ").append(toIndentedString(nutrition)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
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
