package Tests;

import Pages.*;
import org.junit.*;

public class TestBase extends PageController {



    @Before
    public void setup()
    {

    }

    @After
    public void close() throws Exception
    {
        file.writeToFile(path,testCase,testPass,additionalData);
        Driver.close();
        Driver.quit();
    }


}
