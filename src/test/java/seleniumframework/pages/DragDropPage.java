package seleniumframework.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class DragDropPage {

    WebDriver driver;

    public DragDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void performDragDrop() {

        WebElement source =
                driver.findElement(By.id("draggable"));

        WebElement target =
                driver.findElement(By.id("droppable"));

        Actions actions =
                new Actions(driver);

        actions.dragAndDrop(source, target)
               .perform();
    }
}