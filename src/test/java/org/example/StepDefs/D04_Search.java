package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_Home;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;

public class D04_Search {
    P03_Home home= new P03_Home();
    SoftAssert softAssert=new SoftAssert();
@Given("Search tab")
    public void OpenSearchTab(){

    String ExpectedResult="Search";
    softAssert.assertTrue(home.ItemSearch().contains(ExpectedResult));

}
@When("^User able to type \"([^\"]*)\"$")
    public void SearchItem(){
    System.out.println("SearchItem:   "+home.ResultItemsCount()); ;


}
@Then("User Click Search")
    public void CLickSearch(){

}
}
