package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "login-heading")
    WebElement loginpageTitle_id;

    @FindBy(id = "login-email")
    WebElement emailAddressTextBox;

    @FindBy(id = "login-password")
    WebElement passwordTextBox;

    @FindBy(id = "login-submit")
    WebElement loginButton;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void verifyLoginPageIsDisplayed(){
        loginpageTitle_id.isDisplayed();
    }

    public void enterEmailAddress(){
        emailAddressTextBox.sendKeys("diana@test.co.za");
    }

    public void enterPassword() {
        passwordTextBox.sendKeys("tester123");
    }

    public void clickLoginButton() {
        loginButton.click();
    }



}
