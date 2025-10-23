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



    @AfterTest
    public void closeBrowser() {
        driver.quit();
 }

}
