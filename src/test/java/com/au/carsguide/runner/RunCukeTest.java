package com.au.carsguide.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature",
         glue = "com/au/carsguide/steps",
         plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
         tags = "@regression"
                )
public class RunCukeTest extends AbstractTestNGCucumberTests {

}
