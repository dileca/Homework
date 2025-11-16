package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DiscountCodeTests extends Base {

    @Test(priority = 1)
    public void verifySAVE10DiscountMessage() throws InterruptedException {
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
        Thread.sleep(2000);
        nextPage.verifyDiscountAppliedMessage();
    }

    @Test(priority = 2)
    public void messageUpdatesWhenEnteringSAVE20AfterSAVE10() throws InterruptedException {
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
//        nextPage.selectStandardShippingMethod();
//        nextPage.selectNoWarrantyOption();
//        nextPage.enterDiscountCode("SAVE10");
//        nextPage.clickApplyDiscountButton();
//        nextPage.verifyDiscountAppliedMessage();
        nextPage.enterDiscountCode("SAVE20");
        nextPage.clickApplyDiscountButton();
        Thread.sleep(2000);
        nextPage.verifyDiscountAppliedMessage();
    }

    @Test(priority = 3)
    public void invalidCode() throws InterruptedException {
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
//        nextPage.selectStandardShippingMethod();
//        nextPage.selectNoWarrantyOption();
        nextPage.enterDiscountCode("SAVE 30");
        nextPage.clickApplyDiscountButton();
        Thread.sleep(2000);
        nextPage.verifyDiscountAppliedMessage();
    }

    @Test(priority = 4)
    public void removeDiscount() throws InterruptedException {
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
//        nextPage.selectStandardShippingMethod();
//        nextPage.selectNoWarrantyOption();
        nextPage.enterDiscountCode("SAVE10");
        nextPage.clickApplyDiscountButton();
        nextPage.verifyDiscountAppliedMessage();
        Thread.sleep(2000);
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
