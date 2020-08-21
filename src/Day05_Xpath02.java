import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath02 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");

        //2.adim: Nesne olustur. Run yapinca driver acilir sayfa bos olur
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        //WebElement welcome = driver.findElement(By.tagName("h1"));



// xpath kullanımında, attribute kullanmaya gerek duymazsanız,
// sadece tagName yazılarakta webelement bulunabilir.
       // WebElement welcomeYazisi = driver.findElement(By.xpath("//h1"));
       // System.out.println(welcomeYazisi.getText());






    }
}
