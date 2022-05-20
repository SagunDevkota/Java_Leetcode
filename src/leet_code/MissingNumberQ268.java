package leet_code;

public class MissingNumberQ268 {

	public static void main(String[] args) {
		MissingNumberQ268 missingNumberQ268 = new MissingNumberQ268();
		int a[] = {0,1,2,5,3};
		System.out.println(missingNumberQ268.missingNumber(a));
	}
	public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i = 0;i<=nums.length;i++){
            sum-=i;
        }
        return sum*-1;
    }
}
