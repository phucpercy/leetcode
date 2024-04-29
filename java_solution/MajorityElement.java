package java_solution;

import java.util.HashMap;

public class MajorityElement {

  public static int majorityElement(int[] nums) {
    HashMap<Integer, Integer> numMap = new HashMap<>();
    int numSize = nums.length;
    var shownTime = 0;
    for (int n : nums) {
      if (numMap.get(n) == null) {
        shownTime = 1;
      } else {
        shownTime = numMap.get(n);
        ++shownTime;
      }
      if (shownTime > numSize / 2) return n;
      numMap.put(n, shownTime);
    }
    return 1;
  }
}
