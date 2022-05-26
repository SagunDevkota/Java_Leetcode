package leet_code;

public class ValidPerfectSquareQ367 {

	public static void main(String[] args) {
		ValidPerfectSquareQ367 validPerfectSquareQ367 = new ValidPerfectSquareQ367();
		System.out.println(validPerfectSquareQ367.isPerfectSquare(225));
	}
	public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        int start = 1;
        int end = num/2;
        while(start <= end){
            int mid = (start + end)/2;
            if(start * start == num || end*end == num){
                return true;
            }
            if(start == mid || end == mid){
                return false;
            }
            if(mid < num/mid){
                start = mid;
            }else{
                end = mid;
            }
        }
        return false;
    }
}
