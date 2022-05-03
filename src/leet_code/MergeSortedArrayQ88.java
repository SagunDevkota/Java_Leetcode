package leet_code;
/**
 * 
 * @author Sagun Devkota
 *https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArrayQ88 {

	public static void main(String[] args) {
		MergeSortedArrayQ88 mergeSortedArrayQ88 = new MergeSortedArrayQ88();
		int[] nums1 = {0};
		int[] nums2 = {1};
		mergeSortedArrayQ88.merge(nums1, 0, nums2, 1);
	}
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
        	for(int i=0;i<n;i++) {
        		nums1[i] = nums2[i];
        	}
        }else {
	        int temp = m;
	        System.out.println("temp = "+temp+" m= "+m+" n= "+n+" nums1[-1] "+nums1[temp-1]+" nums2[n-1]= "+nums2[n-1]);
	        while(n > 0) {
	        	temp = m;
	        	if(nums1[temp-1] > nums2[n-1]) {
	        		while(nums1[temp-1] > nums2[n-1]) {
	        			nums1[temp] = nums1[temp-1];
	        			temp--;
	        			if(temp == 0) {
	        				break;
	        			}
	        		}
	        	}
	        	
	        	nums1[temp] = nums2[n-1];
//	        	for(int num:nums1) {
//	        		System.out.println(num);
//	        	}
	        	m++;
	        	n--;
	        }
        }
        for(int num:nums1) {
        	System.out.println(num);
        }
    }
}
