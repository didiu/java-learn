package javaApi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForIterator {
    private static long MAX_NUMBER=100000;

    public static void main(String[] args) {
        List<Integer> linkedList=new LinkedList<Integer>();
        List<Integer> arrayList=new ArrayList<Integer>();
        for(int i=0;i<MAX_NUMBER;i++){   //给两个list赋值
            linkedList.add(100);
            arrayList.add(100);
        }
        getForCirculationTime(linkedList);
        getForCirculationTime(arrayList);
    }


    /**
     * 方法功能：获取两种for循环的时间
     * @param lists
     */
    public static void getForCirculationTime(List<Integer> lists){
        long starTime=System.currentTimeMillis();
        int n=0;
        int size=lists.size();
        for(int i=0;i<size;i++){
            n=lists.get(i);
        }
        Class s =lists.getClass();   //获取class的名
        String name=s.getName();
        System.out.println(s+"普通for循环 调用get方法花的时间："+(System.currentTimeMillis()-starTime));

        starTime=System.currentTimeMillis();
        for(int  in:lists){
            n=in;
        }
        System.out.println(s+"增强型的for循环get方法花的时间："+(System.currentTimeMillis()-starTime));
        System.out.println();
    }
}
