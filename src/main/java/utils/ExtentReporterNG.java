package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG
{
    private static ExtentReports reports;
    private static ExtentTest test;

    public static ExtentReports getReports(String testName)
    {
        //path where to save the report
        String path = System.getProperty("user.dir")+"\\reports\\index.html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Test Results"); //setting report name
        reporter.config().setDocumentTitle("Test Results"); //setting doc title

        reports = new ExtentReports();
        reports.attachReporter(reporter); //setting path for saving the report
        reports.setSystemInfo("Tester", "Japneet"); //details
        test = reports.createTest(testName); //setting name for test
        return reports;
    }

    public static void logInfo(String data)
    {
        test.log(Status.INFO,data);
    }

    public static void logPass (String data)
    {
        test.log(Status.PASS,data);
    }

    public void logFail(String data)
    {
        test.log(Status.FAIL, data);
    }

    public static void addDataToReport()
    {
        reports.flush();
    }
}
