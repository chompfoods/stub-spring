package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RecipeObjectNutrientsCalories;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing nutrient information for this recipe
 */
@Schema(description = "An object containing nutrient information for this recipe")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-09T22:27:46.582Z[GMT]")


public class RecipeObjectNutrients   {
  @JsonProperty("calories")
  @Valid
  private List<RecipeObjectNutrientsCalories> calories = null;

  @JsonProperty("daily_values")
  @Valid
  private List<RecipeObjectNutrientsCalories> dailyValues = null;

  @JsonProperty("fat")
  @Valid
  private List<RecipeObjectNutrientsCalories> fat = null;

  @JsonProperty("carbs")
  @Valid
  private List<RecipeObjectNutrientsCalories> carbs = null;

  @JsonProperty("vitamins")
  @Valid
  private List<RecipeObjectNutrientsCalories> vitamins = null;

  public RecipeObjectNutrients calories(List<RecipeObjectNutrientsCalories> calories) {
    this.calories = calories;
    return this;
  }

  public RecipeObjectNutrients addCaloriesItem(RecipeObjectNutrientsCalories caloriesItem) {
    if (this.calories == null) {
      this.calories = new ArrayList<RecipeObjectNutrientsCalories>();
    }
    this.calories.add(caloriesItem);
    return this;
  }

  /**
   * An array containing information for calories found in this recipe
   * @return calories
   **/
  @Schema(description = "An array containing information for calories found in this recipe")
      @Valid
    public List<RecipeObjectNutrientsCalories> getCalories() {
    return calories;
  }

  public void setCalories(List<RecipeObjectNutrientsCalories> calories) {
    this.calories = calories;
  }

  public RecipeObjectNutrients dailyValues(List<RecipeObjectNutrientsCalories> dailyValues) {
    this.dailyValues = dailyValues;
    return this;
  }

  public RecipeObjectNutrients addDailyValuesItem(RecipeObjectNutrientsCalories dailyValuesItem) {
    if (this.dailyValues == null) {
      this.dailyValues = new ArrayList<RecipeObjectNutrientsCalories>();
    }
    this.dailyValues.add(dailyValuesItem);
    return this;
  }

  /**
   * An array containing information for this recipe's daily recommended value of certain nutrients
   * @return dailyValues
   **/
  @Schema(description = "An array containing information for this recipe's daily recommended value of certain nutrients")
      @Valid
    public List<RecipeObjectNutrientsCalories> getDailyValues() {
    return dailyValues;
  }

  public void setDailyValues(List<RecipeObjectNutrientsCalories> dailyValues) {
    this.dailyValues = dailyValues;
  }

  public RecipeObjectNutrients fat(List<RecipeObjectNutrientsCalories> fat) {
    this.fat = fat;
    return this;
  }

  public RecipeObjectNutrients addFatItem(RecipeObjectNutrientsCalories fatItem) {
    if (this.fat == null) {
      this.fat = new ArrayList<RecipeObjectNutrientsCalories>();
    }
    this.fat.add(fatItem);
    return this;
  }

  /**
   * An array containing information for fat found in this recipe
   * @return fat
   **/
  @Schema(description = "An array containing information for fat found in this recipe")
      @Valid
    public List<RecipeObjectNutrientsCalories> getFat() {
    return fat;
  }

  public void setFat(List<RecipeObjectNutrientsCalories> fat) {
    this.fat = fat;
  }

  public RecipeObjectNutrients carbs(List<RecipeObjectNutrientsCalories> carbs) {
    this.carbs = carbs;
    return this;
  }

  public RecipeObjectNutrients addCarbsItem(RecipeObjectNutrientsCalories carbsItem) {
    if (this.carbs == null) {
      this.carbs = new ArrayList<RecipeObjectNutrientsCalories>();
    }
    this.carbs.add(carbsItem);
    return this;
  }

  /**
   * An array containing information for carbs found in this recipe
   * @return carbs
   **/
  @Schema(description = "An array containing information for carbs found in this recipe")
      @Valid
    public List<RecipeObjectNutrientsCalories> getCarbs() {
    return carbs;
  }

  public void setCarbs(List<RecipeObjectNutrientsCalories> carbs) {
    this.carbs = carbs;
  }

  public RecipeObjectNutrients vitamins(List<RecipeObjectNutrientsCalories> vitamins) {
    this.vitamins = vitamins;
    return this;
  }

  public RecipeObjectNutrients addVitaminsItem(RecipeObjectNutrientsCalories vitaminsItem) {
    if (this.vitamins == null) {
      this.vitamins = new ArrayList<RecipeObjectNutrientsCalories>();
    }
    this.vitamins.add(vitaminsItem);
    return this;
  }

  /**
   * An array containing information for vitamins found in this recipe
   * @return vitamins
   **/
  @Schema(description = "An array containing information for vitamins found in this recipe")
      @Valid
    public List<RecipeObjectNutrientsCalories> getVitamins() {
    return vitamins;
  }

  public void setVitamins(List<RecipeObjectNutrientsCalories> vitamins) {
    this.vitamins = vitamins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectNutrients recipeObjectNutrients = (RecipeObjectNutrients) o;
    return Objects.equals(this.calories, recipeObjectNutrients.calories) &&
        Objects.equals(this.dailyValues, recipeObjectNutrients.dailyValues) &&
        Objects.equals(this.fat, recipeObjectNutrients.fat) &&
        Objects.equals(this.carbs, recipeObjectNutrients.carbs) &&
        Objects.equals(this.vitamins, recipeObjectNutrients.vitamins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calories, dailyValues, fat, carbs, vitamins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectNutrients {\n");
    
    sb.append("    calories: ").append(toIndentedString(calories)).append("\n");
    sb.append("    dailyValues: ").append(toIndentedString(dailyValues)).append("\n");
    sb.append("    fat: ").append(toIndentedString(fat)).append("\n");
    sb.append("    carbs: ").append(toIndentedString(carbs)).append("\n");
    sb.append("    vitamins: ").append(toIndentedString(vitamins)).append("\n");
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
