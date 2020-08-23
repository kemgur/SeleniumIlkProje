package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");

        //2.adim: Nesne olustur. Run yapinca driver acilir sayfa bos olur
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);//10 saniye
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");
// ilk webelementimizi buluyoruz.

       // <a id="sign-in" class="nav-item nav-link" data-test="sign-in"
        // href="/sign_in">Sign in</a>
        // tagName:=> a
        //attributes: => id=, class=, data-test=, href=,
        //***** Eger bir webelementin "id" attribute'u varsa o kullanilarak
        //      webelementini bulabiliriz

// "Hamza" -> String
// Web sayfasındaki tüm elamanlar -> WebElement
// webelementimizi id kullanarak bulduk.
        WebElement signInLink = driver.findElement(By.id("sign-in"));// WebElement=> very type
       signInLink.click(); //webelementimize tıkladık.

  //email kutusunu bulalım.
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com"); // emailKutusu'nun içerisine yazı gönderiyoruz

  //sifre kutusunu buluyor.
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");
        // sifreKutusu'nun içerisine yazı gönderiyoruz

        // sign in butonunu buluyoruz. // name="commit"
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

     String baslik = driver.getTitle();
      if(baslik.equals("Address Book")){
          System.out.println("Login successful");// "Giris basarili"
      }else{
          System.out.println("Login failed");// Giris basarisiz.
      }

    }}