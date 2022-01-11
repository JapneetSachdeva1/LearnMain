package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static utils.CustomDriverMethod.clickElement;

public class Homepage
{
    //Driver object
   // WebDriver driver;

    //Element Locators
    private final By signInButtonHomePage = By.id("a-autoid-0-announce");

    public Homepage() throws IOException
    {
        //driver = initializeWebDriver();
    }

    //Method to Locate

    public void clickSignInButton(WebDriver driver)
    {
        clickElement(driver,signInButtonHomePage);
    }

}
