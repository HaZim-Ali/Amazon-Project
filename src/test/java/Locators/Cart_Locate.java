package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart_Locate {

    WebDriver HZM = Hooks.HZM;


    public WebElement CartButton (){
        return HZM.findElement(By.xpath("//div[@id=\"nav-cart-text-container\"]"));
    }
}
