package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AllTests extends Base {

    @Test(priority = 1)
    public void invalidPassword() {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.enterEmailAddress("diana@test.co.za");
        loginPage.enterPassword("1tester123");
        loginPage.clickLoginButton();
        loginPage.confirmInvalidPasswordPopUpDisplays();
        loginPage.clickHomeTab();
    }

    @Test(priority = 2)
    public void verifySuccessfulLogin() {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.enterEmailAddress("diana@test.co.za");
        loginPage.enterPassword("tester123");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
        learningMaterialPage.clickLogoutButton();
    }

    @Test(priority = 3)
    public void verifyThatExtraSpaceIsTrimmedOnUsernameAndPassword() {
        homePage.clickLearningMaterialButton();
        loginPage.enterEmailAddress(" diana@test.co.za ");
        loginPage.enterPassword(" tester123 ");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
        learningMaterialPage.clickLogoutButton();
    }

    @Test(priority = 4)
    public void verifyForcedLogoutWhenAnotherTabIsSelectedAndThenLearningMaterialIsSelected() {
        homePage.clickLearningMaterialButton();
        loginPage.enterEmailAddress("diana@test.co.za");
        loginPage.enterPassword("tester123");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
        learningMaterialPage.clickAboutUsTab();
        aboutUsPage.clickLearningMaterialsTab();
        loginPage.verifyLoginPageIsDisplayed();
    }

    @Test(priority = 5)
    public void clickLogOut() {
        homePage.clickLearningMaterialButton();
        loginPage.enterEmailAddress("diana@test.co.za");
        loginPage.enterPassword("tester123");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
        learningMaterialPage.clickLogoutButton();
        loginPage.verifyLoginPageIsDisplayed();
    }

    @Test(priority = 6)
    public void passwordMismatch() throws InterruptedException {
        loginPage.clickSignUpLink();
        registrationPage.enterFirstName("aa");
        registrationPage.enterLastName("aa");
        registrationPage.enterEmail("aa@test.co.za");
        registrationPage.enterPassword("12345678");
        registrationPage.confirmPassword("12345679");
        registrationPage.clickCreateAccountButton();
        Thread.sleep(2000);
        registrationPage.confirmMismatchPasswordPopUpDisplays();
    }

    @Test(priority = 7)
    public void verifyBadEmailFormatIsNotAccepted() throws InterruptedException {
        registrationPage.enterFirstName("bb");
        registrationPage.enterLastName("bb");
        registrationPage.enterEmail("bb@test");
        registrationPage.enterPassword("12345678");
        registrationPage.confirmPassword("12345678");
        registrationPage.clickCreateAccountButton();
        Thread.sleep(2000);
        registrationPage.confirmEmailFormatPopUpDisplays();
    }

    @Test(priority = 8)
    public void verifyPasswordMustBe8CharactersLong() throws InterruptedException {
        registrationPage.enterFirstName("cc");
        registrationPage.enterLastName("cc");
        registrationPage.enterEmail("cc@test.co.za");
        registrationPage.enterPassword("1234567");
        registrationPage.confirmPassword("1234567");
        registrationPage.clickCreateAccountButton();
        Thread.sleep(2000);
        registrationPage.confirm8CharactersPopUpDisplays();
    }


    @Test(priority = 9)
    public void successfulRegistration() throws InterruptedException {
        registrationPage.enterFirstName("ff");
        registrationPage.enterLastName("ff");
        registrationPage.enterEmail("ff6@test.co.za");
        registrationPage.enterPassword("12345678");
        registrationPage.confirmPassword("12345678");
        registrationPage.clickCreateAccountButton();
        Thread.sleep(2000);
        registrationPage.confirmSuccessfulRegistrationPopUpDisplays();
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void verifyUnitAndSubtotalIsZeroWhenNoDeviceAndStorageIsSelected() {
        loginPage.enterPassword("12345678");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
        learningMaterialPage.clickWebAutomationAdvanceTab();
        webAutomationAdvancePage.verifyWebAutomationAdvancePageIsDisplayed();
        webAutomationAdvancePage.verifyUnitPriceIsZero();
        webAutomationAdvancePage.verifySubTotalIsZero();
    }

    @Test(priority = 11)
    public void verifyUnitAnSubtotalWhen64GBPhoneIsSelected() {
        webAutomationAdvancePage.selectDeviceType("Phone");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.select64GBStorage();
        webAutomationAdvancePage.verifySubTotalAmount();
    }

    @Test(priority = 12)
    public void verifyUnityAndSubtotalWhenTwo128GBPhonesAreSelected() throws InterruptedException {
        webAutomationAdvancePage.selectDeviceType("Phone");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.select128GBStorage();
        webAutomationAdvancePage.selectColor("Gold");
        webAutomationAdvancePage.selectQuantity("2");
        Thread.sleep(2000);
        webAutomationAdvancePage.verifySubTotalAmount();
    }

    @Test(priority = 13)
    public void verifyUnityAndSubtotalWhen256GBLaptopIsSelected() throws InterruptedException {
        webAutomationAdvancePage.selectDeviceType("Laptop");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.select256GBStorage();
        webAutomationAdvancePage.selectColor("Gold");
        webAutomationAdvancePage.selectQuantity("2");
        Thread.sleep(2000);
        webAutomationAdvancePage.verifySubTotalAmount();
    }

    @Test(priority = 14)
    public void verifyUnitAndSubtotalResetsWhenDeviceIsCleared() throws InterruptedException {
        webAutomationAdvancePage.selectDeviceType("Laptop");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.select256GBStorage();
        webAutomationAdvancePage.selectColor("Gold");
        webAutomationAdvancePage.selectQuantity("2");
        Thread.sleep(2000);
        webAutomationAdvancePage.verifySubTotalAmount();
        webAutomationAdvancePage.selectDeviceType("Select");
        Thread.sleep(2000);
        webAutomationAdvancePage.verifyUnitPriceIsZero();
        webAutomationAdvancePage.verifySubTotalIsZero();
    }

    @Test(priority = 15)
    public void toggleBetweenDifferentShippingMethods() throws InterruptedException {
        webAutomationAdvancePage.selectDeviceType("Phone");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.select256GBStorage();
        webAutomationAdvancePage.selectColor("White");
        webAutomationAdvancePage.selectQuantity("1");
        webAutomationAdvancePage.enterAddress("123 Street Road");
        webAutomationAdvancePage.clickNext();
        nextPage.selectStandardShippingMethod();
        nextPage.verifyShippingChargeInPricingBreakdown();
        nextPage.selectExpressShippingMethod();
        nextPage.verifyShippingChargeInPricingBreakdown();
    }

    @Test(priority = 16)
    public void toggleBetweenDifferentWarrantyOptions() throws InterruptedException {
        nextPage.selectStandardShippingMethod();
        nextPage.selectNoWarrantyOption();
        nextPage.verifyWarrantyChargeInPricingBreakdown();
        nextPage.select1YearWarrantyOption();
        nextPage.verifyWarrantyChargeInPricingBreakdown();
        nextPage.select2YearWarrantyOption();
        nextPage.verifyWarrantyChargeInPricingBreakdown();
        nextPage.clickBackButton();
    }

//    @Test(priority = 17)
//    public void formulaCheck() throws InterruptedException {
//        webAutomationAdvancePage.selectDeviceType("Phone");
//        webAutomationAdvancePage.selectBrand("Apple");
//        webAutomationAdvancePage.select128GBStorage();
//        webAutomationAdvancePage.selectColor("White");
//        webAutomationAdvancePage.selectQuantity("2");
//        webAutomationAdvancePage.enterAddress("123 Street Road");
//        webAutomationAdvancePage.clickNext();
//        nextPage.selectExpressShippingMethod();
//        nextPage.select1YearWarrantyOption();
//        nextPage.enterDiscountCode("SAVE10");
//        nextPage.clickApplyDiscountButton();
//        Thread.sleep(4000);
//     //   nextPage.verifyDiscountApplied();
//        nextPage.clickConfirmPurchaseButton();
//        Thread.sleep(4000);
//        webAutomationAdvancePage.verifySuccessfulOrderToastDisplayed();
//        nextPage.clickBackButton();
//    }

    @Test(priority = 18)
    public void verifySAVE10DiscountMessage() throws InterruptedException {
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

    @Test(priority = 19)
    public void messageUpdatesWhenEnteringSAVE20AfterSAVE10() throws InterruptedException {
        nextPage.enterDiscountCode("SAVE20");
        nextPage.clickApplyDiscountButton();
        Thread.sleep(2000);
        nextPage.verifyDiscountAppliedMessage();
    }

    @Test(priority = 20)
    public void invalidCode() throws InterruptedException {
        nextPage.enterDiscountCode("SAVE 30");
        nextPage.clickApplyDiscountButton();
        Thread.sleep(2000);
        nextPage.verifyDiscountAppliedMessage();
    }

    @Test(priority = 21)
    public void removeDiscount() throws InterruptedException {
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
        driver.close();
    }







}
