package java_solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence {

  // Time complexity: O(n^2)
  // Space complexity: O(n)
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

  // Time complexity: O(n*logn)
  // Space complexity: O(n)
  public int lengthOfLIS2(int[] nums) {
    int length = nums.length;
    List<Integer> ans = new ArrayList<>();

    ans.add(nums[0]);

    for (int i = 0; i < length; ++i) {
      if (nums[i] > ans.get(ans.size() - 1)) {
        ans.add(nums[i]);
      } else {
        int low = Collections.binarySearch(ans, nums[i]);
        if (low < 0) {
          low = - (low + 1);
        }
        ans.set(low, nums[i]);
      }
    }

    return ans.size();
  }
}
