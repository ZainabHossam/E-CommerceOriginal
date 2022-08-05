package org.example.StepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.messages.types.Hook;
import org.example.Pages.P01_Register;


public class D01_registerStepDef {
P01_Register Reg= new P01_Register();
    @Given("user go to register page")
    public void goRegisterPage(){

        Reg.registerLink().click();
    }
}
