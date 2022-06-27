package leet_code;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArrayQ34 {

	public static void main(String[] args) {
		FindFirstAndLastPositionOfElementInSortedArrayQ34 findFirstAndLastPositionOfElementInSortedArrayQ34 = new FindFirstAndLastPositionOfElementInSortedArrayQ34();
		System.out.println(findFirstAndLastPositionOfElementInSortedArrayQ34.searchRange(new int[] {5,7,7,8,8,10}, 8)[0]+" "+findFirstAndLastPositionOfElementInSortedArrayQ34.searchRange(new int[] {5,7,7,8,8,10}, 8)[1]);
	}
	public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[] {-1,-1};
        }
        int low = 0;
        int high = nums.length-1;
        return binarySearch(nums,low,high,target);
    }
    
    public int[] binarySearch(int nums[],int low,int high,int target){
        if((low == high) || (low+1) == high ){
            if(nums[low] == target && nums[high] == target){
                return new int[]{low,high};
            }else if(nums[low] == target){
                return new int[]{low,low};
            }else if(nums[high] == target){
                return new int[]{high,high};
            }
            return new int[]{-1,-1};
        }
        int mid = (low+high)/2;
        int arr[] = new int[2];
        if(nums[mid] < target){
            arr = binarySearch(nums,mid,high,target);
        }else if(nums[mid] > target){
            arr = binarySearch(nums,low,mid,target);
        }else{
            int tempMid = mid;
            while(nums[tempMid] == target){
                tempMid--;
                if(tempMid == -1){
                    break;
                }
            }
            while(nums[mid] == target){
                mid++;
                if(mid == nums.length){
                    break;
                }
            }
            arr[0] = ++tempMid;
            arr[1] = --mid;
            return arr;
        }
        return arr;
    }
}
