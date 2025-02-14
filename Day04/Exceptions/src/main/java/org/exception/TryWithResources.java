package org.exception;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        String filePath = "info.txt"; // file path of a non-existing file
        File file = new File(filePath); // File object

        // reading the file and handling the exception
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) { // try with resources
            // FileReader object wrapped in BufferedReader
            String line = reader.readLine(); // reading the first line
            System.out.println(line);
        } catch (IOException i) { // handling the exception if file not found
            System.out.println("Error reading file");
        }
    }
}
