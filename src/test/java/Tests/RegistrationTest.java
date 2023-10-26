package Tests;

import Pages.LoginPage;
import Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationTest  extends  BaseTest {


    @Test
    public void testNavToRegistration ()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        new LoginPage(driver).clickCreateACCLink();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Assert.assertTrue(driver.findElement(RegistrationPage.fullNameLabel()).isDisplayed());
    }

    @Test
    public void validateValidRegistration ()
    {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new LoginPage(driver).clickCreateACCLink().performRegistration("testautomation","firsttest","secondtest@gmail.com","12345678","12345678");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Assert.assertTrue(driver.findElement(LoginPage.userName()).isDisplayed());

    }





}
