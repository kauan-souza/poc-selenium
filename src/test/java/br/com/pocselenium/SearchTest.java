package br.com.pocselenium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    static WebDriver driver;
    static SearchPage searchPage;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        searchPage = new SearchPage(driver);
    }

    @Test
    public void setTeste2(){
        searchPage.SearchBlouse("Blouse");
        Assert.assertEquals(searchPage.validateMessageQuantity(),"1 result has been found.");
    }
    @AfterClass
    public static void tearDownAfterClass() {
        driver.quit();
    }
}


