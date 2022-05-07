package demoq.test.practiceform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import static java.awt.SystemColor.control;

public class FormsTest {

    @Test
    void testRegistrationPositiveForm() throws InterruptedException {

        final String FIRST_NAME = "Peter";

        System.setProperty("webdriver.chrome.driver", "C:/Users/Егор/Desktop/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        Actions actionProvider;
        WebElement searchBtn = driver.findElement(By.ByXPath(//*[@id="genterWrapper"]/div[2]/div[1]/label));
        Actions.actionProvider = new Actions(driver)));
        // Perform context-click action on the element
        actionProvider.contextClick(searchBtn).build().perform();



        Thread.sleep(5000);




        driver.quit();

    }




}
