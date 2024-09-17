package java_solution;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

  public static List<String> summaryRanges(int[] nums) {
    String rangeConnect = "->";
    List<String> res = new ArrayList<>();
    if (nums.length == 0) {
      return res;
    }
    if (nums.length == 1) {
      res.add(nums[0] + "");
      return res;
    }
    int left = nums[0], right;

    for (int i = 1; i < nums.length; ++i) {
      if (nums[i] - nums[i-1] > 1) {
        right = nums[i-1];
        if (right == left) {
          res.add(left + "");
        } else {
          res.add(left + rangeConnect + right);
        }
        left = nums[i];
      }
      if (i == nums.length - 1) {
        right = nums[i];
        if (right == left) {
          res.add(left + "");
        } else {
          res.add(left + rangeConnect + right);
        }
        left = nums[i];
      }
    }

    return res;
  }

  public static void main(String[] args) {
    int[] nums = {-2147483648,-2147483647,2147483647};

    System.out.println(summaryRanges(nums));
  }
}
