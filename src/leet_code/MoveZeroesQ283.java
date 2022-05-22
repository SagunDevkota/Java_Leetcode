package leet_code;

public class MoveZeroesQ283 {

	public static void main(String[] args) {
		MoveZeroesQ283 moveZeroesQ283 = new MoveZeroesQ283();
		int[] a = {0,1,0,3,12};
		moveZeroesQ283.moveZeroes(a);
		for(int x:a) {
			System.out.println(x);
		}
	}
	public void moveZeroes(int[] nums) {
        int current_index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[current_index] = nums[i];
                current_index++;
            }
        }
        for(int i = current_index;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}
