package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RecipeObjectMetaImages;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing this item&#x27;s compatibility grades for each supported diet
 */
@Schema(description = "An object containing this item's compatibility grades for each supported diet")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-09T22:27:46.582Z[GMT]")


public class RecipeObjectMeta   {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("images")
  private RecipeObjectMetaImages images = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("cuisine")
  private String cuisine = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("modified")
  private String modified = null;

  @JsonProperty("nutrients_notice")
  private String nutrientsNotice = null;

  public RecipeObjectMeta url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to the recipe. You must link back to the recipe when displaying it.
   * @return url
   **/
  @Schema(description = "URL to the recipe. You must link back to the recipe when displaying it.")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public RecipeObjectMeta images(RecipeObjectMetaImages images) {
    this.images = images;
    return this;
  }

  /**
   * Get images
   * @return images
   **/
  @Schema(description = "")
  
    @Valid
    public RecipeObjectMetaImages getImages() {
    return images;
  }

  public void setImages(RecipeObjectMetaImages images) {
    this.images = images;
  }

  public RecipeObjectMeta source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The source of the recipe. You must attribute this source when displaying this recipe.
   * @return source
   **/
  @Schema(description = "The source of the recipe. You must attribute this source when displaying this recipe.")
  
    public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public RecipeObjectMeta cuisine(String cuisine) {
    this.cuisine = cuisine;
    return this;
  }

  /**
   * This recipe's cuisine
   * @return cuisine
   **/
  @Schema(description = "This recipe's cuisine")
  
    public String getCuisine() {
    return cuisine;
  }

  public void setCuisine(String cuisine) {
    this.cuisine = cuisine;
  }

  public RecipeObjectMeta created(String created) {
    this.created = created;
    return this;
  }

  /**
   * The date when this recipe was created
   * @return created
   **/
  @Schema(description = "The date when this recipe was created")
  
    public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public RecipeObjectMeta modified(String modified) {
    this.modified = modified;
    return this;
  }

  /**
   * The date when this recipe was most recently modified
   * @return modified
   **/
  @Schema(description = "The date when this recipe was most recently modified")
  
    public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public RecipeObjectMeta nutrientsNotice(String nutrientsNotice) {
    this.nutrientsNotice = nutrientsNotice;
    return this;
  }

  /**
   * Additional information about this recipe's nutrients
   * @return nutrientsNotice
   **/
  @Schema(description = "Additional information about this recipe's nutrients")
  
    public String getNutrientsNotice() {
    return nutrientsNotice;
  }

  public void setNutrientsNotice(String nutrientsNotice) {
    this.nutrientsNotice = nutrientsNotice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectMeta recipeObjectMeta = (RecipeObjectMeta) o;
    return Objects.equals(this.url, recipeObjectMeta.url) &&
        Objects.equals(this.images, recipeObjectMeta.images) &&
        Objects.equals(this.source, recipeObjectMeta.source) &&
        Objects.equals(this.cuisine, recipeObjectMeta.cuisine) &&
        Objects.equals(this.created, recipeObjectMeta.created) &&
        Objects.equals(this.modified, recipeObjectMeta.modified) &&
        Objects.equals(this.nutrientsNotice, recipeObjectMeta.nutrientsNotice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, images, source, cuisine, created, modified, nutrientsNotice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectMeta {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    cuisine: ").append(toIndentedString(cuisine)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    nutrientsNotice: ").append(toIndentedString(nutrientsNotice)).append("\n");
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
