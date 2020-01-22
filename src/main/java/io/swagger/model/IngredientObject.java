package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.IngredientObjectItems;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T15:36:20.847Z[GMT]")
public class IngredientObject   {
  @JsonProperty("items")
  @Valid
  private List<IngredientObjectItems> items = null;

  public IngredientObject items(List<IngredientObjectItems> items) {
    this.items = items;
    return this;
  }

  public IngredientObject addItemsItem(IngredientObjectItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<IngredientObjectItems>();
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
    public List<IngredientObjectItems> getItems() {
    return items;
  }

  public void setItems(List<IngredientObjectItems> items) {
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
    IngredientObject ingredientObject = (IngredientObject) o;
    return Objects.equals(this.items, ingredientObject.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObject {\n");
    
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
