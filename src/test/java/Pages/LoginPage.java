package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

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
       new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginpageTitle_id));
        loginpageTitle_id.isDisplayed();
    }

    public void enterEmailAddress(String email){
        emailAddressTextBox.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordTextBox.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }



}
