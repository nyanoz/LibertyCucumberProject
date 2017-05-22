package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OurClientsPage {

    private WebDriver driver;

    public OurClientsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnClientPage() throws InterruptedException{
        driver.findElement(By.xpath("id(\"khabane-nav-bar\")/ul[1]/li[3]/a[1]")).click();
        return;
    }

}
