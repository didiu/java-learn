/**
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 *
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 *
 * You may return any answer array that satisfies this condition.
 *
 *
 *
 * Example 1:
 *
 * Input: [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 *
 *
 * Note:
 *
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 *
 * */


package easy.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sort_Array_By_Parity_II {


    //新建Array迭代器输出   虽然运行慢,但是学会了迭代器输出,不亏.
    public int[] sortArrayByParityII(int[] A) {
        int i=0;
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        while(i<A.length){
            if(A[i]%2==0){
                list1.add(A[i]);
            }else{
                list2.add(A[i]);
            }
            i++;
        }

        int j=0;
        Iterator<Integer> iter1=list1.iterator();
        Iterator<Integer> iter2=list2.iterator();
        while(j<A.length){
            if(j%2!=0){
                A[j]=iter2.next();
            }else{
                A[j]=iter1.next();
            }
            j++;
        }
        return A;
    }

    /**
     *  方法二,新建等长数组,i循环的时候+2,先放奇数再放偶数.
     *  时间空间复杂的O(n);
     */


    /**
     *  方法三,定义两个标志位,其中一个指向期数位,一个指向偶数位.判断只判断偶数位,当偶数位
     *  不是偶数的时候,判断奇数位,不为奇数交换,为奇数加2.
     *
     *  时间复杂度O(n);
     *  空间复杂度O(1);
     */

}
