package libs;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageProvider {

    WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage getHomePage() {
        return new HomePage(webDriver);
    }

    public BasePage getSearchResultPage() {
        return new BasePage(webDriver);
    }

    public ProductPage getProductPage() {
        return new ProductPage(webDriver);
    }

    public CartPage getCartPage() {
        return new CartPage(webDriver);
    }
}

