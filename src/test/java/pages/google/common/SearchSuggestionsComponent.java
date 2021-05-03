package pages.google.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchSuggestionsComponent extends AbstractComponent {

    @FindBy(css = "li.sbct")
    private List<WebElement> suggestions;

    public SearchSuggestionsComponent (WebDriver driver){
        super(driver);
    }

    public void clickSuggestionByIndex(int index){
        isDisplayed();
        this.suggestions.get(index - 1).click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.suggestions.size() > 5);
    }
}