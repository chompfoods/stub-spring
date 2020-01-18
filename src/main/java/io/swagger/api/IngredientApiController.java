package io.swagger.api;

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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-18T16:53:00.929Z[GMT]")
@Controller
public class IngredientApiController implements IngredientApi {

    private static final Logger log = LoggerFactory.getLogger(IngredientApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IngredientApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<IngredientObject> ingredientSearchPhpGet(@NotNull @ApiParam(value = "Specify the ingredient name(s).  __Example #1:__ broccoli  __Example #2:__ broccoli,cauliflower,spinach  ___Important Note:__ Set the \"is_list\" parameter to true before passing in a comma-separated list of ingredients._ ", required = true) @Valid @RequestParam(value = "find", required = true) Integer find,@NotNull @ApiParam(value = "Specify if you are searching for multiple ingredients.  _Setting this to true will configure this endpoint so that it accepts a comma-separated list of ingredients._  _By default, this endpoint expects a single ingredient._  __Example:__ true _(defaults to false)_ ", required = true) @Valid @RequestParam(value = "list", required = true) Boolean list,@ApiParam(value = "Specify if you only want data for raw ingredients.  __Example:__ true _(defaults to true)_ ") @Valid @RequestParam(value = "raw", required = false) Boolean raw,@ApiParam(value = "Set maximum number of records you want the API to return.  ___Important Note:__ Setting this to \"1\" will return 1 record per search term._  __Example:__ 1 _(defaults to 1, max is 3)_ ", allowableValues = "1, 2, 3") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IngredientObject>(objectMapper.readValue("{\n  \"items\" : [ {\n    \"protein_conversion_factor\" : 0.8008281904610115,\n    \"calorie_conversion_factor\" : {\n      \"carbohydrate_value\" : 6.84685269835264,\n      \"protein_value\" : 1.0246457001441578,\n      \"fat_value\" : 1.4894159098541704\n    },\n    \"components\" : [ {\n      \"data_points\" : 3,\n      \"pct_weight\" : 9.018348186070783,\n      \"gram_weight\" : 6.438423552598547,\n      \"name\" : \"name\",\n      \"is_refuse\" : true\n    }, {\n      \"data_points\" : 3,\n      \"pct_weight\" : 9.018348186070783,\n      \"gram_weight\" : 6.438423552598547,\n      \"name\" : \"name\",\n      \"is_refuse\" : true\n    } ],\n    \"diet_labels\" : {\n      \"vegetarian\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 9,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 5,\n        \"is_compatible\" : true\n      },\n      \"vegan\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 4,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 1,\n        \"is_compatible\" : true\n      },\n      \"gluten_free\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 6,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 9,\n        \"is_compatible\" : true\n      }\n    },\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"categories\" : [ \"categories\", \"categories\" ],\n    \"footnote\" : \"footnote\",\n    \"common_name\" : \"common_name\",\n    \"nutrients\" : {\n      \"usda\" : [ {\n        \"data_points\" : 1,\n        \"min\" : 2.027123023002322,\n        \"median\" : 7.386281948385884,\n        \"max\" : 4.145608029883936,\n        \"name\" : \"name\",\n        \"measurement_unit\" : \"measurement_unit\",\n        \"description\" : \"description\",\n        \"id\" : 9,\n        \"per_100g\" : 3.616076749251911,\n        \"footnote\" : \"footnote\",\n        \"source\" : \"source\"\n      }, {\n        \"data_points\" : 1,\n        \"min\" : 2.027123023002322,\n        \"median\" : 7.386281948385884,\n        \"max\" : 4.145608029883936,\n        \"name\" : \"name\",\n        \"measurement_unit\" : \"measurement_unit\",\n        \"description\" : \"description\",\n        \"id\" : 9,\n        \"per_100g\" : 3.616076749251911,\n        \"footnote\" : \"footnote\",\n        \"source\" : \"source\"\n      } ]\n    },\n    \"portions\" : [ {\n      \"data_points\" : 1,\n      \"modifier\" : \"modifier\",\n      \"gram_weight\" : 6.965117697638846,\n      \"measurement_unit\" : \"measurement_unit\",\n      \"description\" : \"description\",\n      \"footnote\" : \"footnote\"\n    }, {\n      \"data_points\" : 1,\n      \"modifier\" : \"modifier\",\n      \"gram_weight\" : 6.965117697638846,\n      \"measurement_unit\" : \"measurement_unit\",\n      \"description\" : \"description\",\n      \"footnote\" : \"footnote\"\n    } ]\n  }, {\n    \"protein_conversion_factor\" : 0.8008281904610115,\n    \"calorie_conversion_factor\" : {\n      \"carbohydrate_value\" : 6.84685269835264,\n      \"protein_value\" : 1.0246457001441578,\n      \"fat_value\" : 1.4894159098541704\n    },\n    \"components\" : [ {\n      \"data_points\" : 3,\n      \"pct_weight\" : 9.018348186070783,\n      \"gram_weight\" : 6.438423552598547,\n      \"name\" : \"name\",\n      \"is_refuse\" : true\n    }, {\n      \"data_points\" : 3,\n      \"pct_weight\" : 9.018348186070783,\n      \"gram_weight\" : 6.438423552598547,\n      \"name\" : \"name\",\n      \"is_refuse\" : true\n    } ],\n    \"diet_labels\" : {\n      \"vegetarian\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 9,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 5,\n        \"is_compatible\" : true\n      },\n      \"vegan\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 4,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 1,\n        \"is_compatible\" : true\n      },\n      \"gluten_free\" : {\n        \"confidence_description\" : \"confidence_description\",\n        \"confidence\" : 6,\n        \"name\" : \"name\",\n        \"compatibility_level\" : 9,\n        \"is_compatible\" : true\n      }\n    },\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"categories\" : [ \"categories\", \"categories\" ],\n    \"footnote\" : \"footnote\",\n    \"common_name\" : \"common_name\",\n    \"nutrients\" : {\n      \"usda\" : [ {\n        \"data_points\" : 1,\n        \"min\" : 2.027123023002322,\n        \"median\" : 7.386281948385884,\n        \"max\" : 4.145608029883936,\n        \"name\" : \"name\",\n        \"measurement_unit\" : \"measurement_unit\",\n        \"description\" : \"description\",\n        \"id\" : 9,\n        \"per_100g\" : 3.616076749251911,\n        \"footnote\" : \"footnote\",\n        \"source\" : \"source\"\n      }, {\n        \"data_points\" : 1,\n        \"min\" : 2.027123023002322,\n        \"median\" : 7.386281948385884,\n        \"max\" : 4.145608029883936,\n        \"name\" : \"name\",\n        \"measurement_unit\" : \"measurement_unit\",\n        \"description\" : \"description\",\n        \"id\" : 9,\n        \"per_100g\" : 3.616076749251911,\n        \"footnote\" : \"footnote\",\n        \"source\" : \"source\"\n      } ]\n    },\n    \"portions\" : [ {\n      \"data_points\" : 1,\n      \"modifier\" : \"modifier\",\n      \"gram_weight\" : 6.965117697638846,\n      \"measurement_unit\" : \"measurement_unit\",\n      \"description\" : \"description\",\n      \"footnote\" : \"footnote\"\n    }, {\n      \"data_points\" : 1,\n      \"modifier\" : \"modifier\",\n      \"gram_weight\" : 6.965117697638846,\n      \"measurement_unit\" : \"measurement_unit\",\n      \"description\" : \"description\",\n      \"footnote\" : \"footnote\"\n    } ]\n  } ]\n}", IngredientObject.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IngredientObject>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IngredientObject>(HttpStatus.NOT_IMPLEMENTED);
    }

}
