package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.CucumberOptions;


public class stepDefinition {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing() {
        //code to navigate to login url
        System.out.println("navigated to login url");
    }

    @When("User login into application with username and password")
    public void userLoginIntoApplicationWithUsernameAndPassword() {
        //code to login
        System.out.println("login successfully");
    }

    @Then("^Homepage is populated$")
    public void homepageIsPopulated() {
        //homepage is load
        System.out.println("validated homepage");
    }

    @And("^Cards are displayed$")
    public void cardsAreDisplayed() {
        System.out.println("validated cards");
    }

}
