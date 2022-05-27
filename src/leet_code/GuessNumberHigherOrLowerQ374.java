package leet_code;

public class GuessNumberHigherOrLowerQ374 {

	public static void main(String[] args) {
		GuessNumberHigherOrLowerQ374 guessNumberHigherOrLowerQ374 = new GuessNumberHigherOrLowerQ374();
		System.out.println(guessNumberHigherOrLowerQ374.guessNumber(544));
	}
	public int guessNumber(int n) {
        int low = 1;
        int high = n;
        if(guess(low) == 0){
            return low;
        }else if(guess(high) == 0){
            return high;
        }
        int mid = 0;
        while(low<=high){
            mid = low+(high-mid)/2;
            if(guess(mid) == 0){
                return mid;
            }else if(guess(mid) == 1){
                low = mid+1;
            }else if(guess(mid) == -1){
                high = mid-1;
            }
        }
        return mid;
    }
	private int guess(int num) {
		if(num == 14) {
			return 0;
		}else if(num>14) {
			return -1;
		}else {
			return 1;
		}
	}
}
