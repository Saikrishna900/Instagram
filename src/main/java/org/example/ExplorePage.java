
package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ExplorePage {
    WebDriver driver;

    @FindBy(linkText = "Explore")
    WebElement explore;

    public ExplorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void exploreContent() throws InterruptedException {
        explore.click();
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,10000)", "");
        Thread.sleep(2000);
    }
}