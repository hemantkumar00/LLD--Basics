package com.advanceJava.Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderMethodExample {
    static void main() {
        try {
            String fileName = "FileReaderMethodExample.java";
            readFile(fileName);
        }catch (FileNotFoundException e){
            System.err.println("FileNotFoundException: " + e.getMessage());
        }
    }

    // Method with a throws clause
    static void readFile(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
        // Code continues.
    }
}
