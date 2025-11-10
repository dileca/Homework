package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage {

    WebDriver driver;

    @FindBy(id = "nav-btn-practice")
    WebElement learningMaterialButton_id;

    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLearningMaterialsTab() {
        learningMaterialButton_id.click();
    }


}
