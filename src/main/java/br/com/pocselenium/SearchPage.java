package br.com.pocselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    static WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void SearchBlouse(String word){
        WebElement search = driver.findElement(By.id("search_query_top"));
        search.sendKeys(word);

        driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]"))
                .click();
    }

    public String validateMessageQuantity() {
        return driver.findElement(By.xpath("//span[contains(text(),'1 result has been found.')]"))
                .getText();
    }
}
