package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends BasePage{

    WebDriver driver;

    WebElement thisElement;

    public GoogleHomePage(WebDriver Driver)
    {
        super(Driver);
        driver = Driver;
    }

    public void clickSearchBar() throws Exception
    {
        thisElement = findElementByXPath("//*[@id='searchform']//input[@maxlength='2048']");
        thisElement.click();
    }

    public void addSearchBar(String search) throws Exception
    {
        thisElement = findElementByXPath("//*[@id='searchform']//input[@maxlength='2048']");
        thisElement.sendKeys(search);
    }

    public void clickSearch() throws Exception
    {
        thisElement = findElementByXPath("(//input)[7]");
        thisElement.click();
    }

}
