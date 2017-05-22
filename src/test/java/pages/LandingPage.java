package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.Console;

/**
 * Created by manyano on 5/21/17.
 */
public class LandingPage {
    private WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUserName(String username){
        driver.findElement(By.id("email")).sendKeys(username);
        return;
    }

    public void enterPassword(String password){
        driver.findElement(By.id("pass")).sendKeys(password);
        return;
    }

    public void clickLogin(){
        this.driver.findElement(By.id("loginbutton")).click();
//        return;
    }
}
