class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();
        int n = nums.length;

        for(int i=0;i < n;i++){
            int val = nums[i];

            if(seen.containsKey(val) && i - seen.get(val) <=k){
                return true;
            }
            seen.put(val,i);

        }
        return false;
        
    }
}