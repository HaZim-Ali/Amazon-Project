package StepDefinitions;

import Locators.AddProduct_Locate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
//import org.openqa.selenium.JavascriptExecutor;



public class AddProduct_Steps {


    AddProduct_Locate Air =new AddProduct_Locate();
    AddProduct_Locate Button1 =new AddProduct_Locate();
    AddProduct_Locate Select =new AddProduct_Locate();
    AddProduct_Locate Basket =new AddProduct_Locate();
    AddProduct_Locate Home =new AddProduct_Locate();



//    private void scrollDownToElement(WebDriver HZM, WebElement element) {
//        JavascriptExecutor js = (JavascriptExecutor) HZM;
//        js.executeScript("arguments[0].scrollIntoView(150);", element);
//    }




    @When("go to search bar and write air pods name")
    public void go_to_search_bar_and_write_air_pods_name(){
        Air.AirPods().sendKeys("joyroom airpods");
    }
    @And("click on search button")
    public void click_on_search_button(){
        Button1.SearchButton().click();

    }
    @And("select on Audio")
    public void select_on_Audio(){
        Select.SelectAir().click();
    }

    @And("click add to basket")
    public void click_add_to_basket() throws InterruptedException {
//        scrollDownToElement(HZM,Basket.AddBasket());
        Basket.AddBasket().click();
        Thread.sleep(10000);
    }
    @And("navigate to home page")
    public void navigate_to_home_page(){
        Home.HomePage().click();
    }
}





