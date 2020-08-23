package com.techproed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day02_01_NavigationOdev {
    // 1 - ilk önce google.com'a gidiniz.
    // 2 - oradan youtube.com'a gidiniz.
    // 3 - google.com'a back methodu ile geri dönünüz.
    // 4 - youtube.com'a geri giniz.(forward methodu ile)
    // 5 - youtube.com'u yenileyiniz (refresh methodu ile)
    // 6 - driver'ı kapatın. (quit ile)
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" ,"/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();//Nesne olusturuldu.=> driver==browser
        driver.get("http://google.com");//driver'i google.com'a yonlendirdik.

        driver.navigate().to("http://youtube.com"); // get 'te kullanılabilir
        // navigate().to() methodu get() methodu ile ayni islemi yapar.

        driver.navigate().back();// Bir onceki sayfaya geri donmeye yarar.

        driver.navigate().forward();// geri geldigimiz sayfaya tekrar gitmemizi saglar.

        driver.navigate().refresh();// sayfayi yenilemeye yariyor.

        driver.quit();// Tum sayfalari kapatir.
    }
}