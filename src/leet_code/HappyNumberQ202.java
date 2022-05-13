package leet_code;

public class HappyNumberQ202 {

	public static void main(String[] args) {
		HappyNumberQ202 happyNumberQ202 = new HappyNumberQ202();
		System.out.println(happyNumberQ202.isHappy(12));
	}
	public boolean isHappy(int n) {
        int x = n;
        n = 0;
        while(true){
            while(x>0){
                n += Math.pow(x%10,2);
                x /= 10;
            }
            if(n == 1){
                return true;
            }else if(n == 4){
                return false;
            }
            x = n;
            n = 0;
        }
    }
}	
