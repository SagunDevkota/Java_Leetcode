package leet_code;

import java.util.ArrayList;
import java.util.Arrays;

public class KeyboardRowQ500 {

	public static void main(String[] args) {
		KeyboardRowQ500 keyboardRowQ500 = new KeyboardRowQ500();
		System.out.println(Arrays.asList(keyboardRowQ500.findWords(new String[] {"Hello","Alaska","Dad","Peace"})));
	}
	public String[] findWords(String[] words) {
        String[] keyboard = {"qwertyuiop",
                             "asdfghjkl",
                             "zxcvbnm"};
        ArrayList<String> retWord = new ArrayList<>();
        for(String word:words){
            String temp = word.toLowerCase();
            int searchRow = 0;
            if(keyboard[1].contains(String.valueOf(temp.charAt(0)))){
                searchRow = 1;
            }else if(keyboard[2].contains(String.valueOf(temp.charAt(0)))){
                searchRow = 2;
            }
            boolean valid = true;
            for(int i = 0;i<word.length();i++){
                if(!keyboard[searchRow].contains(String.valueOf(temp.charAt(i)))){
                    valid = false;
                    break;
                }
            }
            if(valid){
                retWord.add(word);
            }
        }
        return retWord.toArray(new String[retWord.size()]);
    }
}
