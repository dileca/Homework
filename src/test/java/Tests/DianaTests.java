package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class DianaTests extends Base {

    public void E2E() throws InterruptedException {
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
        webAutomationAdvancePage.selectQuantity("2");
        Thread.sleep(2000);
        webAutomationAdvancePage.enterAddress("123 Street Road");
        webAutomationAdvancePage.clickNext();
//        nextPage.selectStandardShippingMethod();
//        nextPage.selectNoWarrantyOption();
//        nextPage.enterDiscountCode("SAVE10");
//        nextPage.clickApplyDiscountButton();
//        Thread.sleep(4000);
//        nextPage.verifyDiscountApplied();
//        nextPage.clickConfirmPurchaseButton();
//        Thread.sleep(4000);
//        webAutomationAdvancePage.verifySuccessfulOrderToastDisplayed();
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
