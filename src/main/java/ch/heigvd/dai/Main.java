package ch.heigvd.dai;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Size in byte : 1B");
        // Measure the time to write a binary file (e.g : 1 byte, no buffer and binary file)
        Measure.write("binary1B.bin", 1, false, Measure.FileType.BINARY);
        Measure.write("binary_buffered1B.bin", 1, true, Measure.FileType.BINARY);

        // Measure the time to read the same binary file
        Measure.read("binary1B.bin", false, Measure.FileType.BINARY);
        Measure.read("binary_buffered1B.bin",true, Measure.FileType.BINARY);


        // Measure the time to write a text file (e.g : 1 byte, no buffer and binary file)
        Measure.write("file1B.txt", 1, false, Measure.FileType.TEXT);
        Measure.write("buffered_file1B.txt", 1, true, Measure.FileType.TEXT);

        // Measure the time to read the same text file
        Measure.read("file1B.txt", false, Measure.FileType.TEXT);
        Measure.read("buffered_file1B.txt",true, Measure.FileType.TEXT);



        System.out.println(" ");
        System.out.println("Size in byte : 1 KB");
        // Measure the time to write a binary file (e.g : 1 byte, no buffer and binary file)
        Measure.write("binary1KB.bin", 1024, false, Measure.FileType.BINARY);
        Measure.write("binary_buffered1KB.bin", 1024, true, Measure.FileType.BINARY);

        // Measure the time to read the same binary file
        Measure.read("binary1KB.bin", false, Measure.FileType.BINARY);
        Measure.read("binary_buffered1KB.bin",true, Measure.FileType.BINARY);


        // Measure the time to write a text file (e.g : 1 byte, no buffer and binary file)
        Measure.write("file1KB.txt", 1024, false, Measure.FileType.TEXT);
        Measure.write("buffered_file1KB.txt", 1024, true, Measure.FileType.TEXT);

        // Measure the time to read the same text file
        Measure.read("file1KB.txt", false, Measure.FileType.TEXT);
        Measure.read("buffered_file1KB.txt",true, Measure.FileType.TEXT);





        System.out.println(" ");
        System.out.println("Size in byte : 1MB");
        // Measure the time to write a binary file (e.g : 1 byte, no buffer and binary file)
        Measure.write("binary1MB.bin", 1024 * 1024, false, Measure.FileType.BINARY);
        Measure.write("binary_buffered1MB.bin", 1024 * 1024, true, Measure.FileType.BINARY);

        // Measure the time to read the same binary file
        Measure.read("binary1MB.bin", false, Measure.FileType.BINARY);
        Measure.read("binary_buffered1MB.bin",true, Measure.FileType.BINARY);


        // Measure the time to write a text file (e.g : 1 byte, no buffer and binary file)
        Measure.write("file1MB.txt", 1024 * 1024, false, Measure.FileType.TEXT);
        Measure.write("buffered_file1MB.txt", 1024 * 1024, true, Measure.FileType.TEXT);

        // Measure the time to read the same text file
        Measure.read("file1MB.txt", false, Measure.FileType.TEXT);
        Measure.read("buffered_file1MB.txt",true, Measure.FileType.TEXT);

    }
}
