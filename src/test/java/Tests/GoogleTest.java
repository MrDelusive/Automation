package Tests;

import org.junit.Test;

public class GoogleTest extends TestBase{


    @Test
    public void GoogleTest01() throws Exception
    {
        testCase = "GoogleTest01";

        googleHome.clickSearchBar();
        googleHome.addSearchBar("Selenium");
        googleHome.clickSearch();
    }
}
