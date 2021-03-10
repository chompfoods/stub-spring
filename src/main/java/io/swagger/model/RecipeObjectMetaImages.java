package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing this recipe&#x27;s image URLs
 */
@Schema(description = "An object containing this recipe's image URLs")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-09T22:27:46.582Z[GMT]")


public class RecipeObjectMetaImages   {
  @JsonProperty("extra_large")
  private String extraLarge = null;

  @JsonProperty("large")
  private String large = null;

  @JsonProperty("standard")
  private String standard = null;

  @JsonProperty("grid_view")
  private String gridView = null;

  @JsonProperty("small")
  private String small = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

  @JsonProperty("extra_small")
  private String extraSmall = null;

  public RecipeObjectMetaImages extraLarge(String extraLarge) {
    this.extraLarge = extraLarge;
    return this;
  }

  /**
   * Extra large recipe image
   * @return extraLarge
   **/
  @Schema(description = "Extra large recipe image")
  
    public String getExtraLarge() {
    return extraLarge;
  }

  public void setExtraLarge(String extraLarge) {
    this.extraLarge = extraLarge;
  }

  public RecipeObjectMetaImages large(String large) {
    this.large = large;
    return this;
  }

  /**
   * Large recipe image
   * @return large
   **/
  @Schema(description = "Large recipe image")
  
    public String getLarge() {
    return large;
  }

  public void setLarge(String large) {
    this.large = large;
  }

  public RecipeObjectMetaImages standard(String standard) {
    this.standard = standard;
    return this;
  }

  /**
   * Standard recipe image
   * @return standard
   **/
  @Schema(description = "Standard recipe image")
  
    public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }

  public RecipeObjectMetaImages gridView(String gridView) {
    this.gridView = gridView;
    return this;
  }

  /**
   * Grid view recipe image
   * @return gridView
   **/
  @Schema(description = "Grid view recipe image")
  
    public String getGridView() {
    return gridView;
  }

  public void setGridView(String gridView) {
    this.gridView = gridView;
  }

  public RecipeObjectMetaImages small(String small) {
    this.small = small;
    return this;
  }

  /**
   * Small recipe image
   * @return small
   **/
  @Schema(description = "Small recipe image")
  
    public String getSmall() {
    return small;
  }

  public void setSmall(String small) {
    this.small = small;
  }

  public RecipeObjectMetaImages thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Thumbnail recipe image
   * @return thumbnail
   **/
  @Schema(description = "Thumbnail recipe image")
  
    public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public RecipeObjectMetaImages extraSmall(String extraSmall) {
    this.extraSmall = extraSmall;
    return this;
  }

  /**
   * Extra small recipe image
   * @return extraSmall
   **/
  @Schema(description = "Extra small recipe image")
  
    public String getExtraSmall() {
    return extraSmall;
  }

  public void setExtraSmall(String extraSmall) {
    this.extraSmall = extraSmall;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectMetaImages recipeObjectMetaImages = (RecipeObjectMetaImages) o;
    return Objects.equals(this.extraLarge, recipeObjectMetaImages.extraLarge) &&
        Objects.equals(this.large, recipeObjectMetaImages.large) &&
        Objects.equals(this.standard, recipeObjectMetaImages.standard) &&
        Objects.equals(this.gridView, recipeObjectMetaImages.gridView) &&
        Objects.equals(this.small, recipeObjectMetaImages.small) &&
        Objects.equals(this.thumbnail, recipeObjectMetaImages.thumbnail) &&
        Objects.equals(this.extraSmall, recipeObjectMetaImages.extraSmall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraLarge, large, standard, gridView, small, thumbnail, extraSmall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectMetaImages {\n");
    
    sb.append("    extraLarge: ").append(toIndentedString(extraLarge)).append("\n");
    sb.append("    large: ").append(toIndentedString(large)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    gridView: ").append(toIndentedString(gridView)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    extraSmall: ").append(toIndentedString(extraSmall)).append("\n");
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
