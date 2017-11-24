package d3dCom;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basepage {
    public static WebDriver driver;

    public void Openbrowser() {
        String Browser1 = System.getProperty("Browser");
        if (Browser1.equals("Chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        } else if (Browser1.equals("Firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        } else if (Browser1.equals("InternetExplorer")) {
            InternetExplorerDriverManager.getInstance().setup();
            driver = new InternetExplorerDriver();
        }
    }


    public void CloseBrowser()
    {
//        driver.close();
    }


    public void OpenUrl(String Urlname) {
        driver.get(Urlname);
        driver.manage().window().maximize();


    }
}
