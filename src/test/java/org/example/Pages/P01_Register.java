package org.example.Pages;
import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Register {
public WebElement registerLink(){
    WebElement RegLink=Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    return  RegLink;
}
public WebElement SelectGender(){
    WebElement Gender=Hooks.driver.findElement(By.id("gender-male"));
    return Gender;
}
public void FirstAndLastName(String FirstName,String LastName){

    WebElement FirstNa= Hooks.driver.findElement(By.id("FirstName"));
    WebElement LastNa= Hooks.driver.findElement(By.id("LastName"));
    FirstNa.sendKeys(FirstName);
    LastNa.sendKeys(LastName);
}

public void AddDateOfBirth(){
    WebElement Day=Hooks.driver.findElement(By.name("DateOfBirthDay"));
    WebElement Month=Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    WebElement Year=Hooks.driver.findElement(By.name("DateOfBirthYear"));
    Day.sendKeys("1");
    Month.sendKeys("September");
    Year.sendKeys("1994");
}

    public WebElement AddEmail(){
        WebElement Email=Hooks.driver.findElement(By.name("Email"));
        return Email;
    }
    public void AddPassword(String Password, String ConfirmPassword){
        WebElement PasswordField=Hooks.driver.findElement(By.id("Password"));
        WebElement ConfirmPasswordField=Hooks.driver.findElement(By.id("ConfirmPassword"));
        PasswordField.sendKeys(Password);
        ConfirmPasswordField.sendKeys(ConfirmPassword);

    }
    public WebElement PressRegisterBtn(){
       WebElement RegisterBtn= Hooks.driver.findElement(By.id("register-button"));
       return RegisterBtn;

    }
    public WebElement SucessMsg(){
        WebElement Message= Hooks.driver.findElement(By.className("result"));
        return Message;

    }
}
