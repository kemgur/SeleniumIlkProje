package com.techproed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_03_LocatorsTagName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();// nesne olusturmak

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");
        // id, name, className, linkName, par

        WebElement homeLinki = driver.findElement(By.tagName("a"));//Home
        System.out.println(homeLinki.getText());//Home=> Dogru elemani bulup bulmadigimizi check edebiliriz.





    }
}
