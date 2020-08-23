package com.techproed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_05_GoogleTest {
    //Class Work: Google Search Test
    //1. Bir class olusturun.
    //2. Main method olusturun ve asagidaki gorevleri tamamlayin
    // a. Google web sayfasina gidin.
    // b. Seatch(ara) "city bike"
    // c. Google'da goruntulenen ilgili sonuclarin sayisini yazdirin
    // d. "Shopping"e tiklayin.
    // e. Sonra karsiniza cikan ilk sonucun resmini tiklayin.
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        driver.get("http://google.com");
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("city bike");

        WebElement aramaButonu = driver.findElement(By.name("btnK"));
        aramaButonu.click();//aramaButonu.submit(); => Ayni anlama geliyor.

        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());

        WebElement shoppingLinki = driver.findElement(By.partialLinkText("Shopping"));
        shoppingLinki.click();

        WebElement ilkResim = driver.findElement(By.id("gsr"));
        ilkResim.click();

      driver.quit();
    }
}
