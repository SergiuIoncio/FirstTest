import Testare.AddUser;
import Testare.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddUserTest2 {
    String driverPath = " /home/sergiuioncio/Downloads/geckodriver-v0.29.1-linux64";
    String baseUrl = "http://localhost:4200/add";
    public WebDriver driver;
    public LoginPage loginPage;
    public AddUser addUser;

    @BeforeTest
    public void initialSetup() {
        String driverPath = " /home/sergiuioncio/Downloads/geckodriver-v0.29.1-linux64";
        String baseUrl = "http://localhost:4200/add";
//        System.setProperty("webdriver.firefox.driver",driverPath);
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        addUser = new AddUser(driver);
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void FullComplete() {
        addUser.getUsernameAddElement().sendKeys("Sergiu");
        addUser.getEmailElement().sendKeys("ssergsiu@scsx.com");
        addUser.getFullNameElement().sendKeys("Serrfsdd");
        addUser.getPasswordAddElement().sendKeys("sss12s34");
        addUser.getFocusedElement().click();
        addUser.getCarringElement().click();
        addUser.getPerfectionistElement().click();
        addUser.getCourageousElement().click();
        addUser.getMaleElement().click();
        addUser.getFemaleElement().click();
        addUser.getSubmitElement().click();
        //boolean isInserted = addUser.getUsername1().isDisplayed();
        //Assert.assertTrue(isInserted);
        //Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[6]/div/div[1]/a/h1")).isDisplayed());
         Assert.assertEquals(driver.getPageSource().contains("Sergiu"),true);
    }
    @Test(priority = 1)
        public void MustCompleteBox(){
            driver.get(baseUrl);
            addUser.getUsernameAddElement().sendKeys("Sergiussa12324");
            addUser.getEmailElement().sendKeys("aa@ss");
            addUser.getFullNameElement().sendKeys("Sss");
            addUser.getPasswordAddElement().sendKeys("s11");
            addUser.getFemaleElement().click();
            addUser.getSubmitElement().click();
            //Assert.assertTrue(driver.findElement(By.id("Sss")).isDisplayed());
        boolean isInserted = addUser.getUsername1().isDisplayed();
        Assert.assertTrue(isInserted);
           //Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[7]/div/div[1]/a")).isDisplayed());

    }
    @Test(priority = 2)
    public void DuplicateFullName(){
        driver.get(baseUrl);
        addUser.getUsernameAddElement().sendKeys("Sergiu123ew1");
        addUser.getEmailElement().sendKeys("mss@sa");
        addUser.getFullNameElement().sendKeys("Eden Martin");
        addUser.getPasswordAddElement().sendKeys("saaq11s34");
        addUser.getFemaleElement().click();
        addUser.getSubmitElement().click();
        boolean isInserted = addUser.getUsername1().isDisplayed();
        Assert.assertTrue(isInserted);
        //Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[7]/div/div[1]/a")).isDisplayed());
    }
    @Test(priority = 3 )
    public void DuplicateUsername(){
        driver.get(baseUrl);
        addUser.getAddUserElement().click();
        addUser.getUsernameAddElement().sendKeys("User1");
        addUser.getEmailElement().sendKeys("ssergsiu@sc5555ssx.scom");
        addUser.getFullNameElement().sendKeys("Serrfsds22555d");
        addUser.getPasswordAddElement().sendKeys("sss1s2555433ss34");
        addUser.getFemaleElement().click();
        addUser.getSubmitElement().click();
        boolean isInserted = addUser.getUsername1().isDisplayed();
       Assert.assertTrue(isInserted);

    }
    @Test(priority = 4 )
    public void DuplicateEmail(){
        driver.get(baseUrl);
        addUser.getUsernameAddElement().sendKeys("Sergiu233");
        addUser.getEmailElement().sendKeys("my_email1@gmail.com");
        addUser.getFullNameElement().sendKeys("Serrfsd555sd");
        addUser.getPasswordAddElement().sendKeys("sss1s2345ss34");
        addUser.getFemaleElement().click();
        addUser.getSubmitElement().click();
        boolean isInserted = addUser.getUsername1().isDisplayed();
        Assert.assertTrue(isInserted);

    }
    @Test(priority = 6)
    public void DuplicatePassword(){
        driver.get(baseUrl);
        addUser.getUsernameAddElement().sendKeys("Sergiu111");
        addUser.getEmailElement().sendKeys("my_email0@gmai222sssx");
        addUser.getFullNameElement().sendKeys("Erika Emerso22ssn");
        addUser.getPasswordAddElement().sendKeys("my_pass1");
        addUser.getFemaleElement().click();
        addUser.getSubmitElement().click();
        boolean isInserted = addUser.getUsername1().isDisplayed();
        Assert.assertTrue(isInserted);

    }
}

