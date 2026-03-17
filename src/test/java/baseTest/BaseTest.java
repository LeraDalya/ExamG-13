package baseTest;

import libs.PageProvider;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    protected WebDriver driver;
    protected PageProvider pageProvider;

    @Before
    public void setUp() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        pageProvider = new PageProvider(driver);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}