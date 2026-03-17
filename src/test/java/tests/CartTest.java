package tests;

import org.junit.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import baseTest.BaseTest;

public class CartTest extends BaseTest {

    @Test
    public void openCartTest() {

        HomePage homePage = pageProvider.getHomePage();
        homePage.openPromoCategory();
        homePage.clickFirstProduct();

        ProductPage productPage = pageProvider.getProductPage();
        productPage.clickAddToCartButton();

        CartPage cartPage = pageProvider.getCartPage();
        cartPage.openCart();
        cartPage.verifyCartPageOpened();
    }
}