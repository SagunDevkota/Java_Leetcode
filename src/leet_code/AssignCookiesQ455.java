package leet_code;

import java.util.Arrays;

public class AssignCookiesQ455 {

	public static void main(String[] args) {
		AssignCookiesQ455 assignCookiesQ455 = new AssignCookiesQ455();
		System.out.println(assignCookiesQ455.findContentChildren(new int[] {1,2,3,4,5}, new int[] {1,1,2,1,2}));
	}
	public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gCount = 0;
        int sCount = 0;
        int total = 0;
        while(sCount<s.length && gCount<g.length){
            if(s[sCount] >= g[gCount]){
                sCount++;
                gCount++;
                total++;
            }else if(s[sCount] < g[gCount]){
                sCount++;
            }
        }
        return total;
    }
}
