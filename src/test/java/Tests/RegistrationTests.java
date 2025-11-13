package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RegistrationTests extends Base {

    @Test(priority = 1)
    public void passwordMismatch() throws InterruptedException {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.verifyLoginPageIsDisplayed();
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

    @Test(priority = 2)
    public void verifyBadEmailFormatIsNotAccepted() throws InterruptedException {
//        homePage.verifyHomePageIsDisplayed();
//        homePage.clickLearningMaterialButton();
//        loginPage.verifyLoginPageIsDisplayed();
//        loginPage.clickSignUpLink();
        registrationPage.enterFirstName("bb");
        registrationPage.enterLastName("bb");
        registrationPage.enterEmail("bb@test");
        registrationPage.enterPassword("12345678");
        registrationPage.confirmPassword("12345678");
        registrationPage.clickCreateAccountButton();
        Thread.sleep(2000);
        registrationPage.confirmEmailFormatPopUpDisplays();
    }

    @Test(priority = 3)
    public void verifyPasswordMustBe8CharactersLong() throws InterruptedException {
//        homePage.verifyHomePageIsDisplayed();
//        homePage.clickLearningMaterialButton();
//        loginPage.verifyLoginPageIsDisplayed();
//        loginPage.clickSignUpLink();
        registrationPage.enterFirstName("cc");
        registrationPage.enterLastName("cc");
        registrationPage.enterEmail("cc@test.co.za");
        registrationPage.enterPassword("1234567");
        registrationPage.confirmPassword("1234567");
        registrationPage.clickCreateAccountButton();
        Thread.sleep(2000);
        registrationPage.confirm8CharactersPopUpDisplays();
    }


    @Test(priority = 4)
    public void successfulRegistration() throws InterruptedException {
//        homePage.verifyHomePageIsDisplayed();
//        homePage.clickLearningMaterialButton();
//        loginPage.verifyLoginPageIsDisplayed();
//        loginPage.clickSignUpLink();
        registrationPage.enterFirstName("ee");
        registrationPage.enterLastName("ee");
        registrationPage.enterEmail("ee@test.co.za");
        registrationPage.enterPassword("12345678");
        registrationPage.confirmPassword("12345678");
        registrationPage.clickCreateAccountButton();
        Thread.sleep(2000);
        registrationPage.confirmSuccessfulRegistrationPopUpDisplays();
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }

}
