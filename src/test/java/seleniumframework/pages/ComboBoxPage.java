package seleniumframework.pages;

import org.openqa.selenium.*;
//import org.openqa.selenium.interactions.Actions;

public class ComboBoxPage {

    WebDriver driver;

    public ComboBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    private By comboBox =
            By.xpath("//input[@id='comboBox']");

    public void selectValue(String value) {

        WebElement element =
                driver.findElement(comboBox);

        ((JavascriptExecutor)driver)
                .executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                element);

        element.click();
        element.sendKeys(value);
        element.sendKeys(Keys.ENTER);
    }
}
