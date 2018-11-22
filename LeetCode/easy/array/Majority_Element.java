/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 *
 * */
package easy.array;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int output=0;
        int out=0;
        for(int i=0;i<nums.length; i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else{
                int str=map.get(nums[i]);
                map.remove(nums[i]);
                map.put(nums[i],str);
            }
        }

        for(Integer key:map.keySet()){
                if(output<map.get(key)){
                    output=map.get(key);
                    out=key;
                }
        }
        return out;
    }
}
