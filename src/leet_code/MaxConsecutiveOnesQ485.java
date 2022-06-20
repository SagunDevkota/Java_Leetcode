package leet_code;

public class MaxConsecutiveOnesQ485 {

	public static void main(String[] args) {
		MaxConsecutiveOnesQ485 maxConsecutiveOnesQ485 = new MaxConsecutiveOnesQ485();
		System.out.println(maxConsecutiveOnesQ485.findMaxConsecutiveOnes(new int[] {1,1,0,0,1,1,0,1,0,1,1,1,1,1,0}));
	}
	public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int currentOne = 0;
        for(int num:nums){
            if(num == 1){
                currentOne++;
            }else{
                if(currentOne>maxOne){
                    maxOne = currentOne;
                }
                currentOne = 0;
            }
        }
        return maxOne>currentOne?maxOne:currentOne;
    }
}
