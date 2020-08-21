import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsTagName {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\isimsiz\\selenium dependencies\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");
        // id, name, className, linkName, par

        WebElement homeLinki = driver.findElement(By.tagName("A"));//Home
     System.out.println(homeLinki.getText());





    }
}
