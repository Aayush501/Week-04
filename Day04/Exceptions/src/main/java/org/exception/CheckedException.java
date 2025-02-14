package org.exception;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        String filePath = "data.txt"; // file path of a non-existing file
        File file = new File(filePath); // File object

        // reading the file and handling the exception
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file)); // FileReader object wrapped in BufferedReader
            String line; // to store the read line
            while((line = reader.readLine()) != null) { // reading the file
                System.out.println(line); // displaying the line
            }
        }
        // handling the exception if file not found
        catch (FileNotFoundException e) {
             System.out.println("File Not Found.");
        }
    }
}