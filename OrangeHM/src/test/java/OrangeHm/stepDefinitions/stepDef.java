package OrangeHm.stepDefinitions;

import OrangeHm.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.io.IOException;

/**
 * Created by SHRADHA on 18/08/2017.
 */
public class stepDef {

    //BaseMain baseMain = new BaseMain();
    Homepage homepage = new Homepage();
    LoginPage loginPage = new LoginPage();
    DashboardPage welcomedashboardPage = new DashboardPage();
    RetryLoginPage retryloginpage = new RetryLoginPage();
    PimPage pimpage = new PimPage();

    @Given("^I am in login page$")
    public void home_page() throws Throwable {
        homepage.checkTitle();
    }

    @When("^I select \"([^\"]*)\" as username$")
    public void enterUsername(String username) throws Throwable {
        loginPage.setUsername(username);
    }

    @When("^I select as  \"([^\"]*)\" as password$")
    public void enterPassword(String pwd) throws Throwable {
        loginPage.setPassword(pwd);
    }

    @When("^I click login button$")
    public void verifyTextloginbutton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        loginPage.submitLoginbutton();
    }

    @Then("^I should be on the \"([^\"]*)\" page$")
    public void retryLoginpage(String uname,String pwd) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        retryloginpage.setUsername(uname);
        retryloginpage.setPassword(pwd);
        retryloginpage.retryLoginbutton();
    }



    @And("^I can login successfully$")
    public void verifLogin() throws Throwable {
        loginPage.submitLoginbutton();
        Assert.assertTrue(welcomedashboardPage.getPageHeader().contains("Dashboard"));
    }



   /* @When("^I should be on the \"([^\"]*)\" page$")
    public void retryLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        ;retryloginpage.retryLoginbutton()
    }*/

    @Then("^I should see the login error message as \"([^\"]*)\"$")
    public void verifyLoginErrorMessage(String message) {
        Assert.assertTrue(loginPage.getLoginErrorMessage().equals(message));
        Assert.assertEquals("Verifying the login error message", message,loginPage.getLoginErrorMessage());
    }

    @Given("^User is on orangehm  homepage$")
    public void homePage() throws Throwable {

    }

    @When("^user enters valid  credentials on Login page$")
    public void verfyLoginpage() throws Throwable {
    }

    @Then("^user can successfully view the homepage$")
    public void viewHomepage() throws Throwable {

    }


   /* @Given("^user is on login page$")
    public void userisonloginpage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        homepage.checkTitle();
        //loginPage.setPassword(pwd);
        //loginPage.setUsername(uname);
        loginPage.submitLoginbutton();
        //loginPage.setPassword(pwd);
        //loginPage.setUsername(uname);
        //loginPage.submitLoginbutton();

    }*/

    @When("^user navigates to pim page$")
    public void usernavigatestopimpage() throws Throwable {

       }



    @Then("^user navigates to add employee page$")
    public void userNavigatestoAddemplyee() throws Throwable {
             pimpage.navigateToAddEmployee();

    }

    @And("^user enters details of employee$")
    public void userEntersthedetailsofemployee() throws InterruptedException {
        pimpage.checkAdminIsInAddEmployeePage();
        pimpage.provideEmployeeDetails();
        pimpage.selectStatus();

        pimpage.selectLocation();
        pimpage.newUserSave();

    }

    @Then("^user navigates to personal details$")
    public void userNavigatestopersonaldetails() throws Throwable {
        Assert.assertTrue(pimpage.isUserOnPIPage());
    }

}
