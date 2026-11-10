package Exception;
import java.util.Scanner;

public class UnChecked {
    public static void main(String[] args){
//        System.out.println(4/0); //arithmetic exceptions
//
//        String name ="grace";
//        System.out.println(name.length());
//        name = null;
//        System.out.println(name.length());//NullPointerException


        int a = 30;
        int b = 50;
        int c = a / b;
        System.out.println(c);


        Scanner sc = new Scanner(System.in);
    try {
        int d = sc.nextInt();
        int e =sc.nextInt();
        int f = d/e;
        System.out.println(f);
    } catch (Exception e) {
        System.out.println(e);
    }finally {
        System.out.println("runned");
    }

    }

}
