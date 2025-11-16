package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ExtrasAndPricingTests extends Base {

    @Test(priority = 1)
    public void toggleBetweenDifferentShippingMethods() throws InterruptedException {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.verifyLoginPageIsDisplayed();
        loginPage.enterEmailAddress("diana@test.co.za");
        loginPage.enterPassword("tester123");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
        learningMaterialPage.clickWebAutomationAdvanceTab();
        webAutomationAdvancePage.verifyWebAutomationAdvancePageIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Phone");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.select256GBStorage();
        webAutomationAdvancePage.selectColor("White");
        webAutomationAdvancePage.selectQuantity("1");
        webAutomationAdvancePage.enterAddress("123 Street Road");
        webAutomationAdvancePage.verifySubTotalAmount();
        webAutomationAdvancePage.clickNext();
        nextPage.selectStandardShippingMethod();
        nextPage.verifyShippingChargeInPricingBreakdown();
        nextPage.selectExpressShippingMethod();
        nextPage.verifyShippingChargeInPricingBreakdown();
    }

    @Test(priority = 2)
    public void toggleBetweenDifferentWarrantyOptions() throws InterruptedException {
//        homePage.verifyHomePageIsDisplayed();
//        homePage.clickLearningMaterialButton();
//        loginPage.verifyLoginPageIsDisplayed();
//        loginPage.enterEmailAddress("diana@test.co.za");
//        loginPage.enterPassword("tester123");
//        loginPage.clickLoginButton();
//        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
//        learningMaterialPage.clickWebAutomationAdvanceTab();
//        webAutomationAdvancePage.verifyWebAutomationAdvancePageIsDisplayed();
//        webAutomationAdvancePage.selectDeviceType("Phone");
//        webAutomationAdvancePage.selectBrand("Apple");
//        webAutomationAdvancePage.select256GBStorage();
//        webAutomationAdvancePage.selectColor("White");
//        webAutomationAdvancePage.selectQuantity("1");
//        webAutomationAdvancePage.enterAddress("123 Street Road");
//        webAutomationAdvancePage.clickNext();
        nextPage.selectStandardShippingMethod();
        nextPage.selectNoWarrantyOption();
        nextPage.verifyWarrantyChargeInPricingBreakdown();
        nextPage.select1YearWarrantyOption();
        nextPage.verifyWarrantyChargeInPricingBreakdown();
        nextPage.select2YearWarrantyOption();
        nextPage.verifyWarrantyChargeInPricingBreakdown();
        Thread.sleep(2000);
        nextPage.clickBackButton();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void formulaCheck() throws InterruptedException {
//        homePage.verifyHomePageIsDisplayed();
//        homePage.clickLearningMaterialButton();
//        loginPage.verifyLoginPageIsDisplayed();
//        loginPage.enterEmailAddress("diana@test.co.za");
//        loginPage.enterPassword("tester123");
//        loginPage.clickLoginButton();
//        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
//        learningMaterialPage.clickWebAutomationAdvanceTab();
//        webAutomationAdvancePage.verifyWebAutomationAdvancePageIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Phone");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.select128GBStorage();
        webAutomationAdvancePage.selectColor("White");
        webAutomationAdvancePage.selectQuantity("2");
        webAutomationAdvancePage.enterAddress("123 Street Road");
        webAutomationAdvancePage.verifySubTotalAmount();
        webAutomationAdvancePage.clickNext();
        nextPage.selectExpressShippingMethod();
        nextPage.select1YearWarrantyOption();
        nextPage.enterDiscountCode("SAVE10");
        nextPage.clickApplyDiscountButton();
        Thread.sleep(4000);
        nextPage.verifyAllFeesAndDiscountApplied();
        nextPage.clickConfirmPurchaseButton();
        Thread.sleep(4000);
        webAutomationAdvancePage.verifySuccessfulOrderToastDisplayed();


    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}
