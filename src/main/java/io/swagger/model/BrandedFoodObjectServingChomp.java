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
 * Serving information from Chomp&#x27;s internal database
 */
@ApiModel(description = "Serving information from Chomp's internal database")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T15:36:20.847Z[GMT]")
public class BrandedFoodObjectServingChomp   {
  @JsonProperty("size")
  private String size = null;

  public BrandedFoodObjectServingChomp size(String size) {
    this.size = size;
    return this;
  }

  /**
   * Serving size with measurement unit (e.g. if measure is 3 tsp, the unit is tsp)
   * @return size
  **/
  @ApiModelProperty(value = "Serving size with measurement unit (e.g. if measure is 3 tsp, the unit is tsp)")
  
    public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectServingChomp brandedFoodObjectServingChomp = (BrandedFoodObjectServingChomp) o;
    return Objects.equals(this.size, brandedFoodObjectServingChomp.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectServingChomp {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
