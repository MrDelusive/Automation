package Data;

import org.apache.commons.net.ftp.*;

import java.io.*;

public class URLConnect {

    private static void showServerReply(FTPClient ftpClient) {
        String[] replies = ftpClient.getReplyStrings();
        if (replies != null && replies.length > 0) {
            for (String aReply : replies) {
                System.out.println("SERVER: " + aReply);
            }
        }
    }

    public void connectToFTP(FTPClient ftpClient, String server, String user, String pass, int port) throws Exception
    {
        // IF ERROR
        // netsh advfirewall set global StatefulFTP disable

        try {
            ftpClient.connect(server, port);
            showServerReply(ftpClient);
            int replyCode = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(replyCode)) {
                System.out.println("Operation failed. Server reply code: " + replyCode);
                throw new Exception("Connection Failed");
            }
            boolean success = ftpClient.login(user, pass);

            showServerReply(ftpClient);
            if (!success) {
                System.out.println("Could not login to the server");
                throw new Exception("Connection Failed");
            }
        } catch (IOException ex) {
            System.out.println("Oops! Something wrong happened");
            throw new Exception(ex);
        }
    }

    public void getFile(FTPClient ftpClient, String fileName) throws Exception
    {
        System.out.println("LOGGED IN SERVER");
        ftpClient.enterLocalPassiveMode();
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

        String remoteFile1 = "/anon/gen/fwo/" + fileName;
        File downloadFile1 = new File("M:/Downloads and Files/Automation/Results/" + fileName);
        OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(downloadFile1));
        boolean successDL = ftpClient.retrieveFile(remoteFile1, outputStream1);
        outputStream1.close();

        if (successDL)
            System.out.println("File " + fileName + " has been downloaded successfully.");
        else
            throw new Exception("File was not retrieved");


    }
}
