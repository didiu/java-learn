package javaApi;

public enum Singleton {
    INSTANCE;
    public void getRecourse(){
        System.out.println("111");
    }

}

//饿汉式
class Singleton1{
    private static Singleton1 instance=new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return instance;
    }
}