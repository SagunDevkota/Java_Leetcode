package leet_code;

public class RansomNoteQ383 {

	public static void main(String[] args) {
		RansomNoteQ383 ransomNoteQ383 = new RansomNoteQ383();
		System.out.println(ransomNoteQ383.canConstruct("hey", "helloy"));
	}
	public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabets = new int[26];
        int mLen = magazine.length();
        int rLen = ransomNote.length();
        if(mLen < rLen){
            return false;
        }
        for(int i = 0;i<mLen;i++){
            alphabets[magazine.charAt(i)-97] += 1;
            if(rLen > i){
                alphabets[ransomNote.charAt(i)-97] -= 1;
            }
        }
        for(int i = 0;i<alphabets.length;i++){
            if(alphabets[i] < 0){
                return false;
            }
        }
        return true;
    }
}
