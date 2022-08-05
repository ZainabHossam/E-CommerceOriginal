package org.example.StepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Hook;
import org.checkerframework.checker.units.qual.C;
import org.example.Pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef {
P01_Register Reg= new P01_Register();
    @Given("user go to register page")
    public void goRegisterPage(){
        Reg.registerLink().click();
    }

    @And("User select Gender type")
    public void SelectGender(){
    Reg.SelectGender().click();
    }
    @And("^User enter \"(.*)\" and \"(.*)\"$")
    public void FirstLastName(String FirstName,String LastName){
        Reg.FirstAndLastName(FirstName,LastName);
    }
    @And("User enter date of Birth")
    public void DateOfBirth(){
     Reg.AddDateOfBirth();
    }
    @And("^User enter email \"(.*)\"$")
    public void Email(String Email){
        Reg.AddEmail().sendKeys(Email);
    }
    @And("^User Enter \"(.*)\" and \"(.*)\"$")
    public void Password(String Password,String ConfirmPassword){
        Reg.AddPassword(Password,ConfirmPassword);
    }
    @Then("Press Register")
    public void PressRegister(){
    Reg.PressRegisterBtn().click();
    }
    @And("Success Message displayed")
    public void ConfirmSuccessReg(){
        String  ExpectedResult ="Your registration completed";
        String ActualResult= String.valueOf(Reg.SucessMsg().getText());
        String SuccessColor= Hooks.driver.findElement(By.className("result")).getCssValue("color");
    //    System.out.println("Color: "+SuccessColor);
    //        System.out.println("Expected Result: "+ExpectedResult);
    //        System.out.println("Actual Result: "+ActualResult);
        Assert.assertEquals(ExpectedResult,ActualResult);
     Assert.assertEquals(SuccessColor, "rgba(76, 177, 124, 1)");
     //       System.out.println("SuccessColor Same");
        System.out.println("Hey, Assertion Done Successfully");
    }




}
