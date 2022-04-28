package leet_code;

/**
 * 
 * @author Sagun Devkota
 * 9. Palindrome Number
Easy

5675

2111

Add to List

Share
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 */

public class PalindromeNumberQ9 {

	public static void main(String[] args) {
		PalindromeNumberQ9 obj= new PalindromeNumberQ9();
		System.out.println(obj.isPalindrome(-121));
	}

	private boolean isPalindrome(int n) {
		if(n<0) {
			return false;
		}
		final int divisor = 10;
		boolean palindrome = false;
		int check_original = n;
		int check_rev = 0;
		while(true) {
			check_rev = check_rev*10+n%divisor;
			n = n/10;
			if(n == 0) {
				break;
			}
		}
		if(check_original == check_rev) {
			palindrome = true;
		}
		return palindrome;
	}

}
