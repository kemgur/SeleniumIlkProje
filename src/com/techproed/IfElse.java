package com.techproed;
​
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
​
public class Day_02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mesanlialp/Documents/Selenium libaries/drivers/chromedriver");
        WebDriver webDriver = new ChromeDriver();
​
        webDriver.manage().window().maximize();
        webDriver.get("https://www.amazon.com/ref=nav_logo");
​
        String sayfaBasligi = webDriver.getTitle();
​
        if (sayfaBasligi.toLowerCase().contains("book")){
            System.out.println("Book kelimesi geciyor" );
        }else{
            System.out.println("Book kelimesi gecmiyor");
        }
        webDriver.quit();
    }
}