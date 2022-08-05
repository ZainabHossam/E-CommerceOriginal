package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.Pages.P03_Home;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D03_HomeStepDef {
    P03_Home home= new P03_Home();
    @Given("User in the home page")
    public void homePage(){
        String ExpectedResult="https://demo.nopcommerce.com/";
        String ActualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(ActualResult,ExpectedResult);
    }
    @And("User Change The Currency")
    public void ChangeCurrency(){
    home.Homepage().findElement(By.xpath("//*[@id=\"customerCurrency\"]")).getCssValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        // value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")).click();
    }
}
