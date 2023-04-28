
package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class InfoPage {
    WebDriver driver;

    @FindBy(xpath = "//button[contains(text(),'Save Info')]")
    WebElement SaveInfo;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/button[2]")
    WebElement turnOn;


    public InfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void SaveInfo() throws InterruptedException {
        SaveInfo.click();
        Thread.sleep(4000);
    }

    public void turnOn() throws InterruptedException {
        turnOn.click();
        Thread.sleep(4000);
    }
}