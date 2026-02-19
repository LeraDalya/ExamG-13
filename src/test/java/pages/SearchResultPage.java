package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends ParentPage {

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//button[@class='card__btn ']")
    private WebElement productCard;

    public void checkProductIsDisplayed() {
        Assert.assertTrue(productCard.isDisplayed());
    }

    public void clickOnFirstProduct() {
        productCard.click();
    }
}

