package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCompanyPage {

    WebDriver  driver ;

    public CreateCompanyPage (WebDriver driver )
    {
       this.driver = driver ;
    }

    public static By welcomeMsgLocator ()
    {
        return By.xpath("//h1[contains(text(),\"Welcome to Peak\")]");
    }

    public static By companyCreatedSuccessfullyMsg ()
    {
        return  By.xpath("//div[contains(text(),\"company created successfully\")]");
    }

    public static By yourCompanyNameField ()
    {
        return By.name("companyName");
    }

    public static By nextButton ()
    {
        return By.xpath("//button[@type=\"submit\"]");
    }



public CompaniesPage createNewCompany (String companyName )
{
    driver.findElement(yourCompanyNameField()).sendKeys(companyName);
    driver.findElement(nextButton()).click();
    return new CompaniesPage(driver);
}


}
