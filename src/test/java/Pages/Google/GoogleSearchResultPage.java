package Pages.Google;

import Pages.BasePage;
import org.openqa.selenium.*;

public class GoogleSearchResultPage extends BasePage {

    WebDriver driver;

    public GoogleSearchResultPage(WebDriver Driver)
    {
        super(Driver);
        driver = Driver;
    }

    // Only from conversion search
    public String getConversionResult()
    {
        return driver.findElement(By.xpath("//*[@id='knowledge-currency__updatable-data-column']/div[@data-exchange-rate]")).getAttribute("data-exchange-rate");
    }

}
