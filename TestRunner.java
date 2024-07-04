package com.nimap_infotech_runner;

import org.junit.runner.RunWith;

import com.nimap_infotech_stepdef.Login;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefile/Login.feature",glue={"com.nimap_infotech_stepdef"},dryRun=false,monochrome=true,
plugin={"pretty","html:test-output","json:test-output/cucumber.json","junit:test-output/cucumber.xml"})
public class TestRunner extends Login
{
	

}
