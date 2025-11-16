package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WebAutomationAdvancePage {

    WebDriver driver;

    public static Double unitPrice;
    public static Double quantity;
    public static Double subTotalValue;

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
    WebElement qtyLabel_id;

    @FindBy(id = "subtotal-value")
    WebElement subtotalValue_id;

    @FindBy(id = "cart-title")
    WebElement cartQuantity_id;

    @FindBy(xpath = "//*[starts-with(@id, 'cart-item-discount')]")
    WebElement cartItemDiscount_id;

    @FindBy(xpath = "(//button[@aria-label='Remove item'])[1]")
    WebElement cartRemoveButton_id;

    @FindBy(id = "cart-grand-total")
    WebElement grandTotal_id;

    @FindBy(id = "review-cart-btn")
    WebElement reviewCartOrderButton_id;

    @FindBy(id = "confirm-cart-btn")
    WebElement placeOrderButton_id;

    @FindBy(id = "cancel-cart-btn")
    WebElement cancelButton_id;

    @FindBy(id = "cart-confirm-panel")
    WebElement infoPanel_id;

    @FindBy(xpath = "css=p:nth-child(2)")
    WebElement successMessage_id;



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

    public void verifyUnitPriceIsZero() {
        String stringUnitPrice = unitPriceValue_id.getText();
        System.out.println(stringUnitPrice);
    }

    public void verifySubTotalIsZero() {
        String stringSubtotal = subtotalValue_id.getText();
        System.out.println(stringSubtotal);
    }

    public void verifySubTotalAmount() {
        String stringUnitPrice = unitPriceValue_id.getText();
    //    System.out.println(stringUnitPrice);

        String stringUnitPriceWithoutR = stringUnitPrice.replace("R", "");
    //    System.out.println(stringUnitPriceWithoutR);

        String stringQuantity = qtyLabel_id.getText();
        String stringQuantityWithoutQty = stringQuantity.replace("Qty: ", "");
        quantity = Double.parseDouble(stringQuantityWithoutQty);
    //    System.out.println("Quantity " +quantity);

        unitPrice = Double.parseDouble(stringUnitPriceWithoutR);
        subTotalValue = unitPrice * quantity;

        String stringExpectedTotalValue = subtotalValue_id.getText();
        String stringExpectedTotalValueWithoutR = stringExpectedTotalValue.replace("R", "");
        Double expectedTotalValue = Double.parseDouble(stringExpectedTotalValueWithoutR);
        Assert.assertEquals(expectedTotalValue,subTotalValue);
        System.out.println("Unit Price R " +unitPrice+ " x Quantity Amount of " +quantity+ " = Subtotal Amount R " +subTotalValue);
    }

    public void clickNext() {
        nextButton_id.click();
    }

    public void verifySuccessfulOrderToastDisplayed() {
        orderSuccessfulToast_id.isDisplayed();
        //System.out.println(successMessage_id.getText());
    }

    public void verifyCartQuantity() {
        String stringCartQuantity = cartQuantity_id.getText();
        System.out.println(stringCartQuantity);
    }

    public void verifyDiscountMessageDisplaysInCart() {
        cartItemDiscount_id.getText();
        System.out.println("The Discount message displayed in the Cart is " + cartItemDiscount_id.getText());
    }

    public void removeItemFromCart() {
        cartRemoveButton_id.click();
    }

    public void clearQuantity() {
        quantityTextBox_id.clear();
    }

    public void verifyGrandTotal() {
        grandTotal_id.getText();
        System.out.println(grandTotal_id.getText());
    }

    public void clickReviewCartOrderButton() {
        reviewCartOrderButton_id.click();
    }

    public void verifyPlaceOrderButtonDisplays() {
        placeOrderButton_id.isDisplayed();
        System.out.println(placeOrderButton_id.getText() + " button displays");
    }

    public void verifyCancelButtonIsDisplayed() {
        cancelButton_id.isDisplayed();
        System.out.println(cancelButton_id.getText() + " button displays");
    }

    public void verifyInfoPanelDisplayed() {
        infoPanel_id.isDisplayed();
        System.out.println(infoPanel_id.getText());
    }

    public void clickCancelButton() {
        cancelButton_id.click();
    }

    public void verifyReviewCartOrderButtonIsDisplayed() {
        reviewCartOrderButton_id.isDisplayed();
        System.out.println(reviewCartOrderButton_id.getText() + " button displays");
    }

    public void clickPlaceOrderButton() {
        placeOrderButton_id.click();

    }






}
