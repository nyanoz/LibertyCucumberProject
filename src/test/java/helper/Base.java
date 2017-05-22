package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {

    public WebDriver driver;

    public Base() {
        driver = getDriver();
    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void setUp(WebDriver driver) {

        driver.manage().window().maximize();
        driver.get("http://khabane.co.za/");
    }

    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
