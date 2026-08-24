class Solution {
    public int longestOnes(int[] nums, int k) {
        int len=nums.length;
        int z=0;
        int l=0;
        int c=0;
        for(int r=0;r<len;r++){
            if(nums[r]==0){
                z++;

            }
            while(z>k){
                if(nums[l]==0) z--;
                l++;
            }
            c=Math.max(c,r-l+1);
        }
        return c;
    }
}