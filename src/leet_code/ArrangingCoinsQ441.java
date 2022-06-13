package leet_code;

public class ArrangingCoinsQ441 {

	public static void main(String[] args) {
		ArrangingCoinsQ441 arrangingCoinsQ441 = new ArrangingCoinsQ441();
		System.out.println(arrangingCoinsQ441.arrangeCoins(492));
	}
	public int arrangeCoins(int n) {
        long low = (long)Math.sqrt(n);
        long high = (long)Math.pow(n,0.999);
        long mid = ((low+high)/2);
        while(low+1<high){
            long calc = mid*(mid+1)/2;
            if(calc<0){
                high = mid;
            }else if(calc > (long)n){
                high = mid;
            }else{
                low = mid;
            }
            mid = ((low+high)/2);
        }
        if((high*(high+1))/2==n){
            return (int) high;
        }else{
            return (int) low;
        }
    }
}
