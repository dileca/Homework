package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PricingPanelTests extends Base {


    @Test(priority = 1)
    public void verifyUnitAndSubtotalIsZeroWhenNoDeviceAndStorageIsSelected() {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.verifyLoginPageIsDisplayed();
        loginPage.enterEmailAddress("diana@test.co.za");
        loginPage.enterPassword("tester123");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
        learningMaterialPage.clickWebAutomationAdvanceTab();
        webAutomationAdvancePage.verifyWebAutomationAdvancePageIsDisplayed();
        webAutomationAdvancePage.verifyUnitPriceIsZero();
        webAutomationAdvancePage.verifySubTotalIsZero();
    }

    @Test(priority = 2)
    public void verifyUnitAnSubtotalWhen64GBPhoneIsSelected() {
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
        webAutomationAdvancePage.select64GBStorage();
        webAutomationAdvancePage.verifySubTotalAmount();
    }

    @Test(priority = 3)
    public void verifyUnityAndSubtotalWhenTwo128GBPhonesAreSelected() throws InterruptedException {
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
        webAutomationAdvancePage.select128GBStorage();
        webAutomationAdvancePage.selectColor("Gold");
        webAutomationAdvancePage.selectQuantity("2");
        Thread.sleep(2000);
        webAutomationAdvancePage.verifySubTotalAmount();
    }

    @Test(priority = 4)
    public void verifyUnityAndSubtotalWhen256GBLaptopIsSelected() throws InterruptedException {
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
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.select256GBStorage();
        webAutomationAdvancePage.selectColor("Gold");
        webAutomationAdvancePage.selectQuantity("2");
        Thread.sleep(2000);
        webAutomationAdvancePage.verifySubTotalAmount();
    }

    @Test(priority = 5)
    public void verifyUnitAndSubtotalResetsWhenDeviceIsCleared() throws InterruptedException {
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
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.select256GBStorage();
        webAutomationAdvancePage.selectColor("Gold");
        webAutomationAdvancePage.selectQuantity("1");
        Thread.sleep(2000);
        webAutomationAdvancePage.selectDeviceType("Select");
        Thread.sleep(10000);
        webAutomationAdvancePage.clearQuantity();
        webAutomationAdvancePage.verifyUnitPriceIsZero();
        webAutomationAdvancePage.verifySubTotalIsZero();
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}
