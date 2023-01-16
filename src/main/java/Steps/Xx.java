package Steps;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Xx {

    @BeforeClass
    static void setUp(){
        System.setProperty("webdriver.chrome.driver",ConfProperties.getProperties("chrome driver"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperties("loginpage"));
    }
}