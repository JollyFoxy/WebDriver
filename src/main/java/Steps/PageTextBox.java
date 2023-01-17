package Steps;

import Tools.Button;
import Tools.Input;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageTextBox {
    private final WebDriver driver;
    public PageTextBox(WebDriver driver){
        this.driver=driver;
    }
    @Step("Переход на страницу\"TextBox\"")
    public void transition(){
        WebElement element= driver.findElement(By.cssSelector("div.category-cards > div:nth-child(1) > div:nth-child(1)"));
        element.click();
        WebElement elementTextBox = driver.findElement(By.cssSelector("#item-0"));
        elementTextBox.click();
    }
    @Step("Ввод имени")
    public void inputFirstName(String name){
        Input userName =new Input(driver,"userName");
        userName.setValueInput(name);
    }
    @Step("Ввод почты")
    public void inputLastName(String eMail){
       Input userEmail= new Input(driver,"userEmail");
       userEmail.setValueInput(eMail);
    }
    @Step("Ввод аддреса")
    public void inputCurrentAddress(String address){
        Input currentAddress =new Input(driver,"currentAddress");
        currentAddress.setValueInput(address);
    }
    @Step("Ввод постоянного аддреса")
    public void inputPermanentAddress(String address){
        Input permanentAddress =new Input(driver,"permanentAddress");
        permanentAddress.setValueInput(address);
    }
    @Step
    public void clickSubmit(){
        Button submit =new Button(driver,"submit");
        submit.clickBtn();
    }
}
