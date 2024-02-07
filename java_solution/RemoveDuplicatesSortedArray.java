package java_solution;

public class RemoveDuplicatesSortedArray {

  public int removeDuplicates(int[] nums) {
    int length = nums.length;
    int res = length;
    int i = 1;
    int cnt = 1;

    while (i <= length - 1) {
      if (nums[i] == nums[i - 1]) {
        ++cnt;
        if (cnt > 2) {
          for (int j = i; j < length - 1; ++j) {
            nums[j] = nums[j + 1];
          }
          --length;
          --res;
          --cnt;
          --i;
        }
      } else {
        cnt = 1;
      }
      ++i;
    }

    return res;
  }
}
