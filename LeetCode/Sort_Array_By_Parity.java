/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 *
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 *
 * Note:
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 * */

import java.util.Arrays;

public class Sort_Array_By_Parity {
//    public int[] sortArrayByParity(int[] A) {
//        int[] output=new int[A.length];
//        int count=0;
//        for(int nums:A){
//            if(nums%2==0)
//                output[count++]=nums;
//        }
//        for(int nums:A){
//            if(nums%2!=0)
//                output[count++]=nums;
//        }
//        return output;
//    }

    public int[] sortArrayByParity(int[] A) {
        Integer[] B = new Integer[A.length];
        for (int t = 0; t < A.length; ++t)
            B[t] = A[t];

        Arrays.sort(B, (a, b) -> Integer.compare(a%2, b%2));

        for (int t = 0; t < A.length; ++t)
            A[t] = B[t];
        return A;

        /* Alternative:
        return Arrays.stream(A)
                     .boxed()
                     .sorted((a, b) -> Integer.compare(a%2, b%2))
                     .mapToInt(i -> i)
                     .toArray();
        */
    }
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int[][] str=new int[3][4];
        int[][] str1=new int[str[0].length][str.length];
        int sum=0;
        for(int i=0;i<nums.length;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }

}
