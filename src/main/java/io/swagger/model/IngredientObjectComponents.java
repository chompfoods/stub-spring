package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing information on a specific component of this food item
 */
@Schema(description = "An object containing information on a specific component of this food item")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-09T22:27:46.582Z[GMT]")


public class IngredientObjectComponents   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("pct_weight")
  private BigDecimal pctWeight = null;

  @JsonProperty("gram_weight")
  private BigDecimal gramWeight = null;

  @JsonProperty("is_refuse")
  private Boolean isRefuse = null;

  @JsonProperty("data_points")
  private Integer dataPoints = null;

  public IngredientObjectComponents name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The kind of component, e.g. bone
   * @return name
   **/
  @Schema(description = "The kind of component, e.g. bone")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IngredientObjectComponents pctWeight(BigDecimal pctWeight) {
    this.pctWeight = pctWeight;
    return this;
  }

  /**
   * The weight of the component as a percentage of the total weight of the food
   * @return pctWeight
   **/
  @Schema(description = "The weight of the component as a percentage of the total weight of the food")
  
    @Valid
    public BigDecimal getPctWeight() {
    return pctWeight;
  }

  public void setPctWeight(BigDecimal pctWeight) {
    this.pctWeight = pctWeight;
  }

  public IngredientObjectComponents gramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
    return this;
  }

  /**
   * The weight of the component in grams
   * @return gramWeight
   **/
  @Schema(description = "The weight of the component in grams")
  
    @Valid
    public BigDecimal getGramWeight() {
    return gramWeight;
  }

  public void setGramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
  }

  public IngredientObjectComponents isRefuse(Boolean isRefuse) {
    this.isRefuse = isRefuse;
    return this;
  }

  /**
   * Whether the component is refuse, i.e. not edible
   * @return isRefuse
   **/
  @Schema(description = "Whether the component is refuse, i.e. not edible")
  
    public Boolean isIsRefuse() {
    return isRefuse;
  }

  public void setIsRefuse(Boolean isRefuse) {
    this.isRefuse = isRefuse;
  }

  public IngredientObjectComponents dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  /**
   * The number of obersvations on which the measure is based
   * @return dataPoints
   **/
  @Schema(description = "The number of obersvations on which the measure is based")
  
    public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientObjectComponents ingredientObjectComponents = (IngredientObjectComponents) o;
    return Objects.equals(this.name, ingredientObjectComponents.name) &&
        Objects.equals(this.pctWeight, ingredientObjectComponents.pctWeight) &&
        Objects.equals(this.gramWeight, ingredientObjectComponents.gramWeight) &&
        Objects.equals(this.isRefuse, ingredientObjectComponents.isRefuse) &&
        Objects.equals(this.dataPoints, ingredientObjectComponents.dataPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pctWeight, gramWeight, isRefuse, dataPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectComponents {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pctWeight: ").append(toIndentedString(pctWeight)).append("\n");
    sb.append("    gramWeight: ").append(toIndentedString(gramWeight)).append("\n");
    sb.append("    isRefuse: ").append(toIndentedString(isRefuse)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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
