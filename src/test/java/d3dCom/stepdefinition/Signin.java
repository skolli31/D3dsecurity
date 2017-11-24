package d3dCom.stepdefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3dCom.Basepage;
import d3dCom.Pages.Signinpage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Signin extends Basepage {
    public Signinpage spage = PageFactory.initElements(Basepage.driver, Signinpage.class);

//    public WebDriver driver;

    @Given("^I Go to \"([^\"]*)\"$")
    public void iGoTo(String Urlname) throws Throwable {
//        Open a browser--->chrome or ie or firefox
//      Assign a variable to the Webdriver down seperately or globally
//        WebDriver driver;

//        ChromeDriverManager.getInstance().setup();
//        driver = new ChromeDriver();
//        if you want maximize your Url window then below command
//        driver.manage().window().maximize();
//        FirefoxDriverManager.getInstance().setup();
//        driver = new FirefoxDriver();
//        System.out.println("Browser opened or not");
//        to open a Url in selenium then get the Url
//       (or) you can just write driver.get("http://www.d3dsecurity.co.uk") without putting a parameter(String Urlname)
//        in public void statement

        OpenUrl(Urlname);

    }

    @When("^i click on login button$")
    public void iClickOnLoginButton() throws Throwable {
//        we can use xpath or linktext
//       driver.findElement(By.xpath(".//*[@id='menu-item-4532']/a")).click();
//        driver.findElement(By.linkText("Login")).click();
        spage.Clicklogin();
    }

    @Given("^I enter the username as \"([^\"]*)\"$")
    //    Move username to a variable uid so that it checks every record in the examples of feature file
    public void iEnterTheUsernameAs(String uid) throws Throwable {
        spage.Enterusername(uid);
    }

    @And("^I enter the password as \"([^\"]*)\"$")
//    Move password to a variable passwd so that it checks every record in the examples of feature file
    public void iEnterThePasswordAs(String passwd) throws Throwable {
        spage.Enterpasswd(passwd);
    }

    @When("^I click on Signin button on Loginpage$")
    public void iClickOnSigninButtonOnLoginpage() throws Throwable {
//        driver.findElement(By.name("submit")).click();
        spage.Signin();
    }


    @And("^I should see My account button on the right hand side$")
    public void iShouldSeeMyAccountButtonOnTheRightHandSide() throws Throwable {

//step1: getText element of My Account.then move to a variable.
//step2:My expected results is in a variable.
// Compare Variable 1 and Varibale2.


//        String Actual_MyAccount_Text = driver.findElement(By.xpath(".//*[@id='menu-item-5958']/a")).getText();
//        String Expected_MyAccount_Text = "My Account";
//        assertEquals(Expected_MyAccount_Text, Actual_MyAccount_Text);
        spage.Myacc();


    }

    @And("^I should see the Logout on the right hand side$")
    public void iShouldSeeTheLogoutOnTheRightHandSide() throws Throwable {
//        Step1: get the element of Logout button.
//        Step2: Verify isDisplayed button. move the result to boolean variable.
//        Step3: Compare using True or false.

//        boolean Actual_Logout = driver.findElement(By.cssSelector("#menu-item-4531>a")).isDisplayed();
//        assertTrue(Actual_Logout);
//        driver.close();
        spage.Logout();

    }

    @And("^I should see a Error message \"([^\"]*)\"$")
    public void iShouldSeeAErrorMessage(String Exp_errmsg) throws Throwable {
        spage.Errmsg(Exp_errmsg);
//        driver.findElement(By.xpath(".//*[@id='post-4521']/div/div[1]/p")).getText();
    }

    @Then("^I should see \"([^\"]*)\" header$")
    public void iShouldSeeHeader(String arg0) throws Throwable {
//      1. change the arg0 to a proper variable name
//      2. get the element of header
//      3. Move actual header to a variable
//      4. Compare actual_header to Exp_header
//        String Act_header = driver.findElement(By.xpath(".//*[@id='wpc_5a083a3e9c84c']/div/div/div/div/div/div/div/div/div/div/div[1]/div/h3")).getText();
//        String Exp_header = "Why D3D";
//        assertEquals(Exp_header, Act_header);
        spage.WhyD3dHeader();
    }

    @When("^I click on Why D(\\d+)d header$")
    public void iClickOnWhyDDHeader(String arg0) throws Throwable {
//        driver.findElement(By.linkText("Why D3D")).click();
        spage.clickwhyD3d();
    }


    @Then("^I should see about us in the current url$")
    public void iShouldSeeAboutUsInTheCurrentUrl() throws Throwable {
// *       String currentUrl = driver.getCurrentUrl();
//  *      String Exp_Url = "https://www.d3dsecurity.co.uk/about-us/";
//   *     assertEquals(Exp_Url, currentUrl);
        spage.ShowCurrentUrl();
    }


    @Given("^I enter the details$")
    public void iEnterTheDetails(DataTable details) throws Throwable {
        System.out.println(details);
//        raw removes the pipe symbol in the data table
        System.out.println(details.raw());
        System.out.println(details.raw().get(0));
        String email = details.raw().get(1).get(0);
        System.out.println(email);
        String passwd =  details.raw().get(1).get(1);
        System.out.println(passwd);
        driver.findElement(By.name("log")).sendKeys(email);
        driver.findElement(By.name("pwd")).sendKeys(passwd);
    }
}


