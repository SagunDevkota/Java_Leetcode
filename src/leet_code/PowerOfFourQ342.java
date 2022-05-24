package leet_code;

public class PowerOfFourQ342 {

	public static void main(String[] args) {
		PowerOfFourQ342 powerOfFourQ342 = new PowerOfFourQ342();
		System.out.println(powerOfFourQ342.isPowerOfFour(24));
	}
	public boolean isPowerOfFour(int n) {
        if(n == 0){
            return false;
        }
        while(n != 1){
            if(n%4 != 0){
                return false;
            }
            n/=4;
            
        }
        return true;
    }
}
