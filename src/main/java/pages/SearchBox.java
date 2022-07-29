package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBox extends BasePage{

    By searchBoxLocator = By.id("search-input");
//    By submitButtonLocator = By.id("nav-search-submit-button");
//    By submitButtonLocator = new By.ByCssSelector("nav-progressive-attribute");
//    WebElement.sendKeys(Keys.ENTER);

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        driver.findElement(new By.ByCssSelector("common-sprite button-search")).sendKeys(Keys.ENTER);
//        click(submitButtonLocator);

    }
}
