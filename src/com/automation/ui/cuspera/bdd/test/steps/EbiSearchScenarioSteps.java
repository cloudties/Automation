package  com.automation.ui.cuspera.bdd.test.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.gl.E;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.automation.ui.base.common.bdd.serenity.framework.hooks.ScenarioHook;
import  com.automation.ui.cuspera.bdd.test.pages.EbiHomePage;

import org.junit.Assert;


public class EbiSearchScenarioSteps extends ScenarioSteps{
    EbiHomePage homePage;

    @Step
    private void printMessage(String message){

    }

    private void opens_home_page() {
        homePage.open();
    }

/*TC_01*/
    @Given("^I am Scientist$")
    public void i_am_Scientist() throws Throwable {
        opens_home_page();
        ScenarioHook.getScenario().log("Logged-In User : Scientist");
    }

    @When("^I open the EBI Website$")
    public void i_open_the_EBI_Website() throws Throwable {
        Assert.assertTrue("ERROR: Home Page NOT available",homePage.verifyHomePageAvailable());
    }

    @When("^Enter the keyword \"([^\"]*)\" on the Query field$")
    public void enter_the_keyword_on_the_Query_field(String keyWord) throws Throwable {
        homePage.enterQueryString(keyWord);
    }

    @When("^Click on the Search button$")
    public void click_on_the_Search_button() throws Throwable {
        homePage.performSearch();
    }

    @Then("^I should be able to see the matching results on the Search Result page$")
    public void i_should_be_able_to_see_the_matching_results_on_the_Search_Result_page() throws Throwable {
        printMessage("Successful");
    }

/*TC_02 */
    @When("^Enter the \"([^\"]*)\" on the Query field$")
    public void enter_the_on_the_Query_field(String text) throws Throwable {
        homePage.enterQueryString(text);
    }
}
