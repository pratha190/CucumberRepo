package com.basic.postUpdatedJsonWithDataDriven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/resources/com/basic/postUpdatedJsonDataDriven"},
			glue={"com/basic/postUpdatedJsonWithDataDriven/"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report774.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunMyPostFromTextFileTestDataDriven {


}
