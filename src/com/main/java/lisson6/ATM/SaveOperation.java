package com.main.java.lisson6.ATM;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveOperation {
    public static void writeToFile(String path, String whatToSave) throws IOException {
        File file1 = new File(path);
        FileWriter in = new FileWriter(file1);
        in.write(whatToSave);
        in.close();
    }
}
