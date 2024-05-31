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
}
