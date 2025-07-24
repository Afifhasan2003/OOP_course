import java.io.*;

public class Buffered {
    public void readAndWriteByBuffer(File  pathI, File pathO) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader(pathI));
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathO,true));
        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
