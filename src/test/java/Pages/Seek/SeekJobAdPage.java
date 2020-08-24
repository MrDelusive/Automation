package Pages.Seek;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeekJobAdPage extends BasePage {

    WebDriver Driver;

    public SeekJobAdPage(WebDriver driver)
    {
        super(driver);
        Driver = driver;
    }

    public String getJobTitle() throws Exception
    {
        return Driver.findElement(By.xpath("//article//span[@data-automation='job-detail-title']/span/h1")).getText();
    }

    public boolean checkIfTitleContainsString(String name)
    {
        String thisString = Driver.findElement(
                By.xpath("//article//span[@data-automation='job-detail-title']/span/h1")).getText();

        if(thisString.contains(name))
            return true;

        return false;
    }

    public void clickApplyForJob() throws Exception
    {
        fluentClickXPath("//section//*[@data-automation='job-detail-apply']");
    }


}
