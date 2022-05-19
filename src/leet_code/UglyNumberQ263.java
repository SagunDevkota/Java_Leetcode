package leet_code;

public class UglyNumberQ263 {

	public static void main(String[] args) {
		UglyNumberQ263 uglyNumberQ263 = new UglyNumberQ263();
		System.out.println(uglyNumberQ263.isUgly(123));
	}
	public boolean isUgly(int n) {
        if(n <= 0){
            return false;
        }
        int prevN = n;
        while(true){
            if(n%2 == 0){
                n = n/2;
            }
            if(n%3 == 0){
                n = n/3;
            }
            if(n%5 == 0){
                n = n/5;
            }
            if(n == 1){
                break;
            }
            if(prevN == n){
                return false;
            }
            prevN = n;
        }
        return true;
    }
}
