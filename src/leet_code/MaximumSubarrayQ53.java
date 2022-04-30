package leet_code;
/**
 * 
 * @author Sagun Devkota
 *https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarrayQ53 {

	public static void main(String[] args) {
		MaximumSubarrayQ53 maximumSubarrayQ53 = new MaximumSubarrayQ53();
		int array[] = {2,-2,-2,0,-2,2,2};
		System.out.println(maximumSubarrayQ53.maxSubArray(array));
	}
	public int maxSubArray(int[] nums) {
		int current_max = nums[0];
		int global_max = current_max;
		for(int i=1;i<nums.length;i++) {
			//-2,1,-3,4,-1,2,1,-5,4
			current_max += nums[i];
			if(nums[i] > current_max) {
				current_max = nums[i];
			}
			if(current_max > global_max) {
				global_max = current_max;
			}
			System.out.println(i+" = "+current_max);
		}
		if(current_max>global_max) {
			global_max = current_max;
		}
        return global_max;
    }
}
