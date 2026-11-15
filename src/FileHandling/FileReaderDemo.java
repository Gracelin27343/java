package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Student.txt");

        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
