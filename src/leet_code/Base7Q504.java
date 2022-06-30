package leet_code;

public class Base7Q504 {

	public static void main(String[] args) {
		Base7Q504 base7q504 = new Base7Q504();
		System.out.println(base7q504.convertToBase7(100));
	}
	public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int numCalc = Math.abs(num);
        while(numCalc != 0){
            sb.append(numCalc%7);
            numCalc = numCalc/7;
        }
        if(num > 0){
            return sb.reverse().toString();
        }else{
            return "-"+  sb.reverse().toString();
        }
    }
}
