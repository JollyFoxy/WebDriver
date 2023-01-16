package Steps;

import Tools.Button;
import io.qameta.allure.Step;
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

    @Step("Переход на страницу\"Buttons\"")
    public void transition(){
        WebElement element= driver.findElement(By.cssSelector("div.category-cards > div:nth-child(1) > div:nth-child(1)"));
        element.click();
        WebElement elementButtons = driver.findElement(By.cssSelector("#item-4"));
        elementButtons.click();
    }
    @Step("Одинарый клик")
    public void oneClick(){
        WebElement oneClickBtn = driver.findElement(By.cssSelector("div[class$='col-md-6']> div:nth-child(2) > div:nth-child(3)> button"));
        oneClickBtn.click();
        WebElement dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage"));
        dynamicClickMessage.getText().contains("You have done a dynamic click");

    }
    @Step("Двойной клик")
    public void doubleClick(){
        Button doubleClickBtn =new Button(driver,"doubleClickBtn");
        doubleClickBtn.doubleClickBtn();
        WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
        doubleClickMessage.getText().contains("You have done a double click");
    }
    @Step("Клик правой кнопкой")
    public void rightClick(){
        Button rightClickBtn= new Button(driver,"rightClickBtn");
        rightClickBtn.rightClickBtn();
        WebElement rightClickMessage =driver.findElement(By.id("rightClickMessage"));
        rightClickMessage.getText().contains("You have done a right click");
    }
}
