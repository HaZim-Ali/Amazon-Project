package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Locate {
    WebDriver HZM = Hooks.HZM;


    public WebElement email1 (){
        return HZM.findElement(By.xpath("//*[@id=\"ap_email\"]"));
    }
    public WebElement LogButton (){
        return HZM.findElement(By.xpath("//*[@id=\"continue\"]"));
    }
}
