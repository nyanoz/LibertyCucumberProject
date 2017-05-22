package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LandingPage {
    private WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUserName(String username){
        driver.findElement(By.xpath("//*[contains(concat( \" \", @class, \" \" ), concat( \" \", \"ng-valid-pattern\", \" \" ))]")).sendKeys(username);
        return;
    }

    public void enterPassword(String password){
        driver.findElement(By.xpath("//*[contains(concat( \" \", @class, \" \" ), concat( \" \", \"ng-invalid-required\", \" \" ))]")).sendKeys(password);
        return;
    }

    public void clickLogin(){
        this.driver.findElement(By.id("loginbutton")).click();
        return;
    }
}
