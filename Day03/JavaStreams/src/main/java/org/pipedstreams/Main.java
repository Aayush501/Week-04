package org.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a PipedOutputStream and PipedInputStream
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

            // Create and start the writer thread
            SecondThread writerThread = new SecondThread(pipedOutputStream);
            writerThread.start();

            // Create and start the reader thread
            FirstThread readerThread = new FirstThread(pipedInputStream);
            readerThread.start();

            // Wait for both threads to finish
            writerThread.join();
            readerThread.join();
        } catch (IOException | InterruptedException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}