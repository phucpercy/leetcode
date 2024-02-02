package java_solution;

public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] res = new int[m+n];
    int i = 0, j = 0;
    int cur = 0;
    while (i < m || j < n) {
      if (i == m) {
        res[cur] = nums2[j];
        ++j;
      } else if (j == n) {
        res[cur] = nums1[i];
        ++i;
      } else if (nums1[i] <= nums2[j]) {
        res[cur] = nums1[i];
        ++i;
      } else {
        res[cur] = nums2[j];
        ++j;
      }
      ++cur;
    }
    i = 0;
    for (; i < m+n; ++i) {
      nums1[i] = res[i];
    }
  }

  public static void main(String[] args) {
    new MergeSortedArray().merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);

    return;
  }
}
