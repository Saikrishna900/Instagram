package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClosePost {

    WebDriver driver;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/*[name()='svg'][1]/*[name()='line'][1]")
    WebElement closepost;

    public ClosePost(WebDriver driver) {
        this.driver = driver;
    }

    public void Closepost() throws InterruptedException{
        closepost.click();
    }


}
