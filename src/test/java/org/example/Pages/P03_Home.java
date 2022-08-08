package org.example.Pages;
import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_Home {
public WebElement ChangeCurrency(){
 WebElement Currency= Hooks.driver.findElement(By.name("customerCurrency"));
 return Currency;
}
public String ItemSearch(){
 String SearchLink=Hooks.driver.getCurrentUrl();
 return  SearchLink;
}
public int ResultItemsCount(){
 int ResultCounts= Hooks.driver.findElements(By.className("item-grid")).size();
 //Hooks.driver.findElement(By.id("small-searchterms");

 return ResultCounts;
}
}
