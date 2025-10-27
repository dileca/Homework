package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LearningMaterialPage {

    WebDriver driver;

    @FindBy(id = "practice-heading")
    WebElement welcomeHeader_id;

    @FindBy(id = "tab-btn-web")
    WebElement webAutomationAdvanceTab_id;

    public LearningMaterialPage(WebDriver driver) {
        this.driver=driver;
    }

    public void verifyLearningMaterialPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(welcomeHeader_id)); // used whenever there's a refresh
        welcomeHeader_id.isDisplayed();
    }

     public void clickWebAutomationAdvanceTab() {
         webAutomationAdvanceTab_id.click();

    }








}
