package javaApi;

public class Runable {
    public  void sellTicket(){
        MutliThread m=new MutliThread();
        Thread t1=new Thread(m,"Window 1");
        Thread t2=new Thread(m,"Window 2");
        Thread t3=new Thread(m,"Window 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class MutliThread implements Runnable{
    private int ticket=100;//每个线程都拥有100张票
    public synchronized void run(){
        while(ticket>0){
            System.out.println(ticket--+" is saled by "+Thread.currentThread().getName());
        }
    }
}