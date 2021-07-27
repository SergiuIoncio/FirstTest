import Testare.AddUser;
import Testare.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.EmailableReporter;

public class AddUserTest {
    String baseUrl = "http://localhost:4200/add";
    public WebDriver driver;
    public LoginPage loginPage;
    public AddUser addUser;

    @BeforeTest
    public void initialSetup() {
        String baseUrl = "http://localhost:4200/users";
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        addUser = new AddUser(driver);
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void AddUserButton() {
        addUser.getAddUserElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div")).isDisplayed());
    }

    @Test(priority = 2)
    public void UsernameAdd() {
        driver.get(baseUrl);
        addUser.getUsernameAddElement().sendKeys("Afdsfsd");
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());
        driver.close();
    }

    @Test(priority = 3)
    public void Email() {
        driver.get(baseUrl);
        addUser.getEmailElement().sendKeys("sss@sff");
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());
        driver.close();
    }

    @Test(priority = 4)
    public void FullName() {
        driver.get(baseUrl);
        addUser.getFullNameElement().sendKeys("Serrfd");
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());
        driver.close();
    }

    @Test(priority = 5)
    public void PasswordAdd() {
        driver.get(baseUrl);
        addUser.getPasswordAddElement().sendKeys("sss123");
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());
        driver.close();
    }

    @Test(priority = 6)
    public void Focused() {
        driver.get(baseUrl);
        addUser.getFocusedElement().click();
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());
        driver.close();
    }

    @Test(priority = 7)
    public void Caring() {
        driver.get(baseUrl);
        addUser.getCarringElement().click();
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());
        driver.close();
    }

    @Test(priority = 8)
    public void Perfectionist() {
        driver.get(baseUrl);
        addUser.getPerfectionistElement().click();
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());
        driver.close();
    }

    @Test(priority = 9)
    public void Courageours() {
        driver.get(baseUrl);
        addUser.getCourageousElement().click();
        addUser.getSubmitElement();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());
        driver.close();
    }

    @Test(priority = 10)
    public void Male() {
        driver.get(baseUrl);
        addUser.getMaleElement().click();
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());
        driver.close();
    }

    @Test(priority = 11)
    public void Female() {
        driver.get(baseUrl);
        addUser.getFemaleElement().click();
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());
        driver.close();
    }

    @Test(priority = 12)
    public void Appache() {
        driver.get(baseUrl);
        addUser.getAppacheElement().click();
        addUser.getSubmitElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-addmodal/div/div/form/button/span[1]")).isSelected());
        driver.quit();
    }

}
