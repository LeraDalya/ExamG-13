package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends BasePage {

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    private By cartButton = By.xpath("//a[@data-test='header.cart']");

    // Контейнер модалки корзини
    private By cartModal = By.xpath("//a[@class='common__btn']");

    public void openCart() {
        webDriver.findElement(cartButton).click();
    }

    public void verifyCartPageOpened() {
        try {
            new WebDriverWait(webDriver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(cartModal));
            System.out.println("Cart modal is visible, test passed");
        } catch (Exception e) {
            throw new AssertionError("Cart modal is not visible!");
        }
    }
}