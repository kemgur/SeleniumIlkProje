package com.techproed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_02_Xpath02 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");

        //2.adim: Nesne olustur. Run yapinca driver acilir sayfa bos olur
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
         driver.get("http://a.testaddressbook.com/sign_in");

        //WebElement welcome = driver.findElement(By.tagName("h1"));
        WebElement wc = driver.findElement(By.tagName("h1"));
        System.out.println(wc.getText());


// xpath kullanımında, attribute kullanmaya gerek duymazsanız,
// sadece tagName yazılarakta webelement bulunabilir.
         WebElement welcomeYazisi = driver.findElement(By.xpath("//h1"));
        // xpath kullaniminda sadece tagName yazarakta webelementi bulabiliriz.
         System.out.println(welcomeYazisi.getText());

        //==> //input[.='Sign up'] == //*[.='Sign up'] Ayni islemi yapar.
        // * tagNane ne olursa olsun, yazisi 'Sign up' ne varsa al getir, anlamina geliyor.
        //*[.='Sign up'] -> içerdiği yazı Sign up olan tüm webelementleri bulur.
        //*[(text()='Sign up')] -> üsttekinin aynısı
        //div[.='Sign up'] -> içerdiği yazı Sign up olan ve tagnamei "div" tüm webelementleri bulur.
        //*[contains(text(),'ign')]  -> içerisinde "ign" geçen tüm elementleri bulur. (örnek : Sign in ya da Sign out' u bulabilir.)

    }
}
