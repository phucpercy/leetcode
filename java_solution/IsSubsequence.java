package java_solution;

public class IsSubsequence {

  public boolean isSubsequence(String s, String t) {
    if (s.isEmpty())
      return true;
    if (t.isEmpty())
      return false;
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
    int tLength = t.length();
    int sLength = s.length();
    int i = 0;
    int j = 0;

    for (i = 0; i < tLength; ++i) {
      if (tArr[i] == sArr[j]) {
        ++j;
        if (j == sLength) return true;
      }
    }

    return false;
  }
}
