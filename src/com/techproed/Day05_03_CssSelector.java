package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class  Day05_03_CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");

        //2.adim: Nesne olustur. Run yapinca driver acilir sayfa bos olur
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailKutusu = driver.findElement(new By.ByCssSelector(".form-control"));
        emailKutusu.sendKeys("testtecgproed@gmail.com");

        //cssSelector kullanirken class value kullaniyorsak => .value
        //                          id  value kullaniyorsak #value seklinde yazabiliriz.
        // “tagName[attribute name='value']”
        WebElement sifreKutusu = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        sifreKutusu.sendKeys("Test1234!");

//        Css selector xpath'e benzer. Üç ana tip kullanılır
//                <input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email"> ● css = “tagName[attribute name='value']”
//○ driver.findElement(By.cssSelector("input[name='session[email]']"));
//● css="tagName#id value" or just css="#id value"=>yalnızca id value ile çalışır.
//○ driver.findElement(By.cssSelector("input#session_email"));
//● css="tagName.class value" or just css=".class value"=>yalnızca class value ile çalışır
//○ driver.findElement(By.cssSelector("input.form-control"));

    }
}
