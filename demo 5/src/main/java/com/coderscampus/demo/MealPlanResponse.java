package com.coderscampus.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class MealPlanResponse {
	@JsonIgnoreProperties(ignoreUnknown = true)
	private Week week;

	public Week getWeek() {
		return week;
	}

	public void setWeek(Week week) {
		this.week = week;
	}
}
