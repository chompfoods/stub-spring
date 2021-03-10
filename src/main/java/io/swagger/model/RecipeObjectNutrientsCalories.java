package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecipeObjectNutrientsCalories
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-09T22:27:46.582Z[GMT]")


public class RecipeObjectNutrientsCalories   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("percent")
  private String percent = null;

  public RecipeObjectNutrientsCalories title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Nutrient name
   * @return title
   **/
  @Schema(description = "Nutrient name")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RecipeObjectNutrientsCalories value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The amount of this nutrient in this recipe
   * @return value
   **/
  @Schema(description = "The amount of this nutrient in this recipe")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public RecipeObjectNutrientsCalories percent(String percent) {
    this.percent = percent;
    return this;
  }

  /**
   * The daily recommended percent total for this nutrient
   * @return percent
   **/
  @Schema(description = "The daily recommended percent total for this nutrient")
  
    public String getPercent() {
    return percent;
  }

  public void setPercent(String percent) {
    this.percent = percent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectNutrientsCalories recipeObjectNutrientsCalories = (RecipeObjectNutrientsCalories) o;
    return Objects.equals(this.title, recipeObjectNutrientsCalories.title) &&
        Objects.equals(this.value, recipeObjectNutrientsCalories.value) &&
        Objects.equals(this.percent, recipeObjectNutrientsCalories.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, value, percent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectNutrientsCalories {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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
