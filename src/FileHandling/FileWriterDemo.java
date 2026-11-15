package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Student.txt");
        fw.write("this my software development class\n");
        fw.write("1st module is java");
        fw.close();

    }
}
