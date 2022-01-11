package utils;

import base.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot extends Base
{
    //private static final ExtentReporterNG reporterNG = new ExtentReporterNG();;
   // ExtentReporterNG reporterNG;

    public CaptureScreenshot() throws IOException {
    }

    public static void captureScreenshot(WebDriver driver,String screenshotName)
    {
        try
        {
            TakesScreenshot ts=(TakesScreenshot) driver ;

            File source=ts.getScreenshotAs(OutputType.FILE);

            FileHandler.copy(source, new File("./failedTests/Screenshots/"+screenshotName+".png"));

           // reporterNG.logInfo("Screenshot Taken");
            System.out.println("Screenshot taken");

        }
        catch (Exception e)
        {

            System.out.println("Exception while taking screenshot "+e.getMessage());
           // reporterNG.logInfo("Exception while taking screenshot"+e.getMessage());
        }
    }

}
