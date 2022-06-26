package com.automation.ui.cuspera.bdd.test.runCukes.ebi_search;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import  com.automation.ui.cuspera.bdd.test.tags.SanityTest;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(tags = "@TC01_EBI_SearchTest",
        //,dryRun = true,
        monochrome = true,
        plugin = {"pretty:target/cucumber/cucumber.txt",
                "html:target/cucumber-html-report/TC01_EBI_SearchTest",
                "json:target/cucumber-report/TC01_EBI_SearchTest.json"},
        features= {"src/com/automation/ui/cuspera/bdd/resources/features"},
        glue = {"com.automation.ui.cuspera.bdd.test.stepdefinition"})

@Category({SanityTest.class})
public class TC01_EBI_SearchTest {
}
