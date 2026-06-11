package seleniumframework.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import seleniumframework.managers.DriverManager;
import seleniumframework.utils.ConfigReader;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = DriverManager.getDriver();

        driver.get(
                ConfigReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {

        DriverManager.quitDriver();
    }
}

