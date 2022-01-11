package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomDriverMethod
{
    public static void findElement(WebDriver driver, By locatorName)
    {
        driver.findElement(locatorName);
    }

    public static void sendText (WebDriver driver, By locatorName, String propertyName)
    {
        driver.findElement(locatorName).sendKeys(propertyName);
    }

    public static void clickElement(WebDriver driver, By locatorName)
    {
        driver.findElement(locatorName).click();
    }

//    public static void tearDown(WebDriver driver)
//    {
//        driver.quit();
//    }
}
