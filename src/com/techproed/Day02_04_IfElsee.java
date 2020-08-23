package com.techproed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day02_04_IfElsee {
    public static void main(String[] args) {
        // Java projemize, chromedriver'ı tanıttık.
        System.setProperty("webdriver.chrome.driver" , "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        // ilk önce sayfanın başlığını alalım.
        String sayfaBasligi = driver.getTitle();// car
        if( sayfaBasligi.contains("Car") ){
            System.out.println("Contain the word car. ");//Car kelimesini içeriyor.
        }else{
            System.out.println("Does not contain the word car.");//Car kelimesini içermiyor.
        }
        String amazonTitle = driver.getTitle();
        if(amazonTitle.contains("Books")){
            System.out.println("Contains the word books");
        }else{
            System.out.println("Do not contains the word books");
        }
        driver.quit();
    }
}
