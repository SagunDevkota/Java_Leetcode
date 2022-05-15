package leet_code;

import java.util.HashSet;

public class ContainsDuplicateQ217 {

	public static void main(String[] args) {
		int[] nums = {8,8,8,8,5,6,2,1};
		ContainsDuplicateQ217 majorityElementQ169 = new ContainsDuplicateQ217();
		System.out.println(majorityElementQ169.containsDuplicate(nums));
	}
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
