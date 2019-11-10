package com.basic.postFromTextFileSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			dryRun=false,
			features= {"src/test/resources/com/basic/postFromTextFileFF/"},
			glue={"com/basic/postFromTextFileSD/"},
			monochrome = true,
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report5434.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunMyPostFromTextFileTest {


}
