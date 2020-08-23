package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_05_TitleUrlTest {

    // youtube.com'a gidelim
    // title, video kelimesini iceriyor mu?
    //driver'i kapatalim
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://youtube.com");

        String titleYoutube = driver.getTitle();
      if(titleYoutube.contains("video")){
          System.out.println("Contain the word video");
      }else{
          System.out.println("Don't contain the word video");
      } driver.close();




    }
}
