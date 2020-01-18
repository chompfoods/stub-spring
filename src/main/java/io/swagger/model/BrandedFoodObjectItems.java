package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BrandedFoodObjectCalorieConversionFactor;
import io.swagger.model.BrandedFoodObjectComponents;
import io.swagger.model.BrandedFoodObjectCountryDetails;
import io.swagger.model.BrandedFoodObjectDietFlags;
import io.swagger.model.BrandedFoodObjectDietLabels;
import io.swagger.model.BrandedFoodObjectNutrients;
import io.swagger.model.BrandedFoodObjectPackage;
import io.swagger.model.BrandedFoodObjectPackagingPhotos;
import io.swagger.model.BrandedFoodObjectPortions;
import io.swagger.model.BrandedFoodObjectServing;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-18T16:45:46.882Z[GMT]")
public class BrandedFoodObjectItems   {
  @JsonProperty("barcode")
  private String barcode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("ingredients")
  private String ingredients = null;

  @JsonProperty("package")
  private BrandedFoodObjectPackage _package = null;

  @JsonProperty("serving")
  private BrandedFoodObjectServing serving = null;

  @JsonProperty("categories")
  @Valid
  private List<String> categories = null;

  @JsonProperty("nutrients")
  private BrandedFoodObjectNutrients nutrients = null;

  @JsonProperty("calorie_conversion_factor")
  private BrandedFoodObjectCalorieConversionFactor calorieConversionFactor = null;

  @JsonProperty("protein_conversion_factor")
  private BigDecimal proteinConversionFactor = null;

  @JsonProperty("diet_labels")
  private BrandedFoodObjectDietLabels dietLabels = null;

  @JsonProperty("diet_flags")
  @Valid
  private List<BrandedFoodObjectDietFlags> dietFlags = null;

  @JsonProperty("packaging_photos")
  private BrandedFoodObjectPackagingPhotos packagingPhotos = null;

  @JsonProperty("components")
  @Valid
  private List<BrandedFoodObjectComponents> components = null;

  @JsonProperty("portions")
  @Valid
  private List<BrandedFoodObjectPortions> portions = null;

  @JsonProperty("allergens")
  @Valid
  private List<String> allergens = null;

  @JsonProperty("brand_list")
  @Valid
  private List<String> brandList = null;

  @JsonProperty("countries")
  @Valid
  private List<String> countries = null;

  @JsonProperty("country_details")
  private BrandedFoodObjectCountryDetails countryDetails = null;

  @JsonProperty("palm_oil_ingredients")
  @Valid
  private List<String> palmOilIngredients = null;

  @JsonProperty("ingredient_list")
  @Valid
  private List<String> ingredientList = null;

  @JsonProperty("has_english_ingredients")
  private Boolean hasEnglishIngredients = null;

  @JsonProperty("minerals")
  @Valid
  private List<String> minerals = null;

  @JsonProperty("traces")
  @Valid
  private List<String> traces = null;

  @JsonProperty("vitamins")
  @Valid
  private List<String> vitamins = null;

  @JsonProperty("common_name")
  private String commonName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("keywords")
  @Valid
  private List<String> keywords = null;

  @JsonProperty("footnote")
  private String footnote = null;

  public BrandedFoodObjectItems barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

  /**
   * EAN/UPC barcode
   * @return barcode
  **/
  @ApiModelProperty(value = "EAN/UPC barcode")
  
    public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public BrandedFoodObjectItems name(String name) {
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

  public BrandedFoodObjectItems brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * The brand name that owns this item
   * @return brand
  **/
  @ApiModelProperty(value = "The brand name that owns this item")
  
    public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public BrandedFoodObjectItems ingredients(String ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  /**
   * Ingredients in order of highest value to least
   * @return ingredients
  **/
  @ApiModelProperty(value = "Ingredients in order of highest value to least")
  
    public String getIngredients() {
    return ingredients;
  }

  public void setIngredients(String ingredients) {
    this.ingredients = ingredients;
  }

  public BrandedFoodObjectItems _package(BrandedFoodObjectPackage _package) {
    this._package = _package;
    return this;
  }

  /**
   * Get _package
   * @return _package
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectPackage getPackage() {
    return _package;
  }

  public void setPackage(BrandedFoodObjectPackage _package) {
    this._package = _package;
  }

  public BrandedFoodObjectItems serving(BrandedFoodObjectServing serving) {
    this.serving = serving;
    return this;
  }

  /**
   * Get serving
   * @return serving
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectServing getServing() {
    return serving;
  }

  public void setServing(BrandedFoodObjectServing serving) {
    this.serving = serving;
  }

  public BrandedFoodObjectItems categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public BrandedFoodObjectItems addCategoriesItem(String categoriesItem) {
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

  public BrandedFoodObjectItems nutrients(BrandedFoodObjectNutrients nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  /**
   * Get nutrients
   * @return nutrients
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectNutrients getNutrients() {
    return nutrients;
  }

  public void setNutrients(BrandedFoodObjectNutrients nutrients) {
    this.nutrients = nutrients;
  }

  public BrandedFoodObjectItems calorieConversionFactor(BrandedFoodObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
    return this;
  }

  /**
   * Get calorieConversionFactor
   * @return calorieConversionFactor
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectCalorieConversionFactor getCalorieConversionFactor() {
    return calorieConversionFactor;
  }

  public void setCalorieConversionFactor(BrandedFoodObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
  }

  public BrandedFoodObjectItems proteinConversionFactor(BigDecimal proteinConversionFactor) {
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

  public BrandedFoodObjectItems dietLabels(BrandedFoodObjectDietLabels dietLabels) {
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

  public BrandedFoodObjectItems dietFlags(List<BrandedFoodObjectDietFlags> dietFlags) {
    this.dietFlags = dietFlags;
    return this;
  }

  public BrandedFoodObjectItems addDietFlagsItem(BrandedFoodObjectDietFlags dietFlagsItem) {
    if (this.dietFlags == null) {
      this.dietFlags = new ArrayList<BrandedFoodObjectDietFlags>();
    }
    this.dietFlags.add(dietFlagsItem);
    return this;
  }

  /**
   * An array of ingredient objects that were flagged while grading this item for compatibility with each diet
   * @return dietFlags
  **/
  @ApiModelProperty(value = "An array of ingredient objects that were flagged while grading this item for compatibility with each diet")
      @Valid
    public List<BrandedFoodObjectDietFlags> getDietFlags() {
    return dietFlags;
  }

  public void setDietFlags(List<BrandedFoodObjectDietFlags> dietFlags) {
    this.dietFlags = dietFlags;
  }

  public BrandedFoodObjectItems packagingPhotos(BrandedFoodObjectPackagingPhotos packagingPhotos) {
    this.packagingPhotos = packagingPhotos;
    return this;
  }

  /**
   * Get packagingPhotos
   * @return packagingPhotos
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectPackagingPhotos getPackagingPhotos() {
    return packagingPhotos;
  }

  public void setPackagingPhotos(BrandedFoodObjectPackagingPhotos packagingPhotos) {
    this.packagingPhotos = packagingPhotos;
  }

  public BrandedFoodObjectItems components(List<BrandedFoodObjectComponents> components) {
    this.components = components;
    return this;
  }

  public BrandedFoodObjectItems addComponentsItem(BrandedFoodObjectComponents componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<BrandedFoodObjectComponents>();
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
    public List<BrandedFoodObjectComponents> getComponents() {
    return components;
  }

  public void setComponents(List<BrandedFoodObjectComponents> components) {
    this.components = components;
  }

  public BrandedFoodObjectItems portions(List<BrandedFoodObjectPortions> portions) {
    this.portions = portions;
    return this;
  }

  public BrandedFoodObjectItems addPortionsItem(BrandedFoodObjectPortions portionsItem) {
    if (this.portions == null) {
      this.portions = new ArrayList<BrandedFoodObjectPortions>();
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
    public List<BrandedFoodObjectPortions> getPortions() {
    return portions;
  }

  public void setPortions(List<BrandedFoodObjectPortions> portions) {
    this.portions = portions;
  }

  public BrandedFoodObjectItems allergens(List<String> allergens) {
    this.allergens = allergens;
    return this;
  }

  public BrandedFoodObjectItems addAllergensItem(String allergensItem) {
    if (this.allergens == null) {
      this.allergens = new ArrayList<String>();
    }
    this.allergens.add(allergensItem);
    return this;
  }

  /**
   * An array of ingredients in this item that may cause allergic reactions in people
   * @return allergens
  **/
  @ApiModelProperty(value = "An array of ingredients in this item that may cause allergic reactions in people")
  
    public List<String> getAllergens() {
    return allergens;
  }

  public void setAllergens(List<String> allergens) {
    this.allergens = allergens;
  }

  public BrandedFoodObjectItems brandList(List<String> brandList) {
    this.brandList = brandList;
    return this;
  }

  public BrandedFoodObjectItems addBrandListItem(String brandListItem) {
    if (this.brandList == null) {
      this.brandList = new ArrayList<String>();
    }
    this.brandList.add(brandListItem);
    return this;
  }

  /**
   * An array of brands we have associated with this item. Some items are sold by more than 1 brand.
   * @return brandList
  **/
  @ApiModelProperty(value = "An array of brands we have associated with this item. Some items are sold by more than 1 brand.")
  
    public List<String> getBrandList() {
    return brandList;
  }

  public void setBrandList(List<String> brandList) {
    this.brandList = brandList;
  }

  public BrandedFoodObjectItems countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public BrandedFoodObjectItems addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<String>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * An array of countries where this item is sold
   * @return countries
  **/
  @ApiModelProperty(value = "An array of countries where this item is sold")
  
    public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  public BrandedFoodObjectItems countryDetails(BrandedFoodObjectCountryDetails countryDetails) {
    this.countryDetails = countryDetails;
    return this;
  }

  /**
   * Get countryDetails
   * @return countryDetails
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectCountryDetails getCountryDetails() {
    return countryDetails;
  }

  public void setCountryDetails(BrandedFoodObjectCountryDetails countryDetails) {
    this.countryDetails = countryDetails;
  }

  public BrandedFoodObjectItems palmOilIngredients(List<String> palmOilIngredients) {
    this.palmOilIngredients = palmOilIngredients;
    return this;
  }

  public BrandedFoodObjectItems addPalmOilIngredientsItem(String palmOilIngredientsItem) {
    if (this.palmOilIngredients == null) {
      this.palmOilIngredients = new ArrayList<String>();
    }
    this.palmOilIngredients.add(palmOilIngredientsItem);
    return this;
  }

  /**
   * An array of ingredients made from palm oil
   * @return palmOilIngredients
  **/
  @ApiModelProperty(value = "An array of ingredients made from palm oil")
  
    public List<String> getPalmOilIngredients() {
    return palmOilIngredients;
  }

  public void setPalmOilIngredients(List<String> palmOilIngredients) {
    this.palmOilIngredients = palmOilIngredients;
  }

  public BrandedFoodObjectItems ingredientList(List<String> ingredientList) {
    this.ingredientList = ingredientList;
    return this;
  }

  public BrandedFoodObjectItems addIngredientListItem(String ingredientListItem) {
    if (this.ingredientList == null) {
      this.ingredientList = new ArrayList<String>();
    }
    this.ingredientList.add(ingredientListItem);
    return this;
  }

  /**
   * An array of this item's ingredients
   * @return ingredientList
  **/
  @ApiModelProperty(value = "An array of this item's ingredients")
  
    public List<String> getIngredientList() {
    return ingredientList;
  }

  public void setIngredientList(List<String> ingredientList) {
    this.ingredientList = ingredientList;
  }

  public BrandedFoodObjectItems hasEnglishIngredients(Boolean hasEnglishIngredients) {
    this.hasEnglishIngredients = hasEnglishIngredients;
    return this;
  }

  /**
   * A boolean indicating if we have English ingredients for this item
   * @return hasEnglishIngredients
  **/
  @ApiModelProperty(value = "A boolean indicating if we have English ingredients for this item")
  
    public Boolean isHasEnglishIngredients() {
    return hasEnglishIngredients;
  }

  public void setHasEnglishIngredients(Boolean hasEnglishIngredients) {
    this.hasEnglishIngredients = hasEnglishIngredients;
  }

  public BrandedFoodObjectItems minerals(List<String> minerals) {
    this.minerals = minerals;
    return this;
  }

  public BrandedFoodObjectItems addMineralsItem(String mineralsItem) {
    if (this.minerals == null) {
      this.minerals = new ArrayList<String>();
    }
    this.minerals.add(mineralsItem);
    return this;
  }

  /**
   * An array of minerals that this item contains
   * @return minerals
  **/
  @ApiModelProperty(value = "An array of minerals that this item contains")
  
    public List<String> getMinerals() {
    return minerals;
  }

  public void setMinerals(List<String> minerals) {
    this.minerals = minerals;
  }

  public BrandedFoodObjectItems traces(List<String> traces) {
    this.traces = traces;
    return this;
  }

  public BrandedFoodObjectItems addTracesItem(String tracesItem) {
    if (this.traces == null) {
      this.traces = new ArrayList<String>();
    }
    this.traces.add(tracesItem);
    return this;
  }

  /**
   * An array of trace ingredients that may be found in this item
   * @return traces
  **/
  @ApiModelProperty(value = "An array of trace ingredients that may be found in this item")
  
    public List<String> getTraces() {
    return traces;
  }

  public void setTraces(List<String> traces) {
    this.traces = traces;
  }

  public BrandedFoodObjectItems vitamins(List<String> vitamins) {
    this.vitamins = vitamins;
    return this;
  }

  public BrandedFoodObjectItems addVitaminsItem(String vitaminsItem) {
    if (this.vitamins == null) {
      this.vitamins = new ArrayList<String>();
    }
    this.vitamins.add(vitaminsItem);
    return this;
  }

  /**
   * An array of vitamins that can be found in this item
   * @return vitamins
  **/
  @ApiModelProperty(value = "An array of vitamins that can be found in this item")
  
    public List<String> getVitamins() {
    return vitamins;
  }

  public void setVitamins(List<String> vitamins) {
    this.vitamins = vitamins;
  }

  public BrandedFoodObjectItems commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }

  /**
   * Common names associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")
   * @return commonName
  **/
  @ApiModelProperty(value = "Common names associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")")
  
    public String getCommonName() {
    return commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  public BrandedFoodObjectItems description(String description) {
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

  public BrandedFoodObjectItems keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public BrandedFoodObjectItems addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<String>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * An array of keywords that can be used to describe this item
   * @return keywords
  **/
  @ApiModelProperty(value = "An array of keywords that can be used to describe this item")
  
    public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public BrandedFoodObjectItems footnote(String footnote) {
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
    BrandedFoodObjectItems brandedFoodObjectItems = (BrandedFoodObjectItems) o;
    return Objects.equals(this.barcode, brandedFoodObjectItems.barcode) &&
        Objects.equals(this.name, brandedFoodObjectItems.name) &&
        Objects.equals(this.brand, brandedFoodObjectItems.brand) &&
        Objects.equals(this.ingredients, brandedFoodObjectItems.ingredients) &&
        Objects.equals(this._package, brandedFoodObjectItems._package) &&
        Objects.equals(this.serving, brandedFoodObjectItems.serving) &&
        Objects.equals(this.categories, brandedFoodObjectItems.categories) &&
        Objects.equals(this.nutrients, brandedFoodObjectItems.nutrients) &&
        Objects.equals(this.calorieConversionFactor, brandedFoodObjectItems.calorieConversionFactor) &&
        Objects.equals(this.proteinConversionFactor, brandedFoodObjectItems.proteinConversionFactor) &&
        Objects.equals(this.dietLabels, brandedFoodObjectItems.dietLabels) &&
        Objects.equals(this.dietFlags, brandedFoodObjectItems.dietFlags) &&
        Objects.equals(this.packagingPhotos, brandedFoodObjectItems.packagingPhotos) &&
        Objects.equals(this.components, brandedFoodObjectItems.components) &&
        Objects.equals(this.portions, brandedFoodObjectItems.portions) &&
        Objects.equals(this.allergens, brandedFoodObjectItems.allergens) &&
        Objects.equals(this.brandList, brandedFoodObjectItems.brandList) &&
        Objects.equals(this.countries, brandedFoodObjectItems.countries) &&
        Objects.equals(this.countryDetails, brandedFoodObjectItems.countryDetails) &&
        Objects.equals(this.palmOilIngredients, brandedFoodObjectItems.palmOilIngredients) &&
        Objects.equals(this.ingredientList, brandedFoodObjectItems.ingredientList) &&
        Objects.equals(this.hasEnglishIngredients, brandedFoodObjectItems.hasEnglishIngredients) &&
        Objects.equals(this.minerals, brandedFoodObjectItems.minerals) &&
        Objects.equals(this.traces, brandedFoodObjectItems.traces) &&
        Objects.equals(this.vitamins, brandedFoodObjectItems.vitamins) &&
        Objects.equals(this.commonName, brandedFoodObjectItems.commonName) &&
        Objects.equals(this.description, brandedFoodObjectItems.description) &&
        Objects.equals(this.keywords, brandedFoodObjectItems.keywords) &&
        Objects.equals(this.footnote, brandedFoodObjectItems.footnote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcode, name, brand, ingredients, _package, serving, categories, nutrients, calorieConversionFactor, proteinConversionFactor, dietLabels, dietFlags, packagingPhotos, components, portions, allergens, brandList, countries, countryDetails, palmOilIngredients, ingredientList, hasEnglishIngredients, minerals, traces, vitamins, commonName, description, keywords, footnote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectItems {\n");
    
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    serving: ").append(toIndentedString(serving)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    calorieConversionFactor: ").append(toIndentedString(calorieConversionFactor)).append("\n");
    sb.append("    proteinConversionFactor: ").append(toIndentedString(proteinConversionFactor)).append("\n");
    sb.append("    dietLabels: ").append(toIndentedString(dietLabels)).append("\n");
    sb.append("    dietFlags: ").append(toIndentedString(dietFlags)).append("\n");
    sb.append("    packagingPhotos: ").append(toIndentedString(packagingPhotos)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    portions: ").append(toIndentedString(portions)).append("\n");
    sb.append("    allergens: ").append(toIndentedString(allergens)).append("\n");
    sb.append("    brandList: ").append(toIndentedString(brandList)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    countryDetails: ").append(toIndentedString(countryDetails)).append("\n");
    sb.append("    palmOilIngredients: ").append(toIndentedString(palmOilIngredients)).append("\n");
    sb.append("    ingredientList: ").append(toIndentedString(ingredientList)).append("\n");
    sb.append("    hasEnglishIngredients: ").append(toIndentedString(hasEnglishIngredients)).append("\n");
    sb.append("    minerals: ").append(toIndentedString(minerals)).append("\n");
    sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
    sb.append("    vitamins: ").append(toIndentedString(vitamins)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
