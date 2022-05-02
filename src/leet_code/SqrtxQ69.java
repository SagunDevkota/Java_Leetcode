package leet_code;
/**
 * 
 * @author Sagun Devkota
 *https://leetcode.com/problems/sqrtx/
 */
public class SqrtxQ69 {

	public static void main(String[] args) {
		SqrtxQ69 sqrtxQ69 = new SqrtxQ69();
		System.out.println(sqrtxQ69.mySqrt(2147395599));
	}
	public int mySqrt(int x) {
		int y = x;
        int i = 1;
        int count = 0;
        while(x > 0) {
        	x-=i;
        	i+=2;
        	count++;
        }
        if(count*count != y) {
        	count--;
        }
		return count;
    }
}
