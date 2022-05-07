package leet_code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangleQ118 {

	public static void main(String[] args) {
		PascalsTriangleQ118 pascalsTriangleQ118 = new PascalsTriangleQ118();
		System.out.println(pascalsTriangleQ118.generate(5));
	}
	List<List<Integer>> result = new ArrayList<>();
	public List<List<Integer>> generate(int numRows) {
		List<Integer> data = new LinkedList<Integer>();
    	data.add(1);
    	result.add(data);
    	System.out.println(result);
        for(int j = 1;j<numRows;j++) {
        	data = new LinkedList<Integer>();
	        for(int i = 0;i<=j;i++) {
	        	if(i == 0 || i == j) {
	        		System.out.println(i);
	        		data.add(1);
	        		continue;
	        	}
	        	System.out.println(result);
	        	data.add(result.get(j-1).get(i-1)+result.get(j-1).get(i));
	        }
	        result.add(data);
        }
        return result;
	}
}
