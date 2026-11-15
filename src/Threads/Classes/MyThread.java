package Threads.Classes;

public class MyThread extends Thread{ //inbuilt thread class

    @Override
   public void run(){
        System.out.println("threads started");
        for(int i=0; i<5; i++){
            System.out.println("child" +i);
        }
    }
}
