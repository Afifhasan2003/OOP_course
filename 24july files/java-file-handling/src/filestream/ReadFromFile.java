package filestream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFromFile {
    private File file;

    public ReadFromFile(String path){
        this.file = new File(path);
        try {
            if (!this.file.exists()) this.file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error creating file.");
        }
    }


    public void method1() {
        try {
            String lines = Files.readString(Path.of(file.getAbsolutePath()));
            System.out.println("Content of file: "  + lines);
        } catch (IOException e) {
            System.out.println("In method 1: " + e.getMessage());
        }
    }

    public String read() {
        try {
            String lines = Files.readString(Path.of(file.getAbsolutePath()));
            return lines;
        } catch (IOException e) {
            System.out.println("In method 1: " + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }


    public void method2(){
        try {
            Scanner sc = new Scanner(file);
            System.out.print("Reading using scanner: ");
            while( sc.hasNextLine() ){
                System.out.print(sc.nextLine() + " - ");
            }
            System.out.println();
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("In method 2: " + e.getMessage());
        }
    }


    public void method3(){
        try {
            FileReader reader = new FileReader(file);
            int character;
            System.out.print("Reading using fileReader: ");
            while ((character = reader.read()) != -1)  System.out.print((char) character);
            System.out.println();
            reader.close();
        } catch (IOException e) {
            System.out.println("Error in reading in method 3: " + e.getMessage());
        }
    }


    public void method4(){
        try {
            FileInputStream fis = new FileInputStream(file);
            System.out.print("Reading using stream: ");
            int ch;
            while( ( ch = fis.read()) != -1 )  System.out.print((char) ch );
            System.out.println();
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public void method5(){
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            int ch;
            System.out.print("Reading using buffer: ");
            while( (ch = bis.read()) != -1 ) System.out.print((char)ch);
            System.out.println();
            bis.close();
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }


    public void method6(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            System.out.print("Reading using BufferedReader: ");
            System.out.print(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("Error in reading in method 6: " + e.getMessage());
        }
    }

}
