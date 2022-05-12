package leet_code;

public class ReverseBitsQ190 {

	public static void main(String[] args) {
		ReverseBitsQ190 reverseBitsQ190 = new ReverseBitsQ190();
		reverseBitsQ190.reverseBits(250);
	}
	public int reverseBits(int n) {
        StringBuilder s = new StringBuilder(Integer.toUnsignedString(n, 2));
        for(int i = s.length();i<32;i++){
            s.insert(0,"0");
        }
        String reverse = s.reverse().toString();
        Long decimal = Long.parseLong(reverse,2);
        int intValue = decimal.intValue();
        return intValue;
    }
}
