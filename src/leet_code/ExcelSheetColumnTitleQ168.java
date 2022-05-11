package leet_code;

public class ExcelSheetColumnTitleQ168 {

	public static void main(String[] args) {
		ExcelSheetColumnTitleQ168 excelSheetColumnTitleQ168 = new ExcelSheetColumnTitleQ168();
		System.out.println(excelSheetColumnTitleQ168.convertToTitle(28));
	}
	public String convertToTitle(int columnNumber) {
        StringBuilder returnString=new StringBuilder();
        while(columnNumber > 0){
            int rem = columnNumber%26;
            if(rem != 0){
                returnString.insert(0,(char)(rem+64));
            }else if(columnNumber == 26){
                returnString.insert(0,(char)(columnNumber+64));
            }else{
                returnString.insert(0,'Z');
            }
            if(columnNumber == 26){
                break;
            }
            if(columnNumber%26.0 == 0.0){
                columnNumber/=26;
                columnNumber--;
                continue;
            }
            columnNumber/=26;
        }
        return returnString.toString();
    }
}
