import Testare.AddUser;
import Testare.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddUserTest2 {
    String baseUrl = "http://localhost:4200/add";
    public WebDriver driver;
    public LoginPage loginPage;
    public AddUser addUser;

    @BeforeTest
    public void initialSetup() {
        String baseUrl = "http://localhost:4200/add";
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
        Assert.assertEquals(driver.getPageSource().contains("Sergiussa12324"),true);

    }
    @Test(priority = 2)
    public void DuplicateFullName(){
        driver.get(baseUrl);
        addUser.getUsernameAddElement().sendKeys("vasile");
        addUser.getEmailElement().sendKeys("mss@sa");
        addUser.getFullNameElement().sendKeys("dff vcx vbvxv");
        addUser.getPasswordAddElement().sendKeys("saaq11s34");
        addUser.getFemaleElement().click();
        addUser.getSubmitElement().click();
        Assert.assertEquals(driver.getPageSource().contains("dff vcx vbvxv"),true);
    }
    @Test(priority = 3 )
    public void DuplicateUsername(){
        driver.get(baseUrl);
        addUser.getUsernameAddElement().sendKeys("wasile");
        addUser.getEmailElement().sendKeys("ssergsiu@sc5555ssx.sssscom");
        addUser.getFullNameElement().sendKeys("Serrfsds2255ssa5d");
        addUser.getPasswordAddElement().sendKeys("sss1s2555qqws433ss34");
        addUser.getFemaleElement().click();
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());

    }
    @Test(priority = 4 )
    public void DuplicateEmail(){
        driver.get(baseUrl);
        addUser.getUsernameAddElement().sendKeys("Sergiu233");
        addUser.getEmailElement().sendKeys("sszzz@ss");
        addUser.getFullNameElement().sendKeys("Serrfsd555sd");
        addUser.getPasswordAddElement().sendKeys("sss1s2345ss34");
        addUser.getFemaleElement().click();
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());

    }
    @Test(priority = 6)
    public void DuplicatePassword(){
        driver.get(baseUrl);
        addUser.getUsernameAddElement().sendKeys("Sergiu111");
        addUser.getEmailElement().sendKeys("my_email0@gmai222sssx");
        addUser.getFullNameElement().sendKeys("Erika Emerso22ssn");
        addUser.getPasswordAddElement().sendKeys("lll11");
        addUser.getFemaleElement().click();
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());
    }
}

