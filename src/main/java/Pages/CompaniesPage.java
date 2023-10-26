package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompaniesPage {

    WebDriver driver ;

    public CompaniesPage (WebDriver driver )
    {
        this.driver = driver ;
    }

//public static By cathcompany ()
//{
   // return By.className("flex items-center rounded-md text-sm px-4 py-2");
//}

public static By chooseCompany ()
{
    return By.className("choose-company");
}
}
