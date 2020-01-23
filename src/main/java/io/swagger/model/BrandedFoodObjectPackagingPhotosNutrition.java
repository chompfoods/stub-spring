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
 * An object containing photos of this item&#x27;s nutrition label
 */
@ApiModel(description = "An object containing photos of this item's nutrition label")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-23T13:07:59.789Z[GMT]")
public class BrandedFoodObjectPackagingPhotosNutrition   {
  @JsonProperty("small")
  private String small = null;

  @JsonProperty("thumb")
  private String thumb = null;

  @JsonProperty("display")
  private String display = null;

  public BrandedFoodObjectPackagingPhotosNutrition small(String small) {
    this.small = small;
    return this;
  }

  /**
   * Small photo of this item's nutrition label
   * @return small
  **/
  @ApiModelProperty(value = "Small photo of this item's nutrition label")
  
    public String getSmall() {
    return small;
  }

  public void setSmall(String small) {
    this.small = small;
  }

  public BrandedFoodObjectPackagingPhotosNutrition thumb(String thumb) {
    this.thumb = thumb;
    return this;
  }

  /**
   * Thumbnail photo of this item's nutrition label
   * @return thumb
  **/
  @ApiModelProperty(value = "Thumbnail photo of this item's nutrition label")
  
    public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  public BrandedFoodObjectPackagingPhotosNutrition display(String display) {
    this.display = display;
    return this;
  }

  /**
   * Full-sized photo of this item's nutrition label
   * @return display
  **/
  @ApiModelProperty(value = "Full-sized photo of this item's nutrition label")
  
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
    BrandedFoodObjectPackagingPhotosNutrition brandedFoodObjectPackagingPhotosNutrition = (BrandedFoodObjectPackagingPhotosNutrition) o;
    return Objects.equals(this.small, brandedFoodObjectPackagingPhotosNutrition.small) &&
        Objects.equals(this.thumb, brandedFoodObjectPackagingPhotosNutrition.thumb) &&
        Objects.equals(this.display, brandedFoodObjectPackagingPhotosNutrition.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(small, thumb, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackagingPhotosNutrition {\n");
    
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
