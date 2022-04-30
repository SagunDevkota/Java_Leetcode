package leet_code;

public class LengthOfLastWordQ58 {

	public static void main(String[] args) {
		LengthOfLastWordQ58 lengthOfLastWordQ58 = new LengthOfLastWordQ58();
		System.out.println(lengthOfLastWordQ58.lengthOfLastWord("luffy is still joyboy"));
	}
	public int lengthOfLastWord(String s) {
		int length = 0;
        for(int i=s.length()-1;i>=0;i--) {
        	if(s.charAt(i) != ' ') {
        		length++;
        	}else {
        		if(length > 0) {
        			break;
        		}
        		continue;
        	}
        }
		return length;
    }
}
