package Steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageButtons {
    WebDriver driver;
    Actions actions;
    public PageButtons(WebDriver driver){
        this.driver=driver;
        actions = new Actions(driver);
    }

    @Step
    public void transition(){
        WebElement element= driver.findElement(By.cssSelector("div.category-cards > div:nth-child(1) > div:nth-child(1)"));
        element.click();
        WebElement elementButtons = driver.findElement(By.cssSelector("#item-4"));
        elementButtons.click();
    }
    @Step
    public void oneClick(){
        WebElement oneClickBtn = driver.findElement(By.cssSelector("div[class$='col-md-6']> div:nth-child(2) > div:nth-child(3)> button"));
        oneClickBtn.click();
        WebElement dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage"));
        Assertions.assertEquals("You have done a dynamic click",dynamicClickMessage.getText());
    }
    @Step
    public void doubleClick(){
        WebElement doubleClickBtn=driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickBtn).build().perform();
        WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
        Assertions.assertEquals("You have done a double click",doubleClickMessage.getText());
    }
    @Step
    public void rightClick(){
        WebElement rightClickBtn= driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).build().perform();
        WebElement rightClickMessage =driver.findElement(By.id("rightClickMessage"));
        Assertions.assertEquals("You have done a right click",rightClickMessage.getText());
    }
}
