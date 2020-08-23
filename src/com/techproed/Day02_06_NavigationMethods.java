 package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_06_NavigationMethods {

    public static void main(String[] args) {
        // 1.adim: driver tanitmak
        System.setProperty("webdriver.chrome.driver","/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");

        //2.adim: Nesne olustur. Run yapinca driver acilir sayfa bos olur
        WebDriver webDriver = new ChromeDriver();

        //Sayfayi tam sayfa yapar.
        webDriver.manage().window().maximize();
        //
        webDriver.get("https://google.com");

        //get konutu ile ayni islemi yapar.
        webDriver.navigate().to("http://amazon.com");

        //Bu komut bir onceki sayfaya donebiliyoruz.
        webDriver.navigate().back();

        //bu komut bizi tekrar onceki sayfaya goturur.
        // ornek: google->amazon->google->amazon
        webDriver.navigate().forward();

        //Sayfayi yenilemeye yarar
        webDriver.navigate().refresh();







    }
}
