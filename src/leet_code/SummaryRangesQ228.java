package leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRangesQ228 {
	public static void main(String[] args) {
		SummaryRangesQ228 summaryRangesQ228 = new SummaryRangesQ228();
		System.out.println(summaryRangesQ228.summaryRanges(new int[] {0,1,3,5,6,7}));
	}
	public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0){
            return new ArrayList<>();
        }else if(nums.length == 1){
            return Arrays.asList(new String[]{""+nums[0]});
        }
        List<String> summaryRanges = new ArrayList<>();
        int count = nums[0];
        String current = "";
        for(int i = 0; i<nums.length; i++){
            if(count != nums[i]){
                count = nums[i];
                if(!((current).equals(""+nums[i-1]))){
                    current+="->"+nums[i-1];
                }
                summaryRanges.add(current);
                current="";
            }else if(i == nums.length-1){
                current+="->"+nums[i];
            }
            if(current.equals("")){
                current = ""+nums[i];
            }
            count++;
        }
        summaryRanges.add(current);
        return summaryRanges;
    }
}
