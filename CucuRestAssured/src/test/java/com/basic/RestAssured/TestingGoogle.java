package com.basic.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGoogle {
	public static void main(String[] args) {

		Response response = RestAssured.given().get("https://www.google.com");
		int stCode = response.getStatusCode();
		System.out.println("Ststus code is =" + stCode);
	}

}
