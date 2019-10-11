package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver Driver)
    {
        driver = Driver;
    }

    // Waits
    public void fluentWaitByID(String ID, int seconds) throws Exception
    {
        Wait wait = new WebDriverWait(driver, seconds);
        try
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID)));
        }
        catch(Exception e)
        {
            throw new Exception("No Element found with ID: " + ID);
        }
    }
    public void fluentWaitByID(String ID) throws Exception
    {
        Wait wait = new WebDriverWait(driver, 3);
        try
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID)));
        }
        catch(Exception e)
        {
            throw new Exception("No Element found with ID: " + ID);
        }
    }

    public void fluentWaitByXPath(String XPath, int seconds) throws Exception
    {
        Wait wait = new WebDriverWait(driver, seconds);
        try
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPath)));
        }
        catch(Exception e)
        {
            throw new Exception("No Element found with XPath: " + XPath);
        }
    }
    public void fluentWaitByXPath(String XPath) throws Exception
    {
        Wait wait = new WebDriverWait(driver, 3);
        try
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPath)));
        }
        catch(Exception e)
        {
            throw new Exception("No Element found with XPath: " + XPath);
        }
    }
    // End Waits

    // Click Elements
    public void fluentClickID(String ID) throws Exception
    {
        fluentWaitByID(ID);
        try
        {
            driver.findElement(By.id(ID)).click();
        }
        catch(Exception e)
        {
            throw new Exception("Element not clickable at ID: " + ID);
        }
    }

    public void fluentClickXPath(String XPath) throws Exception
    {
        fluentWaitByXPath(XPath);
        try
        {
            driver.findElement(By.xpath(XPath)).click();
        }
        catch(Exception e)
        {
            throw new Exception("Element not clickable at XPath: " + XPath);
        }
    }
    // End Click Elements

    // Send Text Element
    public void fluentSendTextID(String ID, String text) throws Exception
    {
        fluentWaitByID(ID);
        try
        {
            driver.findElement(By.id(ID)).sendKeys(text);
        }
        catch(Exception e)
        {
            throw new Exception("Cannot send text at ID: " + ID);
        }
    }

    public void fluentSendTextXPath(String XPath, String text) throws Exception
    {
        fluentWaitByXPath(XPath);
        try
        {
            driver.findElement(By.xpath(XPath)).sendKeys(text);
        }
        catch(Exception e)
        {
            throw new Exception("Cannot send text at XPath: " + XPath);
        }
    }
}
