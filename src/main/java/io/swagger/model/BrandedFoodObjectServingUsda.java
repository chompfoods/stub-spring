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
 * Serving information from the USDA
 */
@ApiModel(description = "Serving information from the USDA")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-23T13:13:51.429Z[GMT]")
public class BrandedFoodObjectServingUsda   {
  @JsonProperty("size")
  private String size = null;

  @JsonProperty("measurement_unit")
  private String measurementUnit = null;

  @JsonProperty("size_fulltext")
  private String sizeFulltext = null;

  public BrandedFoodObjectServingUsda size(String size) {
    this.size = size;
    return this;
  }

  /**
   * Serving size
   * @return size
  **/
  @ApiModelProperty(value = "Serving size")
  
    public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public BrandedFoodObjectServingUsda measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

  /**
   * Measurement unit for each serving (e.g. if measure is 3 tsp, the unit is tsp)
   * @return measurementUnit
  **/
  @ApiModelProperty(value = "Measurement unit for each serving (e.g. if measure is 3 tsp, the unit is tsp)")
  
    public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public BrandedFoodObjectServingUsda sizeFulltext(String sizeFulltext) {
    this.sizeFulltext = sizeFulltext;
    return this;
  }

  /**
   * Serving size description
   * @return sizeFulltext
  **/
  @ApiModelProperty(value = "Serving size description")
  
    public String getSizeFulltext() {
    return sizeFulltext;
  }

  public void setSizeFulltext(String sizeFulltext) {
    this.sizeFulltext = sizeFulltext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectServingUsda brandedFoodObjectServingUsda = (BrandedFoodObjectServingUsda) o;
    return Objects.equals(this.size, brandedFoodObjectServingUsda.size) &&
        Objects.equals(this.measurementUnit, brandedFoodObjectServingUsda.measurementUnit) &&
        Objects.equals(this.sizeFulltext, brandedFoodObjectServingUsda.sizeFulltext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, measurementUnit, sizeFulltext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectServingUsda {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    sizeFulltext: ").append(toIndentedString(sizeFulltext)).append("\n");
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
