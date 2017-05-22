package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by manyano on 5/22/17.
 */
public class WhatWeDoPage {

    private WebDriver driver;

    public WhatWeDoPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnWhatWeDo(){
        driver.findElement(By.id("what-we-do")).click();
    }
}