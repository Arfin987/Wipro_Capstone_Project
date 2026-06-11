package seleniumframework.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinkPage {

    WebDriver driver;

    public BrokenLinkPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyBrokenLink() {
        List<WebElement> links = driver.findElements(By.cssSelector(".link"));

        for (WebElement link : links) {
            String href = link.getAttribute("href");

            if (href == null || href.isEmpty() || href.startsWith("javascript")) {
                continue; 
            }

            try {
                @SuppressWarnings("deprecation")
				URL linkUrl = new URL(href);
                HttpURLConnection conn = (HttpURLConnection) linkUrl.openConnection();
                conn.setConnectTimeout(5000);
                conn.connect();

                if (conn.getResponseCode() >= 400) {
                    System.out.println(href + " ====> Broken link");
                } else {
                    System.out.println(href + " ====> Valid link");
                }

                conn.disconnect();
            } catch (Exception e) {
                System.out.println(href + " ====> Exception: " + e.getMessage());
            }
        }
    }
}
