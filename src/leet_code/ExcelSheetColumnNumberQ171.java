package leet_code;

public class ExcelSheetColumnNumberQ171 {

	public static void main(String[] args) {
		ExcelSheetColumnNumberQ171 excelSheetColumnNumberQ171 = new ExcelSheetColumnNumberQ171();
		System.out.println(excelSheetColumnNumberQ171.titleToNumber("ZZZZZZZ"));
	}
	public int titleToNumber(String columnTitle) {
        int len = columnTitle.length()-1;
        int count = 0;
        int value = 0;
        for(int i = len;i>=0;i--){
            count = len-i;
            int weight = (int) ((columnTitle.charAt(i)-64)*Math.pow(26,count));
            // while(count > 0){
            //     weight*=26;
            //     count--;
            // }
            value = value+weight;
        }
        return value;
    }
}
