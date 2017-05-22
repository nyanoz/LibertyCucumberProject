package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {

    public Base(){

    }

    public Base(WebDriver driver){
        this.driver = driver;
    }

   public WebDriver driver;

    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://khabane.co.za/");
    }

    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
