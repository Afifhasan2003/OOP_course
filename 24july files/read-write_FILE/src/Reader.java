import java.io.*;

public class Reader {
    public void readAndWriteByReaderandWrite(File pathI, File pathO) throws IOException {
        FileReader fr = new FileReader(pathI);
        FileWriter fw = new FileWriter(pathO, true); // true = append mode

        int ch;
        while((ch = fr.read()) != -1){
            fw.write(ch);
            
        }
        fw.write("\n");
        fw.write("finish");
        fr.close();
        fw.close();
    }
}
