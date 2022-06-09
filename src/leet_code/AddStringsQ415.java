package leet_code;

public class AddStringsQ415 {

	public static void main(String[] args) {
		AddStringsQ415 addStringsQ415 = new AddStringsQ415();
		System.out.println(addStringsQ415.addStrings("412456853265325623956235623", "651238465312651326512305621365320"));
	}
	public String addStrings(String num1, String num2) {
        int num1C = num1.length()-1;
        int num2C = num2.length()-1;
        int sum = 0;
        int carry = 0;
        StringBuilder sumStr = new StringBuilder(); 
        while(true){
            if(num1C >= 0 && num2C >=0){
                sum = num1.charAt(num1C)+num2.charAt(num2C)-96+carry;
            }else if(num1C >= 0){
                sum = num1.charAt(num1C)-48+carry;
            }else if(num2C >= 0){
                sum = num2.charAt(num2C)-48+carry;
            }else{
                break;
            }
            sumStr = sumStr.append((sum%10));
            carry = sum/10;
            sum = sum%10;
            num1C--;
            num2C--;
        }
        if(carry!=0){
            sumStr.append(carry);
        }
        return sumStr.reverse().toString();
    }
}
