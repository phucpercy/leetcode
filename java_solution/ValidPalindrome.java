package java_solution;

public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    s = s.trim();
    s = s.toLowerCase();
    s = s.replaceAll("[^a-zA-Z0-9]", "");
    int length = s.length();
    int i = 0;
    int j = length - 1;

    while (i <= length / 2 && j >= length / 2) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      ++i;
      --j;
    }
    return true;
  }
}
