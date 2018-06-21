package com.qa.rest.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "resources/FeatureFiles/RestTest.feature",
		plugin = {"pretty","json:target/pmi.json",			
		"html:target/HTML-Report"}
		
		)

public class RunTest 
{

}
