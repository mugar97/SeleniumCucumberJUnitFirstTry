package pages.google.common;

import org.openqa.selenium.WebDriver;

public class Browser {

    private WebDriver driver;

    public Browser(final WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        this.driver.get("https://www.google.com");
    }

    public String getPageTitle() {
        return this.driver.getTitle();
    }
    
}
