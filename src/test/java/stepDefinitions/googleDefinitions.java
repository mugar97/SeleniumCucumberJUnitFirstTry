package stepDefinitions;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.google.common.BrowserPage;
import pages.google.mainPage.MainPage;
import utils.driver.DriverManager;

public class googleDefinitions {

    MainPage mainPage;
    BrowserPage browserPage;

    public googleDefinitions(DriverManager driverManager) {
        WebDriver driver = driverManager.getDriver();
        mainPage = new MainPage(driver);
        browserPage = new BrowserPage(driver);
    }

    @Given("I am on the Google search page")
    public void I_visit_google() {
        browserPage.open();
    }

    @When("I search for {string}")
    public void search_for(String query) {
        mainPage.getSearchWidget().enter(query);
    }

    @Then("the page title should start with {string}")
    public void checkTitle(String expected) {
        String actual = browserPage.getPageTitle();
        Assert.assertTrue(StringUtils.containsIgnoreCase(actual, expected));
    }
}
