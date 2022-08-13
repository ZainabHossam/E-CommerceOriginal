package org.example.Pages;
import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class P03_Home {
 public WebElement ChangeCurrency() {
  WebElement Currency = Hooks.driver.findElement(By.name("customerCurrency"));
  return Currency;
 }

 public String ItemSearch() {
  String SearchLink = Hooks.driver.getCurrentUrl();
  return SearchLink;
 }

 public int ResultItemsCount() {
  int ResultCounts = Hooks.driver.findElements(By.className("item-grid")).size();
  //Hooks.driver.findElement(By.id("small-searchterms");

  return ResultCounts;
 }

 //public String[] GetSelectedCat(){
// String[] Cat = new String[3];
// Cat[0]= Hooks.driver.findElement(By.xpath("//a[@href='/computers']")).getText();
// Cat[1]= Hooks.driver.findElement(By.xpath("//a[@href='/electronics']")).getText();
// Cat[2]= Hooks.driver.findElement(By.xpath("//a[@href='/apparel']")).getText();
//
//
// return Cat;
//}
 public WebElement GetSelectedCat() {
  WebElement Cat = null;
  WebElement Cat1 = Hooks.driver.findElement(By.xpath("//a[@href='/computers']"));
  WebElement Cat2 = Hooks.driver.findElement(By.xpath("//a[@href='/electronics']"));
  WebElement Cat3 = Hooks.driver.findElement(By.xpath("//a[@href='/apparel']"));
  ArrayList<WebElement> N = new ArrayList<>();
  ArrayList<WebElement> SubCat=new ArrayList<>();
  //Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]"));
  N.add(Cat1);
  N.add(Cat2);
  N.add(Cat3);

  Cat = N.get((int) (Math.random() * 3));
  System.out.println(Cat.getText());
  SubCat.add(Cat1.findElement(By.xpath("//ul[@class='sublist first-level']")));
  //SelectSubCat(Cat);
  return Cat;
 }

 public WebElement SelectSubCat(String MainCat) {
   int Num=0;
   int Rand=1;
  System.out.println("MainCat "+MainCat);

   if (MainCat.equals("Computers")){
    Num=1;
   }else if (MainCat.equals("Electronics")){
    Num=2;
   }else if(MainCat.equals("Apparel")){
    Num=3;
   }

    Rand = (int) (Math.random() * 2)+1;

  WebElement SelectedSubCat = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[" + Num + "]/ul/li[" + Rand + "]/a"));

  Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    return SelectedSubCat;

 }
 public WebElement PageTitle(){
  WebElement PageTitle= Hooks.driver.findElement(By.className("page-title"));
 return PageTitle;
 }

 public WebElement SliderLink(){

  WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
  WebElement SliderImgLink = Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[1]"));
  wait.until(ExpectedConditions.elementToBeClickable(SliderImgLink));
  return SliderImgLink;
 }
 public WebElement SecSliderLink(){
  WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
  WebElement SliderImgLink = Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
  wait.until(ExpectedConditions.elementToBeClickable(SliderImgLink));
  return SliderImgLink;
 }
public WebElement GetFaceBookLink(){
 WebElement SocialLink = Hooks.driver.findElement(By.className("facebook"));
 return SocialLink;
}
 public WebElement GetTwitterLink(){
  WebElement SocialLink = Hooks.driver.findElement(By.className("twitter"));
  return SocialLink;
 }
 public WebElement GetRSSLink(){
  WebElement SocialLink = Hooks.driver.findElement(By.className("rss"));
  return SocialLink;
 }
 public WebElement GetYoutubeLink(){
  WebElement SocialLink = Hooks.driver.findElement(By.className("youtube"));
  return SocialLink;
 }

 public WebElement GetFavItem(){
  WebElement FavLink = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
  return FavLink;
 }
 public WebElement GetMsg(){
  WebElement SucMSG = Hooks.driver.findElement(By.className("content"));

   return SucMSG;
 }

 public WebElement CloseMsg(){
  WebElement CloseMSGBtn = Hooks.driver.findElement(By.className("close"));

  return CloseMSGBtn;
 }

 public WebElement QtCheck(){
  WebElement Quatity = Hooks.driver.findElement(By.className("wishlist-qty"));
  return Quatity;
 }







}
