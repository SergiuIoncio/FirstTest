import Testare.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    String baseUrl = "http://localhost:4200/";
    public WebDriver driver;
    public LoginPage loginPage;

    @BeforeTest
    public void initialSetup(){
//        System.setProperty("webdriver.firefox.driver",driverPath);
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void UserLoginTest(){
        loginPage.getUsernameElement().sendKeys("Sdvf");
        loginPage.getLoginButtonElement().click();
        String newURL = driver.getCurrentUrl();
        Assert.assertEquals(newURL, loginPage.getBaseUrl());
    }
    @Test(priority = 1)
    public void PasswordLogin() {
        driver.get(baseUrl);
        loginPage.getPasswordElement();
        loginPage.getPasswordElement().sendKeys("ss11s");
        loginPage.getLoginButtonElement().click();
        String newURL = driver.getCurrentUrl();
        Assert.assertEquals(newURL, loginPage.getBaseUrl());
    }
    @Test(priority = 3)
    public void FullLogin(){
        driver.get(baseUrl);
        loginPage.getPasswordElement();
        loginPage.getUsernameElement().sendKeys("sfaq");
      loginPage.getPasswordElement().sendKeys("ss11s");
        loginPage.getLoginButtonElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-header/mat-toolbar")).isDisplayed());
    }
    @Test(priority = 4)
    public void LoginMissingInfo(){
        driver.get(baseUrl);
        loginPage.getLoginButtonElement().click();
        String newURL = driver.getCurrentUrl();
        Assert.assertEquals(newURL, loginPage.getBaseUrl());
    }
}
