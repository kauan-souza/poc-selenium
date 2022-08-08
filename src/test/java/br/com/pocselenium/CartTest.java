package br.com.pocselenium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest {
    static WebDriver driver;
    static SearchPage searchPage;
    static CartPage cartPage;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        searchPage = new SearchPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test
    public void teste3() {
        searchPage.SearchBlouse("Blouse");
        cartPage.clickAddToCart();
        cartPage.clickProceedToCheckout();
        cartPage.deleteToCart();

        Assert.assertEquals(cartPage.validateMessageDelete(), "Your shopping cart is empty.");
    }
    @AfterClass
    public static void tearDownAfterClass() {
        driver.quit();
    }
}


