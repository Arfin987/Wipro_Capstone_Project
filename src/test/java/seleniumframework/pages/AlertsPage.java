package seleniumframework.pages;

import org.openqa.selenium.*;

public class AlertsPage {

    WebDriver driver;

    public AlertsPage(WebDriver driver) {

        this.driver = driver;
    }

    public void handleAlert1() {

        driver.findElement(
                By.id("alertBtn"))
                .click();

        Alert alert =
                driver.switchTo().alert();

        alert.accept();
    }
    
    public void handleAlert2() {

        driver.findElement(
                By.id("confirmBtn"))
                .click();

        Alert alert =
                driver.switchTo().alert();
        //System.out.println(alert.getText());

        alert.accept();
    }
    
    public void handleAlert3() {

        driver.findElement(
                By.id("promptBtn"))
                .click();

        Alert alert =
                driver.switchTo().alert();
        //System.out.println(alert.getText());
        alert.sendKeys("Arfin");

        alert.accept();
    }
    
}
