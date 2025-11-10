package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Pages.WebAutomationAdvancePage.unitPrice;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class NextPage {

    WebDriver driver;

    @FindBy(id = "review-section-title")
    WebElement reviewTitle_id;

    @FindBy(id = "shipping-option-standard")
    WebElement standardShippingOption_id;

    @FindBy(id = "shipping-option-express")
    WebElement expressShippingOption_id;

    @FindBy(id = "warranty-option-none")
    WebElement noWarrantyOption_id;

    @FindBy(id = "warranty-option-1yr")
    WebElement oneYearWarrantyOption_id;

    @FindBy(id = "warranty-option-2yr")
    WebElement twoYearWarrantyOption_id;

    @FindBy(id = "discount-code")
    WebElement discountCodeTextBox_id;

    @FindBy(id = "apply-discount-btn")
    WebElement discountApplyButton_id;

    @FindBy(id = "add-to-cart-btn")
    WebElement addToCartButton_id;

    @FindBy(id = "purchase-device-btn")
    WebElement confirmPurchaseButton_id;

    @FindBy(id = "breakdown-total-value")
    WebElement totalValue_id;

    @FindBy(id = "breakdown-shipping-value")
    WebElement shippingValue_id;

    @FindBy(id = "breakdown-warranty-value")
    WebElement warrantyValue_id;

    @FindBy(id = "discount-feedback")
    WebElement discountAppliedMessage_id;


    public NextPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyNextPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(reviewTitle_id)); // used whenever there's a refresh
        reviewTitle_id.isDisplayed();
    }

    public void selectStandardShippingMethod() {
        standardShippingOption_id.click();
    }

    public void selectExpressShippingMethod() {
        expressShippingOption_id.click();
    }

    public void selectNoWarrantyOption() {
        noWarrantyOption_id.click();
    }

    public void select1YearWarrantyOption() {
        oneYearWarrantyOption_id.click();
    }

    public void select2YearWarrantyOption() {
        twoYearWarrantyOption_id.click();
    }

    public void enterDiscountCode(String discountCode) {
        discountCodeTextBox_id.clear();
        discountCodeTextBox_id.sendKeys(discountCode);
    }

    public void clickApplyDiscountButton() {
        discountApplyButton_id.click();
    }

    public void verifyDiscountApplied() {
        Double discount = unitPrice * 0.1;
        System.out.println(discount);
        Double expectedTotalPrice = unitPrice - discount;
        System.out.println(expectedTotalPrice);

        String stringTotalValue = (totalValue_id.getText());
        String stringTotalValueWithoutR = stringTotalValue.replace("R", "");
        Double actualTotalPrice = Double.parseDouble(stringTotalValueWithoutR);
        System.out.println(actualTotalPrice);

        Assert.assertEquals(expectedTotalPrice, actualTotalPrice);
    }

    public void clickAddToCartButton() {
        addToCartButton_id.click();
    }

    public void clickConfirmPurchaseButton() {
        confirmPurchaseButton_id.click();
    }

    public void verifyShippingChargeInPricingBreakdown() {
        shippingValue_id.getText();
        System.out.println(shippingValue_id.getText());
    }

    public void verifyWarrantyChargeInPricingBreakdown() {
        warrantyValue_id.getText();
        System.out.println(warrantyValue_id.getText());
    }

    public void verifyDiscountAppliedMessage() {
        discountAppliedMessage_id.getText();
        System.out.println(discountAppliedMessage_id.getText());
    }

    public void clearDiscountCodeTextBox() {
        discountCodeTextBox_id.clear();
    }


}
