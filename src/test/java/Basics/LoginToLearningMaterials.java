package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginToLearningMaterials {

    WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        driver = new ChromeDriver();
    }

    @Test
    public void startBrowser() throws InterruptedException {
        // driver = new ChromeDriver();
        driver.get("https://www.ndosiautomation.co.za/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void verifyLoginPage() {
        driver.findElement(By.xpath("//*[@id=\"overview-hero\"]/h2")).isDisplayed();
    }

    @Test(priority = 2)
    public void clickLearningMaterials() throws InterruptedException {
        driver.findElement(By.id("nav-btn-practice")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void enterEmail() {
        driver.findElement(By.id("login-email")).sendKeys("diana@test.co.za");
    }

    @Test(priority = 4)
    public void enterPassword() {
        driver.findElement(By.id("login-password")).sendKeys("tester123");
    }

    @Test(priority = 5)
    public void clickLoginButton() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(2000);
    }

     @Test(priority = 6)
     public void verifyHomePage(){
        driver.findElement(By.id("practice-heading")).isDisplayed();
    }

    @Test(priority = 7)
    public void clickWebAutomationBasicForm() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void enterFullName() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("Diana Leca");
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void enterEmailAddress() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("diana@test.co.za");
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void enterAge() throws InterruptedException {
        driver.findElement(By.id("age")).sendKeys("49");
        Thread.sleep(2000);
    }

    @Test(priority = 11)
    public void selectGender() throws InterruptedException {
       driver.findElement(By.name("gender")).sendKeys("Female");
        Thread.sleep(2000);
    }

    @Test(priority = 12)
    public void selectCountry() throws InterruptedException {
        driver.findElement(By.name("country")).sendKeys("United States");
        Thread.sleep(2000);
    }

    @Test(priority = 13)
    public void selectExperienceLevel() throws InterruptedException {
        driver.findElement(By.name("experience")).sendKeys("Advanced (5+ years)");
        Thread.sleep(2000);
    }

    @Test(priority = 14)
    public void clickTestingCheckbox() throws InterruptedException {
        driver.findElement(By.id("skill-testing")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public void enterCommentInCommentBox() throws InterruptedException {
        driver.findElement(By.id("comments")).sendKeys("Please send information");
        Thread.sleep(2000);
    }

    @Test(priority = 16)
    public void acceptTermsAndConditions() throws InterruptedException {
        driver.findElement(By.id("terms")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 17)
    public void clickSubmitForm() throws InterruptedException {
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeBrowser(){
       driver.quit();
    }



}

