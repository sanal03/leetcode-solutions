class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int left = 0;
        int maxLen = 0;
        int count =0;
        for(int right =0; right < n ; right ++){
        if(nums[right] == 1){
            count++;
             maxLen = Math.max(maxLen,count);
        }else{
           count =0;
        }
        
        
        }
        return maxLen;
        
    }
}