package io.swagger.api;

import io.swagger.model.BrandedFoodObject;
import io.swagger.model.IngredientObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-27T21:18:02.330Z[GMT]")
@Controller
public class FoodApiController implements FoodApi {

    private static final Logger log = LoggerFactory.getLogger(FoodApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FoodApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<BrandedFoodObject> foodBrandedBarcodePhpGet(@NotNull @ApiParam(value = "#### UPC/EAN barcode  **Example** > ```&code=0842234000988``` ", required = true) @Valid @RequestParam(value = "code", required = true) String code) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BrandedFoodObject>(objectMapper.readValue("{\n  \"items\" : [ {\n    \"minerals\" : [ \"minerals\", \"minerals\" ],\n    \"package\" : {\n      \"quantity\" : 0,\n      \"size\" : \"size\"\n    },\n    \"keywords\" : [ \"keywords\", \"keywords\" ],\n    \"country_details\" : {\n      \"english_speaking\" : 7,\n      \"non_english_speaking\" : 1\n    },\n    \"traces\" : [ \"traces\", \"traces\" ],\n    \"description\" : \"description\",\n    \"diet_flags\" : [ {\n      \"ingredient\" : \"ingredient\",\n      \"is_allergen\" : true,\n      \"ingredient_description\" : \"ingredient_description\",\n      \"compatibility_level\" : 4,\n      \"is_compatible\" : \"is_compatible\",\n      \"diet_label\" : \"diet_label\",\n      \"compatibility_description\" : \"compatibility_description\"\n    }, {\n      \"ingredient\" : \"ingredient\",\n      \"is_allergen\" : true,\n      \"ingredient_description\" : \"ingredient_description\",\n      \"compatibility_level\" : 4,\n      \"is_compatible\" : \"is_compatible\",\n      \"diet_label\" : \"diet_label\",\n      \"compatibility_description\" : \"compatibility_description\"\n    } ],\n    \"countries\" : [ \"countries\", \"countries\" ],\n    \"has_english_ingredients\" : true,\n    \"palm_oil_ingredients\" : [ \"palm_oil_ingredients\", \"palm_oil_ingredients\" ],\n    \"serving\" : {\n      \"size_fulltext\" : \"size_fulltext\",\n      \"size\" : \"size\",\n      \"measurement_unit\" : \"measurement_unit\"\n    },\n    \"nutrients\" : [ {\n      \"data_points\" : 5,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 1,\n      \"description\" : \"description\",\n      \"per_100g\" : 6.027456183070403\n    }, {\n      \"data_points\" : 5,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 1,\n      \"description\" : \"description\",\n      \"per_100g\" : 6.027456183070403\n    } ],\n    \"allergens\" : [ \"allergens\", \"allergens\" ],\n    \"packaging_photos\" : {\n      \"nutrition\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      },\n      \"ingredients\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      },\n      \"front\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      }\n    },\n    \"ingredient_list\" : [ \"ingredient_list\", \"ingredient_list\" ],\n    \"vitamins\" : [ \"vitamins\", \"vitamins\" ],\n    \"diet_labels\" : {\n      \"vegetarian\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 9,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 7,\n        \"is_compatible\" : true\n      },\n      \"vegan\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 5,\n        \"is_compatible\" : true\n      },\n      \"gluten_free\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 3,\n        \"is_compatible\" : true\n      }\n    },\n    \"name\" : \"name\",\n    \"ingredients\" : \"ingredients\",\n    \"categories\" : [ \"categories\", \"categories\" ],\n    \"barcode\" : \"barcode\",\n    \"brand\" : \"brand\",\n    \"brand_list\" : [ \"brand_list\", \"brand_list\" ]\n  }, {\n    \"minerals\" : [ \"minerals\", \"minerals\" ],\n    \"package\" : {\n      \"quantity\" : 0,\n      \"size\" : \"size\"\n    },\n    \"keywords\" : [ \"keywords\", \"keywords\" ],\n    \"country_details\" : {\n      \"english_speaking\" : 7,\n      \"non_english_speaking\" : 1\n    },\n    \"traces\" : [ \"traces\", \"traces\" ],\n    \"description\" : \"description\",\n    \"diet_flags\" : [ {\n      \"ingredient\" : \"ingredient\",\n      \"is_allergen\" : true,\n      \"ingredient_description\" : \"ingredient_description\",\n      \"compatibility_level\" : 4,\n      \"is_compatible\" : \"is_compatible\",\n      \"diet_label\" : \"diet_label\",\n      \"compatibility_description\" : \"compatibility_description\"\n    }, {\n      \"ingredient\" : \"ingredient\",\n      \"is_allergen\" : true,\n      \"ingredient_description\" : \"ingredient_description\",\n      \"compatibility_level\" : 4,\n      \"is_compatible\" : \"is_compatible\",\n      \"diet_label\" : \"diet_label\",\n      \"compatibility_description\" : \"compatibility_description\"\n    } ],\n    \"countries\" : [ \"countries\", \"countries\" ],\n    \"has_english_ingredients\" : true,\n    \"palm_oil_ingredients\" : [ \"palm_oil_ingredients\", \"palm_oil_ingredients\" ],\n    \"serving\" : {\n      \"size_fulltext\" : \"size_fulltext\",\n      \"size\" : \"size\",\n      \"measurement_unit\" : \"measurement_unit\"\n    },\n    \"nutrients\" : [ {\n      \"data_points\" : 5,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 1,\n      \"description\" : \"description\",\n      \"per_100g\" : 6.027456183070403\n    }, {\n      \"data_points\" : 5,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 1,\n      \"description\" : \"description\",\n      \"per_100g\" : 6.027456183070403\n    } ],\n    \"allergens\" : [ \"allergens\", \"allergens\" ],\n    \"packaging_photos\" : {\n      \"nutrition\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      },\n      \"ingredients\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      },\n      \"front\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      }\n    },\n    \"ingredient_list\" : [ \"ingredient_list\", \"ingredient_list\" ],\n    \"vitamins\" : [ \"vitamins\", \"vitamins\" ],\n    \"diet_labels\" : {\n      \"vegetarian\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 9,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 7,\n        \"is_compatible\" : true\n      },\n      \"vegan\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 5,\n        \"is_compatible\" : true\n      },\n      \"gluten_free\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 3,\n        \"is_compatible\" : true\n      }\n    },\n    \"name\" : \"name\",\n    \"ingredients\" : \"ingredients\",\n    \"categories\" : [ \"categories\", \"categories\" ],\n    \"barcode\" : \"barcode\",\n    \"brand\" : \"brand\",\n    \"brand_list\" : [ \"brand_list\", \"brand_list\" ]\n  } ]\n}", BrandedFoodObject.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BrandedFoodObject>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BrandedFoodObject>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<BrandedFoodObject> foodBrandedNamePhpGet(@NotNull @ApiParam(value = "#### Search for branded food items using a general food name keyword. This does not have to exactly match the \"official\" name for the food.  **Example** > ```&name=Starburst``` ", required = true) @Valid @RequestParam(value = "name", required = true) String name,@ApiParam(value = "#### Set maximum number of records you want the API to return.  **Example** > ```&limit=10``` ", allowableValues = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "#### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  **Example** > ```&page=1``` ") @Valid @RequestParam(value = "page", required = false) Integer page) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BrandedFoodObject>(objectMapper.readValue("{\n  \"items\" : [ {\n    \"minerals\" : [ \"minerals\", \"minerals\" ],\n    \"package\" : {\n      \"quantity\" : 0,\n      \"size\" : \"size\"\n    },\n    \"keywords\" : [ \"keywords\", \"keywords\" ],\n    \"country_details\" : {\n      \"english_speaking\" : 7,\n      \"non_english_speaking\" : 1\n    },\n    \"traces\" : [ \"traces\", \"traces\" ],\n    \"description\" : \"description\",\n    \"diet_flags\" : [ {\n      \"ingredient\" : \"ingredient\",\n      \"is_allergen\" : true,\n      \"ingredient_description\" : \"ingredient_description\",\n      \"compatibility_level\" : 4,\n      \"is_compatible\" : \"is_compatible\",\n      \"diet_label\" : \"diet_label\",\n      \"compatibility_description\" : \"compatibility_description\"\n    }, {\n      \"ingredient\" : \"ingredient\",\n      \"is_allergen\" : true,\n      \"ingredient_description\" : \"ingredient_description\",\n      \"compatibility_level\" : 4,\n      \"is_compatible\" : \"is_compatible\",\n      \"diet_label\" : \"diet_label\",\n      \"compatibility_description\" : \"compatibility_description\"\n    } ],\n    \"countries\" : [ \"countries\", \"countries\" ],\n    \"has_english_ingredients\" : true,\n    \"palm_oil_ingredients\" : [ \"palm_oil_ingredients\", \"palm_oil_ingredients\" ],\n    \"serving\" : {\n      \"size_fulltext\" : \"size_fulltext\",\n      \"size\" : \"size\",\n      \"measurement_unit\" : \"measurement_unit\"\n    },\n    \"nutrients\" : [ {\n      \"data_points\" : 5,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 1,\n      \"description\" : \"description\",\n      \"per_100g\" : 6.027456183070403\n    }, {\n      \"data_points\" : 5,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 1,\n      \"description\" : \"description\",\n      \"per_100g\" : 6.027456183070403\n    } ],\n    \"allergens\" : [ \"allergens\", \"allergens\" ],\n    \"packaging_photos\" : {\n      \"nutrition\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      },\n      \"ingredients\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      },\n      \"front\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      }\n    },\n    \"ingredient_list\" : [ \"ingredient_list\", \"ingredient_list\" ],\n    \"vitamins\" : [ \"vitamins\", \"vitamins\" ],\n    \"diet_labels\" : {\n      \"vegetarian\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 9,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 7,\n        \"is_compatible\" : true\n      },\n      \"vegan\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 5,\n        \"is_compatible\" : true\n      },\n      \"gluten_free\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 3,\n        \"is_compatible\" : true\n      }\n    },\n    \"name\" : \"name\",\n    \"ingredients\" : \"ingredients\",\n    \"categories\" : [ \"categories\", \"categories\" ],\n    \"barcode\" : \"barcode\",\n    \"brand\" : \"brand\",\n    \"brand_list\" : [ \"brand_list\", \"brand_list\" ]\n  }, {\n    \"minerals\" : [ \"minerals\", \"minerals\" ],\n    \"package\" : {\n      \"quantity\" : 0,\n      \"size\" : \"size\"\n    },\n    \"keywords\" : [ \"keywords\", \"keywords\" ],\n    \"country_details\" : {\n      \"english_speaking\" : 7,\n      \"non_english_speaking\" : 1\n    },\n    \"traces\" : [ \"traces\", \"traces\" ],\n    \"description\" : \"description\",\n    \"diet_flags\" : [ {\n      \"ingredient\" : \"ingredient\",\n      \"is_allergen\" : true,\n      \"ingredient_description\" : \"ingredient_description\",\n      \"compatibility_level\" : 4,\n      \"is_compatible\" : \"is_compatible\",\n      \"diet_label\" : \"diet_label\",\n      \"compatibility_description\" : \"compatibility_description\"\n    }, {\n      \"ingredient\" : \"ingredient\",\n      \"is_allergen\" : true,\n      \"ingredient_description\" : \"ingredient_description\",\n      \"compatibility_level\" : 4,\n      \"is_compatible\" : \"is_compatible\",\n      \"diet_label\" : \"diet_label\",\n      \"compatibility_description\" : \"compatibility_description\"\n    } ],\n    \"countries\" : [ \"countries\", \"countries\" ],\n    \"has_english_ingredients\" : true,\n    \"palm_oil_ingredients\" : [ \"palm_oil_ingredients\", \"palm_oil_ingredients\" ],\n    \"serving\" : {\n      \"size_fulltext\" : \"size_fulltext\",\n      \"size\" : \"size\",\n      \"measurement_unit\" : \"measurement_unit\"\n    },\n    \"nutrients\" : [ {\n      \"data_points\" : 5,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 1,\n      \"description\" : \"description\",\n      \"per_100g\" : 6.027456183070403\n    }, {\n      \"data_points\" : 5,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 1,\n      \"description\" : \"description\",\n      \"per_100g\" : 6.027456183070403\n    } ],\n    \"allergens\" : [ \"allergens\", \"allergens\" ],\n    \"packaging_photos\" : {\n      \"nutrition\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      },\n      \"ingredients\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      },\n      \"front\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      }\n    },\n    \"ingredient_list\" : [ \"ingredient_list\", \"ingredient_list\" ],\n    \"vitamins\" : [ \"vitamins\", \"vitamins\" ],\n    \"diet_labels\" : {\n      \"vegetarian\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 9,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 7,\n        \"is_compatible\" : true\n      },\n      \"vegan\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 5,\n        \"is_compatible\" : true\n      },\n      \"gluten_free\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 3,\n        \"is_compatible\" : true\n      }\n    },\n    \"name\" : \"name\",\n    \"ingredients\" : \"ingredients\",\n    \"categories\" : [ \"categories\", \"categories\" ],\n    \"barcode\" : \"barcode\",\n    \"brand\" : \"brand\",\n    \"brand_list\" : [ \"brand_list\", \"brand_list\" ]\n  } ]\n}", BrandedFoodObject.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BrandedFoodObject>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BrandedFoodObject>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<BrandedFoodObject> foodBrandedSearchPhpGet(@ApiParam(value = "#### Filter the search to only include branded foods that contain a specific allergen.  **Example** > ```&allergen=Peanuts```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @Valid @RequestParam(value = "allergen", required = false) String allergen,@ApiParam(value = "#### Filter the search to only include branded foods that are owned by a specific brand.  **Example** > ```&brand=Starbucks``` ") @Valid @RequestParam(value = "brand", required = false) String brand,@ApiParam(value = "#### Filter the search to only include branded foods from a specific category.  **Example** > ```&category=Plant Based Foods``` ") @Valid @RequestParam(value = "category", required = false) String category,@ApiParam(value = "#### Filter the search to only include branded foods that are sold in a specific country.  **Example** > ```&country=United States```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @Valid @RequestParam(value = "country", required = false) String country,@ApiParam(value = "#### Filter the search to only include branded foods that are considered compatible with a specific diet.  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ", allowableValues = "Vegan, Vegetarian, Gluten Free") @Valid @RequestParam(value = "diet", required = false) String diet,@ApiParam(value = "#### Filter the search to only include branded foods that contain a specific ingredient.  **Example** > ```&ingredient=Salt``` ") @Valid @RequestParam(value = "ingredient", required = false) String ingredient,@ApiParam(value = "#### Filter the search to only include branded foods that are associated with a specific keyword.  **Example** > ```&keyword=Organic```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "#### Filter the search to only include branded foods that contain a specific mineral.  **Example** > ```&mineral=Potassium``` ") @Valid @RequestParam(value = "mineral", required = false) String mineral,@ApiParam(value = "#### Filter the search to only include branded foods that contain a specific nutrient.  **Example** > ```&nutrient=Caffeine```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @Valid @RequestParam(value = "nutrient", required = false) String nutrient,@ApiParam(value = "#### Filter the search to only include branded foods that contain a specific ingredient made using palm oil.  **Example** > ```&palm_oil=E160a Beta Carotene``` ") @Valid @RequestParam(value = "palm_oil", required = false) String palmOil,@ApiParam(value = "### Filter the search to only include branded foods that contain a specific trace ingredient.  **Example** > ```&trace=Tree Nuts```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. ") @Valid @RequestParam(value = "trace", required = false) String trace,@ApiParam(value = "#### Filter the search to only include branded foods that contain a specific vitamin.  **Example** > ```&vitamin=Biotin``` ") @Valid @RequestParam(value = "vitamin", required = false) String vitamin,@ApiParam(value = "#### Set maximum number of records you want the API to return.  **Example** > ```&limit=10``` ", allowableValues = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "#### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  **Example** > ```&page=1``` ") @Valid @RequestParam(value = "page", required = false) Integer page) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BrandedFoodObject>(objectMapper.readValue("{\n  \"items\" : [ {\n    \"minerals\" : [ \"minerals\", \"minerals\" ],\n    \"package\" : {\n      \"quantity\" : 0,\n      \"size\" : \"size\"\n    },\n    \"keywords\" : [ \"keywords\", \"keywords\" ],\n    \"country_details\" : {\n      \"english_speaking\" : 7,\n      \"non_english_speaking\" : 1\n    },\n    \"traces\" : [ \"traces\", \"traces\" ],\n    \"description\" : \"description\",\n    \"diet_flags\" : [ {\n      \"ingredient\" : \"ingredient\",\n      \"is_allergen\" : true,\n      \"ingredient_description\" : \"ingredient_description\",\n      \"compatibility_level\" : 4,\n      \"is_compatible\" : \"is_compatible\",\n      \"diet_label\" : \"diet_label\",\n      \"compatibility_description\" : \"compatibility_description\"\n    }, {\n      \"ingredient\" : \"ingredient\",\n      \"is_allergen\" : true,\n      \"ingredient_description\" : \"ingredient_description\",\n      \"compatibility_level\" : 4,\n      \"is_compatible\" : \"is_compatible\",\n      \"diet_label\" : \"diet_label\",\n      \"compatibility_description\" : \"compatibility_description\"\n    } ],\n    \"countries\" : [ \"countries\", \"countries\" ],\n    \"has_english_ingredients\" : true,\n    \"palm_oil_ingredients\" : [ \"palm_oil_ingredients\", \"palm_oil_ingredients\" ],\n    \"serving\" : {\n      \"size_fulltext\" : \"size_fulltext\",\n      \"size\" : \"size\",\n      \"measurement_unit\" : \"measurement_unit\"\n    },\n    \"nutrients\" : [ {\n      \"data_points\" : 5,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 1,\n      \"description\" : \"description\",\n      \"per_100g\" : 6.027456183070403\n    }, {\n      \"data_points\" : 5,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 1,\n      \"description\" : \"description\",\n      \"per_100g\" : 6.027456183070403\n    } ],\n    \"allergens\" : [ \"allergens\", \"allergens\" ],\n    \"packaging_photos\" : {\n      \"nutrition\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      },\n      \"ingredients\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      },\n      \"front\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      }\n    },\n    \"ingredient_list\" : [ \"ingredient_list\", \"ingredient_list\" ],\n    \"vitamins\" : [ \"vitamins\", \"vitamins\" ],\n    \"diet_labels\" : {\n      \"vegetarian\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 9,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 7,\n        \"is_compatible\" : true\n      },\n      \"vegan\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 5,\n        \"is_compatible\" : true\n      },\n      \"gluten_free\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 3,\n        \"is_compatible\" : true\n      }\n    },\n    \"name\" : \"name\",\n    \"ingredients\" : \"ingredients\",\n    \"categories\" : [ \"categories\", \"categories\" ],\n    \"barcode\" : \"barcode\",\n    \"brand\" : \"brand\",\n    \"brand_list\" : [ \"brand_list\", \"brand_list\" ]\n  }, {\n    \"minerals\" : [ \"minerals\", \"minerals\" ],\n    \"package\" : {\n      \"quantity\" : 0,\n      \"size\" : \"size\"\n    },\n    \"keywords\" : [ \"keywords\", \"keywords\" ],\n    \"country_details\" : {\n      \"english_speaking\" : 7,\n      \"non_english_speaking\" : 1\n    },\n    \"traces\" : [ \"traces\", \"traces\" ],\n    \"description\" : \"description\",\n    \"diet_flags\" : [ {\n      \"ingredient\" : \"ingredient\",\n      \"is_allergen\" : true,\n      \"ingredient_description\" : \"ingredient_description\",\n      \"compatibility_level\" : 4,\n      \"is_compatible\" : \"is_compatible\",\n      \"diet_label\" : \"diet_label\",\n      \"compatibility_description\" : \"compatibility_description\"\n    }, {\n      \"ingredient\" : \"ingredient\",\n      \"is_allergen\" : true,\n      \"ingredient_description\" : \"ingredient_description\",\n      \"compatibility_level\" : 4,\n      \"is_compatible\" : \"is_compatible\",\n      \"diet_label\" : \"diet_label\",\n      \"compatibility_description\" : \"compatibility_description\"\n    } ],\n    \"countries\" : [ \"countries\", \"countries\" ],\n    \"has_english_ingredients\" : true,\n    \"palm_oil_ingredients\" : [ \"palm_oil_ingredients\", \"palm_oil_ingredients\" ],\n    \"serving\" : {\n      \"size_fulltext\" : \"size_fulltext\",\n      \"size\" : \"size\",\n      \"measurement_unit\" : \"measurement_unit\"\n    },\n    \"nutrients\" : [ {\n      \"data_points\" : 5,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 1,\n      \"description\" : \"description\",\n      \"per_100g\" : 6.027456183070403\n    }, {\n      \"data_points\" : 5,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 1,\n      \"description\" : \"description\",\n      \"per_100g\" : 6.027456183070403\n    } ],\n    \"allergens\" : [ \"allergens\", \"allergens\" ],\n    \"packaging_photos\" : {\n      \"nutrition\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      },\n      \"ingredients\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      },\n      \"front\" : {\n        \"small\" : \"small\",\n        \"thumb\" : \"thumb\",\n        \"display\" : \"display\"\n      }\n    },\n    \"ingredient_list\" : [ \"ingredient_list\", \"ingredient_list\" ],\n    \"vitamins\" : [ \"vitamins\", \"vitamins\" ],\n    \"diet_labels\" : {\n      \"vegetarian\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 9,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 7,\n        \"is_compatible\" : true\n      },\n      \"vegan\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 5,\n        \"is_compatible\" : true\n      },\n      \"gluten_free\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 3,\n        \"is_compatible\" : true\n      }\n    },\n    \"name\" : \"name\",\n    \"ingredients\" : \"ingredients\",\n    \"categories\" : [ \"categories\", \"categories\" ],\n    \"barcode\" : \"barcode\",\n    \"brand\" : \"brand\",\n    \"brand_list\" : [ \"brand_list\", \"brand_list\" ]\n  } ]\n}", BrandedFoodObject.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BrandedFoodObject>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BrandedFoodObject>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<IngredientObject> foodIngredientSearchPhpGet(@NotNull @ApiParam(value = "Search our database for a single ingredient or a specific set of ingredients.  **Example #1: Single Ingredient** > ```&find=broccoli```  **Example #2: Set of Ingredients** > ```&find=broccoli,cauliflower,spinach```  **Important Notes**    * Comma-separated lists cannot contain more than **15 ingredients**. You must perform additional API calls if you are looking up more than 15 ingredients. ", required = true) @Valid @RequestParam(value = "find", required = true) String find,@ApiParam(value = "#### Optionally filter the search result to only include raw ingredients.  **Example** > ```&raw=true``` ") @Valid @RequestParam(value = "raw", required = false) Boolean raw,@ApiParam(value = "#### Set maximum number of records you want the API to return, per search term.  **Example** > ```&limit=3``` ", allowableValues = "1, 2, 3") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IngredientObject>(objectMapper.readValue("{\n  \"items\" : [ {\n    \"protein_conversion_factor\" : 2.027123023002322,\n    \"calorie_conversion_factor\" : {\n      \"carbohydrate_value\" : 3.616076749251911,\n      \"protein_value\" : 7.061401241503109,\n      \"fat_value\" : 9.301444243932576\n    },\n    \"components\" : [ {\n      \"data_points\" : 1,\n      \"pct_weight\" : 4.145608029883936,\n      \"gram_weight\" : 7.386281948385884,\n      \"name\" : \"name\",\n      \"is_refuse\" : true\n    }, {\n      \"data_points\" : 1,\n      \"pct_weight\" : 4.145608029883936,\n      \"gram_weight\" : 7.386281948385884,\n      \"name\" : \"name\",\n      \"is_refuse\" : true\n    } ],\n    \"diet_labels\" : {\n      \"vegetarian\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 9,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 7,\n        \"is_compatible\" : true\n      },\n      \"vegan\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 5,\n        \"is_compatible\" : true\n      },\n      \"gluten_free\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 3,\n        \"is_compatible\" : true\n      }\n    },\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"categories\" : [ \"categories\", \"categories\" ],\n    \"footnote\" : \"footnote\",\n    \"common_name\" : \"common_name\",\n    \"nutrients\" : [ {\n      \"data_points\" : 2,\n      \"min\" : 6.027456183070403,\n      \"median\" : 5.962133916683182,\n      \"max\" : 1.4658129805029452,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 5,\n      \"description\" : \"description\",\n      \"per_100g\" : 0.8008281904610115,\n      \"footnote\" : \"footnote\"\n    }, {\n      \"data_points\" : 2,\n      \"min\" : 6.027456183070403,\n      \"median\" : 5.962133916683182,\n      \"max\" : 1.4658129805029452,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 5,\n      \"description\" : \"description\",\n      \"per_100g\" : 0.8008281904610115,\n      \"footnote\" : \"footnote\"\n    } ],\n    \"portions\" : [ {\n      \"data_points\" : 1,\n      \"modifier\" : \"modifier\",\n      \"gram_weight\" : 1.0246457001441578,\n      \"measurement_unit\" : \"measurement_unit\",\n      \"description\" : \"description\",\n      \"footnote\" : \"footnote\"\n    }, {\n      \"data_points\" : 1,\n      \"modifier\" : \"modifier\",\n      \"gram_weight\" : 1.0246457001441578,\n      \"measurement_unit\" : \"measurement_unit\",\n      \"description\" : \"description\",\n      \"footnote\" : \"footnote\"\n    } ]\n  }, {\n    \"protein_conversion_factor\" : 2.027123023002322,\n    \"calorie_conversion_factor\" : {\n      \"carbohydrate_value\" : 3.616076749251911,\n      \"protein_value\" : 7.061401241503109,\n      \"fat_value\" : 9.301444243932576\n    },\n    \"components\" : [ {\n      \"data_points\" : 1,\n      \"pct_weight\" : 4.145608029883936,\n      \"gram_weight\" : 7.386281948385884,\n      \"name\" : \"name\",\n      \"is_refuse\" : true\n    }, {\n      \"data_points\" : 1,\n      \"pct_weight\" : 4.145608029883936,\n      \"gram_weight\" : 7.386281948385884,\n      \"name\" : \"name\",\n      \"is_refuse\" : true\n    } ],\n    \"diet_labels\" : {\n      \"vegetarian\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 9,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 7,\n        \"is_compatible\" : true\n      },\n      \"vegan\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 5,\n        \"is_compatible\" : true\n      },\n      \"gluten_free\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 2,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 3,\n        \"is_compatible\" : true\n      }\n    },\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"categories\" : [ \"categories\", \"categories\" ],\n    \"footnote\" : \"footnote\",\n    \"common_name\" : \"common_name\",\n    \"nutrients\" : [ {\n      \"data_points\" : 2,\n      \"min\" : 6.027456183070403,\n      \"median\" : 5.962133916683182,\n      \"max\" : 1.4658129805029452,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 5,\n      \"description\" : \"description\",\n      \"per_100g\" : 0.8008281904610115,\n      \"footnote\" : \"footnote\"\n    }, {\n      \"data_points\" : 2,\n      \"min\" : 6.027456183070403,\n      \"median\" : 5.962133916683182,\n      \"max\" : 1.4658129805029452,\n      \"name\" : \"name\",\n      \"measurement_unit\" : \"measurement_unit\",\n      \"rank\" : 5,\n      \"description\" : \"description\",\n      \"per_100g\" : 0.8008281904610115,\n      \"footnote\" : \"footnote\"\n    } ],\n    \"portions\" : [ {\n      \"data_points\" : 1,\n      \"modifier\" : \"modifier\",\n      \"gram_weight\" : 1.0246457001441578,\n      \"measurement_unit\" : \"measurement_unit\",\n      \"description\" : \"description\",\n      \"footnote\" : \"footnote\"\n    }, {\n      \"data_points\" : 1,\n      \"modifier\" : \"modifier\",\n      \"gram_weight\" : 1.0246457001441578,\n      \"measurement_unit\" : \"measurement_unit\",\n      \"description\" : \"description\",\n      \"footnote\" : \"footnote\"\n    } ]\n  } ]\n}", IngredientObject.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IngredientObject>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IngredientObject>(HttpStatus.NOT_IMPLEMENTED);
    }

}
