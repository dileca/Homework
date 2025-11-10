package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RegistrationTests extends Base {

    @Test
    public void passwordMismatch() throws InterruptedException {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.verifyLoginPageIsDisplayed();
        loginPage.clickSignUpLink();
        registrationPage.enterFirstName("aa");
        Thread.sleep(2000);
        registrationPage.enterLastName("aa");
        Thread.sleep(2000);
        registrationPage.enterEmail("aa@test.co.za");
        Thread.sleep(2000);
        registrationPage.enterPassword("12345678");
        Thread.sleep(2000);
        registrationPage.confirmPassword("12345679");
        Thread.sleep(2000);
        registrationPage.clickCreateAccountButton();
        registrationPage.confirmMismatchPasswordPopUpDisplays();
    }

    @Test
    public void verifyBadEmailFormatIsNotAccepted() throws InterruptedException {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.verifyLoginPageIsDisplayed();
        loginPage.clickSignUpLink();
        registrationPage.enterFirstName("bb");
        Thread.sleep(2000);
        registrationPage.enterLastName("bb");
        Thread.sleep(2000);
        registrationPage.enterEmail("bb@test");
        Thread.sleep(2000);
        registrationPage.enterPassword("12345678");
        Thread.sleep(2000);
        registrationPage.confirmPassword("12345678");
        Thread.sleep(2000);
        registrationPage.clickCreateAccountButton();
        Thread.sleep(2000);
        registrationPage.confirmEmailFormatPopUpDisplays();
    }

    @Test
    public void verifyPasswordMustBe8CharactersLong() throws InterruptedException {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.verifyLoginPageIsDisplayed();
        loginPage.clickSignUpLink();
        registrationPage.enterFirstName("cc");
        Thread.sleep(2000);
        registrationPage.enterLastName("cc");
        Thread.sleep(2000);
        registrationPage.enterEmail("cc@test.co.za");
        Thread.sleep(2000);
        registrationPage.enterPassword("1234567");
        Thread.sleep(2000);
        registrationPage.confirmPassword("1234567");
        Thread.sleep(2000);
        registrationPage.clickCreateAccountButton();
        Thread.sleep(2000);
        registrationPage.confirm8CharactersPopUpDisplays();
    }


    @Test
    public void successfulRegistration() throws InterruptedException {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.verifyLoginPageIsDisplayed();
        loginPage.clickSignUpLink();
        registrationPage.enterFirstName("dd");
        Thread.sleep(2000);
        registrationPage.enterLastName("dd");
        Thread.sleep(2000);
        registrationPage.enterEmail("dd@test.co.za");
        Thread.sleep(2000);
        registrationPage.enterPassword("12345678");
        Thread.sleep(2000);
        registrationPage.confirmPassword("12345678");
        Thread.sleep(2000);
        registrationPage.clickCreateAccountButton();
        Thread.sleep(2000);
        registrationPage.confirmSuccessfulRegistrationPopUpDisplays();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
