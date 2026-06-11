package seleniumframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultiFileUploadPage {

    WebDriver driver;

    public MultiFileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    private By uploadField =
            By.id("multipleFilesInput");

    public void uploadFiles() {

        driver.findElement(uploadField)
              .sendKeys(
               System.getProperty("user.dir")+"\\TestData\\file1.txt\n" +
               System.getProperty("user.dir")+"\\TestData\\file2.txt");
    }
}