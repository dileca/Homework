package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class DianaTests extends Base {

    public void verifyHomePageIsDisplayedTest() {
        homePage.verifyHomePageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayedTest")
    public void clickLearningMaterialButtonTest() {
        homePage.clickLearningMaterialButton();
    }

    @Test(dependsOnMethods = "clickLearningMaterialButtonTest")
    public void verifyLoginPageIsDisplayedTest() {
        loginPage.verifyLoginPageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyLoginPageIsDisplayedTest")
    public void enterEmailAddressTest() {
        loginPage.enterEmailAddress("diana@test.co.za");
    }

    @Test(dependsOnMethods = "enterEmailAddressTest")
    public void enterPasswordTest() {
        loginPage.enterPassword("tester123");
    }

    @Test(dependsOnMethods = "enterPasswordTest")
    public void clickLoginButtonTest() {
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginButtonTest")
    public void verifyLearningMaterialPageIsDisplayedTest() {
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyLearningMaterialPageIsDisplayedTest")
    public void clickWebAutomationAdvanceTabTest() {
        learningMaterialPage.clickWebAutomationAdvanceTab();
    }

    @Test(dependsOnMethods = "clickWebAutomationAdvanceTabTest")
    public void verifyWebAutomationAdvancePageIsDisplayedTest() {
        webAutomationAdvancePage.verifyWebAutomationAdvancePageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyWebAutomationAdvancePageIsDisplayedTest")
    public void selectDeviceTypeTest() {
        webAutomationAdvancePage.selectDeviceType("Phone");
    }

    @Test(dependsOnMethods = "selectDeviceTypeTest")
    public void selectBrandTest() {
        webAutomationAdvancePage.selectBrand("Apple");
    }

    @Test(dependsOnMethods = "selectBrandTest")
    public void selectStorageTest() {
        webAutomationAdvancePage.selectStorage();
    }

    @Test(dependsOnMethods = "selectStorageTest")
    public void selectColorTest() {
        webAutomationAdvancePage.selectColor();
    }

    @Test(dependsOnMethods = "selectColorTest")
    public void selectQuantityTest() {
        webAutomationAdvancePage.selectQuantity();
    }

    @Test(dependsOnMethods = "selectQuantityTest")
    public void enterDeliveryAddressTest() {
        webAutomationAdvancePage.enterAddress("123 Street Road");
    }

    @Test(dependsOnMethods = "enterDeliveryAddressTest")
    public void clickNextTest() {
        webAutomationAdvancePage.clickNext();
    }

    @Test(dependsOnMethods = "clickNextTest")
    public void selectStandardShippingMethodTest() {
        nextPage.selectStandardShippingMethod();
    }

    @Test(dependsOnMethods = "selectStandardShippingMethodTest")
    public void selectNoWarrantyOptionTest() {
        nextPage.selectNoWarrantyOption();
    }

    @Test(dependsOnMethods = "selectNoWarrantyOptionTest")
    public void enterDiscountCodeTest() throws InterruptedException {
        nextPage.enterDiscountCode("SAVE10");
        nextPage.clickApplyDiscountButton();

        Thread.sleep(4000);

    }

    @Test(dependsOnMethods = "enterDiscountCodeTest")
    public void verifyDiscountAppliedTest() {
        nextPage.verifyDiscountApplied();

    }

    @Test(dependsOnMethods = "verifyDiscountAppliedTest")
    public void confirmPurchaseTest() throws InterruptedException {
        nextPage.clickConfirmPurchaseButton();
        Thread.sleep(4000);
    }


    @Test(dependsOnMethods = "confirmPurchaseTest")
    public void verifySuccessfulOrderToastIsDisplayedTest() {
        webAutomationAdvancePage.verifySuccessfulOrderToastDisplayed();
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
