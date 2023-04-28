package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LikePage {
    WebDriver driver;




    @FindBy(className = "_aamw")
    WebElement like;
//    @FindBy(xpath = "//span[@class='_aamx']//div[@class='_abm0 _abm1']//*[name()='svg']")
//    WebElement comm;
//
//
////    @FindBy(xpath = "//textarea[@placeholder='Add a comment…']")
//    //@FindBy(tagName = "textarea")
//    @FindBy(className = "_aatk")
//    WebElement comment;
//
//   @FindBy(xpath = "//div[contains(text(),'Post')]")
//    WebElement post;
public LikePage(WebDriver driver) {
    this.driver = driver;
}


    public void Like() throws InterruptedException{
        like.click();
        Thread.sleep(2000);
    }

//    public void commClick() throws InterruptedException{
//        comm.click();
//        Thread.sleep(1000);
//    }
//
//
//    public void comment() throws InterruptedException {
//        comment.sendKeys("Congratulations");
//        comment.click();
//        Thread.sleep(3000);
//        post.click();
//        Thread.sleep(3000);
//    }
}
