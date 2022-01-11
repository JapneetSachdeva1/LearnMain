package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CustomDriverMethod;
import utils.ExtentReporterNG;
import utils.PropertyReader;

import java.io.IOException;

import static utils.CustomDriverMethod.clickElement;
import static utils.CustomDriverMethod.sendText;
import static utils.ExtentReporterNG.*;

public class LoginPage
{
    //Class Objects
    private final PropertyReader prop = new PropertyReader();
   // private final ExtentReporterNG log = new ExtentReporterNG();
    //Find Elements
    private final By homePageSignInButton =By.xpath("//*[@id='nav-signin-tooltip']/a/span");
    private final By loginUsername = By.id("ap_email");
    private final By continueButton = By.id("continue");
    //private final By continueButton = By.id("continuee");
    private final By loginPassword = By.id("ap_password");
    //private final By signInButton = By.id("signInSubmit");
    private final By signInButton = By.id("signInSubmit");


    public LoginPage() throws IOException
    {}

    //Locator Methods

    public void accountLogin(WebDriver driver) throws InterruptedException
    {
        getReports("Account Login");
        sendText(driver, loginUsername, prop.readProperty("username")); //sends keys
        logInfo("entered username");
        clickElement(driver, continueButton);
        logInfo("Clicked on continue button");
        sendText(driver, loginPassword, prop.readProperty("password"));
        logInfo("Entered Password");
        clickElement(driver, signInButton);
        logInfo("Clicked on SignIn button");

        //Success
        logPass("Test Success!!!");
        addDataToReport();
    }


}