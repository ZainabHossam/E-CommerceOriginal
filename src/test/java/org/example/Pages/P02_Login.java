package org.example.Pages;
import io.cucumber.messages.types.Hook;
import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;

public class P02_Login {
    public WebElement NavigateLogin(){
        WebElement LoginLink= Hooks.driver.findElement(By.className("ico-login"));
        return LoginLink;
    }

    public void EnterData(String Email, String Password){
        WebElement EmailField= Hooks.driver.findElement(By.id("Email"));
        WebElement PasswordField= Hooks.driver.findElement(By.id("Password"));
        System.out.println("Email: "+Email+"   Password:  "+Password);
        EmailField.sendKeys(Email);
        PasswordField.sendKeys(Password);
    }
    public WebElement PressLogin(){
        WebElement loginBtn=Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]"));
        System.out.println("Text  "+loginBtn.getText());
        return loginBtn;
    }

}
