package tests;

import baseTest.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCartTest() {
        HomePage homePage = pageProvider.getHomePage();
        homePage.openPromoCategory();       // відкриваємо категорію
        homePage.clickFirstProduct();       // кликаємо перший товар

        ProductPage productPage = pageProvider.getProductPage();
        productPage.clickAddToCartButton(); // добавляємо товар

        productPage.verifyProductAddedToCart(); // перевіряємо, що додано
    }
}
