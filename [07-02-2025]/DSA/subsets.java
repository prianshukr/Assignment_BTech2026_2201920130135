import java.util.*;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int[] nums, int index, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path)); // Add current subset

        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);         // Include nums[i] in subset
            dfs(nums, i + 1, path, result); // Recur with next index
            path.remove(path.size() - 1);  // Backtrack
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        System.out.println(sol.subsets(nums)); 
        // Output: [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
    }
}
