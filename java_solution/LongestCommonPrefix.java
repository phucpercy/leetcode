package java_solution;

public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    String res = "";
    String firstStr = strs[0];

    for (int i = 0; i < firstStr.length(); ++i) {
      for (int j = 1; j < strs.length; ++j) {
        if (i >= strs[j].length() || firstStr.charAt(i) != strs[j].charAt(i)) {
          return res;
        }
      }
      res += firstStr.charAt(i);
    }

    return res;
  }
}
