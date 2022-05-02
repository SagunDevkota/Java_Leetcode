package leet_code;

public class ClimbingStairsQ60 {

	public static void main(String[] args) {
		ClimbingStairsQ60 climbingStairsQ60 = new ClimbingStairsQ60();
		System.out.println(climbingStairsQ60.climbStairs(5));
	}
	public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }
        int x1 = 1;
        int x2 = 2;
        int current = 0;
        for(int i=3;i<=n;i++){
            current = x1+x2;
            x1 = x2;
            x2 = current;
        }
        return current;
    }
}
