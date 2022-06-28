package leet_code;

public class SearchInRotatedSortedArrayQ33 {

	public static void main(String[] args) {
		SearchInRotatedSortedArrayQ33 searchInRotatedSortedArrayQ33 = new SearchInRotatedSortedArrayQ33();
		System.out.println(searchInRotatedSortedArrayQ33.search(new int[] {4,5,6,7,0,1,2}, 5));
	}
	public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        return binarySearch(nums,target,0,nums.length-1);
    }
    int binarySearch(int nums[],int target,int low,int high){
        if(low < 0 || high < 0){
            return -1;
        }
        if(low > high){
            return -1;
        }
        if(high == low){
            if(nums[low] == target){
                return low;
            }else{
                return -1;
            }
        }
        
        int mid = (low+high)/2;
        int ret = -1;
        if(nums[low] == target) {
            	return low;
        }else if(nums[high] == target){
            return high;
        }else if(nums[mid] == target) {
        	return mid;
        }
        if(nums[low] > target && nums[high]>target){
            if(nums[mid] > target && nums[high] > nums[mid]){
                ret = binarySearch(nums,target,low,mid-1);
            }else{
                ret = binarySearch(nums,target,mid+1,high);
            }
        }else if(nums[low] < target && nums[high] < target){
            if(nums[mid] > target && nums[high] < nums[mid]){
                ret = binarySearch(nums,target,low,mid-1);
            }else if(nums[mid] < target && nums[high] > nums[mid]){
                ret = binarySearch(nums,target,low,mid-1);
            }
            else{
                ret = binarySearch(nums,target,mid+1,high);
            }
        }else if(nums[low] < target && nums[high] > target) {
            if(nums[mid] > target && nums[high] > nums[mid]){
                ret = binarySearch(nums,target,low,mid-1);
            }else{
                ret = binarySearch(nums,target,mid+1,high);
            }
        }else if(nums[low] == target) {
            return low;
        }else if(nums[high] == target){
            return high;
        }
        return ret;
    }
}
