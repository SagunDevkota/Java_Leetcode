package leet_code;

public class SingleNumberQ136 {

	public static void main(String[] args) {
		SingleNumberQ136 singleNumberQ136 = new SingleNumberQ136();
		int[] nums = {4,1,2,1,2};
		System.out.println(singleNumberQ136.singleNumber(nums));
	}
	public int singleNumber(int[] nums) {
        int result = 0;
        for(int i:nums){
            result = result^i;
        }
        return result;
    }
}
