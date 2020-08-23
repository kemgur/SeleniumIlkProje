package com.techproed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day02_02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        // google.com'a gittik
        webDriver.get("http://google.com");
        webDriver.navigate().to("http://amazon.com");

        String sayfaTitle = webDriver.getTitle();// Sayfanin basligini alabilir

        String sayfaUrl   = webDriver.getCurrentUrl();// Sayfanin adresini alir.


        System.out.println(sayfaTitle);//Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
        System.out.println(sayfaUrl);//https://www.amazon.com/

        webDriver.quit();
    }
}
