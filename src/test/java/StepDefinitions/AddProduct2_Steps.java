package StepDefinitions;

import Locators.AddProduct2_Locate;
import io.cucumber.java.en.And;

public class AddProduct2_Steps {
    AddProduct2_Locate xiaomi1 =new AddProduct2_Locate();
    AddProduct2_Locate home7 =new AddProduct2_Locate();
    AddProduct2_Locate Button4 =new AddProduct2_Locate();

    @And("navigate to home final")
    public void navigate_to_home_final(){
        home7.home3().click();
    }

    @And("select new product scooter")
    public void select_new_product_scooter(){
        xiaomi1.xiaomi2().sendKeys("xiaomi scooter");

    }
    @And("upon click on search button")
    public void upon_click_on_search_button(){
       Button4.Button3().click();
    }
}
