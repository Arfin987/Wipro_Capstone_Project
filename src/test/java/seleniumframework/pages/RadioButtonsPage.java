package seleniumframework.pages;

import org.openqa.selenium.*;

public class RadioButtonsPage {

    WebDriver driver;

    public RadioButtonsPage(WebDriver driver) {

        this.driver = driver;
    }

    public void selectGender() {

        driver.findElement(
                By.id("male"))
                .click();
    }
}