package seleniumframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaptopPage {

    WebDriver driver;

    public LaptopPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLaptopsUsingNavigation() {

        // Navigate to page
       // driver.navigate().to(
        //    "https://testautomationpractice.blogspot.com/");

        // Select Apple
        driver.findElement(By.id("apple")).click();

        // Refresh page
        driver.navigate().back();

        // Select Lenovo
        driver.findElement(By.id("lenovo")).click();

        // Refresh page
        driver.navigate().back();

        // Select Dell
        driver.findElement(By.id("dell")).click();
        driver.navigate().back();
    }
}
