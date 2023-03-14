import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Test {
    public void readLines() throws IOException {
        List list = Files.readAllLines(Paths.get("d:/a.txt"));
        System.out.println(list);
    }

    public static void main(String[] args) {
        Test test = new Test();
        try{
            test.readLines();
        } catch (IOException e){
            System.out.println("Exception");
        }
    }
}

