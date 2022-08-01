package leet_code;

public class DetectCapitalQ520 {

	public static void main(String[] args) {
		DetectCapitalQ520 detectCapitalQ520 = new DetectCapitalQ520();
		System.out.println(detectCapitalQ520.detectCapitalUse("Hello World"));
	}
	public boolean detectCapitalUse(String word) {
        int capital = 0;
        int small = 0;
        if(word.charAt(0) >= 'a' && word.charAt(0) <= 'z'){
            small++;
        }
        for(int i = 1;i<word.length();i++){
            if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
                small++;
            }else{
                capital++;
            }
            if(capital>0 && small>0){
                return false;
            }
        }
        return true;
    }
}
