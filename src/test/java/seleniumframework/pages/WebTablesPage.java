package seleniumframework.pages;

import java.util.List;

import org.openqa.selenium.*;

public class WebTablesPage {

    WebDriver driver;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void printTableData() {

        List<WebElement> rows =
                driver.findElements(
                By.xpath("//table[@name='BookTable']//tr"));

        for(WebElement row : rows) {

            System.out.println(row.getText()+"\t");
            
        }System.out.println();
    }
}