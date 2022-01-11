package utils;

import base.Base;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

import static utils.CaptureScreenshot.captureScreenshot;
import static utils.ExtentReporterNG.*;

public class TestListener extends Base implements ITestListener
{
    public TestListener() throws IOException
    {}
    //Base base = new Base();

    @Override
    public void onTestStart(ITestResult iTestResult)
    {


    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @SneakyThrows
    @Override
    public void onTestFailure(ITestResult iTestResult)
    {
       WebDriver driver = (WebDriver) iTestResult.getTestClass().getRealClass().getDeclaredField("driver").get(iTestResult.getInstance());//to webdriver instance from actual Testclass
        captureScreenshot(driver,iTestResult.getMethod().getMethodName());
        //getReports("OnTestFailure Screenshot");
        logInfo("Screenshot Taken!!");
        addDataToReport();

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
