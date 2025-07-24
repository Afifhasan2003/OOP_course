import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class streamed {
    public void readAndWriteByStream(File pathI, File pathO) throws IOException {
        FileInputStream fi = new FileInputStream(pathI);
        FileOutputStream fo= new FileOutputStream(pathO,true);

        int a;
        while((a = fi.read()) != -1){
            fo.write(a);
        }
        fi.close();
        fo.close();
    }
}
