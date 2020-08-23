package com.techproed;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day06_01_Facebook {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");

        //2.adim: Nesne olustur. Run yapinca driver acilir sayfa bos olur
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
//1. Adım (4 dk)
// email kutusuna techproed@gmail.com yazdıralım.
// <input type="text" class="inputtext _55r1 _6luy" name="email" id="email"
// data-testid="royal_email" placeholder="Email address or phone number"
// autofocus="1" aria-label="Email address or phone number">
        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

// 2. Adım (3 dk)
// şifre kutusuna Test1234 yazdıralım.
//<input type="password" class="inputtext _55r1 _6luy" name="pass" id="pass"
// data-testid="royal_pass" placeholder="Password" aria-label="Password">
        WebElement sifreKutusu = driver.findElement(By.xpath("//*[@type='password']"));
        sifreKutusu.sendKeys("Test1234");
//sifreKutusu.submit();
// 3. Adım (2 dk)
// login butonunu bulalım
// <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"
// name="login" data-testid="royal_login_button" type="submit" id="u_0_b">Log In</button>

        WebElement loginButonu = driver.findElement(By.cssSelector("#u_0_b"));
        loginButonu.click();

        //Burada java 3000 milisaniye(3 saniye) bekleyecek
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String logUrl = driver.getCurrentUrl();
        if (logUrl.equals("https://tr-tr.facebook.com/login/")) {
            System.out.println("Basarili");
        } else {
            System.out.println("Basarisiz");
        }


    }
}
