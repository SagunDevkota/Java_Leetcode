package leet_code;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleQ119 {

	public static void main(String[] args) {
		PascalsTriangleQ119 pascalsTriangleQ119 = new PascalsTriangleQ119();
		System.out.println(pascalsTriangleQ119.getRow(4));
	}
	public List<Integer> getRow(int rowIndex) {
        Integer[] row = new Integer[rowIndex+1];
        row[0] = 1;
        for(int i = 1;i<=rowIndex;i++){
        	int j;
        	int update = 1;
        	int x = 0;
            for(j = 1;j < i;j++){
            	x = update;
            	update = row[j];
            	row[j] = row[j]+x;
            }
            row[j] = 1;
        }
        return Arrays.asList(row);
    }
}