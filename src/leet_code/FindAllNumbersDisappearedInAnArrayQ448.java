package leet_code;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArrayQ448 {

	public static void main(String[] args) {
		FindAllNumbersDisappearedInAnArrayQ448 findAllNumbersDisappearedInAnArrayQ448 = new FindAllNumbersDisappearedInAnArrayQ448();
		System.out.println(findAllNumbersDisappearedInAnArrayQ448.findDisappearedNumbers(new int[] {1,1,3,6,5,3,4}));
	}
	public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i:nums){
            int temp = Math.abs(i)-1;
            nums[temp] = -1*Math.abs(nums[temp]);
        }
        ArrayList<Integer> missing = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > 0){
                missing.add(i+1);
            }
        }
        return missing;
    }
}
