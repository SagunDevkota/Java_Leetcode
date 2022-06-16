package leet_code;

public class HammingDistanceQ461 {

	public static void main(String[] args) {
		HammingDistanceQ461 hammingDistanceQ461 = new HammingDistanceQ461();
		System.out.println(hammingDistanceQ461.hammingDistance(20, 21));
	}
	public int hammingDistance(int x, int y) {
        int xor = x^y;
        int count = 0;
        while(xor>0){
            if(xor%2 !=0){
                count++;
            }
            xor = xor>>1;
        }
        return count;
    }
}
