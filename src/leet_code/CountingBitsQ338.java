package leet_code;

public class CountingBitsQ338 {

	public static void main(String[] args) {
		CountingBitsQ338 countingBitsQ338 = new CountingBitsQ338();
//		for(int i = 0;i<=35;i++) {
//			System.out.println(i+" -> "+(i&i-1));
//		}
		int[] temp = countingBitsQ338.countBits(72);
		System.out.print("[");
		for(int num:temp) {
			System.out.print(num+" , ");
		}
		System.out.println("]");
	}
	public int[] countBits(int n) {
		int[] array = new int[n+1];
		array[0] = 0;
		array[1] = 1;
		array[2] = 1;
		array[3] = 2;
		int multiplier = 4;
		for(int i = 4;i<=n;i++) {
			if(i >= multiplier*2) {
				multiplier *= 2;
			}
			int target =(i%multiplier);
			System.out.println(target+" for "+i);
			array[i] = array[target]+1;
		}
		return array;
    }
}
