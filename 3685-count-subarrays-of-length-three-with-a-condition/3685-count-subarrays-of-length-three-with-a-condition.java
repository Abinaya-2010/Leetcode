class Solution {
    public int countSubarrays(int[] nums) {
        int n = 0;
        for(int i=1;i<nums.length-1;i++){
            if((nums[i-1]+nums[i+1]) == (nums[i]/2.0))
                n++;
        }
        return n;
    }
}