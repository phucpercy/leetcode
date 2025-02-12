package java_solution;

public class SearchInsertPosition {
  public int searchInsert(int[] nums, int target) {
    int l = 0, r = nums.length - 1;
    int m = (l + r) / 2;

    while (l <= r) {
      if (nums[m] == target) {
        return m;
      }
      if (nums[m] > target) {
        r = m - 1;
        m = (l + r) / 2;
      } else {
        l = m + 1;
        m = (l + r) / 2;
      }
    }
    return l;
  }
}
