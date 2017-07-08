package com.cucumber.StepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/cucumber/features",
		glue = "com.cucumber.StepDefinations",
		plugin = {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber/git.json",
		}
		)


public class RunTest {

}
