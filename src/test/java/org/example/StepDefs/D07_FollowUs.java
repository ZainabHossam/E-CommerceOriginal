package org.example.StepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Hook;
import org.example.Pages.P03_Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;

public class D07_FollowUs {
    P03_Home home= new P03_Home();
    @Given("User Opens Facebook")
    public void OpenFacebook(){
    WebElement Link= home.GetFaceBookLink();
    Link.click();


}
    @Given("User Opens Twitter")
    public void OpenTwitter(){
        WebElement Link= home.GetTwitterLink();
        Link.click();
    }
    @Given("User Opens RSS")
    public void OpenRss(){
        WebElement Link= home.GetRSSLink();
        Link.click();

    }
    @Given("User Opens Youtube")
    public void OpenYoutube(){
        WebElement Link= home.GetYoutubeLink();
        Link.click();
    }
    //"^User enter \"(.*)\"and\"(.*)\"$"
    //"^\"(.*)\" is Opened in NewTab$"
    /*   Then "https://www.facebook.com/nopCommerce" is Opened in NewTab
"https://twitter.com/nopCommerce" is Opened in NewTab
"https://demo.nopcommerce.com/new-online-store-is-open" is Opened in NewTab
"https://www.youtube.com/user/nopCommerce" is Opened in NewTab
* */
    @Then("^\"(.*)\" is Opened in NewTab$")
    public void ClickAndConfirm(String Link){

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),Link);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));

        // reload
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }
}
