package leet_code;

public class ReverseStringQ344 {

	public static void main(String[] args) {
		ReverseStringQ344 reverseStringQ344 = new ReverseStringQ344();
		reverseStringQ344.reverseString(null);
	}
	public void reverseString(char[] s) {
        int rear = s.length-1;
        for(int i = 0;i < s.length/2;i++){
            s[i] = (char)(s[rear]+s[i]);
            s[rear] = (char)(s[i] - s[rear]);
            s[i] = (char)(s[i] - s[rear]);
            rear--;
        }
    }
}
