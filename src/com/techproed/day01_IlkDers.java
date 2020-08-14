package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_IlkDers {

    public static void main(String[] args) {
        // java projemize chromedriver' i tanittik.
        System.setProperty("webdriver.chrome.driver","/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");

        //selenium ile ilgili ilk kodumuz.
        //webDriver nesnesi olusturarak,
        //chrome driver kullanabilir hale geldik.
        WebDriver webDriver = new ChromeDriver();

        //
        webDriver.get("https://google.com");

        //Driverimizdeki acik olan pencereyi kapatir
        //webDriver.close();

        //deriverimizi tum pencereleri kapatir.
        //webDriver.quit();



    }
}
