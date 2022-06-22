package leet_code;

public class ContainerWithMostWaterQ11 {

	public static void main(String[] args) {
		ContainerWithMostWaterQ11 containerWithMostWaterQ11 = new ContainerWithMostWaterQ11();
		System.out.println(containerWithMostWaterQ11.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
	}
	public int maxArea(int[] height) {
        int lowInd = 0;
        int highInd = height.length-1;
        int max = 0;
        while(lowInd<highInd){
            int temp = height[lowInd]<height[highInd]?height[lowInd]:height[highInd];
            int tempMax = temp * (highInd-lowInd);
            if(tempMax > max){
                max = tempMax;
            }
            if(temp == height[lowInd]){
                lowInd++;
            }else{
                highInd--;
            }
        }
        return max;
    }
}
