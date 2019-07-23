package javaApi;

public class Exceptions {
    public static void main(String[] args){
        int i;
        try{
            System.out.println("aaa");
            i=10/0;
            System.out.println("bbbb");
        }catch (Exception e){
            System.out.println("ccccc");
        }finally {
            System.out.println("eeeeee");
        }
    }
}
