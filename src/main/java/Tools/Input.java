package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input {
    WebElement input;
    public Input(WebDriver driver, String id) {
        input = driver.findElement(By.id(id));
    }
    public void setValueInput(String value){
        input.sendKeys(value);
    }
}