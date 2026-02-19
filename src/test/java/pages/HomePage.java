package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    // Локатор для першого товару
    private By firstProductLocator = By.xpath("//span[@title='51 ніжний тюльпан']");

    // (опціонально) кнопка пошуку на сайті, якщо вона існує
    private By searchButtonLocator = By.xpath("//button[contains(@class,'search')]");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public void openPromoCategory() {
        webDriver.get("https://flowers.ua/ua/promo");
    }

    public void clickFirstProduct() {
        WebElement product = wait.until(
                ExpectedConditions.elementToBeClickable(firstProductLocator));
        product.click();
    }

    public void clickSearchButtonIfExists() {
        if (!webDriver.findElements(searchButtonLocator).isEmpty()) {
            try {
                WebElement searchButton = wait.until(
                        ExpectedConditions.elementToBeClickable(searchButtonLocator)
                );
                searchButton.click();
            } catch (Exception e) {
                WebElement searchButton = webDriver.findElement(searchButtonLocator);
                ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", searchButton);
            }
        }
    }
}
