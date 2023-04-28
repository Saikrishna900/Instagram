
package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MessagePage {
    WebDriver driver;

    @FindBy(xpath = "//div[@role='button'][normalize-space()='Message']")
    WebElement message;

    @FindBy(xpath = "//textarea[@placeholder='Message...']")
    WebElement text;

    @FindBy(xpath = "//div[contains(text(),'Send')]")
    WebElement send;

    @FindBy(xpath = "//div[@class='_aacl _aacp _aacw _aacx _aada']")
    WebElement close;

    public MessagePage(WebDriver driver) {
        this.driver = driver;
    }

    public void Message() throws InterruptedException {
        message.click();
        Thread.sleep(3000);
        text.sendKeys("hello");
        Thread.sleep(3000);
        send.click();
        Thread.sleep(3000);
        close.click();
        Thread.sleep(3000);
    }
}