
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ResourceBundle;


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
    public void loginWebsite() throws InterruptedException {
        ResourceBundle r =ResourceBundle.getBundle("config");
        String username=r.getString("username");
        String password=r.getString("password");

        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(2000);

        loginButton.click();
        Thread.sleep(4000);
    }

}
