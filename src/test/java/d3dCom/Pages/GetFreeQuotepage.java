package d3dCom.Pages;

import d3dCom.Basepage;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetFreeQuotepage extends Basepage {
    public void ClickOnlinetab() {
        driver.findElement(By.linkText("Online Demo")).click();
    }

    public void GetafreequoteHeader() {
        boolean FQheader = driver.findElement(By.cssSelector(".heading-title")).isDisplayed();
        assertTrue(FQheader);
    }

    public void Firstname(String arg0) {
        driver.findElement(By.name("first-name")).sendKeys(arg0);
    }

    public void blankfirstname(String arg0) {
        driver.findElement(By.name("first-name")).sendKeys(arg0);
    }

    public void Lastname(String arg0) {
        driver.findElement(By.name("last-name")).sendKeys(arg0);
    }

    public void emailid(String arg0) {
        driver.findElement(By.name("your-email")).sendKeys(arg0);
    }

    public void Phoneno(String arg0) {
        driver.findElement(By.xpath(".//*[@id='wpcf7-f391-p1521-o1']/form/div[6]/span/input")).sendKeys(arg0);
    }

    public void subject(String arg0) {
        driver.findElement(By.name("your-subject")).sendKeys(arg0);
    }

    public void message(String arg0) {
        driver.findElement(By.name("your-message")).sendKeys(arg0);
    }

    public void captcha() throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id='wpcf7-f391-p1521-o1']/form/p[3]/span/input")).getText();
        Thread.sleep(1000);
    }

    public void Clicksendmsg() {
        driver.findElement(By.xpath(".//*[@id='wpcf7-f391-p1521-o1']/form/p[4]/input")).click();
    }

    public void Header(String arg0) {
        boolean Actual_header = driver.findElement(By.cssSelector(".page-entry-title")).isDisplayed();
        assertTrue(Actual_header);
    }

    public void Header1() {
        boolean Actual_header1 = driver.findElement(By.cssSelector(".heading-title")).isDisplayed();
        assertTrue(Actual_header1);
    }

    public void CurrentUrl(String Exp_Url) {
        String currentUrl = driver.getCurrentUrl();
//        String Exp_Url = "https://www.d3dsecurity.co.uk/thank-you/";
        assertEquals(Exp_Url, currentUrl);
    }

    public void Errormsg(String arg0) {
        String Act_errmsg = driver.findElement(By.xpath(".//*[@id='wpcf7-f391-p1521-o1']/form/div[8]")).getText();
        assertEquals(arg0, Act_errmsg);
    }

//    public void blankerrormsg(String arg0) {
//        String Act_blankerrmsg = driver.findElement(By.cssSelector(".wpcf7-not-valid-tip")).getText();
//        assertEquals(arg0, Act_blankerrmsg);
//    }

}


