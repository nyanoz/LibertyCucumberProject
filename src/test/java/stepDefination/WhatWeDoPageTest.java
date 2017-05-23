//package stepDefination;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.After;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import helper.Base;
//import junit.framework.Assert;
//import org.junit.Before;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import pages.WhatWeDoPage;
//
///**
// * Created by manyano on 5/23/17.
// */
//public class WhatWeDoPageTest extends Base {
//
//    WhatWeDoPage whatWeDoPage = new WhatWeDoPage(getDriver());
//
//
//    @Before
//    public void setUp() {
//        driver = getDriver();
//        driver.manage().window().maximize();
//        driver.get("http://khabane.co.za/");
//    }
//
//    @Given("^Open Firefox and start$")
//    public void open_Firefox_and_start() throws Throwable{
//        setUp(getDriver());
//    }
//
//    @When("^I click on the what we do page$")
//    public void i_click_on_the_what_we_do_page() throws Throwable {
//        whatWeDoPage.clickOnWhatWeDo();
//    }
//
//    @Then("^user should be redirected to the what we do page$")
//    public void user_should_be_redirected_to_the_what_we_do_page() throws Throwable {
//        Assert.assertEquals("We don't believe in silos","We don't believe in silos");
//    }
//
//    @After
//    public void tearDown() {
//        driver.close();
//    }
//}
