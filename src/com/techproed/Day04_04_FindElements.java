package com.techproed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class Day04_04_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kemalgurler/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit .MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // a tagname sahip tum webElementleri bulalim.Bunun icin List Array olusturmamiz lazim.
        // Calisilacak konular : if else, for -foreeach -methodlar- nesneolusturma- arrays
        List<WebElement> listem = driver.findElements(By.tagName("a"));
        for (WebElement w: listem){// aynisi=> for(int i=0; i < listem.size(); I++)
            System.out.println(w.getText());// Home, Sign in
        }

    }
}
