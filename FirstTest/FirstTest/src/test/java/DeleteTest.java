import Testare.AddUser;
import Testare.DeleteUser;
import Testare.EditUser;
import Testare.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteTest {

    String baseUrl = "http://localhost:4200/users";
    public WebDriver driver;
    public LoginPage loginPage;
    public AddUser addUser;
    public EditUser editUser;
    public DeleteUser deleteUser;

    @BeforeTest
    public void initialSetup() {

        driver = new FirefoxDriver();
        driver.get(baseUrl);
        addUser = new AddUser(driver);
        editUser = new EditUser(driver);
        deleteUser = new DeleteUser(driver);
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void DeleteUserButton() {
        deleteUser.getDeleteButton().click();
        deleteUser.getYesButtonElement().click();
        Assert.assertTrue(driver.findElement(By.className("mat-button-wrapper")).isEnabled());
    }
    @Test(priority = 1)
    public void CancelDeleteUser(){
        deleteUser.getDeleteButton().click();
        deleteUser.getCancelButtonElement().click();
        Assert.assertTrue(driver.findElement(By.className("mat-button-wrapper")).isEnabled());
    }

}