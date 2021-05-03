package pages.google.common;

import org.openqa.selenium.WebDriver;

public class BrowserPage {

    private WebDriver driver;

    public BrowserPage(final WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        this.driver.get("https://www.google.com");
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
    
}
