package leet_code;
/**
 * 
 * @author Sagun Devkota
 *https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArrayQ26 {

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArrayQ26 removeDuplicatesFromSortedArrayQ26 = new RemoveDuplicatesFromSortedArrayQ26();
		int array[] = {0,2,5,5,7,9,12};
		removeDuplicatesFromSortedArrayQ26.removeDuplicates(array);
	}
	
	public int removeDuplicates(int[] nums) {
        int previous,unique;
        previous = nums[0];
        unique = 1;
        for (int i = 1;i<nums.length;i++) {
        	if(nums[i] == previous) {
        		continue;
        	}else {
        		nums[unique] = nums[i];
        		unique++;
        		previous = nums[i];
        	}
        }
        for(int num:nums) {
        	System.out.println(num);
        }
       return unique; 
    }

}
