import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import java.time.Duration;

public class LoginToLearningMaterials {

   WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        driver = new ChromeDriver();
    }

   @Test
   public void startBrowser() throws InterruptedException{
      // driver = new ChromeDriver();
       driver.get("https://www.ndosiautomation.co.za/");
       driver.manage().window().maximize();
       Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void verifyHomePage(){
        driver.findElement(By.xpath("//*[@id=\"overview-hero\"]/h2")).isDisplayed();
    }

    @Test(priority = 2)
    public void clickLearningMaterials() throws InterruptedException{
        driver.findElement(By.id("nav-btn-practice")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void enterEmail(){
        driver.findElement(By.id("login-email")).sendKeys("diana@test.co.za");
    }

    @Test(priority = 4)
    public void enterPassword(){
        driver.findElement(By.id("login-password")).sendKeys("tester123");
    }

    @Test(priority = 5)
    public void clickLoginButton() throws InterruptedException{
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeBrowser(){
       driver.quit();
    }

}

