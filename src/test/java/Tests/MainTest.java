package Tests;


import Steps.PageButtons;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainTest {
    WebDriver driver;
    PageButtons pageButtons;
    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver","/home/pavel/Documents/chromedriver");
        driver = new ChromeDriver();
        pageButtons=new PageButtons(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }
    @AfterEach
    public void teardown() {
        driver.close();
    }
}
