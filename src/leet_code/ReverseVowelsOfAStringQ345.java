package leet_code;

public class ReverseVowelsOfAStringQ345 {

	public static void main(String[] args) {
		ReverseVowelsOfAStringQ345 reverseVowelsOfAStringQ345 = new ReverseVowelsOfAStringQ345();
		System.out.println(reverseVowelsOfAStringQ345.reverseVowels("Education"));
	}
	public String reverseVowels(String s) {
        int firstVowel = 0;
        int lastVowel = s.length()-1;
        char[] str = new char[lastVowel+1];
        while(firstVowel<=lastVowel){
            char firstChar = s.charAt(firstVowel);
            char lastChar = s.charAt(lastVowel);
            if(isVowel(firstChar) && isVowel(lastChar)){
                str[firstVowel] = lastChar;
                str[lastVowel] = firstChar;
                firstVowel++;
                lastVowel--;
            }else if(isVowel(firstChar)){
                str[firstVowel] = firstChar;
                str[lastVowel] = lastChar;
                lastVowel--;
            }else if(isVowel(lastChar)){
                str[firstVowel] = firstChar;
                str[lastVowel] = lastChar;
                firstVowel++;
            }else{
                str[firstVowel] = firstChar;
                str[lastVowel] = lastChar;
                firstVowel++;
                lastVowel--;
            }
        }
        return new String(str);
    }
    boolean isVowel(char c){
        if(c == 'a' || c== 'e' || c == 'i' || c == 'o' || c=='u'){
            return true;
        }
        if(c == 'A' || c== 'E' || c == 'I' || c == 'O' || c=='U'){
            return true;
        }
        return false;
    }
}
