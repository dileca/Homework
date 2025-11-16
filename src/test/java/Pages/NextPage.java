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


    public static Double warrantyFee;
    public static Double shippingFee;
    public static Double totalValueAmount;
    public static Double subtotalValue;

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

    @FindBy(id = "inventory-back-btn")
    WebElement backButton_id;

    @FindBy(id = "breakdown-subtotal-value")
    WebElement subTotalNextScreen_id;


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
        System.out.println("Unit Price " + unitPrice);
        System.out.println("Discount " + discount);
        Double expectedTotalPrice = unitPrice - discount;
        System.out.println(expectedTotalPrice);

        String stringTotalValue = (totalValue_id.getText());
        String stringTotalValueWithoutR = stringTotalValue.replace("R", "");
        Double actualTotalPrice = Double.parseDouble(stringTotalValueWithoutR);
        System.out.println("Actual Total Price " + actualTotalPrice);

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
        System.out.println("The Shipping Fee applied is " + shippingValue_id.getText());
    }

    public void verifyWarrantyChargeInPricingBreakdown() {
        warrantyValue_id.getText();
        System.out.println("The Warranty Fee applied is " + warrantyValue_id.getText());
    }

    public void verifyDiscountAppliedMessage() {
        discountAppliedMessage_id.getText();
        System.out.println("The Discount applied is " + discountAppliedMessage_id.getText());
    }

    public void clearDiscountCodeTextBox() {
        discountCodeTextBox_id.clear();
    }

    public void clickBackButton() {
        backButton_id.click();
    }

    public void verifyWarrantyFeeIsApplied() {
        String stringSubtotalNextScreen = subTotalNextScreen_id.getText();
    //    System.out.println(stringSubtotalNextScreen);
        String stringSubtotalValueWithoutR = stringSubtotalNextScreen.replace("R", "");
        subtotalValue = Double.parseDouble(stringSubtotalValueWithoutR);
    //    System.out.println(subtotalValue);

        String stringWarrantyFee = warrantyValue_id.getText();
    //    System.out.println(stringWarrantyFee);
        String stringWarrantyFeeWithoutR = stringWarrantyFee.replace("R", "");
        warrantyFee = Double.parseDouble(stringWarrantyFeeWithoutR);
   //     System.out.println(stringWarrantyFeeWithoutR);

        String stringTotalValueAmount = totalValue_id.getText();
    //    System.out.println(stringTotalValueAmount);
        String stringTotalValueAmountWithoutR = stringTotalValueAmount.replace("R", "");
        totalValueAmount = Double.parseDouble(stringTotalValueAmountWithoutR);
    //    System.out.println(stringTotalValueAmountWithoutR);

        totalValueAmount = subtotalValue + warrantyFee;
        System.out.println("SubTotal Value R " + subtotalValue + " + Warranty Fee R " + warrantyFee + " = Final Total R " + totalValueAmount);
    }


}
