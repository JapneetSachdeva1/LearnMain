package pagetests;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Homepage;

import java.io.IOException;

public class HomePageTest extends Base
{
    WebDriver driver;
    Homepage homepage = new Homepage();

    public HomePageTest() throws IOException
    {driver = getDriver();}

    @Test
    public void SignInClickTest() throws InterruptedException
    {
        homepage.clickSignInButton(driver);
        Thread.sleep(4000);
        //tearDown(driver);
    }

}
