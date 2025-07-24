import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File inputPath = new File("IO_files/input.txt");
            File outputPath = new File("IO_files/output.txt");
            
            streamed streamed = new streamed();
            streamed.readAndWriteByStream(inputPath, outputPath);
            System.out.println("File copied successfully!");

            Buffered buffered = new Buffered();
            buffered.readAndWriteByBuffer(inputPath, outputPath);
            System.out.println("Buffer copied successfully!");

            Reader reader = new Reader();
            reader.readAndWriteByReaderandWrite(inputPath, outputPath);
            System.out.println("Reader & writer read successfully!");
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}