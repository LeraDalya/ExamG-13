package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    private String BASE_URL = "https://flowers.ua";

    private By promoCategory = By.xpath("//a[@title='Акційні букети']");
    private By firstProduct = By.xpath("//span[@title='Букет \"Attraction of Love\"']");

    public void openHomePage() {
        openUrl(BASE_URL);
    }

    public void openPromoCategory() {
        webDriver.get(BASE_URL + "/ua/promo");
    }

    public void clickFirstProduct() {
        webDriver.findElement(firstProduct).click();
    }
}