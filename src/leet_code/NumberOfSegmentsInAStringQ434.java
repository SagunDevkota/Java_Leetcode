package leet_code;

public class NumberOfSegmentsInAStringQ434 {

	public static void main(String[] args) {
		NumberOfSegmentsInAStringQ434 numberOfSegmentsInAStringQ434 = new NumberOfSegmentsInAStringQ434();
		System.out.println(numberOfSegmentsInAStringQ434.countSegments("Hello, my name is John"));
	}
	public int countSegments(String s) {
        int len = s.length();
        boolean previous = false;
        int count = 0;
        for(int i = 0;i<len;i++){
            if(s.charAt(i)!=' '){
                if(!previous){
                    count++;
                }
                previous = true;
            }else{
                previous = false;
            }
        }
        return count;
    }
}
