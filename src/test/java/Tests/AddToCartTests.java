package Tests;

import Pages.NextPage;
import org.testng.annotations.Test;

public class AddToCartTests extends Base {

    @Test(priority = 1)
    public void verifyCartAmountWhenItemAdded() {
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
        webAutomationAdvancePage.selectColor("Gold");
        webAutomationAdvancePage.selectQuantity("1");
        webAutomationAdvancePage.enterAddress("123 Street Road");
        webAutomationAdvancePage.clickNext();
        nextPage.selectStandardShippingMethod();
        nextPage.selectNoWarrantyOption();
        nextPage.enterDiscountCode("SAVE10");
        nextPage.clickApplyDiscountButton();
        nextPage.clickAddToCartButton();
        webAutomationAdvancePage.verifyCartQuantity();
        webAutomationAdvancePage.verifyGrandTotal();
    }

    @Test(priority = 2)
    public void verifyCartAmountWhen2ItemsAdded() {
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
//        webAutomationAdvancePage.selectColor("Gold");
//        webAutomationAdvancePage.selectQuantity("1");
//        webAutomationAdvancePage.enterAddress("123 Street Road");
//        webAutomationAdvancePage.clickNext();
//        nextPage.selectStandardShippingMethod();
//        nextPage.selectNoWarrantyOption();
//        nextPage.clickAddToCartButton();
//        webAutomationAdvancePage.verifyGrandTotal();
//        webAutomationAdvancePage.verifyWebAutomationAdvancePageIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Tablet");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.select256GBStorage();
        webAutomationAdvancePage.selectColor("Gold");
        webAutomationAdvancePage.selectQuantity("1");
        webAutomationAdvancePage.enterAddress("123 Street Road");
        webAutomationAdvancePage.clickNext();
        nextPage.selectStandardShippingMethod();
        nextPage.selectNoWarrantyOption();
        nextPage.clickAddToCartButton();
        webAutomationAdvancePage.verifyCartQuantity();
        webAutomationAdvancePage.verifyGrandTotal();
    }

    @Test(priority = 3)
    public void verifyDiscountMessageDisplaysInCart() {
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
//        webAutomationAdvancePage.selectColor("Gold");
//        webAutomationAdvancePage.selectQuantity("1");
//        webAutomationAdvancePage.enterAddress("123 Street Road");
//        webAutomationAdvancePage.clickNext();
//        nextPage.selectStandardShippingMethod();
//        nextPage.selectNoWarrantyOption();
//        nextPage.enterDiscountCode("SAVE10");
//        nextPage.clickApplyDiscountButton();
//        nextPage.clickAddToCartButton();
//        webAutomationAdvancePage.verifyGrandTotal();
//        webAutomationAdvancePage.verifyWebAutomationAdvancePageIsDisplayed();
//        webAutomationAdvancePage.selectDeviceType("Tablet");
//        webAutomationAdvancePage.selectBrand("Apple");
//        webAutomationAdvancePage.select256GBStorage();
//        webAutomationAdvancePage.selectColor("Gold");
//        webAutomationAdvancePage.selectQuantity("1");
//        webAutomationAdvancePage.enterAddress("123 Street Road");
//        webAutomationAdvancePage.clickNext();
//        nextPage.selectStandardShippingMethod();
//        nextPage.selectNoWarrantyOption();
//        nextPage.clickAddToCartButton();
//        webAutomationAdvancePage.verifyCartQuantity();
        webAutomationAdvancePage.verifyDiscountMessageDisplaysInCart();
    }


    @Test(priority = 4)
    public void removeItemFromCart() {
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
//        webAutomationAdvancePage.selectColor("Gold");
//        webAutomationAdvancePage.selectQuantity("1");
//        webAutomationAdvancePage.enterAddress("123 Street Road");
//        webAutomationAdvancePage.clickNext();
//        nextPage.selectStandardShippingMethod();
//        nextPage.selectNoWarrantyOption();
//        nextPage.enterDiscountCode("SAVE10");
//        nextPage.clickApplyDiscountButton();
//        nextPage.clickAddToCartButton();
//        webAutomationAdvancePage.verifyGrandTotal();
//        webAutomationAdvancePage.verifyWebAutomationAdvancePageIsDisplayed();
//        webAutomationAdvancePage.selectDeviceType("Tablet");
//        webAutomationAdvancePage.selectBrand("Apple");
//        webAutomationAdvancePage.select256GBStorage();
//        webAutomationAdvancePage.selectColor("Gold");
//        webAutomationAdvancePage.selectQuantity("1");
//        webAutomationAdvancePage.enterAddress("123 Street Road");
//        webAutomationAdvancePage.clickNext();
//        nextPage.selectStandardShippingMethod();
//        nextPage.selectNoWarrantyOption();
//        nextPage.clickAddToCartButton();
//        webAutomationAdvancePage.verifyCartQuantity();
//        webAutomationAdvancePage.verifyDiscountMessageDisplaysInCart();
        webAutomationAdvancePage.removeItemFromCart();
        webAutomationAdvancePage.verifyGrandTotal();
    }

        @Test(priority = 5)
        public void addWithoutStorage() {
            webAutomationAdvancePage.selectDeviceType("Laptop");
            webAutomationAdvancePage.selectBrand("Macbook pro");
            webAutomationAdvancePage.selectColor("Gold");
            webAutomationAdvancePage.selectQuantity("1");
            webAutomationAdvancePage.enterAddress("123 Street Road");
            webAutomationAdvancePage.verifyCartQuantity();
            webAutomationAdvancePage.verifyGrandTotal();
        }



}


