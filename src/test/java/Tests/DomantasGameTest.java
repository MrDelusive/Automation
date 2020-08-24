package Tests;

import org.junit.Test;

public class DomantasGameTest extends TestBase{

    @Test
    public void GoogleTest01() throws Exception
    {
        testCase = "DomantasGameClick";

        domantasGamePage.navigateTo("https://orteil.dashnet.org/igm/?g=Eu4fQRcp");
        domantasGamePage.switchToIFrame();
        for(int i = 0; i < 100; i++) {
            domantasGamePage.clickStartMining();
        }

        domantasGamePage.clickStartMining();

        for(int i = 0; i < 1000; i++)
            domantasGamePage.clickStartMining();

        domantasGamePage.clickStartMining();
    }
}
