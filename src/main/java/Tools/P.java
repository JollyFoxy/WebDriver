package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P {
    private final WebElement p;
    public P(WebDriver driver, String id){
        p=driver.findElement(By.id(id));
    }
    public boolean checkValueP (String value){
        return p.getText().contains(value);
    }
}
