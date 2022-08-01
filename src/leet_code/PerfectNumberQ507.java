package leet_code;

public class PerfectNumberQ507 {

	public static void main(String[] args) {
		PerfectNumberQ507 perfectNumberQ507 = new PerfectNumberQ507();
		System.out.println(perfectNumberQ507.checkPerfectNumber(28));
	}
    public boolean checkPerfectNumber(int num) {
        if(num == 1){
            return false;
        }
        int sum = 1;
        for(int i = 2;i*i<=num;i++){
            if(num%i == 0){
                sum += (i+num/i);
            }
        }
        if(sum == num){
            return true;
        }
        return false;
    }
}
