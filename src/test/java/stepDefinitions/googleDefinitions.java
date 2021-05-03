package stepDefinitions;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.google.common.BrowserPage;
import pages.google.mainPage.MainPage;
import pages.google.resultsPage.ResultsPage;
import utils.driver.DriverManager;

public class googleDefinitions {

    MainPage mainPage;
    BrowserPage browserPage;
    ResultsPage resultsPage;

    public googleDefinitions(DriverManager driverManager) {
        WebDriver driver = driverManager.getDriver();
        mainPage = new MainPage(driver);
        browserPage = new BrowserPage(driver);
        resultsPage = new ResultsPage(driver);
    }

    @Given("I am on the Google search page")
    public void I_visit_google() {
        browserPage.open();
    }

    @When("I search for {string}")
    public void search_for(String query) {
        mainPage.getSearchWidget().enter(query);
        mainPage.getSearchWidget().submit();
    }

    @When("I write the {string} on the search bar")
    public void i_write_the_on_the_search_bar(String query) {
        mainPage.getSearchWidget().enter(query);
    }
    @When("I click on the suggestion {int}")
    public void i_click_on_the_suggestion(Integer index) {
        resultsPage.getSearchSuggestion().clickSuggestionByIndex(index);
    }
    @When("I go to the {string} tab")
    public void i_go_to_the_tab(String resultsTab) {
        switch (resultsTab) {
            case "Noticias":
                resultsPage.getNavigationBar().goToNews();
                break;
            case "Imágenes":
            default:
                resultsPage.getNavigationBar().goToImages();
                break;
        }
    }
    @Then("the page stats should start with {string}")
    public void the_page_stats_should_start_with(String statsMessageBeginning) {
        String statsMessage = resultsPage.getResultStat().getStat();
        Assert.assertTrue(StringUtils.startsWithIgnoreCase(statsMessage, statsMessageBeginning));
    }

    @Then("the page title should start with {string}")
    public void checkTitle(String expected) {
        String actual = browserPage.getPageTitle();
        Assert.assertTrue(StringUtils.containsIgnoreCase(actual, expected));
    }
}
