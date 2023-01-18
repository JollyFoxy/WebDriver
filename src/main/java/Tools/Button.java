package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Button {

    private final WebElement button;
    Actions actions;
    JavascriptExecutor js;

    public Button(WebDriver driver, String id){
        button = driver.findElement(By.id(id));
        actions = new Actions(driver);
        js=(JavascriptExecutor)driver;
    }


    public void clickBtn(){
        button.click();
    }
    public void doubleClickBtn(){
        actions.doubleClick(button).build().perform();
    }
    public void rightClickBtn(){
        actions.contextClick(button).build().perform();
    }
    public void jsClickBtn(){
        js.executeScript("arguments[0].click();", button);
    }
}
