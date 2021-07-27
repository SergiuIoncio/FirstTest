import Testare.AddUser;
import Testare.EditUser;
import Testare.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditTest {

    String baseUrl = "http://localhost:4200/edit/85";
    public WebDriver driver;
    public LoginPage loginPage;
    public AddUser addUser;
    public EditUser editUser;

    @BeforeTest
    public void initialSetup() {

        String baseUrl = "http://localhost:4200/users";
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        addUser = new AddUser(driver);
        editUser = new EditUser(driver);
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void EditUserButton() {
        editUser.getEditButtonElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-editmodal/div/div/div")).isDisplayed());
    }

    @Test(priority = 1)
    public void EditUsernameAdd() {
        driver.get(baseUrl);
        editUser.getUsernameAddElement().clear();
        editUser.getUsernameAddElement().sendKeys("Afdsfsd");
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[1]")).isDisplayed());

    }

    @Test(priority = 2)
    public void EditEmail() {
        driver.get(baseUrl);
        editUser.getEmailElement().clear();
        editUser.getEmailElement().sendKeys("Afdsfsd@yahoo.com");
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[1]")).isDisplayed());

    }

    @Test(priority = 3)
    public void EditFullName() {
        driver.get(baseUrl);
        editUser.getFullNameElement().clear();
        editUser.getFullNameElement().sendKeys("AfdsssWWW");
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[1]")).isDisplayed());

    }

    @Test(priority = 4)
    public void EditPasswordAdd() {
        driver.get(baseUrl);
        editUser.getPasswordAddElement().clear();
        editUser.getPasswordAddElement().sendKeys("AfdsssWWW1111");
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[1]")).isDisplayed());

    }

    @Test(priority = 5)
    public void Focused() {
        driver.get(baseUrl);
        editUser.getEditFocusedElement().click();
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[1]")).isDisplayed());

    }

    @Test(priority = 6)
    public void EditCaring() {
        driver.get(baseUrl);
        editUser.getEditCarringElement().click();
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[1]")).isDisplayed());

    }

    @Test(priority = 7)
    public void EditPerfectionist() {
        driver.get(baseUrl);
        editUser.getEditPerfectionistElement().click();
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[1]")).isDisplayed());

    }

    @Test(priority = 8)
    public void EditCourageours() {
        driver.get(baseUrl);
        editUser.getEditCourageousElement().click();
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[1]")).isDisplayed());

    }

    @Test(priority = 9)
    public void EditMale() {
        driver.get(baseUrl);
        editUser.getEditMaleElement().click();
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[1]")).isDisplayed());

    }

    @Test(priority = 10)
    public void EditFemale() {
        driver.get(baseUrl);
        editUser.getEditFemaleElement().click();
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[1]")).isDisplayed());

    }

    @Test(priority = 11)
    public void EditAppache() {
        driver.get(baseUrl);
        editUser.getEditApacheElement().click();
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-root/app-users/app-user-card[1]")).isDisplayed());

    }

    @Test(priority = 12)
    public void FullComplete() {
        driver.get(baseUrl);
        editUser.getUsernameAddElement().clear();
        editUser.getUsernameAddElement().sendKeys("Andreis");
        editUser.getEmailElement().clear();
        editUser.getEmailElement().sendKeys("Sergiu_ioncio@yahoo.com");
        editUser.getFullNameElement().clear();
        editUser.getFullNameElement().sendKeys("Sergiu Ioncio");
        editUser.getPasswordAddElement().clear();
        editUser.getPasswordAddElement().sendKeys("Sergiu111");
        editUser.getEditFocusedElement().click();
        editUser.getEditCourageousElement().click();
        editUser.getEditApacheElement().click();
        editUser.getSubmitEditElement().click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='lilCel'][contains(.,'Username: Andreis')]")).getText().toString().contains("Andreis"));
        //boolean isInserted = addUser.getUsername1().isDisplayed();
        //Assert.assertTrue(isInserted);
    }
}
