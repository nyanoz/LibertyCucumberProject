package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by manyano on 5/22/17.
 */
public class OurClientsPage {

    private WebDriver driver;

    public OurClientsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnClientPage(){
        driver.findElement(By.linkText("Our Clients.")).click();
    }

    public void assertClientPage(){
        driver.findElement(By.name("Our Clients."));
    }
}
