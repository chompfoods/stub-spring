package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BrandedFoodObjectItems;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Please read the description of each field in this API response object example. By default, the value of each field is __null__. This indicates an unknown state or that no data exists.
 */
@ApiModel(description = "Please read the description of each field in this API response object example. By default, the value of each field is __null__. This indicates an unknown state or that no data exists.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-18T16:42:42.583Z[GMT]")
public class BrandedFoodObject   {
  @JsonProperty("items")
  @Valid
  private List<BrandedFoodObjectItems> items = null;

  public BrandedFoodObject items(List<BrandedFoodObjectItems> items) {
    this.items = items;
    return this;
  }

  public BrandedFoodObject addItemsItem(BrandedFoodObjectItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<BrandedFoodObjectItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * An array containing an object for each individual item returned by your API call.
   * @return items
  **/
  @ApiModelProperty(value = "An array containing an object for each individual item returned by your API call.")
      @Valid
    public List<BrandedFoodObjectItems> getItems() {
    return items;
  }

  public void setItems(List<BrandedFoodObjectItems> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObject brandedFoodObject = (BrandedFoodObject) o;
    return Objects.equals(this.items, brandedFoodObject.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObject {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
