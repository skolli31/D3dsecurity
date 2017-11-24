package d3dCom.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3dCom.Basepage;
import d3dCom.Pages.GetFreeQuotepage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Getfreequote extends Basepage {
    public GetFreeQuotepage Fqpage = PageFactory.initElements(Basepage.driver, GetFreeQuotepage.class);

//    @Given("^I Go to \"([^\"]*)\"$")
//    public void iGoTo(String Urlname) throws Throwable {
//        OpenUrl(Urlname);
//    }

    @When("^I click Online tab on the Home page$")
    public void iClickOnlineTabOnTheHomePage() throws Throwable {
        Fqpage.ClickOnlinetab();
    }

    @Given("^I entered the  first name as \"([^\"]*)\"$")
    public void iEnteredTheFirstNameAs(String arg0) throws Throwable {
        Fqpage.Firstname(arg0);
    }

    @And("^I entered  the last name as \"([^\"]*)\"$")
    public void iEnteredTheLastNameAs(String arg0) throws Throwable {
        Fqpage.Lastname(arg0);
    }


    @And("^I enter the email id as \"([^\"]*)\"$")
    public void iEnterTheEmailIdAs(String arg0) throws Throwable {
        Fqpage.emailid(arg0);
    }

    @And("^I enter phone no as \"([^\"]*)\"$")
    public void iEnterPhoneNoAs(String arg0) throws Throwable {
        Fqpage.Phoneno(arg0);
    }

    @And("^I enter the subject as \"([^\"]*)\"$")
    public void iEnterTheSubjectAs(String arg0) throws Throwable {
        Fqpage.subject(arg0);
    }

    @And("^I enter the message as \"([^\"]*)\"$")
    public void iEnterTheMessageAs(String arg0) throws Throwable {
        Fqpage.message(arg0);
    }

    @Given("^I enter the captcha in the given box$")
    public void iEnterTheCaptchaInTheGivenBox() throws Throwable {
        Fqpage.captcha();

    }

    @When("^I click on the send message button$")
    public void iClickOnTheSendMessageButton() throws Throwable {
        Fqpage.Clicksendmsg();
    }

    @Then("^I should see a displayed message as \"([^\"]*)\" on the current url page$")
    public void iShouldSeeADisplayedMessageAsOnTheCurrentUrlPage(String arg0) throws Throwable {
        Fqpage.Header(arg0);
    }

    @Then("^I should see a displayed message(\\d+) as \"([^\"]*)\" on the current url page$")
    public void iShouldSeeADisplayedMessageAsOnTheCurrentUrlPage(int arg0, String arg1) throws Throwable {
        Fqpage.Header1();
    }

    @And("^I should see a current Url as \"([^\"]*)\"$")
    public void iShouldSeeACurrentUrlAs(String Exp_Url) throws Throwable {
        Fqpage.CurrentUrl(Exp_Url);
    }

    @Then("^I should see a \"([^\"]*)\" on the left hand side bottom$")
    public void iShouldSeeAOnTheLeftHandSideBottom(String arg0) throws Throwable {
        Fqpage.GetafreequoteHeader();
    }

    @Given("^I go to Url \"([^\"]*)\"$")
    public void iGoToUrl(String Urlname) throws Throwable {
        OpenUrl(Urlname);
    }

    @Given("^I entered the  blank first name as \"([^\"]*)\"$")
    public void iEnteredTheBlankFirstNameAs(String arg0) throws Throwable {
        Fqpage.blankfirstname(arg0);
    }

    @Then("^I should see a error message as \"([^\"]*)\"$")
    public void iShouldSeeAErrorMessageAs(String arg0) throws Throwable {
        Fqpage.Errormsg(arg0);
    }


//    @Then("^I should see error message as \"([^\"]*)\"$")
//    public void iShouldSeeErrorMessageAs(String arg0) throws Throwable {
//        Fqpage.blankerrormsg(arg0);
//
//    }
}

