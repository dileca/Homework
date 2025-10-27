package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class DianaTests extends Base{

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
        webAutomationAdvancePage.selectDeviceType();
    }
    @Test(dependsOnMethods = "selectDeviceTypeTest")
    public void selectBrandTest() {
        webAutomationAdvancePage.selectBrand();
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
        webAutomationAdvancePage.enterAddress();
    }
    @Test(dependsOnMethods = "enterDeliveryAddressTest")
    public void clickNextTest() {
        webAutomationAdvancePage.clickNext();
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
 }

}
