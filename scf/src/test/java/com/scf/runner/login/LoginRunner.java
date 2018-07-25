package com.scf.runner.login;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/login/login.feature" }, glue = {
		"classpath:com.scf.stepdefinition",
		"classpath:com.scf.helper" }, plugin = {"html:target/cucumber-html-report"})
public class LoginRunner extends AbstractTestNGCucumberTests {

}
