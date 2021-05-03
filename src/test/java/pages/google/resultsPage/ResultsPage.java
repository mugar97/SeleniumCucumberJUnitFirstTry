package pages.google.resultsPage;

import org.openqa.selenium.WebDriver;

import pages.google.common.SearchSuggestionsComponent;
import pages.google.mainPage.SearchWidgetComponent;
import pages.google.resultsPage.ResultStatComponent;
import pages.google.resultsPage.NavigationBarComponent;

public class ResultsPage {

    private SearchWidgetComponent searchWidget;
    private SearchSuggestionsComponent searchSuggestions;
    private NavigationBarComponent navigationBar;
    private ResultStatComponent resultStat;

    public ResultsPage(final WebDriver driver){
        this.searchWidget = new SearchWidgetComponent(driver);
        this.searchSuggestions = new SearchSuggestionsComponent(driver);
        this.navigationBar = new NavigationBarComponent(driver);
        this.resultStat = new ResultStatComponent(driver);
    }

    public SearchWidgetComponent getSearchWidget() {
        return searchWidget;
    }

    public SearchSuggestionsComponent getSearchSuggestion() {
        return searchSuggestions;
    }

    public NavigationBarComponent getNavigationBar() {
        return navigationBar;
    }

    public ResultStatComponent getResultStat() {
        return resultStat;
    }
    
}
