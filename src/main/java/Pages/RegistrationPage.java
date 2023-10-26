package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    WebDriver driver ;

    public RegistrationPage (WebDriver driver )

    {
        this.driver = driver ;

    }

    public static By fullNameLabel ()
    {
        return By.xpath("//label[contains(.,\"Full Name\")]");
    }

    public static  By fullNameField ()
    {
        return By.xpath("//input[@placeholder=\"John Doe\"]");
    }

    public static  By userNameField ()
    {
        return By.xpath("//input[@placeholder=\"John858\"]");
    }


    public static  By emailField ()
    {
        return By.xpath("//input[@placeholder=\"example@domain.com\"]");
    }


   public static By passwordField ()
   {
       return By.xpath("//input[@name=\"password\"]");
   }

    public static By confirmPasswordField ()
    {
        return By.xpath("//input[@name=\"confirmPassword\"]");
    }
    public static By submitButton ()
    {
        return By.xpath("//button[@type=\"submit\"]");
    }


    //actions

    public LoginPage performRegistration (String fullName , String userName , String email , String password , String confirm_pass)
    {
        driver.findElement(fullNameField()).sendKeys(fullName);
        driver.findElement(userNameField()).sendKeys(userName);
        driver.findElement(emailField()).sendKeys(email);
        driver.findElement(passwordField()).sendKeys(password);
        driver.findElement(confirmPasswordField()).sendKeys(confirm_pass);
        driver.findElement(submitButton()).click();
        return new LoginPage(driver);
    }






}
