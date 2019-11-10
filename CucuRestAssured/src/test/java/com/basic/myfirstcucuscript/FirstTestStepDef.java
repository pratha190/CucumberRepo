package com.basic.myfirstcucuscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstTestStepDef {

	WebDriver driver;
//^ and & used for exect case match
	@Given("^I am starting cucunber automation$")
	public void I_am_starting_cucunber_automation() {
		System.out.println("Starting Cucumber Automation");
		System.setProperty("webdriver.gecko.driver",
				"C:\\RedicalSilenium\\31-aug-2019(drivers)\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@When("I print hello cucumber")
	public void I_print_hello_cucumber() {
		System.out.println("Hello Cucumber");
	}

	@Then("I print cucumber test passed")
	public void I_print_cucumber_test_passed() {
		System.out.println("Test Passed");
	}
}
