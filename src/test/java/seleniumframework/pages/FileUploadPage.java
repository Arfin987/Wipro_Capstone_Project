package seleniumframework.pages;

import org.openqa.selenium.*;

public class FileUploadPage {

    WebDriver driver;

    public FileUploadPage(WebDriver driver) {

        this.driver = driver;
    }

    public void uploadFile(String path) {

        driver.findElement(
                By.id("singleFileInput"))
                .sendKeys(path);
    }
}