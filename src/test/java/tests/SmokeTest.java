package tests;

import org.junit.Test;
import pages.HomePage;
import baseTest.BaseTest;

public class SmokeTest extends BaseTest {

    @Test
    public void smokeTest() {

        HomePage homePage = pageProvider.getHomePage();
        homePage.openHomePage();
    }
}
