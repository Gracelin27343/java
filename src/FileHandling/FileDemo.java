package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("Student.txt");

        if(file.createNewFile()){
            System.out.println("donee");
        }else{
            System.out.println("already there");
        }

        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());

        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.exists());
        System.out.println(file.length());

        System.out.println(file.getTotalSpace());


    }
}
