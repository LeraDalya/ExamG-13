package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends ParentPage {

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//div[contains(@class,'cart')]")
    private WebElement cartContainer;

    @FindBy(xpath = "//input[@type='number']")
    private WebElement quantityInput;

    @FindBy(xpath = "//button[contains(@class,'remove')]")
    private WebElement removeButton;

    public void checkCartIsDisplayed() {
        Assert.assertTrue(cartContainer.isDisplayed());
    }

    public void changeQuantity(String quantity) {
        quantityInput.clear();
        quantityInput.sendKeys(quantity);
    }

    public void clickRemoveButton() {
        removeButton.click();
    }
}

