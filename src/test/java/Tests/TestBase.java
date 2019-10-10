package Tests;
import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {

    PageController page = new PageController();

    @Before
    public void setup()
    {

    }

    @After
    public void close()
    {
        page.Driver.close();
    }


}
