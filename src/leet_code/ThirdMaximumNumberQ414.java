package leet_code;

public class ThirdMaximumNumberQ414 {

	public static void main(String[] args) {
		ThirdMaximumNumberQ414 thirdMaximumNumberQ414 = new ThirdMaximumNumberQ414();
		System.out.println(thirdMaximumNumberQ414.thirdMax(new int[]{1,874521,52,52,5623}));
	}
	public int thirdMax(int[] nums) {
        int[] max = new int[3];
        max[0] = Integer.MIN_VALUE;
        max[1] = Integer.MIN_VALUE;
        max[2] = Integer.MIN_VALUE;
        boolean min = false;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == max[0] || nums[i] == max[1] || nums[i] == max[2]){
                if(nums[i] == max[2]){
                    min = true; //to check if there is INT_MIN value in list provided
                }
                continue;
            }
            count++;//to count distinct element except INT_MIN
            if(nums[i] >= max[0]){
                max[2] = max[1];
                max[1] = max[0];
                max[0] = nums[i];
            }else if(nums[i] >= max[1]){
                max[2] = max[1];
                max[1] = nums[i];
            }else if(nums[i] >= max[2]){
                max[2] = nums[i];
            }
        }
        if(count<2 && min){
            return max[0];
        }
        if(max[2] == Integer.MIN_VALUE && !min){
            return max[0];
        }
        return max[2];
    }
}
