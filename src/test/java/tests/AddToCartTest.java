package tests;

import baseTest.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCartTest() {
        HomePage homePage = pageProvider.getHomePage();
        homePage.openPromoCategory();
        homePage.clickFirstProduct();

        ProductPage productPage = pageProvider.getProductPage();
        productPage.clickAddToCartButton();

        productPage.verifyProductAddedToCart();
    }
}
