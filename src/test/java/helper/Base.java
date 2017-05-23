package helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {

    public static  WebDriver driver;

    public Base() {
        driver = getDriver();
    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

    @Before
    public void setUp(WebDriver driver) {
        driver.manage().window().maximize();
       driver.get("http://khabane.co.za/");
    }

}
