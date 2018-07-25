package com.scf.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/FacebookLogin.feature" }, glue = {
		"classpath:com.scf.stepdefinition",
		"classpath:com.scf.helper" }, plugin = {"html:target/cucumber-html-report"})
public class FacebookLoginFeatureRunner extends AbstractTestNGCucumberTests {

}
