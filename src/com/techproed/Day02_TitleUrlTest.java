package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

    //1-youtube.com'a gidelim
    //2= title (sayfa basligi) video kelimesini iceriyor mu?
    //3-Driver'i kapatalim

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/admin/Documents/selenium libraries/drivers/chromedriver");
​
        WebDriver driver = new ChromeDriver();
​
        driver.get("http://youtube.com");
        String title = driver.getTitle();
        if (title.contains("video")) {
            System.out.println("Video kelimesini iceriyor");
        }else{
            System.out.println("Video kelimesini icermiyor");
        }
​
        driver.quit();

    }
}
