package Pages.Seek;

import Data.Classification;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;

public class SeekHomePage extends BasePage {

    WebDriver driver;

    public SeekHomePage(WebDriver Driver)
    {
        super(Driver);
        driver = Driver;
    }

    public void addKeyword(String keyword) throws Exception
    {
        fluentClickID("keywords-input");
        fluentSendTextID("keywords-input", keyword);
    }

    public void selectClassification(Classification classification) throws Exception
    {
        fluentClickXPath("//*[@data-automation='classificationDropDownList']");
        fluentClickXPath("//*[@id='classificationsPanel']//span[text()='" + classification.toString() + "']");
        fluentClickXPath("//*[@data-automation='classificationDropDownList']");
    }

    public void addWhere(String where) throws Exception
    {
        fluentSendTextID("SearchBar__Where", where);
    }

    public void clickSeek() throws Exception
    {
        fluentClickXPath("//*[@data-automation='searchButton']");
    }


}
