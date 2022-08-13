package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_Home;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D06_HomeSlider {
    P03_Home home= new P03_Home();

    @Given("First Slider link")
    public void GetLink(){
       WebElement SlidLink= home.SliderLink();
        PressOnLink(SlidLink);

    }
    @Then("Press on First Slider")
    public void PressOnLink(WebElement Link){
//        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nivo-slider\"]/a[1]")));
        Link.click();
        String CurrentLink= Hooks.driver.getCurrentUrl();
        Assert.assertEquals(CurrentLink,"https://demo.nopcommerce.com/nokia-lumia-1020");
        Link.sendKeys(Keys.F5);

    }
    @Given("Second Slider link")
    public void GetSecLink(){
        WebElement SecSlidLink= home.SecSliderLink();
        PressOnSecLink(SecSlidLink);
    }
    @Then("Press on Second Slider")
    public void PressOnSecLink(WebElement Link){
//        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nivo-slider\"]/a[2]")));

        Link.click();
        String CurrentLink= Hooks.driver.getCurrentUrl();
        Assert.assertEquals(CurrentLink,"https://demo.nopcommerce.com/nokia-lumia-1020");
       Link.sendKeys(Keys.F5);
    }
}
