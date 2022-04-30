package leet_code;
/**
 * 
 * @author Sagun Devkota
 *https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveElementQ27 {

	public static void main(String[] args) {
		RemoveElementQ27 removeElementQ27 = new RemoveElementQ27();
		int array[] = {3,2,2,3};
		System.out.println("num= "+removeElementQ27.removeElement(array, 3));
		for(int num:array) {
			System.out.println("r= "+num);
		}
	}
	public int removeElement(int[] nums, int val) {
        int unique = 0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i] == val){
                continue;
            }else{
                nums[unique] = nums[i];
                unique++;
            }
        }
        return unique;
    }
}
