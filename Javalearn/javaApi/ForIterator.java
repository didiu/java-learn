package javaApi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForIterator {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        long MAX_NUMBER = 100000;
        for (int i = 0; i < MAX_NUMBER; i++) {   //给两个list赋值
            linkedList.add(1);
            arrayList.add(1);
        }
        getForCirculationTime(linkedList);
        getForCirculationTime(arrayList);
    }


    /**
     * 方法功能：获取两种for循环的时间
     *
     * @param lists
     */
    private static void getForCirculationTime(List<Integer> lists) {
        long starTime = System.currentTimeMillis();
        int size = lists.size();
        for (int i = 0; i < size; i++) {
            System.out.print(lists.get(i));
        }
        System.out.println();
        Class s = lists.getClass();   //获取class的名
        System.out.println(s + "普通for循环 调用get方法花的时间：" + (System.currentTimeMillis() - starTime));

        starTime = System.currentTimeMillis();
        for (int ignored : lists) {
            System.out.print(ignored);
        }
        System.out.println();
        System.out.println(s + "增强型的for循环get方法花的时间：" + (System.currentTimeMillis() - starTime));

        starTime = System.currentTimeMillis();
        lists.forEach(System.out::print);
        System.out.println();
        System.out.println(s + "landam表达式for循环方法花的时间：" + (System.currentTimeMillis() - starTime));
    }
}
