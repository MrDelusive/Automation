package Tests;

import Data.Classification;
import org.junit.Test;

public class SeekTest extends TestBase {

    @Test
    public void SeekTest01() throws Exception
    {
        testCase = "SeekTest01";

        seekHome.navigateTo("http://www.seek.com.au");
        seekHome.selectClassification(Classification.ITANDCT);
        seekHome.addKeyword("Selenium");
        seekHome.addWhere("Melbourne");
        seekHome.clickSeek();

        seekResult.clickResultByNumber(1);

        if(seekJobAd.checkIfTitleContainsString("Automation")
            || seekJobAd.checkIfTitleContainsString("automation")
            || seekJobAd.checkIfTitleContainsString("Selenium"))
        {
            seekJobAd.clickApplyForJob();
        }

    }
}
