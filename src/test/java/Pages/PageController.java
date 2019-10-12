package Pages;

import Data.Global;
import Pages.Google.GoogleHomePage;
import Pages.Google.GoogleSearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageController extends Global
{
    public WebDriver Driver;
    public PageScan pageScan;

    public GoogleHomePage googleHome;
    public GoogleSearchResultPage googleSearchResult;




    public PageController()
    {
        System.setProperty("webdriver.chrome.driver", "M:/Downloads and Files/Automation/chromedriver_win32/chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get(url);

        pageScan = new PageScan(Driver);

        googleHome = new GoogleHomePage(Driver);
        googleSearchResult = new GoogleSearchResultPage(Driver);


    }


}
