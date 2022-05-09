package leet_code;

public class ValidPalindromeQ125 {

	public static void main(String[] args) {
		ValidPalindromeQ125 validPalindromeQ125 = new ValidPalindromeQ125();
		System.out.println(validPalindromeQ125.isPalindrome(" ?helleh;;??"));
	}
	public boolean isPalindrome(String s) {
        int length = s.length();
        int front = 0;
        int rear = length-1;
        char f = s.charAt(front);
        char r = s.charAt(rear);
        for(;(rear>=0 && front<length);){
            while(front<length){
                f = s.charAt(front);
                if(!((f >= 97 && f <= 122)||(f >= 65 && f <= 90))){
                    if((f < 48 || f > 57)){
                        front++;
                    }else{
                        break;
                    }
                }else{
                    break;
                }
            }
            while(rear>=0){
                r = s.charAt(rear);
                if(!((r >= 97 && r <= 122)||(r >= 65 && r <= 90))){
                    if(r < 48 || r > 57){
                        rear--;
                    }else{
                        break;
                    }
                }else{
                    break;
                }
            }
            if(front>length || rear<0){
                break;
            }
            f = s.charAt(front);
            r = s.charAt(rear);
            if(f>=97){
                if((r != f)&&(r+32 != f)){
                    return false;
                }
            }else if(f>=65){
                if((r != f)&&(r-32 != f)){
                    return false;
                }
            }else if(f >= 48 && r<=57){
                if(f != r){
                    return false;
                }
            }
            front++;
            rear--;
        }
        return true;
    }
}
