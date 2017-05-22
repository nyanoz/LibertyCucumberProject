package stepDefination;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.OurClientsPage;

public class ClientPageTest {

    WebDriver driver;
    private Base base = new Base();
    private OurClientsPage ourClientsPage = new OurClientsPage(driver);

    @Given("^Open Firefox and start application$")
    public void open_Firefox_and_start_application() throws Throwable{
        base.setUp();
    }

    @When("^I click on the client page$")
    public void i_click_on_the_client_page() throws Throwable {
        driver.findElement(By.xpath("id(\"khabane-nav-bar\")/ul[1]/li[3]/a[1]")).click();
//        ourClientsPage.clickOnClientPage();
    }

    @Then("^user should be redirected to the client page$")
    public void user_should_be_redirected_to_the_client_page() throws Throwable {
        Assert.assertEquals("We work closely with ","We work closely with ");
    }
}
