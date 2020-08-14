package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        webDriver.navigate().to("http://amazon.com");

        String sayfaTitle = webDriver.getTitle();
        String sayfaUrl   = webDriver.getCurrentUrl();

        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);



    }

}