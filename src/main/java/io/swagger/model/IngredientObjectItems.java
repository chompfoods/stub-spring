package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BrandedFoodObjectDietLabels;
import io.swagger.model.IngredientObjectCalorieConversionFactor;
import io.swagger.model.IngredientObjectComponents;
import io.swagger.model.IngredientObjectNutrients;
import io.swagger.model.IngredientObjectPortions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing information for this specific item.
 */
@ApiModel(description = "An object containing information for this specific item.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-24T13:21:53.301Z[GMT]")
public class IngredientObjectItems   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("categories")
  @Valid
  private List<String> categories = null;

  @JsonProperty("nutrients")
  @Valid
  private List<IngredientObjectNutrients> nutrients = null;

  @JsonProperty("calorie_conversion_factor")
  private IngredientObjectCalorieConversionFactor calorieConversionFactor = null;

  @JsonProperty("protein_conversion_factor")
  private BigDecimal proteinConversionFactor = null;

  @JsonProperty("diet_labels")
  private BrandedFoodObjectDietLabels dietLabels = null;

  @JsonProperty("components")
  @Valid
  private List<IngredientObjectComponents> components = null;

  @JsonProperty("portions")
  @Valid
  private List<IngredientObjectPortions> portions = null;

  @JsonProperty("common_name")
  private String commonName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("footnote")
  private String footnote = null;

  public IngredientObjectItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Item name as provided by brand owner or as shown on packaging
   * @return name
  **/
  @ApiModelProperty(value = "Item name as provided by brand owner or as shown on packaging")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IngredientObjectItems categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public IngredientObjectItems addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public IngredientObjectItems nutrients(List<IngredientObjectNutrients> nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  public IngredientObjectItems addNutrientsItem(IngredientObjectNutrients nutrientsItem) {
    if (this.nutrients == null) {
      this.nutrients = new ArrayList<IngredientObjectNutrients>();
    }
    this.nutrients.add(nutrientsItem);
    return this;
  }

  /**
   * An array containing nutrient informatio objects for this food item
   * @return nutrients
  **/
  @ApiModelProperty(value = "An array containing nutrient informatio objects for this food item")
      @Valid
    public List<IngredientObjectNutrients> getNutrients() {
    return nutrients;
  }

  public void setNutrients(List<IngredientObjectNutrients> nutrients) {
    this.nutrients = nutrients;
  }

  public IngredientObjectItems calorieConversionFactor(IngredientObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
    return this;
  }

  /**
   * Get calorieConversionFactor
   * @return calorieConversionFactor
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public IngredientObjectCalorieConversionFactor getCalorieConversionFactor() {
    return calorieConversionFactor;
  }

  public void setCalorieConversionFactor(IngredientObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
  }

  public IngredientObjectItems proteinConversionFactor(BigDecimal proteinConversionFactor) {
    this.proteinConversionFactor = proteinConversionFactor;
    return this;
  }

  /**
   * The multiplication factor used to calculate protein from nitrogen
   * @return proteinConversionFactor
  **/
  @ApiModelProperty(value = "The multiplication factor used to calculate protein from nitrogen")
  
    @Valid
    public BigDecimal getProteinConversionFactor() {
    return proteinConversionFactor;
  }

  public void setProteinConversionFactor(BigDecimal proteinConversionFactor) {
    this.proteinConversionFactor = proteinConversionFactor;
  }

  public IngredientObjectItems dietLabels(BrandedFoodObjectDietLabels dietLabels) {
    this.dietLabels = dietLabels;
    return this;
  }

  /**
   * Get dietLabels
   * @return dietLabels
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectDietLabels getDietLabels() {
    return dietLabels;
  }

  public void setDietLabels(BrandedFoodObjectDietLabels dietLabels) {
    this.dietLabels = dietLabels;
  }

  public IngredientObjectItems components(List<IngredientObjectComponents> components) {
    this.components = components;
    return this;
  }

  public IngredientObjectItems addComponentsItem(IngredientObjectComponents componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<IngredientObjectComponents>();
    }
    this.components.add(componentsItem);
    return this;
  }

  /**
   * An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)
   * @return components
  **/
  @ApiModelProperty(value = "An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)")
      @Valid
    public List<IngredientObjectComponents> getComponents() {
    return components;
  }

  public void setComponents(List<IngredientObjectComponents> components) {
    this.components = components;
  }

  public IngredientObjectItems portions(List<IngredientObjectPortions> portions) {
    this.portions = portions;
    return this;
  }

  public IngredientObjectItems addPortionsItem(IngredientObjectPortions portionsItem) {
    if (this.portions == null) {
      this.portions = new ArrayList<IngredientObjectPortions>();
    }
    this.portions.add(portionsItem);
    return this;
  }

  /**
   * An array of objects containing information on discrete amounts of a food found in this item
   * @return portions
  **/
  @ApiModelProperty(value = "An array of objects containing information on discrete amounts of a food found in this item")
      @Valid
    public List<IngredientObjectPortions> getPortions() {
    return portions;
  }

  public void setPortions(List<IngredientObjectPortions> portions) {
    this.portions = portions;
  }

  public IngredientObjectItems commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }

  /**
   * Common name associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")
   * @return commonName
  **/
  @ApiModelProperty(value = "Common name associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")")
  
    public String getCommonName() {
    return commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  public IngredientObjectItems description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of this item
   * @return description
  **/
  @ApiModelProperty(value = "A description of this item")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IngredientObjectItems footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

  /**
   * Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.
   * @return footnote
  **/
  @ApiModelProperty(value = "Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.")
  
    public String getFootnote() {
    return footnote;
  }

  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientObjectItems ingredientObjectItems = (IngredientObjectItems) o;
    return Objects.equals(this.name, ingredientObjectItems.name) &&
        Objects.equals(this.categories, ingredientObjectItems.categories) &&
        Objects.equals(this.nutrients, ingredientObjectItems.nutrients) &&
        Objects.equals(this.calorieConversionFactor, ingredientObjectItems.calorieConversionFactor) &&
        Objects.equals(this.proteinConversionFactor, ingredientObjectItems.proteinConversionFactor) &&
        Objects.equals(this.dietLabels, ingredientObjectItems.dietLabels) &&
        Objects.equals(this.components, ingredientObjectItems.components) &&
        Objects.equals(this.portions, ingredientObjectItems.portions) &&
        Objects.equals(this.commonName, ingredientObjectItems.commonName) &&
        Objects.equals(this.description, ingredientObjectItems.description) &&
        Objects.equals(this.footnote, ingredientObjectItems.footnote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, categories, nutrients, calorieConversionFactor, proteinConversionFactor, dietLabels, components, portions, commonName, description, footnote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectItems {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    calorieConversionFactor: ").append(toIndentedString(calorieConversionFactor)).append("\n");
    sb.append("    proteinConversionFactor: ").append(toIndentedString(proteinConversionFactor)).append("\n");
    sb.append("    dietLabels: ").append(toIndentedString(dietLabels)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    portions: ").append(toIndentedString(portions)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
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
