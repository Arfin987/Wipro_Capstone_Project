package seleniumframework.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class DropdownsPage {

    WebDriver driver;

    public DropdownsPage(WebDriver driver) {

        this.driver = driver;
    }

    public void selectCountry() {

        Select country =
                new Select(driver.findElement(By.id("country")));

        country.selectByVisibleText("India");
    }

    public void selectColor() {

        Select color =
                new Select(driver.findElement(By.id("colors")));

        color.selectByVisibleText("Blue");
    }

    public void selectAnimal() {

        Select animal =
                new Select(driver.findElement(By.id("animals")));

        animal.selectByVisibleText("Lion");
    }
}