package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends BasePage{

    WebDriver driver;

    public GoogleHomePage(WebDriver Driver)
    {
        super(Driver);
        driver = Driver;
    }

    public void clickSearchBar() throws Exception
    {
        fluentClickXPath("//*[@id='searchform']//input[@maxlength='2048']");
    }

    public void addSearchBar(String search) throws Exception
    {
        fluentSendTextXPath("//*[@id='searchform']//input[@maxlength='2048']", search);
    }

    public void clickSearch() throws Exception
    {
        fluentClickXPath("(//input)[7]");
    }

}
