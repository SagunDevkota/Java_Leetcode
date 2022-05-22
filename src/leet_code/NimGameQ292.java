package leet_code;

public class NimGameQ292 {

	public static void main(String[] args) {
		NimGameQ292 nimGameQ292 = new NimGameQ292();
		System.out.println(nimGameQ292.canWinNim(126));
	}
	public boolean canWinNim(int n) {
        if(n<=3) return true;
     return (n % 4 != 0);   
    }
}
