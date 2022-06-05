package leet_code;

public class ConvertANumberToHexadecimalQ405 {

	public static void main(String[] args) {
		ConvertANumberToHexadecimalQ405 convertANumberToHexadecimalQ405 = new ConvertANumberToHexadecimalQ405();
		System.out.println(convertANumberToHexadecimalQ405.toHex(521));
	}
	public String toHex(int num) {
        if(num == 0){
            return "0";
        }
        long nums = num;
        if(num < 0){
            nums = 4294967296L+num;
        }
        char[] hex = {'a','b','c','d','e','f'};
        StringBuilder sb = new StringBuilder();
        while(nums > 0){
            int rem = (int)nums%16;
            if(rem < 0 && rem >= -6){
                sb.append(hex[(16+rem)-10]);
            }else if(rem < -6){
                sb.append(16+rem);
            }
            else if(rem > 9){
                sb.append(hex[rem-10]);
            }else{
                sb.append(rem);
            }
            nums = nums/16;
        }
        return sb.reverse().toString();
    }
}
