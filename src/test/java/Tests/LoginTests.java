package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTests extends Base {

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
        //  homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterialButton();
        loginPage.enterEmailAddress(" diana@test.co.za ");
        loginPage.enterPassword(" tester123 ");
        loginPage.clickLoginButton();
        learningMaterialPage.verifyLearningMaterialPageIsDisplayed();
        learningMaterialPage.clickLogoutButton();
    }

    @Test(priority = 4)
    public void verifyForcedLogoutWhenAnotherTabIsSelectedAndThenLearningMaterialIsSelected() {
     //   homePage.verifyHomePageIsDisplayed();
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
     //   homePage.verifyHomePageIsDisplayed();
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
        driver.close();
    }

}
