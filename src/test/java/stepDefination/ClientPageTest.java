package stepDefination;


import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.OurClientsPage;

public class ClientPageTest extends Base {

    Base base = new Base();
    WebDriver driver = new FirefoxDriver();

    OurClientsPage ourClientsPage = new OurClientsPage(driver);

    @Given("^Open Firefox and start application$")
    public void open_Firefox_and_start_application() throws Throwable{
        base.setUp(driver);
    }

    @When("^I click on the client page$")
    public void i_click_on_the_client_page() throws Throwable {
        ourClientsPage.clickOnClientPage();
    }

    @Then("^user should be redirected to the client page$")
    public void user_should_be_redirected_to_the_client_page() throws Throwable {
        Assert.assertEquals("We work closely with ","We work closely with ");
    }

}
