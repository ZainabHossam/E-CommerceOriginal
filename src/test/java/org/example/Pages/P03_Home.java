package org.example.Pages;

import io.cucumber.messages.types.Hook;
import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_Home {
public WebElement ChangeCurrency(){
 WebElement Currency= Hooks.driver.findElement(By.name("customerCurrency"));
 return Currency;
}

}
