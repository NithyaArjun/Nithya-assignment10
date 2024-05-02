package com.coderscampus.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meals {
	
	private int id;
	private String title;
	private String imageType;
	@JsonProperty("readyInMinutes")
	private int readyMinitues;
	private int servings;
	@JsonProperty("sourceUrl")
	private String soureUrl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public int getReadyMinitues() {
		return readyMinitues;
	}
	public void setReadyMinitues(int readyMinitues) {
		this.readyMinitues = readyMinitues;
	}
	public int getServings() {
		return servings;
	}
	public void setServings(int servings) {
		this.servings = servings;
	}
	public String getSoureUrl() {
		return soureUrl;
	}
	public void setSoureUrl(String soureUrl) {
		this.soureUrl = soureUrl;
	}
	
}
