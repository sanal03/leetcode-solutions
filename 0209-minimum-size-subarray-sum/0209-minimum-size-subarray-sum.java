class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left= 0;
        int currSum = 0;
//hiring proces
        for(int right=0;right < nums.length;right ++){
            currSum += nums[right]; // current value will be the first index value

            while(currSum >= target){
                int wow = right - left + 1;// this is to calculate how many subarrays are there
                if(wow < minLen){
                    minLen = wow;
                }
                currSum -= nums[left];
                left++;
            }
         
        }
        return minLen != Integer.MAX_VALUE ? minLen : 0 ;
       

        
    }
}