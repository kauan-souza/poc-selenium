package br.com.pocselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    static WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAddToCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='page']/div[2]" +
                "/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[1]/span[1]")));

        driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]" +
                        "/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[1]/span[1]"))
                .click();
    }

    public void clickProceedToCheckout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[3]/div[1]/div[1]" +
                "/div[4]/div[1]/div[2]/div[4]/a[1]")));

        driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]"))
                .click();
    }

    public void deleteToCart(){
        driver.findElement(By.xpath("//tbody/tr[@id='product_2_7_0_0']/td[7]/div[1]/a[1]/i[1]"))
                .click();
    }

    public String validateMessageDelete(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text()," +
                "'Your shopping cart is empty.')]")));

        return driver.findElement(By
                        .xpath("//p[contains(text(),'Your shopping cart is empty.')]"))
                .getText();
    }
}
