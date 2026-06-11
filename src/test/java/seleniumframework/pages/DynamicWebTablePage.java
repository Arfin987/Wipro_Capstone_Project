package seleniumframework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicWebTablePage {

    WebDriver driver;

    public DynamicWebTablePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyChromeCPUUsage() {

        List<WebElement> rows =
                driver.findElements(
                By.xpath("//table[@id='taskTable']/tbody/tr"));

        String chromeCPU = "";

        for(WebElement row : rows) {

            String process =
                    row.findElement(By.xpath("./td[1]"))
                       .getText();

            if(process.equalsIgnoreCase("Chrome")) {

                chromeCPU =
                        row.findElement(By.xpath("./td[2]"))
                           .getText();

                break;
            }
        }

        String expected =
                driver.findElement(By.cssSelector(".chrome-cpu"))
                       .getText();

        return expected.contains(chromeCPU);
    }
}