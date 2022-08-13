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
        System.out.println("in change currency ");
        home.ChangeCurrency().sendKeys("Euro");
       // String [] ProductID={"0","1","4","18","43"};
        for(int count =0;count<4;count++){
            String itemPrice=Hooks.driver.findElements(By.className("prices")).get(count).getText();
            System.out.println("itemPrice "+itemPrice);
            Assert.assertTrue(itemPrice.contains("€"));

            //Step to get the tag with full xpath  the below line needs the count start from 1 and use the ProductID Array
            // String Price=Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div["+count+"]/div[@data-productid="+ProductID[count]+"]/div[2]/div[3]/div[1]/span")).getText();
            // System.out.println("Here in the loop  "+Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div["+count+"]/div[@data-productid="+ProductID[count]+"]/div[2]/div[3]/div[1]/span")).getText());
        }
    }
}
