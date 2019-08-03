package com.example.pickimage.model;

import com.google.gson.annotations.SerializedName;

public class ResponseApiModel{

	@SerializedName("name")
	private String name;

	@SerializedName("error")
	private boolean error;

	@SerializedName("url")
	private String url;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setError(boolean error){
		this.error = error;
	}

	public boolean isError(){
		return error;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}
}