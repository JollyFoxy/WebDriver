package Tests;

import Iinterfases.IAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainTest implements IAll {
    WebDriver driver;
    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver","/home/pavel/Documents/chromedriver");
        option.setHeadless(true);
        driver=new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }
    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
