package leet_code;

public class IntegerToRomanQ12 {

	public static void main(String[] args) {
		IntegerToRomanQ12 integerToRomanQ12 = new IntegerToRomanQ12();
		System.out.println(integerToRomanQ12.intToRoman(3222));
	}
	public String intToRoman(int num) {
        String[][] arr = {{"I","II","III","IV","V","VI","VII","VIII","IX"},
                          {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                          {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                         {"M","MM","MMM"}};
        StringBuilder sb = new StringBuilder();
        int divisor = 1000;
        int index = 3;
        while(num>0){
            if(num>=divisor){
                int position = 0;
                position = num/divisor;
                num = num%divisor;
                sb.append(arr[index][position-1]);
            }
            divisor/=10;
            index--;
        }
        return sb.toString();
    }
}
