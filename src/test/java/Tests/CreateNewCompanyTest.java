package Tests;

import Pages.CompaniesPage;
import Pages.CreateCompanyPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class CreateNewCompanyTest extends BaseTest {

    @Test
    public void validateCreateNewCompany ()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        new LoginPage(driver).clickCreateACCLink().performRegistration("testautomation", "firsttest", "secondtest6@gmail.com", "12345678", "12345678");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new CreateCompanyPage(driver).createNewCompany("automationCompany1");
        Assert.assertTrue(driver.findElement(CreateCompanyPage.companyCreatedSuccessfullyMsg()).isDisplayed());
    }
}
