package seleniumframework.pages;

import org.openqa.selenium.*;

public class TextFieldsPage {

    WebDriver driver;

    By name = By.id("name");
    By email = By.id("email");
    By phone = By.id("phone");
    By address = By.id("textarea");

    public TextFieldsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterDetails() {

        driver.findElement(name)
                .sendKeys("Arfin");

        driver.findElement(email)
                .sendKeys("arfin@gmail.com");

        driver.findElement(phone)
                .sendKeys("9876543210");

        driver.findElement(address)
                .sendKeys("Patna Bihar");
    }
}