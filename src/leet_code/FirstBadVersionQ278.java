package leet_code;
/**
 * 
 * @author SagunDevkota
 *isBadVersion method implementation is provided by the program internally;
 */
public class FirstBadVersionQ278 {
	int badVersion = 6;
	public static void main(String[] args) {
		FirstBadVersionQ278 firstBadVersionQ278 = new FirstBadVersionQ278();
		firstBadVersionQ278.firstBadVersion(10);
	}
	public int firstBadVersion(int n) {
        int first = 1;
        while(first+1<n){
            int mid = first+((n-first)/2);
            if(!isBadVersion(mid)){
                first = mid;
            }else{
                n = mid;
            }
        }
        if(isBadVersion(first)){
            return first;
        }else{
            return first+1;
        }
    }
	private boolean isBadVersion(int mid) {
		return mid==badVersion;
	}
}
