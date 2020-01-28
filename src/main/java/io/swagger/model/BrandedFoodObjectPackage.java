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
 * An object containing basic packaging information about this item
 */
@ApiModel(description = "An object containing basic packaging information about this item")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-28T13:14:16.027Z[GMT]")
public class BrandedFoodObjectPackage   {
  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("size")
  private String size = null;

  public BrandedFoodObjectPackage quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Package quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "Package quantity")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public BrandedFoodObjectPackage size(String size) {
    this.size = size;
    return this;
  }

  /**
   * Package size
   * @return size
  **/
  @ApiModelProperty(value = "Package size")
  
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
    BrandedFoodObjectPackage brandedFoodObjectPackage = (BrandedFoodObjectPackage) o;
    return Objects.equals(this.quantity, brandedFoodObjectPackage.quantity) &&
        Objects.equals(this.size, brandedFoodObjectPackage.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackage {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
