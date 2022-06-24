package leet_code;

import java.util.Arrays;

public class Three3SumClosestQ16 {

	public static void main(String[] args) {
		Three3SumClosestQ16 three3SumClosestQ16 = new Three3SumClosestQ16();
		System.out.println(three3SumClosestQ16.threeSumClosest(new int[] {1,1,-1,-1,3}, -1));
	}
	public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        Arrays.sort(nums);
        int closestValue = 1001;
        int minDiff = 1001;
        for(int i = 0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i - 1]) continue;
            int front = i+1;
            int rear = nums.length-1;
            int current = nums[i];
            while(front<rear){
        		closestValue = current+nums[front]+nums[rear];
        		if(Math.abs(target-closestValue) < Math.abs(target-minDiff)) {
        			minDiff = closestValue;
                    if(minDiff == target){
                        return minDiff;
                    }
        		}
            	if(target>closestValue) {
            		front++;
            	}else {
            		rear--;
            	}
            }
        }
        return minDiff;
    }
}
