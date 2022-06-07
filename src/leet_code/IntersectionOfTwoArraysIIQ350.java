package leet_code;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArraysIIQ350 {

	public static void main(String[] args) {
		IntersectionOfTwoArraysIIQ350 intersectionOfTwoArraysIIQ350 = new IntersectionOfTwoArraysIIQ350();
		int[] res = intersectionOfTwoArraysIIQ350.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
		for(int data:res) {
			System.out.println(data);
		}
	}
	public int[] intersect(int[] nums1, int[] nums2) {
	      ArrayList<Integer> al = new ArrayList<>();
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        int nums1Counter = 0;
	        int nums2Counter = 0;
	        while(nums1Counter < nums1.length && nums2Counter < nums2.length){
	            if(nums1[nums1Counter] > nums2[nums2Counter]){
	                nums2Counter++;
	            }else if(nums1[nums1Counter] < nums2[nums2Counter]){
	                nums1Counter++;
	            }else{
	                al.add(nums1[nums1Counter]);
	                nums1Counter++;
	                nums2Counter++;
	            }
	        }
	        int alLen = al.size();
	        int arr[] = new int[alLen];
	        int i = 0;
	        for(int item:al){
	            arr[i] = item;
	            i++;
	        }
	        return arr;  
	    }
}
