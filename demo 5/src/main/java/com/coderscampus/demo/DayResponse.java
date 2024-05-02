package com.coderscampus.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {
	@Autowired
	@JsonProperty("meals")
	public List<Meals> meals;
	@Autowired
	@JsonProperty("nutrients")
	public Nutrient nutrient;

	public Nutrient getNutrient() {
		return nutrient;
	}

	public void setNutrient(Nutrient nutrient) {
		this.nutrient = nutrient;
	}

	public List<Meals> getMeals() {
		return meals;
	}

	public void setMeals(List<Meals> meals) {
		this.meals = (List<Meals>) meals;
	}

}
