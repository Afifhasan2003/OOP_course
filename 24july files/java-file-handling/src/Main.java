import filestream.ReadFromFile;
import filestream.WriteIntoFile;

public class Main {
    private static final String filePath = "test.txt";

    public static void main(String[] args) {
        WriteIntoFile wf = new WriteIntoFile(filePath);
        wf.method1("Saikat ");
        wf.method2("Override ");
        wf.method3("IIT ", true);
        wf.method4("hahaha ");
        wf.method5("CSE Missed.");
        wf.method6("Extra text.");

        ReadFromFile rf = new ReadFromFile(filePath);
        rf.method1();
        rf.method2();
        rf.method3();
        rf.method4();
        rf.method5();
        rf.method6();

        test();
    }


    public static void test(){
        ReadFromFile rf = new ReadFromFile("input.txt");
        WriteIntoFile wf = new WriteIntoFile("output.txt");
        wf.method1(rf.read());
    }
}