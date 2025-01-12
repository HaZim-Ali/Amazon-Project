package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCategory_Locate {

    WebDriver HZM = Hooks.HZM;


    public WebElement ElectButton (){
        return HZM.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
    }
    public WebElement CategoryLap (){
        return HZM.findElement(By.xpath("//*[@id=\"sobe_d_b_ms_7_3\"]/a/div[1]/div/img"));
    }
    public WebElement GamButton (){
        return HZM.findElement(By.xpath("//a[@aria-label=\"### Gaming Laptops\"]"));
    }
    public WebElement LapTop (){
        return HZM.findElement(By.xpath("//span[contains(text(),'HP Victus Gaming Laptop (15-fb1004ne), CPU: Ryzen 5-7535HS, 16GB DDR5 2DM 4800 Graphics Card: NVIDIA GeForce RTX 2050, VRAM: 4GB, Display: 15.6 FHD Antiglare IPS 250 nits 144Hz, 512GB, Windows 11')]"));
    }
    public WebElement AddToCart2 (){
        return HZM.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
    }
    public WebElement CartAdd (){
        return HZM.findElement(By.xpath("//*[@id=\"attachSiAddCoverage\"]/span/input"));
    }
    public WebElement Proceed (){
        return HZM.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
    }
}
