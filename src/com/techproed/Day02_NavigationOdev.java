package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {

    // 1 - ilk önce google.com'a gidiniz.
    // 2 - oradan youtube.com'a gidiniz.
    // 3 - google.com'a back methodu ile geri dönünüz.
    // 4 - youtube.com'a geri giniz.(forward methodu ile)
    // 5 - youtube.com'u yenileyiniz (refresh methodu ile)
    // 6= driver'i kapatin.


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        //1
        webDriver.get("https://google.com");
        //2
        webDriver.get("https://youtube.com");
        //3
        webDriver.navigate().back();
        //4
        webDriver.navigate().forward();
        //5
        webDriver.navigate().refresh();
        //6
        webDriver.close();

    }
}