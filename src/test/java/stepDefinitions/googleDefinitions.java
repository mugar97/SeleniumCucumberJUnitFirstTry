package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;
import utils.DriverManager;

public class googleDefinitions {

    GooglePage google;

    public googleDefinitions(DriverManager driverManager) {
        google = new GooglePage(driverManager.getDriver());
    }

    @Given("I am on the Google search page")
    public void I_visit_google() {
        google.visitGoogle();
    }

    @When("I search for {string}")
    public void search_for(String query) {
        google.searchFor(query);
    }

    @Then("the page title should start with {string}")
    public void checkTitle(String titleStartsWith) {
        google.checkTitle(titleStartsWith);
    }
}
