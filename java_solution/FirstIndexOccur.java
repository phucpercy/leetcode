package java_solution;

public class FirstIndexOccur {

  // Time complexity: O(n)
  // Space complexity: O(1)
  public int strStr(String haystack, String needle) {
    int i = 0;
    int j = 0;

    for (i = 0; i < haystack.length(); ++i) {
      if (haystack.charAt(i) == haystack.charAt(j)) {
        j++;
      } else {
        i = i -j;
        j = 0;
      }
      if (j == needle.length()) {
        return i - needle.length() + 1;
      }
    }

    return -1;
  }
}
