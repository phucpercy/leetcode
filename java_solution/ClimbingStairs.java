package java_solution;

import java.util.HashMap;

public class ClimbingStairs {

  private HashMap<Integer, Integer> lastResult = new HashMap<>();
  public int climbStairs(int n) {
    if (lastResult.get(n) != null)
      return lastResult.get(n);
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }
    var res = climbStairs(n-1) + climbStairs(n-2);
    lastResult.put(n, res);
    return res;
  }
}
