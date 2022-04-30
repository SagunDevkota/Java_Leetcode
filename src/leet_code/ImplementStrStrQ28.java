package leet_code;
/**
 * 
 * @author Sagun Devkota
 *https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class ImplementStrStrQ28 {

	public static void main(String[] args) {
		ImplementStrStrQ28 implementStrStrQ28 = new ImplementStrStrQ28();
		System.out.println(implementStrStrQ28.strStr("mississippi", "issip"));
	}
	public int strStr(String haystack, String needle) {
		int needleLen = needle.length();
		int haystackLen = haystack.length();
		if(haystackLen<needleLen) {
			return -1;
		}
		for(int i=0;i<haystackLen;i++) {
			if(i+needleLen > haystackLen) {
				break;
			}
			if(haystack.charAt(i) == needle.charAt(0)) {
				if(haystack.substring(i, i+needleLen).equals(needle)) {
					return i;
				}
			}
		}
		return -1;
    }
}
