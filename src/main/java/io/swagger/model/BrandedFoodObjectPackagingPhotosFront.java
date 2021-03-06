package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing photos of the front of this item&#x27;s packaging
 */
@Schema(description = "An object containing photos of the front of this item's packaging")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-09T22:27:46.582Z[GMT]")


public class BrandedFoodObjectPackagingPhotosFront   {
  @JsonProperty("small")
  private String small = null;

  @JsonProperty("thumb")
  private String thumb = null;

  @JsonProperty("display")
  private String display = null;

  public BrandedFoodObjectPackagingPhotosFront small(String small) {
    this.small = small;
    return this;
  }

  /**
   * Small photo of the front of this item's packaging
   * @return small
   **/
  @Schema(description = "Small photo of the front of this item's packaging")
  
    public String getSmall() {
    return small;
  }

  public void setSmall(String small) {
    this.small = small;
  }

  public BrandedFoodObjectPackagingPhotosFront thumb(String thumb) {
    this.thumb = thumb;
    return this;
  }

  /**
   * Thumbnail photo of the front of this item's packaging
   * @return thumb
   **/
  @Schema(description = "Thumbnail photo of the front of this item's packaging")
  
    public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  public BrandedFoodObjectPackagingPhotosFront display(String display) {
    this.display = display;
    return this;
  }

  /**
   * Full-sized photo of the front of this item's packaging
   * @return display
   **/
  @Schema(description = "Full-sized photo of the front of this item's packaging")
  
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
    BrandedFoodObjectPackagingPhotosFront brandedFoodObjectPackagingPhotosFront = (BrandedFoodObjectPackagingPhotosFront) o;
    return Objects.equals(this.small, brandedFoodObjectPackagingPhotosFront.small) &&
        Objects.equals(this.thumb, brandedFoodObjectPackagingPhotosFront.thumb) &&
        Objects.equals(this.display, brandedFoodObjectPackagingPhotosFront.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(small, thumb, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackagingPhotosFront {\n");
    
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
