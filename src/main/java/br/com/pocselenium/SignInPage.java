package br.com.pocselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    static WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnTheButtonSignInHome() {
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"))
                .click();
    }

    public void clickOnTheButtonSignInAuthentication() {
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]" +
                "/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]"))
                .click();
    }

    public String validateMessageErro() {
       return driver.findElement(By
                        .xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]"))
                .getText();
    }
}
