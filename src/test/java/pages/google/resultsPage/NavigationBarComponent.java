package pages.google.resultsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.google.common.AbstractComponent;

public class NavigationBarComponent extends AbstractComponent {

    @FindBy(id = "hdtb")
    private WebElement bar;

    @FindBy(linkText = "Imágenes")
    private WebElement images;

    @FindBy(linkText = "Noticias")
    private WebElement news;

    public NavigationBarComponent(WebDriver driver) {
        super(driver);
    }

    public void goToImages(){
        isDisplayed();
        this.images.click();
    }

    public void goToNews(){
        isDisplayed();
        this.news.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.bar.isDisplayed());
    }
}