
package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage {
    WebDriver driver;

    @FindBy(xpath = "//div[contains(text(),'Home')]")
    WebElement home;

    @FindBy(linkText = "Search")
    WebElement search;

    @FindBy(className = "_aauy")
    WebElement content;

    @FindBy(partialLinkText = "lpuuniversity")
    WebElement clickonContent;

    @FindBy(xpath = "//div[@class='_aacl _aaco _aacw _aad6 _aade']")
    WebElement follow;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void SearchContent() throws InterruptedException {
        home.click();
        Thread.sleep(3000);
        search.click();
        Thread.sleep(3000);
        content.sendKeys("lpu");
        Thread.sleep(3000);
        clickonContent.click();
        Thread.sleep(3000);
    }

    public void Follow() throws InterruptedException {
        follow.click();
        Thread.sleep(4000);
    }

}