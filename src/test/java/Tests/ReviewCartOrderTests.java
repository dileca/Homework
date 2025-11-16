package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;

public class ReviewCartOrderTests extends Base {

    @Test(priority = 1)
    public void clickReviewCartOrder() throws InterruptedException {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.verifyLoginPageIsDisplayed();
        loginPage.enterEmailAddress("diana@test.co.za");
        loginPage.enterPassword("tester123");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
        learningMaterialPage.clickWebAutomationAdvanceTab();
        webAutomationAdvancePage.verifyWebAutomationAdvancePageIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Laptop");
        webAutomationAdvancePage.selectBrand("Macbook pro");
        webAutomationAdvancePage.select256GBStorage();
        webAutomationAdvancePage.selectColor("Gold");
        webAutomationAdvancePage.selectQuantity("2");
        Thread.sleep(2000);
        webAutomationAdvancePage.enterAddress("123 Street Road");
        webAutomationAdvancePage.clickNext();
        nextPage.selectExpressShippingMethod();
        nextPage.select2YearWarrantyOption();
        nextPage.enterDiscountCode("SAVE10");
        nextPage.clickApplyDiscountButton();
        nextPage.clickAddToCartButton();
        webAutomationAdvancePage.verifyCartQuantity();
        webAutomationAdvancePage.verifyGrandTotal();
        webAutomationAdvancePage.clickReviewCartOrderButton();
        webAutomationAdvancePage.verifyPlaceOrderButtonDisplays();
        webAutomationAdvancePage.verifyCancelButtonIsDisplayed();
        webAutomationAdvancePage.verifyInfoPanelDisplayed();
    }

    @Test(priority = 2)
    public void clickCancelButton() throws InterruptedException {
//        homePage.verifyHomePageIsDisplayed();
//        homePage.clickLearningMaterialButton();
//        loginPage.verifyLoginPageIsDisplayed();
//        loginPage.enterEmailAddress("diana@test.co.za");
//        loginPage.enterPassword("tester123");
//        loginPage.clickLoginButton();
//        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
//        learningMaterialPage.clickWebAutomationAdvanceTab();
//        webAutomationAdvancePage.verifyWebAutomationAdvancePageIsDisplayed();
//        webAutomationAdvancePage.selectDeviceType("Laptop");
//        webAutomationAdvancePage.selectBrand("Macbook pro");
//        webAutomationAdvancePage.select256GBStorage();
//        webAutomationAdvancePage.selectColor("Gold");
//        webAutomationAdvancePage.selectQuantity("2");
//        Thread.sleep(2000);
//        webAutomationAdvancePage.enterAddress("123 Street Road");
//        webAutomationAdvancePage.clickNext();
//        nextPage.selectExpressShippingMethod();
//        nextPage.select2YearWarrantyOption();
//        nextPage.enterDiscountCode("SAVE10");
//        nextPage.clickApplyDiscountButton();
//        nextPage.clickAddToCartButton();
//        webAutomationAdvancePage.verifyCartQuantity();
//        webAutomationAdvancePage.verifyGrandTotal();
//        webAutomationAdvancePage.clickReviewCartOrderButton();
//        webAutomationAdvancePage.verifyPlaceOrderButtonDisplays();
//        webAutomationAdvancePage.verifyCancelButtonIsDisplayed();
//        webAutomationAdvancePage.verifyInfoPanelDisplayed();
        webAutomationAdvancePage.clickCancelButton();
        webAutomationAdvancePage.verifyReviewCartOrderButtonIsDisplayed();
    }

    @Test(priority = 3)
            public void clickPlaceOrder() throws InterruptedException {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.verifyLoginPageIsDisplayed();
        loginPage.enterEmailAddress("diana@test.co.za");
        loginPage.enterPassword("tester123");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
        learningMaterialPage.clickWebAutomationAdvanceTab();
        webAutomationAdvancePage.verifyWebAutomationAdvancePageIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Laptop");
        webAutomationAdvancePage.selectBrand("Macbook pro");
        webAutomationAdvancePage.select256GBStorage();
        webAutomationAdvancePage.selectColor("Gold");
        webAutomationAdvancePage.selectQuantity("2");
        Thread.sleep(2000);
        webAutomationAdvancePage.enterAddress("123 Street Road");
        webAutomationAdvancePage.clickNext();
        nextPage.selectExpressShippingMethod();
        nextPage.select2YearWarrantyOption();
        nextPage.enterDiscountCode("SAVE10");
        nextPage.clickApplyDiscountButton();
        nextPage.clickAddToCartButton();
        webAutomationAdvancePage.verifyCartQuantity();
        webAutomationAdvancePage.verifyGrandTotal();
        webAutomationAdvancePage.clickReviewCartOrderButton();
        webAutomationAdvancePage.verifySuccessfulOrderToastDisplayed();
    }

    @Test(priority = 4)
        public void cartSuccessToast() {

    }



    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}