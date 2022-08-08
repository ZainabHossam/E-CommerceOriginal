package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class D05_HoverCategory {
    P03_Home home= new P03_Home();
    Actions Action=new Actions(Hooks.driver);
    SoftAssert softAssert=new SoftAssert();
    @Given("Hovering on Main Category")
    public void HoverCategory(){
        WebElement X= home.GetSelectedCat();
        String [] x={"Computers", "Electronics", "Appare"};
        String xx="Computers";
//        List<WebElement> y= X.getText().compareTo("Computers");
      for(int i=0;i<3;i++){
          if(X.getText()==x[i]){
              Action.moveToElement(home.GetSelectedCat());

          }
      }
        System.out.println("Hover Section"+X.getText());



    }
    @Then("Select Subcategory")
    public void SelectSubCategory(){

    }
    @And("Click on the selected subcategory")
    public void SelectSubCat(){

    }

}
