
package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
    WebDriver driver;
    @FindBy(name = "username")
    WebElement uname;
    @FindBy(name = "password")
    WebElement pname;

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[3]/button/div")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

//    public void loginWebsite(String username, String password) throws InterruptedException {
//        uname.sendKeys(username);
//        uname.click();
//        Thread.sleep(2000);
//        pname.sendKeys(password);
//        pname.click();
//        Thread.sleep(2000);
//        loginButton.click();
//        loginButton.click();
//        Thread.sleep(2000);
//    }

    public void loginWebsiteagain(String username, String password) throws InterruptedException {
      //  uname.clear();
        uname.sendKeys(username);
        Thread.sleep(2000);
      //  pname.clear();
        pname.sendKeys(password);
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(6000);
    }
}
