package Threads.Classes;

public class ThreadMain {
    public static void main(String[] args) {

        MyThread th = new MyThread();
        th.start();
        for(int i=0; i<5; i++){
            System.out.println("main" +i); // the order of output changes because each task runs independently
        }
    }
}
