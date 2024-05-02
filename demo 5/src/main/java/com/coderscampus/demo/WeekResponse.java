package com.coderscampus.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class WeekResponse {
	@Autowired 
	public Meals meals;
	@Autowired
	public List<DayResponse> dayresponse;

	public List<DayResponse> getDayresponse() {
		return dayresponse;
	}

	public void setDayresponse(List<DayResponse> dayresponse) {
		this.dayresponse = dayresponse;
	}

}
