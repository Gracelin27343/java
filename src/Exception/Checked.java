package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checked {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("src/Exceptions/config.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);//FileNotFoundException
        }
        catch (Exception e) {
            System.out.println("Exception = " + e);
        }

    }
}