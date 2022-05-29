package leet_code;

public class FirstUniqueCharacterInAStringQ387 {

	public static void main(String[] args) {
		FirstUniqueCharacterInAStringQ387 firstUniqueCharacterInAStringQ387 = new FirstUniqueCharacterInAStringQ387();
		System.out.println(firstUniqueCharacterInAStringQ387.firstUniqChar("leetcode"));
	}
	public int firstUniqChar(String s) {
        int[] alphabet = new int[26];
        for(int i = 0;i<s.length();i++){
            alphabet[s.charAt(i)-97]++;
        }
        int lowIndex = 0;
        for(int i = 0;i<s.length();i++){
            if(alphabet[s.charAt(i)-97] == 1){
                return i;
            }
        }
        return -1;
    }
}
