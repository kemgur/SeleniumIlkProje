import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Day04_LocatorsGiris {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver" , "C:\\Users\\isimsiz\\selenium dependencies\\selenium\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();// nesne olusturmak

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://a.testaddressbook.com/");
            WebElement signInLink = driver.findElement(By.id("sign-in"));
            signInLink.click();
            WebElement emailKutusu = driver.findElement(By.className("form-control"));
            emailKutusu.sendKeys("testtechproed@gmail.com");
            WebElement sifreKutusu = driver.findElement(By.id("session_password"));
            sifreKutusu.sendKeys("Test1234!");
            WebElement signInButonu = driver.findElement(By.name("commit"));
            signInButonu.click();
        }
    }
