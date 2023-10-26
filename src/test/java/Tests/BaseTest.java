package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

    WebDriver driver ;

    @BeforeMethod
    public void init ()
    {
        driver = new ChromeDriver();
        new LoginPage(driver).openwebsite();
    }

//    @AfterMethod
//    public void flush ()
//    {
//        driver.quit();
//    }


}
