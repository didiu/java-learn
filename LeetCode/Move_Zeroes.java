/**
 *Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * */
/**
 * 思路1:新建队或数组,先放非零,在放零,再转移
 * 思路2:定义标志位,先把不等于0(每次不等于0标志位+1)的移动到前面,然后将标志位之后的置零
 * 思路3:看下面代码,交换
 * */

public class Move_Zeroes {

    public void moveZeroes(int[] nums) {

        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
