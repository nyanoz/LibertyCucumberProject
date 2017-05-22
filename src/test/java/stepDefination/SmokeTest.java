package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Base;
import pages.HomePage;


public class SmokeTest {

    Base base;
    HomePage homePage;

    @Given("^I am on a browser$")
    public void i_am_on_a_browser() throws Throwable {
        base.setUp();
    }

    @When("^I provide valid username and password$")
    public void i_provide_valid_username_and_password() throws Throwable {
        homePage.assertHomePage();
    }

    @Then("^user should be able to login$")
    public void user_should_be_able_to_login() throws Throwable {
        homePage.clickLogin();
    }

    @After
    public void teardown(){
        base.tearDown();
    }
}
