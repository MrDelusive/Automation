package Pages;

import Data.Global;
import Pages.GoogleHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageController extends Global
{
    public WebDriver Driver;

    public GoogleHomePage googleHome;


    public PageController()
    {
        System.setProperty("webdriver.chrome.driver", "M:/Downloads and Files/Automation/chromedriver_win32/chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get(url);
        googleHome = new GoogleHomePage(Driver);


    }


}
