package Threads.Runnables;

public class Main {
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();

        Thread thread =new Thread(myRunnable);  // if this is object thread is not created and use runnable to start it would show
        //(Cannot resolve method 'start' in 'MyRunnable')
        thread.start();
        for(int i=0; i<5; i++){
            System.out.println("runbale" +i);
        }
    }
}
