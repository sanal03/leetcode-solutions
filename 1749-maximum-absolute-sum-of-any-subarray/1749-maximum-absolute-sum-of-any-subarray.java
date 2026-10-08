class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxend = nums[0];
        int minend = nums[0];
        int res = Math.abs(nums[0]);

        for(int i =1 ; i < n ; i++){

            int v1 =nums[i];
            int v2=maxend + nums[i];
            int v3 = minend + nums[i];

            maxend = Math.max(v1,Math.max(v2,v3));
             minend =Math.min(v1,Math.min(v2,v3));

             res = Math.max(res,Math.max(Math.abs(maxend),Math.abs(minend)));
        }

        return res;
        
    }
}