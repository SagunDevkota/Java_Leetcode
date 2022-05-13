package leet_code;

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStringsQ205 {

	public static void main(String[] args) {
		IsomorphicStringsQ205 isomorphicStringsQ205 = new IsomorphicStringsQ205();
		System.out.println(isomorphicStringsQ205.isIsomorphic("hello", "tnvvs"));
	}
	public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sTextMap = new HashMap<>();
        HashSet<Character> ch = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sTextMap.get(tChar) == null){
                sTextMap.put(tChar,sChar);
                if(ch.contains(sChar)){
                    return false;
                }
                ch.add(sChar);
            }else{
                if(sTextMap.get(tChar) != sChar){
                    return false;
                }
            }
        }
        
        
        return true;
    }
}
