package leet_code;

public class FindTheDifferenceQ389 {

	public static void main(String[] args) {
		FindTheDifferenceQ389 findTheDifferenceQ389 = new FindTheDifferenceQ389();
		System.out.println(findTheDifferenceQ389.findTheDifference("hello", "hmello"));
	}
	public char findTheDifference(String s, String t) {
        if(s.length() == 0){
            return t.charAt(0);
        }
        int cha = s.charAt(0)^t.charAt(0);
        for(int i = 1;i<s.length();i++){
            cha = (s.charAt(i)^t.charAt(i))^cha;
        }
        cha = cha^t.charAt(t.length()-1);
        return (char)cha;
    }
}
