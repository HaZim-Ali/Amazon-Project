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
        return HZM.findElement(By.xpath("//*[@id=\"CampaignProductList-CampaignProductList\"]/div/div/div/div[1]/div/div/ul/li[1]/a"));
    }
    public WebElement HomePage (){
        return HZM.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
    }

}
