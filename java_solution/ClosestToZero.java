package java_solution;

public class ClosestToZero {

  public static int findClosestNumber(int[] nums) {
    int res = nums[0];
    for (int i = 1; i < nums.length; ++i) {
      if (Math.abs(nums[i]) < Math.abs(res) || (Math.abs(nums[i]) == Math.abs(res) && nums[i] > res)) {
        res = nums[i];
      }
    }
    return res;
  }
}
