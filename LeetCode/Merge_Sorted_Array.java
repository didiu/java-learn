
/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 * */

import java.util.Arrays;

public class Merge_Sorted_Array {


    //没有任何锻炼意义的解决方案
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n ; i++){
            nums1[m+i]=nums2[i];
        }

        Arrays.sort(nums1);
    }


    //应该的解决方案
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (i > -1 && j > -1)
            nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];

        while (j > -1)
            nums1[k--] = nums2[j--];

    }

}
