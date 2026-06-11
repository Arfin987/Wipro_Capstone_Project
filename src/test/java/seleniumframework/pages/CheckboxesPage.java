package seleniumframework.pages;

import org.openqa.selenium.*;

public class CheckboxesPage {

    WebDriver driver;

    public CheckboxesPage(WebDriver driver) {

        this.driver = driver;
    }

    public void selectDays() {

        driver.findElement(By.id("monday")).click();
        driver.findElement(By.id("wednesday")).click();
        driver.findElement(By.id("friday")).click();
    }
}