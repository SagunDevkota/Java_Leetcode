package leet_code;

public class LongestCommonPrefixQ14 {

	public static void main(String[] args) {
		LongestCommonPrefixQ14 longestCommonPrefixQ14 = new LongestCommonPrefixQ14();
		String array[] = {"a","a","b"};
		System.out.println(longestCommonPrefixQ14.longestCommonPrefix(array));
	}
	public String longestCommonPrefix(String[] strs) {
		String returnString = strs[0];
		int end = strs[0].length();
		int start = 0;
		for(int i=1;i<strs.length;i++) {
			start = 0;
			System.out.println("i = "+i);
			System.out.println("ends = "+end+" Start= "+start);
			while(end>start) {
				System.out.println("Start= "+start);
				if(start>=strs[i].length()) {
					end = start;
					break;
				}
				
				if(returnString.charAt(start) == strs[i].charAt(start)) {
					start++;
				}else {
					end = start;
					break;
				}
			}
		}
		System.out.println("end= "+end);
		return returnString.substring(0,end);
	}
}
