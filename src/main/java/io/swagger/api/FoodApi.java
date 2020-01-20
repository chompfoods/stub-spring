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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-20T16:28:37.395Z[GMT]")
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
    ResponseEntity<BrandedFoodObject> foodBrandedBarcodePhpGet(@NotNull @ApiParam(value = "UPC/EAN barcode  __Example:__ 0842234000988  __Resources:__ [Database search](https://chompthis.com/api/lookup.php)  _Read [this article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do) for tips and tricks._ ", required = true) @Valid @RequestParam(value = "code", required = true) String code);


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
    ResponseEntity<BrandedFoodObject> foodBrandedIdPhpGet(@NotNull @ApiParam(value = "Chomp branded food ID.  _Set \"source=USDA\" if you wish to pass in the food's FoodData Central ID (fdc_id)._  __Example #1:__ 15  __Resources:__ [Find branded food IDs](https://chompthis.com/api/lookup.php) ", required = true) @Valid @RequestParam(value = "id", required = true) Integer id,@ApiParam(value = "Specify the data source (optional).  You must pass in \"USDA\" if you want to look up a food item using a USDA FDC ID.  __Example:__ USDA _(defaults to \"Chomp\")_ ") @Valid @RequestParam(value = "source", required = false) String source);


    @ApiOperation(value = "Get a branded food item by name", nickname = "foodBrandedNamePhpGet", notes = "# Search for branded food items by name.  __Example:__ ```https://chompthis.com/api/v2/food/branded/name.php?api_key=API_KEY&name=NAME``` ", response = BrandedFoodObject.class, authorizations = {
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
    ResponseEntity<BrandedFoodObject> foodBrandedNamePhpGet(@NotNull @ApiParam(value = "Branded food name  __Example:__ Starburst  __Resources:__ [Find branded food names](https://chompthis.com/api/lookup.php) ", required = true) @Valid @RequestParam(value = "name", required = true) String name,@ApiParam(value = "Set maximum number of records you want the API to return.  ___Note:__ The maximum value is 10._  __Example:__ 3 _(defaults to 10)_ ", allowableValues = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10") @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "Get data for branded food items using various search parameters", nickname = "foodBrandedSearchPhpGet", notes = "# Search for branded food items using various parameters.  __Example:__ ```https://chompthis.com/api/v2/food/branded/search.php?api_key=API_KEY&brand=BRAND&country=COUNTRY&page=1```  ___Tip:__ Get started by using the [Query Builder](https://chompthis.com/api/build.php)._ ", response = BrandedFoodObject.class, authorizations = {
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
    ResponseEntity<BrandedFoodObject> foodBrandedSearchPhpGet(@ApiParam(value = "Specify a required allergen ingredient (optional)  __Example__: Peanuts  __Resources__: [List of allergens](https://chompthis.com/api/data/allergen.php) ") @Valid @RequestParam(value = "allergen", required = false) String allergen,@ApiParam(value = "Specify a required brand (optional)  __Example__: Starbucks  __Resources__: [List of brands](https://chompthis.com/api/data/brand.php) ") @Valid @RequestParam(value = "brand", required = false) String brand,@ApiParam(value = "Specify a required category (optional)  __Example__: Pasta Dishes  __Resources__: [List of categories](https://chompthis.com/api/data/category.php) ") @Valid @RequestParam(value = "category", required = false) String category,@ApiParam(value = "Specify a required country (optional)  __Example__: United States  __Resources__: [List of countries](https://chompthis.com/api/data/country.php) ") @Valid @RequestParam(value = "country", required = false) String country,@ApiParam(value = "Specify a required diet (optional)  _Filters the search to only include food items that are considered compatible with the following diets: Vegan, Vegetarian, Gluten Free_  __Example__: Gluten Free  __Resources__: [List of diets](https://chompthis.com/api/data/lifestyle.php) ") @Valid @RequestParam(value = "diet", required = false) String diet,@ApiParam(value = "Specify a required ingredient (optional)  __Example__: Salt  __Resources__: [List of ingredients](https://chompthis.com/api/data/ingredient.php) ") @Valid @RequestParam(value = "ingredient", required = false) String ingredient,@ApiParam(value = "Specify a required keyword (optional)  __Example__: Starbucks  __Resources__: [List of brands](https://chompthis.com/api/data/brand.php) ") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "Specify a required mineral (optional)  __Example__: Potassium  __Resources__: [List of minerals](https://chompthis.com/api/data/mineral.php) ") @Valid @RequestParam(value = "mineral", required = false) String mineral,@ApiParam(value = "Specify a required nutrition label item (optional)  __Example__: Caffeine  __Resources__: [List of nutrition label items](https://chompthis.com/api/data/nutrition.php) ") @Valid @RequestParam(value = "nutrient", required = false) String nutrient,@ApiParam(value = "Specify a required palm oil ingredient (optional)  __Example__: E160a Beta Carotene  __Resources__: [List of palm oil ingredients](https://chompthis.com/api/data/palm-oil.php) ") @Valid @RequestParam(value = "palm_oil", required = false) String palmOil,@ApiParam(value = "Specify a required trace ingredient (optional)  __Example__: Tree Nuts  __Resources__: [List of trace ingredients](https://chompthis.com/api/data/trace.php) ") @Valid @RequestParam(value = "trace", required = false) String trace,@ApiParam(value = "Specify a required vitamin (optional)  __Example__: Biotin  __Resources__: [List of vitamins](https://chompthis.com/api/data/vitamin.php) ") @Valid @RequestParam(value = "vitamin", required = false) String vitamin,@ApiParam(value = "Set maximum number of records you want the API to return.  ___Note:__ The maximum value is 10._  __Example:__ 3 _(defaults to 10)_ ", allowableValues = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "Specify the search response page number.  _Each page will contain up to 10 items._  __Example__: 1 _(default)_ ") @Valid @RequestParam(value = "page", required = false) Integer page);


    @ApiOperation(value = "Get raw/generic food ingredient item(s)", nickname = "foodIngredientSearchPhpGet", notes = "# Get data for a specific ingredient or a specific set of ingredients.  __Example:__ ```https://chompthis.com/api/v2/ingredient/search.php?api_key=API_KEY&find=STRING/LIST&list=BOOLEAN&raw=BOOLEAN``` ", response = IngredientObject.class, authorizations = {
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
    ResponseEntity<IngredientObject> foodIngredientSearchPhpGet(@NotNull @ApiParam(value = "Specify the ingredient name(s).  __Example #1:__ broccoli  __Example #2:__ broccoli,cauliflower,spinach  ___Important Note:__ Set the \"is_list\" parameter to true before passing in a comma-separated list of ingredients._ ", required = true) @Valid @RequestParam(value = "find", required = true) Integer find,@NotNull @ApiParam(value = "Specify if you are searching for multiple ingredients.  _Setting this to true will configure this endpoint so that it accepts a comma-separated list of ingredients._  _By default, this endpoint expects a single ingredient._  __Example:__ true _(defaults to false)_ ", required = true) @Valid @RequestParam(value = "list", required = true) Boolean list,@ApiParam(value = "Specify if you only want data for raw ingredients.  __Example:__ true _(defaults to true)_ ") @Valid @RequestParam(value = "raw", required = false) Boolean raw,@ApiParam(value = "Set maximum number of records you want the API to return.  ___Important Note:__ Setting this to \"1\" will return 1 record per search term._  __Example:__ 1 _(defaults to 1, max is 3)_ ", allowableValues = "1, 2, 3") @Valid @RequestParam(value = "limit", required = false) Integer limit);

}
