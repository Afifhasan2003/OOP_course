package filestream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteIntoFile {
    private File file;

    public WriteIntoFile(String path) {
        this.file = new File(path);
        try {
            if ( !file.exists())  file.createNewFile();
        } catch (IOException e) {
            System.out.printf("Error creating file %s\n", path);
        }
    }

    public void method1(String str){
        try {
            Files.writeString(Path.of(file.getPath()), str);
        } catch (IOException e) {
            System.out.println("Error writing to file using method 1: " + e.getMessage());
        }
    }

    public void method2(String str){
        this.method3(str, false);
    }

    public void method3(String str, boolean append){
        try {
            FileWriter fw = new FileWriter(file, append);
            fw.write(str);
            fw.close();
        } catch (IOException e) {
            System.out.println("File writer error: " +  e.getMessage());
        }
    }

    public void method4(String str){
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            for( char ch: str.toCharArray() ) fos.write(ch);
            fos.close();
        } catch (IOException e) {
            System.out.println("Inside method 4: " + e.getMessage());
        }
    }


    public void method5(String str){
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
            for( char ch: str.toCharArray() ) bos.write(ch);
            bos.close();
        } catch (IOException e) {
            System.out.println("Error in method 5: "  + e.getMessage());
        }
    }

    public void method6(String str){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(str);
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
