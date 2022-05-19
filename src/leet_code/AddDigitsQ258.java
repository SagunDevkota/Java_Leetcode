package leet_code;

public class AddDigitsQ258 {

	public static void main(String[] args) {
		AddDigitsQ258 addDigitsQ258 = new AddDigitsQ258();
		System.out.println(addDigitsQ258.addDigits(256));
	}
	public int addDigits(int num) {
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
            if(sum > 9){
                sum = sum%10+sum/10;
            }
        }
        return sum;
    }
}
