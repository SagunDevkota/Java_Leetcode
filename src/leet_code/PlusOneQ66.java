package leet_code;
/**
 * 
 * @author Sagun Devkota
 *https://leetcode.com/problems/plus-one/
 */
public class PlusOneQ66 {

	public static void main(String[] args) {
		PlusOneQ66 plusOne66 = new PlusOneQ66();
		int[] digits = {9,8,9};
		int[] array;
		array = plusOne66.plusOne(digits);
		for(int num:array) {
			System.out.println(num);
		}
	}
	public int[] plusOne(int[] digits) {
	    boolean carry = true;
	    int carryVal = 1;
	    for(int digit:digits) {
	    	if(digit<9) {
	    		carry = false;
                break;
	    	}
	    }
	    int plusOneArray[];
        int plusOneArrayLen;
	    if(carry) {
	    	plusOneArrayLen = digits.length+1;
	    }else {
	    	plusOneArrayLen = digits.length;
	    }
	    plusOneArray = new int[plusOneArrayLen];
	    for(int i = digits.length-1;i>=0;i--) {
	    	if(digits[i]+carryVal == 10) {
	    		plusOneArray[plusOneArrayLen-1] = 0;
	    		carryVal = 1;
	    	}else {
	    		plusOneArray[plusOneArrayLen-1] = digits[i]+carryVal;
	    		carryVal = 0;
	    	}
	    	plusOneArrayLen--;
	    }
        if(plusOneArray[0] == 0){
            plusOneArray[0] = 1;
        }
	    return plusOneArray;
	}
}
