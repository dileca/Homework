package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class RegistrationPage {

    WebDriver driver;

    @FindBy(id = "registration-heading")
    WebElement registrationHeader_id;

    @FindBy(id = "register-firstName")
    WebElement firstNameTextBox_id;

    @FindBy(id = "register-lastName")
    WebElement lastNameTextBox_id;

    @FindBy(id = "register-email")
    WebElement emailTextBox_id;

    @FindBy(id = "register-password")
    WebElement passwordTextBox_id;

    @FindBy(id = "register-confirmPassword")
    WebElement confirmPasswordTextBox_id;

    @FindBy(id = "register-submit")
    WebElement createAccountButton_id;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyRegistrationPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(registrationHeader_id)); // used whenever there's a refresh
        registrationHeader_id.isDisplayed();
        System.out.println(registrationHeader_id.getText());
    }

    public void enterFirstName(String firstName) {
        firstNameTextBox_id.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameTextBox_id.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailTextBox_id.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordTextBox_id.sendKeys(password);
    }

    public void confirmPassword(String password) {
        confirmPasswordTextBox_id.sendKeys(password);
    }

    public void clickCreateAccountButton() {
        createAccountButton_id.click();
    }

    public void confirmSuccessfulRegistrationPopUpDisplays() {
        //Wait for the Alert to be Present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
        //Switch to the Alert
        Alert alert2 = driver.switchTo().alert();
        //Retrieve the Alert Message
        String alertMessage = alert2.getText();
        //Validate the Message
        String expectedMessage = "Registration successful! You can now login with your credentials.";
        Assert.assertEquals(alertMessage, expectedMessage, "Alert message mismatch!");
        //Click OK
        alert2.accept();
    }

        public void confirmMismatchPasswordPopUpDisplays() {
        //Wait for the Alert to be Present
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert3 = wait2.until(ExpectedConditions.alertIsPresent());
        //Switch to the Alert
        Alert alert4 = driver.switchTo().alert();
        //Retrieve the Alert Message
        String alertMessage2 = alert3.getText();
        //Validate the Message
        String expectedMessage2 = "Passwords do not match!";
        Assert.assertEquals(alertMessage2, expectedMessage2, "Alert message mismatch!");
        //Click OK
        alert4.accept();
    }

    public void confirmEmailFormatPopUpDisplays() {
        //Wait for the Alert to be Present
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert5 = wait3.until(ExpectedConditions.alertIsPresent());
        //Switch to the Alert
        Alert alert6 = driver.switchTo().alert();
        //Retrieve the Alert Message
        String alertMessage3 = alert5.getText();
        //Validate the Message
        String expectedMessage3 = "Please enter a valid email address";
        Assert.assertEquals(alertMessage3, expectedMessage3, "Alert message mismatch!");
        //Click OK
        alert6.accept();
    }

    public void confirm8CharactersPopUpDisplays() {
        //Wait for the Alert to be Present
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert7 = wait4.until(ExpectedConditions.alertIsPresent());
        //Switch to the Alert
        Alert alert8 = driver.switchTo().alert();
        //Retrieve the Alert Message
        String alertMessage4 = alert7.getText();
        //Validate the Message
        String expectedMessage4 = "Password must be at least 8 characters long";
        Assert.assertEquals(alertMessage4, expectedMessage4, "Alert message mismatch!");
        //Click OK
        alert8.accept();
    }

}
