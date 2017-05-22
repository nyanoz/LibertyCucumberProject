package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void assertHomePage(){
        driver.findElement(By.name("WHO WE ARE"));
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
