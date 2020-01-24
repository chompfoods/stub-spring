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
 * An object containing information on this item&#x27;s compatibility with Vegetarian diets
 */
@ApiModel(description = "An object containing information on this item's compatibility with Vegetarian diets")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-24T13:22:21.983Z[GMT]")
public class BrandedFoodObjectDietLabelsVegetarian   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("is_compatible")
  private Boolean isCompatible = null;

  @JsonProperty("compatibility_level")
  private Integer compatibilityLevel = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  @JsonProperty("confidence_description")
  private String confidenceDescription = null;

  public BrandedFoodObjectDietLabelsVegetarian name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Diet name
   * @return name
  **/
  @ApiModelProperty(value = "Diet name")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrandedFoodObjectDietLabelsVegetarian isCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
    return this;
  }

  /**
   * Boolean describing if this item is compatible with this diet
   * @return isCompatible
  **/
  @ApiModelProperty(value = "Boolean describing if this item is compatible with this diet")
  
    public Boolean isIsCompatible() {
    return isCompatible;
  }

  public void setIsCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
  }

  public BrandedFoodObjectDietLabelsVegetarian compatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
    return this;
  }

  /**
   * Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility
   * @return compatibilityLevel
  **/
  @ApiModelProperty(value = "Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility")
  
    public Integer getCompatibilityLevel() {
    return compatibilityLevel;
  }

  public void setCompatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
  }

  public BrandedFoodObjectDietLabelsVegetarian confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Boolean that indicates if we are confident in how this item is graded for this diet
   * @return confidence
  **/
  @ApiModelProperty(value = "Boolean that indicates if we are confident in how this item is graded for this diet")
  
    public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  public BrandedFoodObjectDietLabelsVegetarian confidenceDescription(String confidenceDescription) {
    this.confidenceDescription = confidenceDescription;
    return this;
  }

  /**
   * Description of our confidence that this item was graded correctly
   * @return confidenceDescription
  **/
  @ApiModelProperty(value = "Description of our confidence that this item was graded correctly")
  
    public String getConfidenceDescription() {
    return confidenceDescription;
  }

  public void setConfidenceDescription(String confidenceDescription) {
    this.confidenceDescription = confidenceDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectDietLabelsVegetarian brandedFoodObjectDietLabelsVegetarian = (BrandedFoodObjectDietLabelsVegetarian) o;
    return Objects.equals(this.name, brandedFoodObjectDietLabelsVegetarian.name) &&
        Objects.equals(this.isCompatible, brandedFoodObjectDietLabelsVegetarian.isCompatible) &&
        Objects.equals(this.compatibilityLevel, brandedFoodObjectDietLabelsVegetarian.compatibilityLevel) &&
        Objects.equals(this.confidence, brandedFoodObjectDietLabelsVegetarian.confidence) &&
        Objects.equals(this.confidenceDescription, brandedFoodObjectDietLabelsVegetarian.confidenceDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isCompatible, compatibilityLevel, confidence, confidenceDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietLabelsVegetarian {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
    sb.append("    compatibilityLevel: ").append(toIndentedString(compatibilityLevel)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    confidenceDescription: ").append(toIndentedString(confidenceDescription)).append("\n");
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
