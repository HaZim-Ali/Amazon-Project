package StepDefinitions;

import Locators.SelectCategory_Locate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class SelectCategory_Steps {

    SelectCategory_Locate All = new SelectCategory_Locate();
    SelectCategory_Locate TV = new SelectCategory_Locate();
    SelectCategory_Locate Laps =new SelectCategory_Locate();
    SelectCategory_Locate Cart2 = new SelectCategory_Locate();
    SelectCategory_Locate ProceedToBuy = new SelectCategory_Locate();
    SelectCategory_Locate Category =new SelectCategory_Locate();
    SelectCategory_Locate Gaming =new SelectCategory_Locate();



    @And("click on electronics button")
    public void click_on_category_button()  {
        All.ElectButton().click();
    }
    @And("select laptop from electronics")
    public void select_TVs_and_Electronics()  {
        TV.LapTop().click();
       // Shop by Category
    }
    @And("click on laptop category")
    public void click_on_laptop_category(){
        Category.CategoryLap().click();
    }
    @And("click on gaming laptop")
    public void click_on_gaming_laptop(){
        Gaming.GamButton().click();
    }
    @And("Add laptop to the cart")
    public void select_televisions()  {
        Laps.AddToCart2().click();

    }
    @And("confirmed add to cart")
    public void confirmed_add_to_cart(){
        Cart2.CartAdd().click();
    }
    @Then("click on proceed to buy")
    public void click_on_proceed_to_buy(){
        ProceedToBuy.Proceed().click();
    }
}
