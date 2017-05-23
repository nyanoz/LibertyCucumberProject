package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by manyano on 5/22/17.
 */
public class GetIntouchPage {

    private WebDriver driver;

    public GetIntouchPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnGetInTouchPage(){
        driver.findElement(By.xpath("id(\"khabane-nav-bar\")/ul[1]/li[5]/a[1]")).click();
    }
}
