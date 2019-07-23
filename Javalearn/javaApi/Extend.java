package javaApi;

public class Extend {
    public static void main(String[] args){
        ChildClass childClass=new ChildClass();
        childClass.method2();
        ChildClass.method1();
    }
}

class FatherClass{
    public FatherClass(){
        System.out.println("A");
    }
    public static void  method1(){
        System.out.println("B");
    }
    public void method2(){
        System.out.println("C");
    }
}
class ChildClass extends FatherClass{
    public ChildClass(){
        System.out.println("A");
    }
    public static void  method1(){
        System.out.println("B");
    }
    public void method2(){
        System.out.println("C");
    }
}