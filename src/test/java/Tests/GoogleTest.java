package Tests;

import org.junit.Test;

public class GoogleTest extends TestBase{


    @Test
    public void GoogleTest01() throws Exception
    {
        page.googleHome.clickSearchBar();
        page.googleHome.addSearchBar("Selenium");
        page.googleHome.clickSearch();
        page.googleHome.clickSearch();
    }
}
