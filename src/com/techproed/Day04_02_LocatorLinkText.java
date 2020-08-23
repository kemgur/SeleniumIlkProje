package com.techproed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day04_02_LocatorLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();// nesne olusturmak

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

        //WebElement homeLinki = driver.findElement(By.linkText("Home"));
        //homeLinki.click();// Hata verdi.

        WebElement homeLinki = driver.findElement(By.partialLinkText("Hom"));
        homeLinki.click();
//        WebElement homeLinki = driver.findElement(By.partialLinkText("H"));
//        homeLinki.click();
    }
}
