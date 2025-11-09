package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTests extends Base {

    //Valid Credentials
   @Test
    public void verifySuccessfulLogin() {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.enterEmailAddress("diana@test.co.za");
        loginPage.enterPassword("tester123");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
    }


    @Test
    public void invalidPassword() {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.enterEmailAddress("diana@test.co.za");
        loginPage.enterPassword("1tester123");
        loginPage.clickLoginButton();
        loginPage.confirmInvalidPasswordPopUpDisplays();
    }

    @Test
    public void verifyThatExtraSpaceIsTrimmedOnUsernameAndPassword() {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.enterEmailAddress(" diana@test.co.za ");
        loginPage.enterPassword(" tester123 ");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
    }

    @Test
    public void verifyForcedLogoutWhenAnotherTabIsSelectedAndThenLearningMaterialIsSelected() {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.enterEmailAddress("diana@test.co.za");
        loginPage.enterPassword("tester123");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
        learningMaterialPage.clickAboutUsTab();
        aboutUsPage.clickLearningMaterialsTab();
        loginPage.verifyLoginPageIsDisplayed();
    }

    @Test
    public void clickLogOut() {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.enterEmailAddress("diana@test.co.za");
        loginPage.enterPassword("tester123");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
        learningMaterialPage.clickLogoutButton();
        loginPage.verifyLoginPageIsDisplayed();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
