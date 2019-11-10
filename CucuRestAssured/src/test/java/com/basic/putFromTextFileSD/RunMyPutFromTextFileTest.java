package com.basic.putFromTextFileSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			dryRun=false,
			features= {"src/test/resources/com/basic/putFromTextFileFF/"},
			glue={"com/basic/putFromTextFileSD/"},
			monochrome = true,
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report5434.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunMyPutFromTextFileTest {


}
