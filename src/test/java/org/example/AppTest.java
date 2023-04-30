package org.example;

import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

    WebDriver driver = FactoryBrowser.SetupBrowser("chrome", "https://www.instagram.com/");
    @Test(priority = 1)
    public void LoginVerification() throws InterruptedException {
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);
       // UI-1
        login.loginWebsite();

    }
    @Test(priority = 2)
    public void InfoButton() throws InterruptedException {
        InfoPage info = PageFactory.initElements(driver, InfoPage.class);
        //UI-3
        info.SaveInfo();
        //UI-4
        info.turnOn();
    }
    @Test(priority = 3)
    public void ExploreButton() throws InterruptedException {
        ExplorePage ex = PageFactory.initElements(driver,ExplorePage.class);
        //UI-5
        ex.exploreContent();
    }
    @Test(priority = 4)
    public void SearchButton() throws InterruptedException {
        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
        //UI-6
        search.SearchContent();
        //UI-7
        search.Follow();
    }
    @Test(priority = 5)
    public void MessageButton() throws InterruptedException {
        MessagePage msg = PageFactory.initElements(driver,MessagePage.class);
        //UI-8
        msg.Message();
    }
    @Test(priority = 6)
    public void postButton() throws InterruptedException {
        PostPage p = PageFactory.initElements(driver,PostPage.class);
        //UI-9
        p.Post();
    }
    //UI-10
    @Test(priority = 7)
    public void likComm() throws InterruptedException{
        LikePage li = PageFactory.initElements(driver, LikePage.class);
        li.Like();
    }
    @Test(priority = 8)
    public void Comment() throws InterruptedException{
        CommentPage  c = PageFactory.initElements(driver, CommentPage.class);
        c.comment();
    }

    @Test(priority = 9)
    public void closeButton() throws InterruptedException{
        ClosePost c = PageFactory.initElements(driver, ClosePost.class);
        c.Closepost();
    }


    @Test(priority = 10)
    public void more() throws InterruptedException{
        LogOut l1 = PageFactory.initElements(driver,LogOut.class);
        l1.More();
        l1.logout();
    }
    @Test(priority = 11)
    public void quit(){
        driver.quit();
    }
}
