package pagetests;

import base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;
import java.io.File;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.CaptureScreenshot;
import utils.TestListener;


import java.io.IOException;

import static utils.CaptureScreenshot.captureScreenshot;


@Listeners(TestListener.class)
public class LoginTest extends Base
{
    //driver object is initialized and accessible to entire class
    public WebDriver driver = getDriver();
    LoginPage loginPage = new LoginPage();
    Homepage homepage = new Homepage();

    public LoginTest() throws IOException {//getDriver();}
    }

    @Test
    public void SignInTest() throws InterruptedException
    {
        homepage.clickSignInButton(driver);
        Thread.sleep(2000);
        loginPage.accountLogin(driver);
        Thread.sleep(3000);
        System.out.println("Hi");
        System.out.println("I");
        System.out.println("Am");
        System.out.println("From GitHub updated by MEEEEEE!!");
    }

//    @AfterMethod
//    public void onFailScreenshot(ITestResult result)
//    {
//        if(ITestResult.FAILURE == result.getStatus())
//        {
//            captureScreenshot(driver,result.getMethod().getMethodName());
//        }
//
//        else
//        {
//            System.out.println("Test Completed Successfully!!!");
//        }
//        driver.quit();
//    }

}
