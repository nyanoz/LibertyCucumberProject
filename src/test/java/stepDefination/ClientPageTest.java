package stepDefination;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Base;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.OurClientsPage;

public class ClientPageTest {

    WebDriver driver;
    private Base base = new Base();
    private OurClientsPage ourClientsPage = new OurClientsPage(driver);

    @Test
    @Given("^Open Firefox and start application$")
    public void open_Firefox_and_start_application() throws Throwable{
        base.setUp();
    }
    @Test
    @When("^I click on the client page$")
    public void i_click_on_the_client_page() throws Throwable {
//        base.setUp();
        ourClientsPage.clickOnClientPage();
    }

    @Then("^user should be redirected to the client page$")
    public void user_should_be_redirected_to_the_client_page() throws Throwable {
        ourClientsPage.assertClientPage();
    }

}
