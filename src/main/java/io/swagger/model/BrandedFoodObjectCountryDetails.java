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
 * An object containing additional information on the countries where this item is found
 */
@ApiModel(description = "An object containing additional information on the countries where this item is found")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-18T16:53:00.929Z[GMT]")
public class BrandedFoodObjectCountryDetails   {
  @JsonProperty("english_speaking")
  private Integer englishSpeaking = null;

  @JsonProperty("non_english_speaking")
  private Integer nonEnglishSpeaking = null;

  public BrandedFoodObjectCountryDetails englishSpeaking(Integer englishSpeaking) {
    this.englishSpeaking = englishSpeaking;
    return this;
  }

  /**
   * The number of countries where English is the country's primary language
   * @return englishSpeaking
  **/
  @ApiModelProperty(value = "The number of countries where English is the country's primary language")
  
    public Integer getEnglishSpeaking() {
    return englishSpeaking;
  }

  public void setEnglishSpeaking(Integer englishSpeaking) {
    this.englishSpeaking = englishSpeaking;
  }

  public BrandedFoodObjectCountryDetails nonEnglishSpeaking(Integer nonEnglishSpeaking) {
    this.nonEnglishSpeaking = nonEnglishSpeaking;
    return this;
  }

  /**
   * The number of countries where English is not the country's primary language
   * @return nonEnglishSpeaking
  **/
  @ApiModelProperty(value = "The number of countries where English is not the country's primary language")
  
    public Integer getNonEnglishSpeaking() {
    return nonEnglishSpeaking;
  }

  public void setNonEnglishSpeaking(Integer nonEnglishSpeaking) {
    this.nonEnglishSpeaking = nonEnglishSpeaking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectCountryDetails brandedFoodObjectCountryDetails = (BrandedFoodObjectCountryDetails) o;
    return Objects.equals(this.englishSpeaking, brandedFoodObjectCountryDetails.englishSpeaking) &&
        Objects.equals(this.nonEnglishSpeaking, brandedFoodObjectCountryDetails.nonEnglishSpeaking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(englishSpeaking, nonEnglishSpeaking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectCountryDetails {\n");
    
    sb.append("    englishSpeaking: ").append(toIndentedString(englishSpeaking)).append("\n");
    sb.append("    nonEnglishSpeaking: ").append(toIndentedString(nonEnglishSpeaking)).append("\n");
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
