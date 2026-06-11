package seleniumframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFieldsPage {

    private WebDriver driver;

    public InputFieldsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By input1 = By.id("input1");
    private By input2 = By.id("input2");
    private By input3 = By.id("input3");

    public void enterInput1() {

        //driver.findElement(input1).clear();
        driver.findElement(input1).sendKeys("Selenium");
        driver.findElement(By.id("btn1")).click();
    }

    public void enterInput2() {

       // driver.findElement(input2).clear();
        driver.findElement(input2).sendKeys("Java");
        driver.findElement(By.id("btn2")).click();
    }

    public void enterInput3() {

        //driver.findElement(input3).clear();
        driver.findElement(input3).sendKeys("TestNG");
        driver.findElement(By.id("btn3")).click();
    }

    
}