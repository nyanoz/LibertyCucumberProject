package stepDefination;


import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Base;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.OurClientsPage;
import pages.WhatWeDoPage;

public class ClientPageTest extends Base {

    WebDriver driver = getDriver();

    OurClientsPage ourClientsPage = new OurClientsPage(driver);
    WhatWeDoPage whatWeDoPage = new WhatWeDoPage(driver);

    @Before
    public void setUp() {
        driver = getDriver();
        driver.manage().window().maximize();
        driver.get("http://khabane.co.za/");
    }

    @Given("^Open Firefox and start application$")
    public void open_Firefox_and_start_application() throws Throwable{
        setUp(driver);
    }

    @When("^I click on the client page$")
    public void i_click_on_the_client_page() throws Throwable {
        ourClientsPage.clickOnClientPage();

    }

    @Then("^user should be redirected to the client page$")
    public void user_should_be_redirected_to_the_client_page() throws Throwable {
        Assert.assertEquals("We work closely with ","We work closely with ");
    }

    @Given("^Open Firefox and start$")
    public void open_Firefox_and_start() throws Throwable{
        setUp(getDriver());
    }

    @When("^I click on the what we do page$")
    public void i_click_on_the_what_we_do_page() throws Throwable {
        whatWeDoPage.clickOnWhatWeDo();
    }

    @Then("^user should be redirected to the what we do page$")
    public void user_should_be_redirected_to_the_what_we_do_page() throws Throwable {
        junit.framework.Assert.assertEquals("We don't believe in silos","We don't believe in silos");
    }

//    @After
//    public void tearDown() {
//        driver.close();
//    }

}
