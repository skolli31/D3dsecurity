package d3dCom.Pages;

import d3dCom.Basepage;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Signinpage extends Basepage {
    public void Clicklogin() {
        driver.findElement(By.linkText("Login")).click();
    }

    public void Myacc() {
        String Actual_MyAccount_Text = driver.findElement(By.xpath(".//*[@id='menu-item-5958']/a")).getText();
        String Expected_MyAccount_Text = "My Account";
        assertEquals(Expected_MyAccount_Text, Actual_MyAccount_Text);
    }

    public void Logout() {
        boolean Actual_Logout = driver.findElement(By.cssSelector("#menu-item-4531>a")).isDisplayed();
        assertTrue(Actual_Logout);
    }

    public void Signin() {
        driver.findElement(By.name("submit")).click();
    }

    public void Enterusername(String uid) {
        driver.findElement(By.name("log")).sendKeys(uid);
    }

    public void Enterpasswd(String passwd) {
        driver.findElement(By.name("pwd")).sendKeys(passwd);
    }

    public void Errmsg(String Exp_errmsg)
    {
        String Act_errmsg=driver.findElement(By.xpath(".//*[@id='post-4521']/div/div[1]/p")).getText();
//        Exp_errmsg="Wrong credentials";
    assertEquals(Exp_errmsg,Act_errmsg);
    }

    public void WhyD3dHeader() {
        String Act_header = driver.findElement(By.linkText("Why D3D")).getText();
        String Exp_header = "Why D3D";
        assertEquals(Exp_header, Act_header);
    }

    public void clickwhyD3d() {
        driver.findElement(By.linkText("Why D3D")).click();
    }

    public void ShowCurrentUrl() {
        String currentUrl = driver.getCurrentUrl();
        String Exp_Url = "https://www.d3dsecurity.co.uk/about-us/";
        assertEquals(Exp_Url, currentUrl);

    }
}
