package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver ;


    public LoginPage (WebDriver driver)
    {
        this.driver = driver ;

    }

    //elements

    public  final String URL = "https://app.peaktime.app/auth/login/";

    public static By userName ()
    {
        return By.name("username");
    }

    public static By PASS ()
    {
        return By.name("password");
    }

    public static By loginbutton ()
    {
        return By.xpath("//button[contains(.,Login)]");
    }

    public static By createNewAcclink ()
    {
        return By.xpath("//a[contains(. , \" Create new account\")]");
    }

    public static By successfullRgistrationMsg ()
    {
        return By.xpath("//div[contains(text(),\"Account registered\")]");
    }


    // actions

    public LoginPage openwebsite ()
    {
        driver.navigate().to(URL);
        return new LoginPage(driver);
    }

    public CompaniesPage performLogin (String Email , String pass )
    {
        driver.findElement(userName()).sendKeys(Email);
        driver.findElement(PASS()).sendKeys(pass);
        driver.findElement(loginbutton()).click();
        return new CompaniesPage(driver);
    }

    public RegistrationPage clickCreateACCLink ()
    {
        driver.findElement(createNewAcclink()).click();
        return new RegistrationPage(driver);
    }



}
