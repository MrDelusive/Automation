package Pages;

import org.openqa.selenium.*;

public class PageScan extends BasePage {

    WebDriver driver;

    public PageScan(WebDriver Driver)
    {
        super(Driver);
        driver = Driver;
    }

    public int countInputFields()
    {
        return driver.findElements(By.xpath("//input")).size();
    }

}
