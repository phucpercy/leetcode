package java_solution;

public class RemoveElement {

  public int removeElement(int[] nums, int val) {
    int it = 0;

    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] != val) {
        nums[it] = nums[i];
        ++it;
      }
    }

    return it;
  }
}
