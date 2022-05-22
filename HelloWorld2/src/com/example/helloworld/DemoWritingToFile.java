package com.example.helloworld;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoWritingToFile {
    // main
    public static void main(String[] args) throws IOException {

        long startTime = System.nanoTime();

        // 1 - create a file
        File file1 = new File("out.txt");

        // 2 - create a file writer class
        FileWriter fw = new FileWriter(file1);

        // 3 - create a print writer class
        PrintWriter pw = new PrintWriter(fw);
        int z = 100;
        for (int i = 0; i<=z; i++) {
            pw.println("Line " + i + " some text");
        }
        pw.close();

        // runtime of program
        long endTime = System.nanoTime();
        double totalTime = (double)(endTime - startTime);
        System.out.println(totalTime + "   (runtime in ns)");
        totalTime = (1/1_000_000_000d) * totalTime;
        System.out.println(totalTime + "   (runtime in s)");
        System.out.println(z/totalTime + "   Zeilen pro Sekunde geschrieben");
    }
}
