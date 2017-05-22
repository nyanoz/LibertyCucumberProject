//package stepDefination;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import helper.Base;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import pages.HomePage;
//
//
//public class HomePageTest {
//
//    WebDriver driver;
//    private Base base = new Base();
//    private HomePage homePage = new HomePage(driver);
//
//    @Before
//    public void start(){
//        base.setUp();
//    }
//    @Given("^I am on a browser$")
//    public void i_am_on_a_browser() throws Throwable {
//    }
//
//    @When("^I enter a valid kmc url on the browser$")
//    public void i_enter_a_valid_kmc_url_on_the_browser() throws Throwable {
//    }
//
//    @Then("^I should be redirected to the kmc home page$")
//    public void i_should_be_redirected_to_the_kmc_home_page() throws Throwable {
//        Assert.assertEquals("WHO WE ARE","WHO WE ARE");
//    }
//
//    @After
//    public void teardown(){
//        base.tearDown();
//    }
//}
