package com.ecommerce.Qkart.entities;

public enum UserType {

	NORMAL_USER("NORMAL_USER"), 
	ADMIN_USER("ADMIN_USER");

	private final String userType;

	UserType(String userType) {
		this.userType = userType;
	}

	public String getUserType() {
		return this.userType;
	}
}
