package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProduct2_Locate {

    WebDriver HZM = Hooks.HZM;


    public WebElement home3 (){
        return HZM.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
    }

    public WebElement xiaomi2(){
        return HZM.findElement(By.xpath("//input[@placeholder=\"Search Amazon.eg\"]"));
    }
    public WebElement Button3 (){
        return HZM.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
    }



}
