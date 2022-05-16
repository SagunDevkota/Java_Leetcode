package leet_code;

public class PowerOfTwo {

	public static void main(String[] args) {
		PowerOfTwo powerOfTwo = new PowerOfTwo();
		System.out.println(powerOfTwo.isPowerOfTwo(36893488));
	}
	public boolean isPowerOfTwo(int n) {
        return (Math.log(n)/Math.log(2))%1 < 0.000000000001?true:false;//range is to counter floating point precesion error.
    }
}
