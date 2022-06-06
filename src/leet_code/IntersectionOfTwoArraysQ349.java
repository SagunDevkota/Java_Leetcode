package leet_code;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArraysQ349 {

	public static void main(String[] args) {
		IntersectionOfTwoArraysQ349 intersectionOfTwoArraysQ349 = new IntersectionOfTwoArraysQ349();
		int[] arr = intersectionOfTwoArraysQ349.intersection(new int[] {6,8,1,3,5}, new int[] {3,2,1,6,5});
		for(int num:arr) {
			System.out.println(num);
		}
	}
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> al = new HashSet<>();
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
