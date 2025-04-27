package Problems;

/*
 *https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
*/

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i=0; i<nums2.length;i++){
            nums1[i+m] = nums2[i];
        }
              
        for(int i=1; i<nums1.length;i++){  
            
            int key = nums1[i];
            int j = i-1;
            
            while(j>=0 && nums1[j]>key){               
                nums1[j+1] = nums1[j];
                j--;
            }
            nums1[j+1] = key;
        }

    }
}

