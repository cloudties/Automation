package com.automation.ui.cuspera.bdd.test.runCukes.ebi_search;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import org.junit.experimental.categories.Category;
import org.junit.runner.Runner;
import net.serenitybdd.cucumber.CucumberWithSerenity;
//@RunWith(Cucumber.class)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"pretty:target/cucumber/cucumber.txt", 
				"html:target/cucumber/cucumber-html-report",
				"json:target/cucumber/cucumber.json"
				}
		,features= {"src/com/automation/ui/cuspera/bdd/resources/features"}
		,glue = {"com.automation.ui.cuspera.bdd.test.stepdefinition"}
		//,dryRun = true
		,monochrome = true
		//,tags="@createNewAccount"
		)
public class TestRunner {

}
