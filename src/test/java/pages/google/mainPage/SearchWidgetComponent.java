package pages.google.mainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.google.common.AbstractComponent;

public class SearchWidgetComponent extends AbstractComponent {

    @FindBy(name="q")
    private WebElement searchBox;

    public SearchWidgetComponent(WebDriver driver) {
        super(driver);
    }

    public void enter(String query) {
        isDisplayed();
        searchBox.sendKeys(query);
	}

    public void submit() {
        searchBox.submit();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.searchBox.isDisplayed());
    }
    

}
