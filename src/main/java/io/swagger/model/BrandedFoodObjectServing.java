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
 * An object containing serving information for this item
 */
@ApiModel(description = "An object containing serving information for this item")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-20T16:28:37.395Z[GMT]")
public class BrandedFoodObjectServing   {
  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("measurement_unit")
  private String measurementUnit = null;

  @JsonProperty("size_fulltext")
  private String sizeFulltext = null;

  @JsonProperty("total")
  private Integer total = null;

  public BrandedFoodObjectServing size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Serving size
   * @return size
  **/
  @ApiModelProperty(value = "Serving size")
  
    public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public BrandedFoodObjectServing measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

  /**
   * Serving measurement unit (e.g. if measure is 3 tsp, the unit is tsp)
   * @return measurementUnit
  **/
  @ApiModelProperty(value = "Serving measurement unit (e.g. if measure is 3 tsp, the unit is tsp)")
  
    public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public BrandedFoodObjectServing sizeFulltext(String sizeFulltext) {
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

  public BrandedFoodObjectServing total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total servings
   * @return total
  **/
  @ApiModelProperty(value = "Total servings")
  
    public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectServing brandedFoodObjectServing = (BrandedFoodObjectServing) o;
    return Objects.equals(this.size, brandedFoodObjectServing.size) &&
        Objects.equals(this.measurementUnit, brandedFoodObjectServing.measurementUnit) &&
        Objects.equals(this.sizeFulltext, brandedFoodObjectServing.sizeFulltext) &&
        Objects.equals(this.total, brandedFoodObjectServing.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, measurementUnit, sizeFulltext, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectServing {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    sizeFulltext: ").append(toIndentedString(sizeFulltext)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
