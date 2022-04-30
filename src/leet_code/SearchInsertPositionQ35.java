package leet_code;
/**
 * 
 * @author Sagun Devkota
 *https://leetcode.com/problems/search-insert-position/submissions/
 */
public class SearchInsertPositionQ35 {

	public static void main(String[] args) {
		SearchInsertPositionQ35 searchInsertPositionQ35 = new SearchInsertPositionQ35();
		int array[] = {1,3,5,6};
		System.out.println(searchInsertPositionQ35.searchInsert(array, 7));
	}
	public int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		int mid = (low+high)/2;
		while(mid>low && mid<high) {
			if(nums[mid] == target) {
				return mid;
			}else {
				if(nums[mid]>target) {
					high = mid;
					mid = (low+high)/2;
				}else {
					low = mid;
					mid = (low+high)/2;
				}
			}
		}
		if(nums[high]<target) {
			return high+1;
		}else if(nums[low] >= target) {
			return low;
		}else if(nums[low]<target) {
			return low+1;
		}else if(nums[high] == target) {
			return high;
		}
		return 0;
    }
}
