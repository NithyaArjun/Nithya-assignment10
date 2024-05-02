package com.coderscampus.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Controller {
//	@Value("${spoonacular.urls.base}")
//	private String spoonacularBase;
//	@Value("${spoonacular.urls.mealplan}")
//	private String spoonacularMealGenerate;
//	@Value("${spoonacular.api.key}")
//	private String apiKey;

	@GetMapping("mealplanner/day")
	public DayResponse getDayMeal(@RequestParam String numCalories, @RequestParam String diet,
			@RequestParam String exclusions) throws JsonMappingException, JsonProcessingException {

		RestTemplate restTemplate = new RestTemplate();
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromUriString("https://api.spoonacular.com/mealplanner/generate")
				.queryParam("apiKey", "48c59c15254b4830811f1797ec6773d6").queryParam("targetCalories", numCalories)
				.queryParam("diet", diet).queryParam("exclude", exclusions).queryParam("timeFrame", "day");
		String url = builder.toUriString();
		var response = restTemplate.getForEntity(url, String.class);
		var read = response.getBody();
		ObjectMapper mapper = new ObjectMapper();
		DayResponse day = mapper.readValue(read, DayResponse.class);
		return day;

	}

	@GetMapping("mealplanner/week")

	public MealPlanResponse getDayMeals(@RequestParam String numCalories, @RequestParam String diet,
			@RequestParam String exclusions) throws JsonMappingException, JsonProcessingException {

		RestTemplate restTemplate = new RestTemplate();
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromUriString("https://api.spoonacular.com/mealplanner/generate")
				.queryParam("apiKey", "48c59c15254b4830811f1797ec6773d6").queryParam("targetCalories", numCalories)
				.queryParam("diet", diet).queryParam("exclude", exclusions).queryParam("timeFrame", "week");
		String url = builder.toUriString();
		var response = restTemplate.getForEntity(url, String.class);
		var read = response.getBody();
		ObjectMapper mapper = new ObjectMapper();
		MealPlanResponse week1 = mapper.readValue(read, MealPlanResponse.class);
		return week1;

	}

}