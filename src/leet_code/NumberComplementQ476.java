package leet_code;

public class NumberComplementQ476 {

	public static void main(String[] args) {
		NumberComplementQ476 numberComplementQ476 = new NumberComplementQ476();
		System.out.println(numberComplementQ476.findComplement(232));
	}
	public int findComplement(int num) {
        int numberOfBits = (int)(Math.floor(Math.log(num) / Math.log(2))) + 1;
        return ((1 << numberOfBits) - 1) ^ num;
    }
}
