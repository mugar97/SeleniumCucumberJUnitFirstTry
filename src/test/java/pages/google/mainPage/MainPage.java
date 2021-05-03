package pages.google.mainPage;

import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;
    private SearchWidgetComponent searchWidget;

    public MainPage(final WebDriver driver) {
        this.driver = driver;
        this.searchWidget = new SearchWidgetComponent(driver);
    }

    public void visitGoogle(){
        this.driver.get("https://www.google.com");
    }

    public SearchWidgetComponent getSearchWidget(){
        return searchWidget;
    }

    
    
}
