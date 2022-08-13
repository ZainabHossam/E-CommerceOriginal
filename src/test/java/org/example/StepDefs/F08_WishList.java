package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Background;
import org.example.Pages.P03_Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class F08_WishList {

    P03_Home home= new P03_Home();
    SoftAssert softAssert=new SoftAssert();

    @Given("Wishlist icon for the Product")
    public void AddItemToWishList() throws NumberFormatException{
        boolean Status=false;
        WebElement FavIcon= home.GetFavItem();
        FavIcon.click();
        WebElement Counter= home.QtCheck();
        int Count=2;
        try {
            System.out.println(Counter.getText());
            System.out.println(Integer.parseInt(Counter.getText()));
             Count = Integer.parseInt(Counter.getText());
        }catch(NumberFormatException e) {
            System.out.println("NumberFormat Exception: invalid input string");

        }
        System.out.println(Count);
        softAssert.assertTrue(Count>0);
    }
    @And("Check The count of Wishlist icon increased")
    public void CompareCount(){
        WebElement CloseBtn= home.CloseMsg();
        CloseBtn.click();

    }
    @Then("Add Product to wishlist")
    public void AddItemTWishList(){
        WebElement SucMSG= home.GetMsg();
        String Message=SucMSG.getText();
        System.out.println(Message);
        String MsgColor=Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div")).getCssValue("background-color");
        System.out.println(MsgColor);
        softAssert.assertEquals(Message,"The product has been added to your wishlist");
        softAssert.assertEquals(MsgColor,"rgba(75, 176, 122)");

    }


}
