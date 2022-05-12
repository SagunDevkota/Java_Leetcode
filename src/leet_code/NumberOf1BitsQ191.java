package leet_code;

public class NumberOf1BitsQ191 {

	public static void main(String[] args) {
		NumberOf1BitsQ191 numberOf1BitsQ191 = new NumberOf1BitsQ191();
		numberOf1BitsQ191.hammingWeight(50);
	}
	public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0;i<32;i++){
            if(n == 0){
                break;
            }
            if(n%2 != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
