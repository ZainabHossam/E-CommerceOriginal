package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Hooks {
    public static WebDriver driver=null;
    @Before
    public static void OpenBrowser(){
        // 1-define Bridge using WebDriverManager instead of System.setProperty()
        WebDriverManager.chromedriver().setup();

        // 2-Create new object from Chrome
        driver=new ChromeDriver();

        //3-Configurations
        /*Maximize screen*/
        driver.manage().window().maximize();
        /* set implicit wait */
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Navigate to the Website
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @After
    public static void quitBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
