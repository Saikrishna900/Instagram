
package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PostPage {
    WebDriver driver;

    @FindBy(className = "_aagw")
    WebElement selectPost;
    public PostPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Post() throws InterruptedException {
        selectPost.click();
        Thread.sleep(5000);
    }

}