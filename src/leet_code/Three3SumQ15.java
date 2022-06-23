package leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three3SumQ15 {

	public static void main(String[] args) {
		Three3SumQ15 three3SumQ15 = new Three3SumQ15();
		System.out.println(three3SumQ15.threeSum(new int[] {-1,0,1,1,2,-1,-4}));
	}
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int first = Integer.MIN_VALUE;
        int front = 0;
        int rear = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == first){
                continue;
            }
            first = nums[i];
            front = i+1;
            rear = nums.length-1;
            while(front<rear){
                int sum = (nums[front]+nums[rear]+first);
                if(sum < 0){
                    front++;
                }else if(sum > 0){
                    rear--;
                }else {
                    list.add(Arrays.asList(new Integer[]{first,nums[front++],nums[rear--]}));
                    while (front < rear && nums[front] == nums[front-1]){
                        ++front;
                    }
                }
            }
        }
        return list;
    }
}
