package Pages.Seek;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;

public class SeekResultPage extends BasePage {

    WebDriver driver;

    public SeekResultPage(WebDriver Driver)
    {
        super(Driver);
        driver = Driver;
    }


    public void clickResultByNumber(int res) throws Exception
    {
        fluentClickXPath("(//*[@data-automation='jobTitle'])[" + res +"]");
    }

}
