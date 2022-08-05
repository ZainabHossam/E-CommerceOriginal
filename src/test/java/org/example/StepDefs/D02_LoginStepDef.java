package org.example.StepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P02_Login;
import org.openqa.selenium.By;
//import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef {
    SoftAssert softAssert=new SoftAssert();
    P02_Login login=new P02_Login();

    @Given("user go to login page")
        public void NavigateToLogin(){
        login.NavigateLogin().click();
    }
    @And("^User enter \"(.*)\"and\"(.*)\"$")
    public void EnterCredentials(String Email, String Password){
        login.EnterData(Email,Password);
    }
    @Then("Press Login Button")
    public void PressLogin(){
        login.PressLogin().click();
    }
    @And("Login success successfully")
    public void SuccessLogin(){
        String ExpectedResult = "https://demo.nopcommerce.com/";
        String ActualResult = Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(ExpectedResult,ActualResult);
        softAssert.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());
        System.out.println("Logged Successfully");
        softAssert.assertAll();
    }
    @And("User not Login to system")
    public void InvalidLogin(){
//
        String ExpectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String ActualResult = Hooks.driver.findElement(By.className("message-error validation-summary-errors")).getText();
        softAssert.assertEquals(ActualResult,ExpectedResult);
        System.out.println("Invalid Login");
        softAssert.assertAll();
    }

}
