package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommentPage {
    WebDriver driver;


    public CommentPage(WebDriver driver) {
        this.driver = driver;
    }



    @FindBy(xpath = "//textarea[@placeholder='Add a comment…']")
    WebElement comment;

    @FindBy(xpath = "//div[contains(text(),'Post')]")
    WebElement post;





    public void comment() throws InterruptedException {
        comment.click();
        Thread.sleep(1000);
        comment.sendKeys("Congratulations");
        Thread.sleep(3000);
        post.click();
        Thread.sleep(3000);
    }
}
