package br.com.pocselenium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest {
    static WebDriver driver;
    static SignInPage signInPage;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        signInPage = new SignInPage(driver);
    }

    @Test
    public void shouldValidateMessageErro() {
        signInPage.clickOnTheButtonSignInHome();
        signInPage.clickOnTheButtonSignInAuthentication();

        Assert.assertEquals(signInPage.validateMessageErro(), "There is 1 error\n" +
                "An email address required.");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        driver.quit();
    }
}
