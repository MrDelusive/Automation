package Data;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileHandle {

    public void writeToFile(String path, String testCase, boolean testPass, String additionalData) throws Exception {

        BufferedWriter writer = new BufferedWriter(new FileWriter(path + "TestData.csv", true));
        writer.write(testCase + "," + String.valueOf(testPass) + "," + additionalData + "\n");

        writer.close();
    }

}
