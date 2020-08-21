import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");

        //2.adim: Nesne olustur. Run yapinca driver acilir sayfa bos olur
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

//      //input[@type='email'] -> xpathimiz
        WebElement emailKutusu = driver.findElement(By.xpath("//input[@type='email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu = driver.findElement(By.xpath("//input[@type='password']"));
        sifreKutusu.sendKeys("Test1234!");

        WebElement signInButonu = driver.findElement(By.xpath("//input[@type='submit']"));
        signInButonu.click();

    }
}
