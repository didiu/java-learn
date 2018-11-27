/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 *
 * Note:
 *
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 *
 * */
package easy.array;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum_II_Input_array_is_sorted {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map =new HashMap<>();

        for(int i=0; i<numbers.length; i++){
            if(map.containsKey(target-numbers[i]))
                return i>map.get(target-numbers[i])
                        ?new int[]{map.get(target-numbers[i])+1,i+1}
                        :new int[]{i+1,map.get(target-numbers[i])+1};
            map.put(numbers[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
