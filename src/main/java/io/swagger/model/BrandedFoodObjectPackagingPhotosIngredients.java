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
 * An object containing photos of the ingredients on this item&#x27;s packaging
 */
@ApiModel(description = "An object containing photos of the ingredients on this item's packaging")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T12:55:44.047Z[GMT]")
public class BrandedFoodObjectPackagingPhotosIngredients   {
  @JsonProperty("small")
  private String small = null;

  @JsonProperty("thumb")
  private String thumb = null;

  @JsonProperty("display")
  private String display = null;

  public BrandedFoodObjectPackagingPhotosIngredients small(String small) {
    this.small = small;
    return this;
  }

  /**
   * Small photo of the ingredients on this item's packaging
   * @return small
  **/
  @ApiModelProperty(value = "Small photo of the ingredients on this item's packaging")
  
    public String getSmall() {
    return small;
  }

  public void setSmall(String small) {
    this.small = small;
  }

  public BrandedFoodObjectPackagingPhotosIngredients thumb(String thumb) {
    this.thumb = thumb;
    return this;
  }

  /**
   * Thumbnail photo of the ingredients on this item's packaging
   * @return thumb
  **/
  @ApiModelProperty(value = "Thumbnail photo of the ingredients on this item's packaging")
  
    public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  public BrandedFoodObjectPackagingPhotosIngredients display(String display) {
    this.display = display;
    return this;
  }

  /**
   * Full-sized photo of the ingredients on this item's packaging
   * @return display
  **/
  @ApiModelProperty(value = "Full-sized photo of the ingredients on this item's packaging")
  
    public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectPackagingPhotosIngredients brandedFoodObjectPackagingPhotosIngredients = (BrandedFoodObjectPackagingPhotosIngredients) o;
    return Objects.equals(this.small, brandedFoodObjectPackagingPhotosIngredients.small) &&
        Objects.equals(this.thumb, brandedFoodObjectPackagingPhotosIngredients.thumb) &&
        Objects.equals(this.display, brandedFoodObjectPackagingPhotosIngredients.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(small, thumb, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackagingPhotosIngredients {\n");
    
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    thumb: ").append(toIndentedString(thumb)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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
