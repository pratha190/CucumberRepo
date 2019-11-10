package com.basic.TestingGoogle;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GoogleStepDef {
	Response response;

	@Given("^I start rest assured testing$")
	public void i_start_rest_assured_testing() {
		System.out.println("Starting test case");
	}

	@When("^I hit google website$")
	public void i_hit_google_website() {
		response = RestAssured.given().get("https://www.google.com");
	}

	@Then("^I check the status code from response$")
	public void i_check_the_status_code_from_response() {
		int stCode = response.getStatusCode();
		Assert.assertTrue(stCode == 200);
	}

}
