package Tests;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.annotation.Nonnull;
import java.util.concurrent.TimeUnit;

public class Web_Driver implements WebDriverProvider {
    public WebDriver driver;

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","/home/pavel/Documents/chromedriver");
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return driver;
    }
}
