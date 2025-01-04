package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCategory_Locate {

    WebDriver HZM = Hooks.HZM;


    public WebElement AllButton (){
        return HZM.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]//span[contains(text(),'All')]"));
    }
    public WebElement Category (){
        return HZM.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[12]/a"));
    }
    public WebElement Televisions (){
        return HZM.findElement(By.xpath("//a[contains(text(),'Televisions')]"));
    }
}
