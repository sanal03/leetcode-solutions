class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        helper(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void helper(int[] nums, int i,
                       ArrayList<Integer> current,
                       List<List<Integer>> ans) {

        // base case
        if (i == nums.length) {

            ans.add(new ArrayList<>(current));
            return;
        }

        // YES choice
        current.add(nums[i]);
        helper(nums, i + 1, current, ans);

        // BACKTRACK
        current.remove(current.size() - 1);

        // NO choice
        helper(nums, i + 1, current, ans);
    }
}