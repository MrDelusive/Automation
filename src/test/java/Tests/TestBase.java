package Tests;
import Data.Global;
import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestBase extends PageController {



    @Before
    public void setup()
    {

    }

    @After
    public void close()
    {
        Driver.close();
    }


}
