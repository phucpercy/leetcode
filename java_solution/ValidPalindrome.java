package java_solution;

public class ValidPalindrome {

  public static boolean isPalindrome(String s) {
    s = s.toLowerCase();
    int length = s.length();
    int i = 0;
    int j = length - 1;

    while (i <= j) {
      if (s.charAt(i) < 48 || (s.charAt(i) > 57 && s.charAt(i) < 97) || s.charAt(i) > 122) {
          ++i;
          continue;
      }
      if (s.charAt(j) < 48 || (s.charAt(j) > 57 && s.charAt(j) < 97) || s.charAt(j) > 122) {
          --j;
          continue;
      }
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      ++i;
      --j;
    }
    return true;
  }
}
