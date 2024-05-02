package com.coderscampus.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrient {
	@JsonProperty("calories")
private Long caloreis;
	@JsonProperty("carbohydrates")
private Long carbohydrates;
private Long protein;
private Long fat;
public Long getCaloreis() {
	return caloreis;
}
public void setCaloreis(Long caloreis) {
	this.caloreis = caloreis;
}
public Long getCarbohydrates() {
	return carbohydrates;
}
public void setCarbohydrates(Long carbohydrates) {
	this.carbohydrates = carbohydrates;
}
public Long getProtein() {
	return protein;
}
public void setProtein(Long protein) {
	this.protein = protein;
}
public Long getFat() {
	return fat;
}
public void setFat(Long fat) {
	this.fat = fat;
}
}
