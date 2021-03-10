package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing information about a specific recipe ingredient
 */
@Schema(description = "An object containing information about a specific recipe ingredient")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-09T22:27:46.582Z[GMT]")


public class RecipeObjectIngredients   {
  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("description")
  private String description = null;

  public RecipeObjectIngredients quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity of this ingredient
   * @return quantity
   **/
  @Schema(description = "The quantity of this ingredient")
  
    public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public RecipeObjectIngredients description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of this ingredient
   * @return description
   **/
  @Schema(description = "A description of this ingredient")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectIngredients recipeObjectIngredients = (RecipeObjectIngredients) o;
    return Objects.equals(this.quantity, recipeObjectIngredients.quantity) &&
        Objects.equals(this.description, recipeObjectIngredients.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectIngredients {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
