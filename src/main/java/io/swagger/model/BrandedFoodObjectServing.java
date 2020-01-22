package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BrandedFoodObjectServingChomp;
import io.swagger.model.BrandedFoodObjectServingUsda;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An object containing serving information for this item
 */
@ApiModel(description = "An object containing serving information for this item")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T19:40:24.844Z[GMT]")
public class BrandedFoodObjectServing   {
  @JsonProperty("chomp")
  private BrandedFoodObjectServingChomp chomp = null;

  @JsonProperty("usda")
  private BrandedFoodObjectServingUsda usda = null;

  public BrandedFoodObjectServing chomp(BrandedFoodObjectServingChomp chomp) {
    this.chomp = chomp;
    return this;
  }

  /**
   * Get chomp
   * @return chomp
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectServingChomp getChomp() {
    return chomp;
  }

  public void setChomp(BrandedFoodObjectServingChomp chomp) {
    this.chomp = chomp;
  }

  public BrandedFoodObjectServing usda(BrandedFoodObjectServingUsda usda) {
    this.usda = usda;
    return this;
  }

  /**
   * Get usda
   * @return usda
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BrandedFoodObjectServingUsda getUsda() {
    return usda;
  }

  public void setUsda(BrandedFoodObjectServingUsda usda) {
    this.usda = usda;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectServing brandedFoodObjectServing = (BrandedFoodObjectServing) o;
    return Objects.equals(this.chomp, brandedFoodObjectServing.chomp) &&
        Objects.equals(this.usda, brandedFoodObjectServing.usda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chomp, usda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectServing {\n");
    
    sb.append("    chomp: ").append(toIndentedString(chomp)).append("\n");
    sb.append("    usda: ").append(toIndentedString(usda)).append("\n");
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
