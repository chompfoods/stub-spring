/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.BrandedFoodObject;
import io.swagger.model.IngredientObject;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-28T13:53:56.575Z[GMT]")
@Api(value = "food", description = "the food API")
public interface FoodApi {

    @ApiOperation(value = "Get a branded food item using a barcode", nickname = "foodBrandedBarcodePhpGet", notes = "## Get data for a branded food using the food's UPC/EAN barcode.  **Example**  > ```https://chompthis.com/api/v2/food/branded/barcode.php?api_key=API_KEY&code=CODE```  **Tips**   * Read our **[Knowledge Base article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do)** for helpful tips and tricks. ", response = BrandedFoodObject.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "**Valid** - Will return an object containing any matching foods.  ", response = BrandedFoodObject.class),
        @ApiResponse(code = 400, message = "**Validation error** - Invalid parameters or request. "),
        @ApiResponse(code = 401, message = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        @ApiResponse(code = 404, message = "**Not found** - No food items were found. "),
        @ApiResponse(code = 500, message = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    @RequestMapping(value = "/food/branded/barcode.php",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BrandedFoodObject> foodBrandedBarcodePhpGet(@NotNull @ApiParam(value = "#### UPC/EAN barcode  **Example** > ```&code=0842234000988``` ", required = true) @Valid @RequestParam(value = "code", required = true) String code);


    @ApiOperation(value = "Get a branded food item by name", nickname = "foodBrandedNamePhpGet", notes = "## Search for branded food items by name.  **Example** > ```https://chompthis.com/api/v2/food/branded/name.php?api_key=API_KEY&name=NAME```  **Tips**   * Get started by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", response = BrandedFoodObject.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "**Valid** - Will return an object containing any matching foods.  ", response = BrandedFoodObject.class),
        @ApiResponse(code = 400, message = "**Validation error** - Invalid parameters or request. "),
        @ApiResponse(code = 401, message = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        @ApiResponse(code = 404, message = "**Not found** - No food items were found. "),
        @ApiResponse(code = 500, message = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    @RequestMapping(value = "/food/branded/name.php",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BrandedFoodObject> foodBrandedNamePhpGet(@NotNull @ApiParam(value = "#### Search for branded food items using a general food name keyword. This does not have to exactly match the \"official\" name for the food.  **Example** > ```&name=Starburst``` ", required = true) @Valid @RequestParam(value = "name", required = true) String name,@ApiParam(value = "#### Set maximum number of records you want the API to return. The default value is \"**10**.\"  **Example** > ```&limit=10``` ", allowableValues = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "#### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on. The default value is \"**1**.\"  **Example** > ```&page=1``` ") @Valid @RequestParam(value = "page", required = false) Integer page);


    @ApiOperation(value = "Get data for branded food items using various search parameters", nickname = "foodBrandedSearchPhpGet", notes = "## Search for branded food items using various parameters.  **Example** > ```https://chompthis.com/api/v2/food/branded/search.php?api_key=API_KEY&brand=BRAND&country=COUNTRY&page=1```  **Tips**    * Get started by using the **[Query Builder](https://chompthis.com/api/build.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", response = BrandedFoodObject.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "**Valid** - Will return an object containing any matching foods.  ", response = BrandedFoodObject.class),
        @ApiResponse(code = 400, message = "**Validation error** - Invalid parameters or request. "),
        @ApiResponse(code = 401, message = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        @ApiResponse(code = 404, message = "**Not found** - No food items were found. "),
        @ApiResponse(code = 500, message = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    @RequestMapping(value = "/food/branded/search.php",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BrandedFoodObject> foodBrandedSearchPhpGet(@ApiParam(value = "#### Filter the search to only include branded foods that contain a specific allergen.  **Example** > ```&allergen=Peanuts```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @Valid @RequestParam(value = "allergen", required = false) String allergen,@ApiParam(value = "#### Filter the search to only include branded foods that are owned by a specific brand.  **Example** > ```&brand=Starbucks``` ") @Valid @RequestParam(value = "brand", required = false) String brand,@ApiParam(value = "#### Filter the search to only include branded foods from a specific category.  **Example** > ```&category=Plant Based Foods``` ") @Valid @RequestParam(value = "category", required = false) String category,@ApiParam(value = "#### Filter the search to only include branded foods that are sold in a specific country.  **Example** > ```&country=United States```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @Valid @RequestParam(value = "country", required = false) String country,@ApiParam(value = "#### Filter the search to only include branded foods that are considered compatible with a specific diet.  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ", allowableValues = "Vegan, Vegetarian, Gluten Free") @Valid @RequestParam(value = "diet", required = false) String diet,@ApiParam(value = "#### Filter the search to only include branded foods that contain a specific ingredient.  **Example** > ```&ingredient=Salt``` ") @Valid @RequestParam(value = "ingredient", required = false) String ingredient,@ApiParam(value = "#### Filter the search to only include branded foods that are associated with a specific keyword.  **Example** > ```&keyword=Organic```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "#### Filter the search to only include branded foods that contain a specific mineral.  **Example** > ```&mineral=Potassium``` ") @Valid @RequestParam(value = "mineral", required = false) String mineral,@ApiParam(value = "#### Filter the search to only include branded foods that contain a specific nutrient.  **Example** > ```&nutrient=Caffeine```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @Valid @RequestParam(value = "nutrient", required = false) String nutrient,@ApiParam(value = "#### Filter the search to only include branded foods that contain a specific ingredient made using palm oil.  **Example** > ```&palm_oil=E160a Beta Carotene``` ") @Valid @RequestParam(value = "palm_oil", required = false) String palmOil,@ApiParam(value = "### Filter the search to only include branded foods that contain a specific trace ingredient.  **Example** > ```&trace=Tree Nuts```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @Valid @RequestParam(value = "trace", required = false) String trace,@ApiParam(value = "#### Filter the search to only include branded foods that contain a specific vitamin.  **Example** > ```&vitamin=Biotin``` ") @Valid @RequestParam(value = "vitamin", required = false) String vitamin,@ApiParam(value = "#### Set maximum number of records you want the API to return. The default value is \"**10**.\"  **Example** > ```&limit=10``` ", allowableValues = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "#### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on. The default value is \"**1**.\"  **Example** > ```&page=1``` ") @Valid @RequestParam(value = "page", required = false) Integer page);


    @ApiOperation(value = "Get raw/generic food ingredient item(s)", nickname = "foodIngredientSearchPhpGet", notes = "## Get data for a specific ingredient or a specific set of ingredients.  **Example #1: Single Ingredient** > ```https://chompthis.com/api/v2/ingredient/search.php?api_key=API_KEY&find=raw broccoli```  **Example #2: Set of Ingredients** > ```https://chompthis.com/api/v2/ingredient/search.php?api_key=API_KEY&find=raw broccoli,mashed potatoes,raw spinach```  **Tips**   * Expose ingredient endpoints by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", response = IngredientObject.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "**Valid** - Will return an object containing any matching ingredient foods.  ", response = IngredientObject.class),
        @ApiResponse(code = 400, message = "**Validation error** - Invalid parameters or request. "),
        @ApiResponse(code = 401, message = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        @ApiResponse(code = 404, message = "**Not found** - No food items were found. "),
        @ApiResponse(code = 500, message = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    @RequestMapping(value = "/food/ingredient/search.php",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<IngredientObject> foodIngredientSearchPhpGet(@NotNull @ApiParam(value = "Search our database for a single ingredient or a specific set of ingredients.  **Example #1: Single Ingredient** > ```&find=raw broccoli```  **Example #2: Set of Ingredients** > ```&find=raw broccoli,raw cauliflower,mashed potatoes```  **Important Notes**    * Comma-separated lists cannot contain more than **10 ingredients**. You must perform additional API calls if you are looking up more than 10 ingredients. ", required = true) @Valid @RequestParam(value = "find", required = true) String find,@ApiParam(value = "#### Set maximum number of records you want the API to return, per search term. The default value is \"**1**.\"  **Example** > ```&limit=3``` ", allowableValues = "1, 2, 3") @Valid @RequestParam(value = "limit", required = false) Integer limit);

}
