package javaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead{
    public static void main(String[] agrs)throws IOException{
        char c;
        BufferedReader br =new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("输入字符，按下q推出");
        do{
            c=(char)br.read();
            System.out.print(c);
        }while (c!='q');

    }
}
