package d3dCom.stepdefinition;

import d3dCom.Basepage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Register extends Basepage {

    @Given("^I go to \"([^\"]*)\"$")
    public void iGoTo(String Url) throws Throwable {
//        instead of writing below two lines we are calling a method from the base page
//        Openbrowser();
        //        ChromeDriverManager.getInstance().setup();
        //        driver = new ChromeDriver();
                driver.get(Url);
    }

    @Then("^I should see a Register button$")
    public void iShouldSeeARegisterButton() throws Throwable {
        String Act_register = driver.findElement(By.xpath(".//*[@id='menu-item-4529']/a")).getText();
        String Exp_Register = "Register";
        assertEquals(Exp_Register, Act_register);
    }

    @When("^I click on the Register button$")
    public void iClickOnTheRegisterButton() throws Throwable {
        driver.findElement(By.linkText("Register")).click();
    }

    @Then("^I should see a page with Register as header$")
    public void iShouldSeeAPageWithRegisterAsHeader() throws Throwable {
        String Act_header = driver.findElement(By.xpath(".//*[@id='post-4519']/h1")).getText();
        String Exp_header = "Register";
        assertEquals(Exp_header, Act_header);
    }


    @Given("^I enter the valid emaild as \"([^\"]*)\"$")
    public void iEnterTheValidEmaildAs(String arg0) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(arg0);
    }


    @And("^I enter the new passwd as \"([^\"]*)\"$")
    public void iEnterTheNewPasswdAs(String arg0) throws Throwable {
        driver.findElement(By.name("pass1")).sendKeys(arg0);
    }

    @And("^I enter the confirm passwd as \"([^\"]*)\"$")
    public void iEnterTheConfirmPasswdAs(String arg0) throws Throwable {
        driver.findElement(By.name("pass2")).sendKeys(arg0);
    }

    @When("^i click on the Register button on register page$")
    public void iClickOnTheRegisterButtonOnRegisterPage() throws Throwable {
        driver.findElement(By.name("submit")).click();
    }

    @Then("^I should see the My Account button$")
    public void iShouldSeeTheMyAccountButton() throws Throwable {
        Boolean Act_Myacc = driver.findElement(By.xpath(".//*[@id='menu-item-5958']/a")).isDisplayed();
        assertTrue(Act_Myacc);
    }

    @And("^I should see My Account text$")
    public void iShouldSeeMyAccountText() throws Throwable {
        String Act_Myacc = driver.findElement(By.xpath(".//*[@id='menu-item-5958']/a")).getText();
        String Exp_Myacc = "My Account";
        assertEquals(Exp_Myacc, Act_Myacc);
    }

    @And("^I should see the Logout button$")
    public void iShouldSeeTheLogoutButton() throws Throwable {
        Boolean Act_logout = driver.findElement(By.cssSelector("#menu-item-4531>a")).isDisplayed();
        assertTrue(Act_logout);
//        Instead of driver.close() we are calling a 'Close' method from Baseclass
//        driver.close();
    }

    @And("^I should see the Logout text$")
    public void iShouldSeeTheLogoutText() throws Throwable {
        String Act_logout = driver.findElement(By.xpath(".//*[@id='menu-item-4531']/a")).getText();
        String Exp_Logout = "Log Out";
        assertEquals(Exp_Logout, Act_logout);
    }

    @Then("^I should see  error message as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageAs(String Exp_Errmsg) throws Throwable {
        String Act_Errmsg = driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]/p")).getText();
        assertEquals(Exp_Errmsg, Act_Errmsg);
    }

    @Then("^I should see an error message as \"([^\"]*)\"$")
    public void iShouldSeeAnErrorMessageAs(String Exp_ErrMsg) throws Throwable {
        String Act_ErrMsg = driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]/p")).getText();
        assertEquals(Exp_ErrMsg, Act_ErrMsg);
//        driver.close();

    }
}
