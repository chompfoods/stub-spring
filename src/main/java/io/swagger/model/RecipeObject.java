package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RecipeObjectItems;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Please read the description of each field in this API response object example. By default, the value of each field is **null**. This indicates an unknown state or that no data exists.
 */
@Schema(description = "Please read the description of each field in this API response object example. By default, the value of each field is **null**. This indicates an unknown state or that no data exists.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-09T22:27:46.582Z[GMT]")


public class RecipeObject   {
  @JsonProperty("items")
  @Valid
  private List<RecipeObjectItems> items = null;

  public RecipeObject items(List<RecipeObjectItems> items) {
    this.items = items;
    return this;
  }

  public RecipeObject addItemsItem(RecipeObjectItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<RecipeObjectItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * An array containing an object for each individual item returned by your API call.
   * @return items
   **/
  @Schema(description = "An array containing an object for each individual item returned by your API call.")
      @Valid
    public List<RecipeObjectItems> getItems() {
    return items;
  }

  public void setItems(List<RecipeObjectItems> items) {
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
    RecipeObject recipeObject = (RecipeObject) o;
    return Objects.equals(this.items, recipeObject.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObject {\n");
    
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
