package Tests;

import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class BOMTest extends TestBase {

    @Test
    public void BOMFTPFileGrab() throws Exception
    {
        testCase = "BOMFTPFileGrab";
        FTPClient ftpClient = new FTPClient();

        urlConnect.connectToFTP(ftpClient,"ftp2.bom.gov.au","anonymous","guest",21);
        urlConnect.getFile(ftpClient,"IDV10310.amoc.xml");
        urlConnect.getFile(ftpClient,"IDV10753.xml");
    }

}
