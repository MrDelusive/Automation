package Pages.DomantasGame;

import Pages.BasePage;
import org.openqa.selenium.*;

public class Game extends BasePage {

    WebDriver driver;

    public Game(WebDriver Driver)
    {
        super(Driver);
        driver = Driver;
    }

    public void switchToIFrame() throws Exception
    {
        fluentWaitByID("player", 8);
        driver.switchTo().frame("player");
    }

    public void clickStartMining() throws Exception
    {
        fluentClickID("thing-0");
    }


}
