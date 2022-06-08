package leet_code;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzQ412 {

	public static void main(String[] args) {
		FizzBuzzQ412 fizzBuzzQ412 = new FizzBuzzQ412();
		System.out.println(fizzBuzzQ412.fizzBuzz(22));
	}
	public List<String> fizzBuzz(int n) {
        ArrayList<String> fizzBuzz = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            int x = i%15;
            if(x == 0){
                fizzBuzz.add("FizzBuzz");
            }else if(x%3==0){
                fizzBuzz.add("Fizz");
            }else if(x%5==0){
                fizzBuzz.add("Buzz");
            }else{
                fizzBuzz.add(""+i);
            }
        }
        return fizzBuzz;
    }
}
