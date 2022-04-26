package demoq.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TitleTests {

    @Test
    public void isExist() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");

        Thread.sleep(5000);

        driver.quit();
    }

}
