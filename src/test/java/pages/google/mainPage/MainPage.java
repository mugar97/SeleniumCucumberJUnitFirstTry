package pages.google.mainPage;

import org.openqa.selenium.WebDriver;

public class MainPage {

    private SearchWidgetComponent searchWidget;

    public MainPage(final WebDriver driver) {
        this.searchWidget = new SearchWidgetComponent(driver);
    }

    public SearchWidgetComponent getSearchWidget(){
        return searchWidget;
    }

    
    
}
