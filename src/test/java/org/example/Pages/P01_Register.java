package org.example.Pages;
import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Register {
public WebElement registerLink(){
    WebElement RegLink=Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    return  RegLink;
}
}
