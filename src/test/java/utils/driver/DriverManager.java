package utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

    private WebDriver driver;

    public void init() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver(chromeOptions);
    }

    public void quit() {
        this.driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

}
