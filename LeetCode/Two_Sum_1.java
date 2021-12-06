/*
 * 1.Two Sum
 *Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 *You may assume that each input would have exactly one solution, and you may not use the same element twice.

 *Example:
 *Given nums = [2, 7, 11, 15], target = 9,

 *Because nums[0] + nums[1] = 2 + 7 = 9,
 *return [0, 1].
 */


import java.util.HashMap;
import java.util.Map;

public class Two_Sum_1 {
	/*
	 * 我的解题思路。时间复杂度为O(n²)。
	 * 暴力遍历。原谅我这个时候还没想起来hashcode
	 */	
	 public int[] twoSum(int[] nums, int target) {
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(target==nums[i]+nums[j]){
	                    return new int[]{i,j};
	                }
	            }
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }
	 /*
	  * HashMap的解题方式，时间复杂度为O(n);
	  * 思路是利用hashmap键值对应的关系进行两轮for循环找出结果
	  */
	 public int[] twoSumHashMap(int[] nums,int target) {
		 Map<Integer , Integer> map=new HashMap<>();
		 for (int i = 0; i < nums.length; i++) {
			map.put(nums[i],i);
		}
		 for (int i = 0; i < nums.length; i++) {
			int complement=target-nums[i];
			if (map.containsKey(complement)&&map.get(complement)!=i) {
				return new int[] {i,map.get(complement)};
		}
	 }
		 throw new IllegalArgumentException("No two sum solution");//这里是个啥异常啊。。。
   }
	 
	 /*
	  * HashMap优化方案
	  * 思路是一边加入map，一边进行检测是不是存在。
	  * 只过一遍for循环
	  */
	 public int[] twoSumHashMapTwo(int[] nums,int target) {
		 Map<Integer, Integer> map=new  HashMap<>();
		 for (int i = 0; i < nums.length; i++) {
			int complement=target-nums[i];
			if (map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			map.put(nums[i], i);
		}
		 throw new IllegalArgumentException("No two sum solution");
	 }
}
	 
	 
	 
	 
	 
	 
