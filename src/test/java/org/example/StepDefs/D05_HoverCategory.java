package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D05_HoverCategory {
    P03_Home home= new P03_Home();
    Actions Action=new Actions(Hooks.driver);
    SoftAssert softAssert=new SoftAssert();
    String MainCat;
    String SubCategory;
    WebElement SubCatElement ;
    @Given("Hovering on Main Category")
    public void HoverCategory(){
        WebElement CategoryElements= home.GetSelectedCat();
        MainCat=CategoryElements.getText();
        System.out.println(" Cat Texts "+ CategoryElements.getText());
       Action.moveToElement(CategoryElements).perform();

    }
    @Then("Select Subcategory")
    public void SelectSubCategory(){
        SubCatElement = home.SelectSubCat(MainCat);
        SubCategory= SubCatElement.getText();
        Action.moveToElement(SubCatElement).perform();

    }
    @And("Click on the selected subcategory")
    public void SelectSubCat(){
        Action.click();
        System.out.println("SubElement  "+SubCatElement.getText());
        Assert.assertEquals(home.PageTitle().getText(),SubCategory);
    }


}
