package leet_code;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumberQ509 {
	public static void main(String[] args) {
		FibonacciNumberQ509 fibonacciNumberQ509 = new FibonacciNumberQ509();
		System.out.println(fibonacciNumberQ509.fib(5));
	}
	Map<Integer,Integer> map = new HashMap<>();
    public int fib(int n) {
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        int sum1,sum2;
        sum1 = fib(n-1);
        map.put(n-1,sum1);
        if(map.get(n-2) != null){
            sum2 = map.get(n-2);
        }else{
            sum2 = fib(n-2);
            map.put(n-2,sum2);
        }
        return sum1+sum2;
    }
}
