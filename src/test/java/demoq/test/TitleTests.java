package demoq.test;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class TitleTests {

    @Test(testName = "The title is exist")
    public void isExist() throws InterruptedException {
        String nameTitleExpected = "ToolsQA";

        System.setProperty("webdriver.chrome.driver", "C:/Users/Егор/Desktop/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        Dimension targetSize = new Dimension(1024, 768);
        driver.manage().window().setSize(targetSize);
        Thread.sleep(5000);
        String nameTitleActual = driver.getTitle();

        Assertions.assertThat(nameTitleActual).isEqualTo(nameTitleExpected);


        driver.quit();
    }

}
