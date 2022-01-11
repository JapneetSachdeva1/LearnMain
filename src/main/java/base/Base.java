package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.PropertyReader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Base
{
    public WebDriver driver;
    PropertyReader propertyReader = new PropertyReader();

    public Base() throws IOException
    {
       //getDriver();
    }

    private void initializeWebDriver()
    {
        String browserName = propertyReader.readProperty("browser");
        if(browserName.equals("firefox"))
        {
            System.setProperty("webdriver.firefox.driver", "C:\\Users\\Japneet\\Desktop\\Selenium\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(propertyReader.readProperty("url"));
        }

        else if (browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Japneet\\Desktop\\Selenium\\driver_latest\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(propertyReader.readProperty("url"));
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // return driver;
    }

    public WebDriver getDriver()
    {
        initializeWebDriver();
        return driver;
    }
}
