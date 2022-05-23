package leet_code;

public class PowerOfThreeQ326 {

	public static void main(String[] args) {
		PowerOfThreeQ326 powerOfThreeQ326 = new PowerOfThreeQ326();
		System.out.println(powerOfThreeQ326.isPowerOfThree(729));
	}
	public boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        while(n != 1){
            if(n%3 != 0){
                return false;
            }
            n = n/3;
        }
        return true;
    }
}
