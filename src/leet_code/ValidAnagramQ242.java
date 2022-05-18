package leet_code;


public class ValidAnagramQ242 {

	public static void main(String[] args) {
		ValidAnagramQ242 validAnagramQ242 = new ValidAnagramQ242();
		System.out.println(validAnagramQ242.isAnagram("ad","ads"));
	}
	public boolean isAnagram(String s, String t) {
		int[] alphabet = new int[26];
        for(int i = 0;i<26;i++)
            alphabet[i] = 0;
        for(int i = 0;i<s.length();i++){
            alphabet[s.charAt(i)-97]++;
        }
        for(int i = 0;i<t.length();i++){
            alphabet[t.charAt(i)-97]--;
        }
        for(int i = 0;i<26;i++){
            if(alphabet[i] != 0){
                return false;
            }
        }
        return true;
    }
}
