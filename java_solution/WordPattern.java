package java_solution;

import java.util.HashMap;

public class WordPattern {

  public static boolean wordPattern(String pattern, String s) {
    if (s.isEmpty()) {
      return false;
    }
    HashMap<String, Character> bijection = new HashMap<>();
    String[] words = s.split(" ");
    char[] patternArr = pattern.toCharArray();

    if (words.length != pattern.length()) {
      return false;
    }

    int i = 0;

    for (char c : patternArr) {
      var containKey = bijection.containsKey(words[i]);
      var containValue = bijection.containsValue(c);

      if (containKey && !containValue) {
        return false;
      } else {
        if (containValue) {
          if (bijection.get(words[i]) == null || bijection.get(words[i]) != c) {
            return false;
          }
        } else {
          bijection.put(words[i], c);
        }
      }
      ++i;
    }

    return true;
  }
}
