package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    private By addToCartButtonLocator = By.xpath("//button[@class='card__btn ']");
    private By cartItemLocator = By.xpath("//div[contains(@class,'cart-item')]");

    public ProductPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public void clickAddToCartButton() {
        try {
            WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonLocator));
            addButton.click();
        } catch (Exception e) {
            WebElement addButton = webDriver.findElement(addToCartButtonLocator);
            ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", addButton);
        }
    }

    public void verifyProductAddedToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartItemLocator));
    }
}
