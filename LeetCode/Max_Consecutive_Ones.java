/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 *     The maximum number of consecutive 1s is 3.
 * Note:
 *
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 * */

public class Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int flag=0;
        int outSum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) {
                flag++;
            }else{
                flag=0;
            }
            if(outSum<flag) outSum=flag;
        }
        return outSum;
    }
}
