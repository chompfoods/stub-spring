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
 * An object containing information on this item&#x27;s compatibility with the Vegan diets
 */
@ApiModel(description = "An object containing information on this item's compatibility with the Vegan diets")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-24T14:21:11.694Z[GMT]")
public class BrandedFoodObjectDietLabelsVegan   {
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

  public BrandedFoodObjectDietLabelsVegan name(String name) {
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

  public BrandedFoodObjectDietLabelsVegan isCompatible(Boolean isCompatible) {
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

  public BrandedFoodObjectDietLabelsVegan compatibilityLevel(Integer compatibilityLevel) {
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

  public BrandedFoodObjectDietLabelsVegan confidence(Integer confidence) {
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

  public BrandedFoodObjectDietLabelsVegan confidenceDescription(String confidenceDescription) {
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
    BrandedFoodObjectDietLabelsVegan brandedFoodObjectDietLabelsVegan = (BrandedFoodObjectDietLabelsVegan) o;
    return Objects.equals(this.name, brandedFoodObjectDietLabelsVegan.name) &&
        Objects.equals(this.isCompatible, brandedFoodObjectDietLabelsVegan.isCompatible) &&
        Objects.equals(this.compatibilityLevel, brandedFoodObjectDietLabelsVegan.compatibilityLevel) &&
        Objects.equals(this.confidence, brandedFoodObjectDietLabelsVegan.confidence) &&
        Objects.equals(this.confidenceDescription, brandedFoodObjectDietLabelsVegan.confidenceDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isCompatible, compatibilityLevel, confidence, confidenceDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietLabelsVegan {\n");
    
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
