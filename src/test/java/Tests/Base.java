package Tests;

import Pages.*;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = BrowserFactory.startBrowser("chrome", "https://ndosiautomation.co.za/");
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    LearningMaterialPage learningMaterialPage = PageFactory.initElements(driver, LearningMaterialPage.class);
    WebAutomationAdvancePage webAutomationAdvancePage = PageFactory.initElements(driver, WebAutomationAdvancePage.class);
    NextPage nextPage = PageFactory.initElements(driver, NextPage.class);
    AboutUsPage aboutUsPage = PageFactory.initElements(driver, AboutUsPage.class);
    RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
}
