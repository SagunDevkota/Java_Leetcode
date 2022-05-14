package leet_code;

import java.util.Arrays;

public class ContainsDuplicateIIQ219 {

	public static void main(String[] args) {
		ContainsDuplicateIIQ219 containsDuplicateIIQ219 = new ContainsDuplicateIIQ219();
		containsDuplicateIIQ219.containsNearbyDuplicate(null, 0);
	}
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0){
            return false;
        }
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0,nums.length);
        Arrays.sort(temp);
        int previous = temp[0];
        for(int i = 1;i<nums.length;i++){
            if(previous == temp[i]){
                int firstPointer = previous;
                int maxSecond = -1;
                for(int j = 0;j<nums.length;j++){
                    if(nums[j] == firstPointer && maxSecond == -1){
                        maxSecond = j+k;
                        continue;
                    }else if(nums[j] == firstPointer){
                        return true;
                    }
                    if(j == maxSecond){
                        maxSecond = -1;
                    }
                }
            }
            previous = temp[i];
        }
        return false;
    }
}
