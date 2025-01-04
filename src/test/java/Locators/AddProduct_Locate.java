package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProduct_Locate {

    WebDriver HZM = Hooks.HZM;

    public WebElement AirPods(){
        return HZM.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
    }
    public WebElement SearchButton (){
        return HZM.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
    }
    public WebElement SelectAir (){
        return HZM.findElement(By.xpath("//img[@alt=\"Audio\"]"));
    }
    public WebElement AddBasket (){
        return HZM.findElement(By.xpath("//div[@class=\"ProductShowcaseActions__action__o0KFb\"]//button[@aria-label=\"Add to Basket\"]"));
    }
    public WebElement HomePage (){
        return HZM.findElement(By.xpath("//*[@id=\"nav-area\"]/div/div[2]/div/div/div[2]/div[2]/nav/ul/li[1]/a"));
    }

}
