package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LandingPage;


public class SmokeTest {

    WebDriver driver;

    LandingPage landingPage;

    @Given("^Open Firefox and start application$")
    public void open_Firefox_and_start_application() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
    }

    @When("^I provide valid username and passowrd$")
    public void i_provide_valid_username_and_password() throws Throwable {
        landingPage.enterUserName("sanza");
        landingPage.enterPassword("paasss");

        driver.wait(10000);

    }

    @Then("^user should be able to login$")
    public void user_should_be_able_to_login() throws Throwable {
        landingPage.clickLogin();
    }
}
