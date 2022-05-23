package leet_code;

public class RangeSumQueryImmutableQ303 {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,5,-5,6,-9,7,2,4};
		NumArray numArray = new NumArray(array);
		System.out.println(numArray.sumRange(2, 6));
	}

}
class NumArray {
    int[] sums;
    public NumArray(int[] nums) {
        sums = new int[nums.length+1];
        for(int i = 1;i<sums.length;i++){
            sums[i] = nums[i-1]+sums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return sums[right+1]-sums[left];
    }
}

