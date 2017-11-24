package d3dCom;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
//   public WebDriver driver;

    Basepage bpage = new Basepage();

    @Before
    public void Setupbrowser() {
        bpage.Openbrowser();
//        WebDriver driver;
//        ChromeDriverManager.getInstance().setup();
//        driver = new ChromeDriver();
    }

    @After
    public void Teardown() {
        bpage.CloseBrowser();
//   driver.close();
    }


}
