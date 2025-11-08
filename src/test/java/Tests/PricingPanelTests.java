package Tests;

import org.testng.annotations.Test;

public class PricingPanelTests extends Base{

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
    //No device+storage → Unit: —, Subtotal: —
    //Verify unit and device is zero

    //Phone 64GB Qty1 → Unit R400.00 Subtotal R400.00
    @Test(dependsOnMethods = "verifyWebAutomationAdvancePageIsDisplayedTest")
    public void selectDeviceTypeTest() {
        webAutomationAdvancePage.selectDeviceType("Phone");
    }

    public void verifyUnitValueDisplaysR400Test() {

    }
//    String stringUnitPrice = unitPriceValue_id.getText();
//
//        System.out.println(stringUnitPrice);
//    String stringUnitPriceWithoutR = stringUnitPrice.replace("R", "");
//        System.out.println(stringUnitPriceWithoutR+1);
//    Double unitPriceDouble = Double.parseDouble(stringUnitPriceWithoutR);
//        System.out.println(unitPriceDouble);







}
