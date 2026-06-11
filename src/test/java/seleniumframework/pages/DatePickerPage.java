package seleniumframework.pages;

import org.openqa.selenium.*;

public class DatePickerPage {

    WebDriver driver;

    public DatePickerPage(WebDriver driver) {

        this.driver = driver;
    }

    public void selectDate() {

        driver.findElement(
                By.id("datepicker"))
                .sendKeys("06/15/2026");
    }
}