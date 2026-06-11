package seleniumframework.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ActionsPage {

    WebDriver driver;

    public ActionsPage(WebDriver driver) {

        this.driver = driver;
    }

    public void performDoubleClick() {

        WebElement button =
                driver.findElement(
                        By.xpath("//button[contains(text(),'Copy Text')]"));

        new Actions(driver)
                .doubleClick(button)
                .perform();
    }
}