package leet_code;

public class IsSubsequenceQ392 {

	public static void main(String[] args) {
		IsSubsequenceQ392 isSubsequenceQ392 = new IsSubsequenceQ392();
		System.out.println(isSubsequenceQ392.isSubsequence("asd", "abnbabjaasjshfd"));
	}
	public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen == 0){
            return true;
        }else if(tLen == 0){
            return false;
        }
        int s_count = 0;
        for (int i = 0;i<tLen;i++){
            if(t.charAt(i) == s.charAt(s_count)){
                s_count++;
                if(s_count == sLen){
                    return true;
                }
            }
        }
        return false;
    }
}
