package pages;

import helper.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WhatWeDoPage extends Base {

    private WebDriver driver;

    public WhatWeDoPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnWhatWeDo(){
        driver.findElement(By.xpath("id(\"khabane-nav-bar\")/ul[1]/li[2]/a[1]")).click();
        return;
    }
}
