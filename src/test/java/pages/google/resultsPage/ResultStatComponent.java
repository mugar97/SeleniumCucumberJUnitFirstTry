package pages.google.resultsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.google.common.AbstractComponent;

public class ResultStatComponent extends AbstractComponent {
    @FindBy(id = "result-stats")
    private WebElement stat;

    public ResultStatComponent(final WebDriver driver) {
        super(driver);
    }

    public String getStat(){
        return this.stat.getText();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.stat.isDisplayed());
    }
}
