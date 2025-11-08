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
    WebElement emailAddressTextBox_id;

    @FindBy(id = "login-password")
    WebElement passwordTextBox_id;

    @FindBy(id = "login-submit")
    WebElement loginButton_id;

    @FindBy(id = "signup-toggle")
    WebElement signUpHereLink_id;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void verifyLoginPageIsDisplayed(){
       new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginpageTitle_id));
        loginpageTitle_id.isDisplayed();
        System.out.println(loginpageTitle_id.getText());
    }

    public void enterEmailAddress(String email){
        emailAddressTextBox_id.clear();
        emailAddressTextBox_id.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordTextBox_id.clear();
        passwordTextBox_id.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton_id.click();
    }

    public void clickSignUpLink() {
        signUpHereLink_id.click();
    }





}
