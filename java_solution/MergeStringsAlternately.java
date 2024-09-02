package java_solution;

public class MergeStringsAlternately {
  public String mergeAlternately(String word1, String word2) {
    StringBuilder res = new StringBuilder();
    int i = 0, j =0;
    int w1L = word1.length(), w2L = word2.length();

    while (i < w1L || j < w2L) {
      if (i < w1L) {
        res.append(word1.charAt(i));
        ++i;
      }
      if (j < w2L) {
        res.append(word2.charAt(j));
        ++j;
      }
    }
    return res.toString();
  }
}
