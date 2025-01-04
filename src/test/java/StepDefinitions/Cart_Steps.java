package StepDefinitions;

import Locators.Cart_Locate;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;

public class Cart_Steps {

    Cart_Locate Cart =new Cart_Locate();


    @And("click on cart button")
    public void click_on_cart_button(){
        Cart.CartButton().click();
    }
}
