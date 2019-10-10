package Pages;

import Pages.GoogleHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageController
{
    public WebDriver Driver;

    public GoogleHomePage googleHome;


    public PageController()
    {
        System.setProperty("webdriver.chrome.driver", "M:/Downloads and Files/Automation/chromedriver_win32/chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get("https://www.google.com");
        googleHome = new GoogleHomePage(Driver);


    }


}
