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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T12:55:44.047Z[GMT]")
@Api(value = "food", description = "the food API")
public interface FoodApi {

    @ApiOperation(value = "Get a branded food item using a barcode", nickname = "foodBrandedBarcodePhpGet", notes = "# Get data for a branded food using the food's UPC/EAN barcode.  __Example:__ ```https://chompthis.com/api/v2/food/branded/barcode.php?api_key=API_KEY&code=CODE``` ", response = BrandedFoodObject.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "__Valid__ - Will return an object containing any matching foods.", response = BrandedFoodObject.class),
        @ApiResponse(code = 400, message = "__Validation error__ - Invalid parameters or request."),
        @ApiResponse(code = 401, message = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        @ApiResponse(code = 403, message = "__Forbidden__ - Disallowed entity."),
        @ApiResponse(code = 404, message = "__Not found__ - No food items exist that match your query parameters."),
        @ApiResponse(code = 500, message = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    @RequestMapping(value = "/food/branded/barcode.php",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BrandedFoodObject> foodBrandedBarcodePhpGet(@NotNull @ApiParam(value = "UPC/EAN barcode  __Example:__ &code=0842234000988  __Tips:__    - Use our [food lookup tool](https://chompthis.com/api/lookup.php).   - Read [this article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do) for general tips and tricks. ", required = true) @Valid @RequestParam(value = "code", required = true) String code);


    @ApiOperation(value = "Get a branded food item using an ID number", nickname = "foodBrandedIdPhpGet", notes = "# Get data for a branded food using Chomp's internal ID number.  _Alternatively, set the \"source\" parameter to \"USDA\" and use the food's FDC ID._  __Example:__ ```https://chompthis.com/api/v2/food/branded/id.php?api_key=API_KEY&id=ID``` ", response = BrandedFoodObject.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "__Valid__ - Will return an object containing any matching foods.", response = BrandedFoodObject.class),
        @ApiResponse(code = 400, message = "__Validation error__ - Invalid parameters or request."),
        @ApiResponse(code = 401, message = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        @ApiResponse(code = 403, message = "__Forbidden__ - Disallowed entity."),
        @ApiResponse(code = 404, message = "__Not found__ - No food items exist that match your query parameters."),
        @ApiResponse(code = 500, message = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    @RequestMapping(value = "/food/branded/id.php",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BrandedFoodObject> foodBrandedIdPhpGet(@NotNull @ApiParam(value = "The ID number of a branded food item.  __Example #1:__ &id=15  __Example #2:__ &id=FDC_ID&source=USDA  ___Tip:__ Get started by using our  [ood lookup tool](https://chompthis.com/api/lookup.php)._ ", required = true) @Valid @RequestParam(value = "id", required = true) Integer id,@ApiParam(value = "Configure the endpoint to accept food IDs from various data sources. This endpoint defaults to Chomp but can accept FDC IDs.  __Example:__ &source=Chomp  ___Important Note:__ Pass in &source=USDA if you want to look up food items using a USDA FDC ID._ ", allowableValues = "Chomp, USDA") @Valid @RequestParam(value = "source", required = false) String source);


    @ApiOperation(value = "Get a branded food item by name", nickname = "foodBrandedNamePhpGet", notes = "# Search for branded food items by name.  This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. _[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription) if you aren't sure how to upgrade your subscription._  __Example:__ ```https://chompthis.com/api/v2/food/branded/name.php?api_key=API_KEY&name=NAME``` ", response = BrandedFoodObject.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "__Valid__ - Will return an object containing any matching foods.", response = BrandedFoodObject.class),
        @ApiResponse(code = 400, message = "__Validation error__ - Invalid parameters or request."),
        @ApiResponse(code = 401, message = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        @ApiResponse(code = 403, message = "__Forbidden__ - Disallowed entity."),
        @ApiResponse(code = 404, message = "__Not found__ - No food items exist that match your query parameters."),
        @ApiResponse(code = 500, message = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    @RequestMapping(value = "/food/branded/name.php",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BrandedFoodObject> foodBrandedNamePhpGet(@NotNull @ApiParam(value = "Search for branded food items using a general food name keyword. This does not have to exactly match the \"official\" name for the food.  __Example:__ &name=Starburst  ___Tip:__ Get started by using our [food lookup tool](https://chompthis.com/api/lookup.php)._ ", required = true) @Valid @RequestParam(value = "name", required = true) String name,@ApiParam(value = "Set maximum number of records you want the API to return.  __Example:__ &limit=10 ", allowableValues = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  __Example__: &page=1 ") @Valid @RequestParam(value = "page", required = false) Integer page);


    @ApiOperation(value = "Get data for branded food items using various search parameters", nickname = "foodBrandedSearchPhpGet", notes = "# Search for branded food items using various parameters.  This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. _[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription) if you aren't sure how to upgrade your subscription._  __Example:__ ```https://chompthis.com/api/v2/food/branded/search.php?api_key=API_KEY&brand=BRAND&country=COUNTRY&page=1```  ___Tip:__ Get started by using the [Query Builder](https://chompthis.com/api/build.php)._ ", response = BrandedFoodObject.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "__Valid__ - Will return an object containing any matching foods.", response = BrandedFoodObject.class),
        @ApiResponse(code = 400, message = "__Validation error__ - Invalid parameters or request."),
        @ApiResponse(code = 401, message = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        @ApiResponse(code = 403, message = "__Forbidden__ - Disallowed entity."),
        @ApiResponse(code = 404, message = "__Not found__ - No food items exist that match your query parameters."),
        @ApiResponse(code = 500, message = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    @RequestMapping(value = "/food/branded/search.php",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BrandedFoodObject> foodBrandedSearchPhpGet(@ApiParam(value = "Filter the search to only include branded foods that contain a specific allergen.  __Example__: &allergen=Peanuts  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ ") @Valid @RequestParam(value = "allergen", required = false) String allergen,@ApiParam(value = "Filter the search to only include branded foods that are owned by a specific brand.  __Example__: &brand=Starbucks ") @Valid @RequestParam(value = "brand", required = false) String brand,@ApiParam(value = "Filter the search to only include branded foods from a specific category.  __Example__: &category=Plant Based Foods ") @Valid @RequestParam(value = "category", required = false) String category,@ApiParam(value = "Filter the search to only include branded foods that are sold in a specific country.  __Example__: &country=United States  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ ") @Valid @RequestParam(value = "country", required = false) String country,@ApiParam(value = "Filter the search to only include branded foods that are considered compatible with a specific diet.  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ ", allowableValues = "Vegan, Vegetarian, Gluten Free") @Valid @RequestParam(value = "diet", required = false) String diet,@ApiParam(value = "Filter the search to only include branded foods that contain a specific ingredient.  __Example__: &ingredient=Salt ") @Valid @RequestParam(value = "ingredient", required = false) String ingredient,@ApiParam(value = "Filter the search to only include branded foods that are associated with a specific keyword.  __Example__: &keyword=Organic  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ ") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "Filter the search to only include branded foods that contain a specific mineral.  __Example__: &mineral=Potassium ") @Valid @RequestParam(value = "mineral", required = false) String mineral,@ApiParam(value = "Filter the search to only include branded foods that contain a specific nutrient.  __Example__: &nutrient=Caffeine  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ ") @Valid @RequestParam(value = "nutrient", required = false) String nutrient,@ApiParam(value = "Filter the search to only include branded foods that contain a specific ingredient made using palm oil.  __Example__: &palm_oil=E160a Beta Carotene ") @Valid @RequestParam(value = "palm_oil", required = false) String palmOil,@ApiParam(value = "Filter the search to only include branded foods that contain a specific trace ingredient.  __Example__: &trace=Tree Nuts  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._ ") @Valid @RequestParam(value = "trace", required = false) String trace,@ApiParam(value = "Filter the search to only include branded foods that contain a specific vitamin.  __Example__: &vitamin=Biotin ") @Valid @RequestParam(value = "vitamin", required = false) String vitamin,@ApiParam(value = "Set maximum number of records you want the API to return.  __Example:__ &limit=10 ", allowableValues = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  __Example__: &page=1 ") @Valid @RequestParam(value = "page", required = false) Integer page);


    @ApiOperation(value = "Get raw/generic food ingredient item(s)", nickname = "foodIngredientSearchPhpGet", notes = "# Get data for a specific ingredient or a specific set of ingredients.  This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. _[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription) if you aren't sure how to upgrade your subscription._  __Example:__ ```https://chompthis.com/api/v2/ingredient/search.php?api_key=API_KEY&find=STRING/LIST&list=BOOLEAN&raw=BOOLEAN``` ", response = IngredientObject.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "__Valid__ - Will return an object containing any matching ingredient foods.", response = IngredientObject.class),
        @ApiResponse(code = 400, message = "__Validation error__ - Invalid parameters or request."),
        @ApiResponse(code = 401, message = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        @ApiResponse(code = 403, message = "__Forbidden__ - Disallowed entity."),
        @ApiResponse(code = 404, message = "__Not found__ - No food items exist that match your query parameters."),
        @ApiResponse(code = 500, message = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    @RequestMapping(value = "/food/ingredient/search.php",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<IngredientObject> foodIngredientSearchPhpGet(@NotNull @ApiParam(value = "Search our database for a single ingredient or a specific set of ingredients.  __Example #1:__ &find=broccoli  __Example #2:__ &find=broccoli,cauliflower,spinach&list=true  __Important List Notes:__    - Set the \"list\" parameter to \"true\" before passing in a comma-separated list of ingredients.   - Comma-separated lists cannot contain more than __15 ingredients__. You must perform additional API calls if you are looking up more than 15 ingredients. ", required = true) @Valid @RequestParam(value = "find", required = true) Integer find,@NotNull @ApiParam(value = "Setting _&list=true_ will configure this endpoint to allow searching for ingredients using a comma-separated list. By default, this endpoint will __only__ return results for the first ingredient.  __Example:__ &list=true ", required = true) @Valid @RequestParam(value = "list", required = true) Boolean list,@ApiParam(value = "Optionally filter the search result to only include raw ingredients.  __Example:__ &raw=true ") @Valid @RequestParam(value = "raw", required = false) Boolean raw,@ApiParam(value = "Set maximum number of records you want the API to return, per search term.  __Example:__ &limit=3 ", allowableValues = "1, 2, 3") @Valid @RequestParam(value = "limit", required = false) Integer limit);

}
