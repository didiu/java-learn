package javaApi;

import java.math.BigDecimal;
import java.math.RoundingMode;

class test{
    public static void main(String[] args) {
        System.out.println("aaa");

        String s="12.5";
        String s1="12.23";
        String s2="12.235";
        BigDecimal bs=new BigDecimal(s);
        BigDecimal bs1=new BigDecimal(s1);
        BigDecimal bs2=new BigDecimal(s2);
        System.out.println(bs.setScale(2,RoundingMode.HALF_UP));
        System.out.println(bs1.setScale(2,RoundingMode.HALF_UP));


        System.out.println(bs2.setScale(2,RoundingMode.HALF_UP));
    }
}