package seleniumframework.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class SlidersPage {

    WebDriver driver;

    public SlidersPage(WebDriver driver) {

        this.driver = driver;
    }

    public void moveSlider() {

        WebElement slider =
                driver.findElement(
                        By.xpath("//div[@id='sidebar-right-1']"));

        new Actions(driver)
                .dragAndDropBy(slider,100,0)
                .perform();
    }
}