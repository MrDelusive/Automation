package Pages;

import Data.Global;
import Pages.DomantasGame.*;
import Pages.Google.*;
import Pages.Seek.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageController extends Global
{
    public WebDriver Driver;
    public PageScan pageScan;

    public GoogleHomePage googleHome;
    public GoogleSearchResultPage googleSearchResult;


    public SeekHomePage seekHome;
    public SeekResultPage seekResult;
    public SeekJobAdPage seekJobAd;

    public Game domantasGamePage;



    public PageController()
    {
        System.setProperty("webdriver.chrome.driver", "M:/Downloads and Files/Automation/chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get(url);

        pageScan = new PageScan(Driver);

        googleHome = new GoogleHomePage(Driver);
        googleSearchResult = new GoogleSearchResultPage(Driver);

        seekHome = new SeekHomePage(Driver);
        seekResult = new SeekResultPage(Driver);
        seekJobAd = new SeekJobAdPage(Driver);

        domantasGamePage = new Game(Driver);

    }


}
