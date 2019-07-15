package code;

public class Cpu implements Runnable{

    public void soultion(){
        new Thread(new Cpu()).start();
        new Thread(new Cpu()).start();
    }

    public static void main(String[] args){
        new Cpu().soultion();

    }

    @Override
    public void run() {
        while (true) {
        }
    }
}
