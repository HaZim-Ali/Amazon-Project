package StepDefinitions;

import Locators.SelectCategory_Locate;
import io.cucumber.java.en.And;


public class SelectCategory_Steps {

    SelectCategory_Locate All = new SelectCategory_Locate();
    SelectCategory_Locate TV = new SelectCategory_Locate();
    SelectCategory_Locate Television =new SelectCategory_Locate();




    @And("click on category button")
    public void click_on_category_button() throws InterruptedException {
        All.AllButton().click();
        Thread.sleep(10000);
    }
    @And("select TVs and Electronics")
    public void select_TVs_and_Electronics() throws InterruptedException {
        TV.Category().click();
//        Thread.sleep(10000);
    }
    @And("select televisions")
    public void select_televisions(){
        Television.Televisions().click();

    }
}
