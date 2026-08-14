class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] nums=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                nums[k++]=nums1[i++];
            }else{
                nums[k++]=nums2[j++];
            }
        }
        while(i<n){
            nums[k++]=nums1[i++];
        }
        while(j<m){
            nums[k++]=nums2[j++];
        }
        double result=0;
            int mid=nums.length/2;
            if(nums.length%2==0){
                result=(nums[mid]+nums[mid-1])/2.0;
            }
            else{
                result=nums[mid];
            }
        
        return result;
    }
}