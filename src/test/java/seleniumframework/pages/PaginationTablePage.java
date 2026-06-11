package seleniumframework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginationTablePage {

    WebDriver driver;

    public PaginationTablePage(WebDriver driver) {

        this.driver = driver;
    }

    public void printAllProducts() {

        List<WebElement> pages =
                driver.findElements(
                By.xpath("//ul[@id='pagination']/li"));

        int totalPages = pages.size();

        for(int p=1;p<=totalPages;p++) {

            if(p>1) {

                driver.findElement(
                        By.xpath("//ul[@id='pagination']/li[" + p + "]"))
                        .click();
            }

            List<WebElement> rows =
                    driver.findElements(
                    By.xpath("//table[@id='productTable']/tbody/tr"));

            for(WebElement row : rows) {

                System.out.println(row.getText());
            }
        }
    }

    public void selectAllProducts() {

        List<WebElement> pages =
                driver.findElements(
                By.xpath("//ul[@id='pagination']/li"));

        int totalPages = pages.size();

        for(int p=1;p<=totalPages;p++) {

            if(p>1) {

                driver.findElement(
                        By.xpath("//ul[@id='pagination']/li[" + p + "]"))
                        .click();
            }

            List<WebElement> checkboxes =
                    driver.findElements(
                    By.xpath("//table[@id='productTable']/tbody/tr/td[4]/input"));

            for(WebElement checkbox : checkboxes) {

                if(!checkbox.isSelected()) {

                    checkbox.click();
                }
            }
        }
    }
}
