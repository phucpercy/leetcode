package java_solution;

public class JumpGame {

  // Time complexity: O(n)
  // Space complexity: O(1)
  public boolean canJump(int[] nums) {
    int maxReach = 0;

    for (int i = 0; i < nums.length; ++i) {
      if (i > maxReach) return false;
      maxReach = Math.max(maxReach, i + nums[i]);
    }

    return true;
  }

  public int jump(int[] nums) {
    return solve(nums, 0);
  }

  public int solve(int[] nums, int curPos) {
    if (curPos >= nums.length - 1) return 0;
    int res = 10001;

    for (int i = 1; i <= nums[curPos]; ++i) {
      res = Math.min(res, 1 + solve(nums, curPos + i));
    }

    return res;
  }
}
