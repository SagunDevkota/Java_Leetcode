package leet_code;

public class ConstructTheRectangleQ492 {

	public static void main(String[] args) {
		ConstructTheRectangleQ492 constructTheRectangleQ492 = new ConstructTheRectangleQ492();
		System.out.println(constructTheRectangleQ492.constructRectangle(29852)[0]+" "+constructTheRectangleQ492.constructRectangle(29852)[1]);
	}
	public int[] constructRectangle(int area) {
        for(int i = (int)Math.sqrt(area);i>0;i--){
            if(area%i == 0){
                return new int[]{area/i,i};
            }
        }
        return null;
    }
}
