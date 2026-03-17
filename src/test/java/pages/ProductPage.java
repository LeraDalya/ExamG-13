package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By addToCartButton = By.xpath("//a[contains(@class,'header__btn-cart')]");
    private By cartIcon = By.xpath("//a[contains(@class,'header__btn-cart')]");

    private By productTitle = By.xpath("//h1[@itemprop='name']");

    public void verifyProductPageOpened() {
        WebElement titleElement = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(productTitle));
        Assert.assertTrue("Product page is not opened!", titleElement.isDisplayed());
    }

    public void clickAddToCartButton() {
        new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(addToCartButton))
                .click();
    }

    public void verifyProductAddedToCart() {
        WebElement cartElement = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(cartIcon));
        Assert.assertTrue("Product is not added to cart!", cartElement.isDisplayed());
    }
}