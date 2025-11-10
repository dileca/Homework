package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DiscountCodeTests extends Base {

    @Test
    public void verifySAVE10DiscountMessage() {
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
        webAutomationAdvancePage.clickNext();
        nextPage.selectStandardShippingMethod();
        nextPage.selectNoWarrantyOption();
        nextPage.enterDiscountCode("SAVE10");
        nextPage.clickApplyDiscountButton();
        nextPage.verifyDiscountAppliedMessage();
    }

    @Test
    public void messageUpdatesWhenEnteringSAVE20AfterSAVE10() {
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
        webAutomationAdvancePage.clickNext();
        nextPage.selectStandardShippingMethod();
        nextPage.selectNoWarrantyOption();
        nextPage.enterDiscountCode("SAVE10");
        nextPage.clickApplyDiscountButton();
        nextPage.verifyDiscountAppliedMessage();
        nextPage.enterDiscountCode("SAVE20");
        nextPage.clickApplyDiscountButton();
        nextPage.verifyDiscountAppliedMessage();
    }

    @Test
    public void invalidCode() {
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
        webAutomationAdvancePage.clickNext();
        nextPage.selectStandardShippingMethod();
        nextPage.selectNoWarrantyOption();
        nextPage.enterDiscountCode("SAVE 30");
        nextPage.clickApplyDiscountButton();
        nextPage.verifyDiscountAppliedMessage();
    }

    @Test
    public void removeDiscount() throws InterruptedException {
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
        webAutomationAdvancePage.clickNext();
        nextPage.selectStandardShippingMethod();
        nextPage.selectNoWarrantyOption();
        nextPage.enterDiscountCode("SAVE10");
        nextPage.clickApplyDiscountButton();
        nextPage.verifyDiscountAppliedMessage();
        nextPage.clearDiscountCodeTextBox();
        Thread.sleep(2000);
        nextPage.clickApplyDiscountButton();
        Thread.sleep(2000);
        nextPage.verifyDiscountAppliedMessage();
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
