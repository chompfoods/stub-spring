package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RecipeObjectAttributes;
import io.swagger.model.RecipeObjectIngredients;
import io.swagger.model.RecipeObjectMeta;
import io.swagger.model.RecipeObjectNutrients;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing information for this specific item.
 */
@Schema(description = "An object containing information for this specific item.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-09T22:27:46.582Z[GMT]")


public class RecipeObjectItems   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("meta")
  private RecipeObjectMeta meta = null;

  @JsonProperty("categories")
  @Valid
  private List<String> categories = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("keywords")
  @Valid
  private List<String> keywords = null;

  @JsonProperty("topics")
  @Valid
  private List<String> topics = null;

  @JsonProperty("attributes")
  private RecipeObjectAttributes attributes = null;

  @JsonProperty("ingredients")
  @Valid
  private List<RecipeObjectIngredients> ingredients = null;

  @JsonProperty("base_ingredients")
  @Valid
  private List<String> baseIngredients = null;

  @JsonProperty("nutrients")
  private RecipeObjectNutrients nutrients = null;

  @JsonProperty("diabetic_exchanges")
  @Valid
  private List<String> diabeticExchanges = null;

  public RecipeObjectItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique recipe ID
   * @return id
   **/
  @Schema(description = "Unique recipe ID")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RecipeObjectItems title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Recipe title
   * @return title
   **/
  @Schema(description = "Recipe title")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RecipeObjectItems meta(RecipeObjectMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   **/
  @Schema(description = "")
  
    @Valid
    public RecipeObjectMeta getMeta() {
    return meta;
  }

  public void setMeta(RecipeObjectMeta meta) {
    this.meta = meta;
  }

  public RecipeObjectItems categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public RecipeObjectItems addCategoriesItem(String categoriesItem) {
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
  @Schema(description = "")
  
    public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public RecipeObjectItems author(String author) {
    this.author = author;
    return this;
  }

  /**
   * The author of this recipe. You must attribute this author when displaying this recipe.
   * @return author
   **/
  @Schema(description = "The author of this recipe. You must attribute this author when displaying this recipe.")
  
    public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public RecipeObjectItems keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public RecipeObjectItems addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<String>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * Get keywords
   * @return keywords
   **/
  @Schema(description = "")
  
    public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public RecipeObjectItems topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public RecipeObjectItems addTopicsItem(String topicsItem) {
    if (this.topics == null) {
      this.topics = new ArrayList<String>();
    }
    this.topics.add(topicsItem);
    return this;
  }

  /**
   * Get topics
   * @return topics
   **/
  @Schema(description = "")
  
    public List<String> getTopics() {
    return topics;
  }

  public void setTopics(List<String> topics) {
    this.topics = topics;
  }

  public RecipeObjectItems attributes(RecipeObjectAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   **/
  @Schema(description = "")
  
    @Valid
    public RecipeObjectAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(RecipeObjectAttributes attributes) {
    this.attributes = attributes;
  }

  public RecipeObjectItems ingredients(List<RecipeObjectIngredients> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  public RecipeObjectItems addIngredientsItem(RecipeObjectIngredients ingredientsItem) {
    if (this.ingredients == null) {
      this.ingredients = new ArrayList<RecipeObjectIngredients>();
    }
    this.ingredients.add(ingredientsItem);
    return this;
  }

  /**
   * An array containing this recipe's ingredients
   * @return ingredients
   **/
  @Schema(description = "An array containing this recipe's ingredients")
      @Valid
    public List<RecipeObjectIngredients> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<RecipeObjectIngredients> ingredients) {
    this.ingredients = ingredients;
  }

  public RecipeObjectItems baseIngredients(List<String> baseIngredients) {
    this.baseIngredients = baseIngredients;
    return this;
  }

  public RecipeObjectItems addBaseIngredientsItem(String baseIngredientsItem) {
    if (this.baseIngredients == null) {
      this.baseIngredients = new ArrayList<String>();
    }
    this.baseIngredients.add(baseIngredientsItem);
    return this;
  }

  /**
   * Get baseIngredients
   * @return baseIngredients
   **/
  @Schema(description = "")
  
    public List<String> getBaseIngredients() {
    return baseIngredients;
  }

  public void setBaseIngredients(List<String> baseIngredients) {
    this.baseIngredients = baseIngredients;
  }

  public RecipeObjectItems nutrients(RecipeObjectNutrients nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  /**
   * Get nutrients
   * @return nutrients
   **/
  @Schema(description = "")
  
    @Valid
    public RecipeObjectNutrients getNutrients() {
    return nutrients;
  }

  public void setNutrients(RecipeObjectNutrients nutrients) {
    this.nutrients = nutrients;
  }

  public RecipeObjectItems diabeticExchanges(List<String> diabeticExchanges) {
    this.diabeticExchanges = diabeticExchanges;
    return this;
  }

  public RecipeObjectItems addDiabeticExchangesItem(String diabeticExchangesItem) {
    if (this.diabeticExchanges == null) {
      this.diabeticExchanges = new ArrayList<String>();
    }
    this.diabeticExchanges.add(diabeticExchangesItem);
    return this;
  }

  /**
   * Get diabeticExchanges
   * @return diabeticExchanges
   **/
  @Schema(description = "")
  
    public List<String> getDiabeticExchanges() {
    return diabeticExchanges;
  }

  public void setDiabeticExchanges(List<String> diabeticExchanges) {
    this.diabeticExchanges = diabeticExchanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectItems recipeObjectItems = (RecipeObjectItems) o;
    return Objects.equals(this.id, recipeObjectItems.id) &&
        Objects.equals(this.title, recipeObjectItems.title) &&
        Objects.equals(this.meta, recipeObjectItems.meta) &&
        Objects.equals(this.categories, recipeObjectItems.categories) &&
        Objects.equals(this.author, recipeObjectItems.author) &&
        Objects.equals(this.keywords, recipeObjectItems.keywords) &&
        Objects.equals(this.topics, recipeObjectItems.topics) &&
        Objects.equals(this.attributes, recipeObjectItems.attributes) &&
        Objects.equals(this.ingredients, recipeObjectItems.ingredients) &&
        Objects.equals(this.baseIngredients, recipeObjectItems.baseIngredients) &&
        Objects.equals(this.nutrients, recipeObjectItems.nutrients) &&
        Objects.equals(this.diabeticExchanges, recipeObjectItems.diabeticExchanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, meta, categories, author, keywords, topics, attributes, ingredients, baseIngredients, nutrients, diabeticExchanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectItems {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    baseIngredients: ").append(toIndentedString(baseIngredients)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    diabeticExchanges: ").append(toIndentedString(diabeticExchanges)).append("\n");
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
