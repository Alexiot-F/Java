import java.io.*;

class MyRun implements Runnable{
  public void run(){
            for(int i=1;i<=10;i++){
                System.out.println("Thread Runnable:"+i);
                try{
                    Thread.sleep(500);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
    }
}

public class thread {
    public static void main(String[] args){
        Thread T1=new Thread(new MyRun());
        T1.start();
    }
}
