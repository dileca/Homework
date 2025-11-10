package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WebAutomationAdvancePage {

    WebDriver driver;

    public static Double unitPrice;

    @FindBy(id = "inventory-title")
    WebElement inventoryHeader_id;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropDown_id;

    @FindBy(id = "brand")
    WebElement brandDropDown_id;

    @FindBy(id = "storage-64GB")
    WebElement smallStorage_id;

    @FindBy(id = "storage-128GB")
    WebElement mediumStorage_id;

    @FindBy(id = "storage-256GB")
    WebElement largeStorage_id;

    @FindBy(id = "color")
    WebElement colorDropDown_id;

    @FindBy(id = "quantity")
    WebElement quantityTextBox_id;

    @FindBy(id = "address")
    WebElement deliveryAddressTextBox_id;

    @FindBy(id = "inventory-next-btn")
    WebElement nextButton_id;

    @FindBy(id = "purchase-success-toast")
    WebElement orderSuccessfulToast_id;

    @FindBy(id = "unit-price-value")
    WebElement unitPriceValue_id;

    @FindBy(id = "quantity-label")
    WebElement qty_id;

    @FindBy(id = "subtotal-value")
    WebElement subtotal_id;

    @FindBy(id = "cart-title")
    WebElement cartQuantity_id;


    public WebAutomationAdvancePage(WebDriver driver) {
        this.driver = driver;
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

    public void select64GBStorage() {
        smallStorage_id.click();
    }

    public void select128GBStorage() {
        mediumStorage_id.click();
    }

    public void select256GBStorage() {
        largeStorage_id.click();
    }

    public void selectColor(String color) {
        colorDropDown_id.sendKeys(color);
    }

    public void selectQuantity(String qty) {
        quantityTextBox_id.clear();
        quantityTextBox_id.sendKeys(qty);
    }

    public void enterAddress(String address) {
        deliveryAddressTextBox_id.sendKeys(address);
    }

    public void verifyUnitPrice() {
        String stringUnitPrice = unitPriceValue_id.getText();
        System.out.println(stringUnitPrice);
    }

    public void verifySubTotal() {
        String stringSubtotal = subtotal_id.getText();
        System.out.println(stringSubtotal);
    }

    public void clickNext() {
        String stringUnitPrice = unitPriceValue_id.getText();
        System.out.println(stringUnitPrice);

        String stringUnitPriceWithoutR = stringUnitPrice.replace("R", "");
        System.out.println(stringUnitPriceWithoutR);

        unitPrice = Double.parseDouble(stringUnitPriceWithoutR);
        System.out.println(unitPrice);

        nextButton_id.click();
    }

    public void verifySuccessfulOrderToastDisplayed() {
        orderSuccessfulToast_id.isDisplayed();
    }

    public void verifyCartQuantity() {
        String stringCartQuantity = cartQuantity_id.getText();
        System.out.println(stringCartQuantity);
    }


}
