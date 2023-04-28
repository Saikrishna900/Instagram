package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='_aacl _aacp _aacu _aacx _aada'][normalize-space()='More']")
    WebElement out;

    //@FindBy(xpath = "//body/div[@id='mount_0_0_Do']/div/div/div[@class='x9f619 x1n2onr6 x1ja2u2z']/div[@class='x78zum5 xdt5ytf x1n2onr6 x1ja2u2z']/div[@class='x78zum5 xdt5ytf x1n2onr6']/div[@class='x78zum5 xdt5ytf x1n2onr6 xat3117 xxzkxad']/div/div/div/div[@class='xu96u03 xm80bdy x10l6tqk x13vifvy']/div[@class='x1uvtmcs x4k7w5x x1h91t0o x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1n2onr6 x1qrby5j x1jfb8zj']/div/div[@role='dialog']/div[@class='x78zum5 x91k8ka x1anpbxc']/div[@class='xgf5ljw x78zum5 xdt5ytf x5yr21d x1n2onr6 xh8yej3 x13b9bq5 x6ikm8r x10wlt62 xfh8nwu xoqspk4 x12v9rci x138vmkv']/div[@class='xq9evs9']/div[@class='xt7dq6l x1a2a7pz x6ikm8r x10wlt62 x1n2onr6 x14atkfc']/div[@class='x9f619 x1ja2u2z x1k90msu x6o7n8i x1qfuztq x10l6tqk x17qophe x13vifvy x1hc1fzr x71s49j xh8yej3']/div[@class='x1y1aw1k x1sxyh0 xwib8y2 xurb0ha']/div[1]/div[1]")
    @FindBy(linkText = "Log out")
    WebElement getOut;
    public LogOut(WebDriver driver) {
        this.driver = driver;
    }

    public void More() throws InterruptedException{
        out.click();
        Thread.sleep(1000);
    }
    public void logout() throws InterruptedException{
        getOut.click();
    }
}
