package StepDefinitions;

import Locators.Login_Locate;
import io.cucumber.java.en.And;

public class Login_Steps {

    Login_Locate Email = new Login_Locate();
    Login_Locate LogBut = new Login_Locate();

    @And("fill valid email")
    public void fill_valid_email(){
        Email.email1().sendKeys("01020605066");
    }
    @And("fill invalid {string}")
    public void fill_invalid(String email){
        Email.email1().sendKeys(email);
    }
    @And("click on continue")
    public void click_on_continue (){
        LogBut.LogButton().click();
    }
}
