package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WebAutomationAdvancePage {

    WebDriver driver;

    @FindBy(id = "inventory-title")
    WebElement inventoryHeader_id;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropDown_id;

    @FindBy(id = "brand")
    WebElement brandDropDown_id;

    @FindBy(id = "storage-256GB")
    WebElement storageRadioButton_id;

    @FindBy(id = "color")
    WebElement colorDropDown_id;

    @FindBy(id = "quantity")
    WebElement quantityTextBox_id;

    @FindBy(id = "address")
    WebElement deliveryAddressTextBox_id;

    @FindBy(id = "inventory-next-btn")
    WebElement nextButton_id;


    public WebAutomationAdvancePage(WebDriver driver) {
        this.driver=driver;
    }

    public void verifyWebAutomationAdvancePageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(inventoryHeader_id)); // used whenever there's a refresh
        inventoryHeader_id.isDisplayed();
    }

    public void selectDeviceType(String deviceType) {
     deviceTypeDropDown_id.sendKeys(deviceType);
    }

    public void selectBrand(String deviceBrand) {
        brandDropDown_id.sendKeys(deviceBrand);
    }

    public void selectStorage() {
        storageRadioButton_id.click();
    }

    public void selectColor() {
        colorDropDown_id.sendKeys("gold");
    }

    public void selectQuantity() {
        quantityTextBox_id.click();
    }

    public void enterAddress() {
        deliveryAddressTextBox_id.sendKeys("123 Test Street");
    }

    public void clickNext() {
        nextButton_id.click();
    }
}
