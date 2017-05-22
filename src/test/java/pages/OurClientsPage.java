package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OurClientsPage {

    private WebDriver driver;

    public OurClientsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnClientPage() throws InterruptedException{
        driver.findElement(By.partialLinkText("our clients")).click();
    }


}
