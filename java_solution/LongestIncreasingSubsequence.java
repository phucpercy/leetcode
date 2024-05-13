package java_solution;

// Time complexity: O(n^2)
// Space complexity: O(n)
public class LongestIncreasingSubsequence {

  public int lengthOfLIS(int[] nums) {
    int[] l = new int[nums.length];
    int res = 1;

    l[0] = 1;

    for (int i = 1; i < nums.length; ++i) {
      l[i] = 1;
      for (int j = 0; j < i; ++j) {
        if (nums[j] < nums[i]) {
          l[i] = Math.max(l[i], l[j] + 1);
        }
      }
      res = Math.max(res, l[i]);
    }

    return res;
  }
}
