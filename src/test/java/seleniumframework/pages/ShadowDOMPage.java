package seleniumframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowDOMPage {

    private WebDriver driver;

    public ShadowDOMPage(WebDriver driver) {
        this.driver = driver;
    }

    // Example locators
    private By shadowHost =
            By.cssSelector("#shadow_host");

    private By shadowInput =
            By.cssSelector("input[type='text']");

    public void enterTextInShadowDOM(String text) {

        WebElement host =
                driver.findElement(shadowHost);

        SearchContext shadowRoot =
                host.getShadowRoot();

        shadowRoot.findElement(shadowInput)
                  .sendKeys(text);
    }

    public String getShadowText() {

        WebElement host =
                driver.findElement(shadowHost);

        SearchContext shadowRoot =
                host.getShadowRoot();

        return shadowRoot.findElement(shadowInput)
                         .getAttribute("value");
    }
}