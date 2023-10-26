package Tests;

import Pages.CompaniesPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest  extends BaseTest{


    private  final String ValidEmail= "rabab.elsaid.gaber@gmail.com";
    private final String ValidPass= "12345678";

    //private final String companyName = "rabab company" ;

    @Test
    public void  tesLogin  ()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        new LoginPage(driver).performLogin("rabab.elsaid.gaber@gmail.com","12345678");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Assert.assertTrue(driver.findElement(CompaniesPage.chooseCompany()).isDisplayed());
    }

}
