package tests;

import org.junit.Test;
import pages.HomePage;
import pages.ProductPage;
import baseTest.BaseTest;

public class OpenProductTest extends BaseTest {

    @Test
    public void openProductTest() {

        HomePage homePage = pageProvider.getHomePage();
        homePage.openPromoCategory();
        homePage.clickFirstProduct();

        ProductPage productPage = pageProvider.getProductPage();
        productPage.verifyProductPageOpened();
        productPage.clickAddToCartButton();
        productPage.verifyProductAddedToCart();
    }
}