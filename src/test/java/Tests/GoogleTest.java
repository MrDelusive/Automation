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

    @Test
    public void GoogleTest01Dupe() throws Exception
    {
        testCase = "GoogleTest01Dupe";
        int count = pageScan.countInputFields();
        googleHome.clickSearchBar();
        googleHome.addSearchBar("Selenium");
        googleHome.clickSearch();
        additionalData = String.valueOf(count);
    }

    @Test
    public void GoogleTest02AUDToJPY() throws Exception
    {
        testCase = "GoogleTestAUDToJPY";
        googleHome.clickSearchBar();
        googleHome.addSearchBar("aud to jpy");
        googleHome.clickSearch();
        additionalData = googleSearchResult.getConversionResult();
    }
}
