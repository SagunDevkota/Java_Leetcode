package leet_code;

import java.util.Arrays;

public class RelativeRanksQ506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelativeRanksQ506 relativeRanksQ506 = new RelativeRanksQ506();
		System.out.println(Arrays.asList(relativeRanksQ506.findRelativeRanks(new int[] {10,3,8,9,4})));
	}
	public String[] findRelativeRanks(int[] score) {
        int[] sortedArray = Arrays.copyOf(score,score.length);
        Arrays.sort(sortedArray);
        String[] returnArray = new String[score.length];
        for(int i = 0;i<score.length;i++){
            if(score[i] == sortedArray[score.length-1]){
                returnArray[i] = "Gold Medal";
            }else if(score[i] == sortedArray[score.length-2]){
                returnArray[i] = "Silver Medal";
            }else if(score[i] == sortedArray[score.length-3]){
                returnArray[i] = "Bronze Medal";
            }else{
                int index = binarySearch(sortedArray,score[i],0,sortedArray.length);
                returnArray[i] = ""+(score.length-index);
            }
        }
        return returnArray;
    }
    int binarySearch(int array[],int target,int low,int high){
        int mid = (low+high)/2;
        if(array[mid] == target){
            return mid;
        }else if(array[mid] > target){
            return binarySearch(array,target,low,mid);
        }else{
            return binarySearch(array,target,mid,high);
        }
    }
}
