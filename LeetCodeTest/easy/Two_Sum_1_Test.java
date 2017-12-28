package easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Two_Sum_1_Test {

	@Test
	public void TestTwoSum() {
		int[] nums=new int[] {2,7,11,15};
		assertEquals(0, new Two_Sum_1().twoSum(nums, 9)[0]);
		assertEquals(1, new Two_Sum_1().twoSum(nums, 9)[1]);
		
		assertEquals(0, new Two_Sum_1().twoSumHashMap(nums, 9)[0]);
		assertEquals(1, new Two_Sum_1().twoSumHashMap(nums, 9)[1]);
		
		assertEquals(0, new Two_Sum_1().twoSumHashMapTwo(nums, 9)[0]);
		assertEquals(1, new Two_Sum_1().twoSumHashMapTwo(nums, 9)[1]);
	}
}
