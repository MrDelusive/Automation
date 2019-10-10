package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver Driver)
    {
        driver = Driver;
    }

    public WebElement findElementByXPath(String XPath) throws Exception
    {
        WebElement thisElement = driver.findElement(By.xpath(XPath));

        return thisElement;
    }
}
