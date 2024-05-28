package java_solution;

import java.util.HashMap;

public class RansomNote {

  // Time complexity: O(n+m)
  // Space complexity: O(n)
  public boolean canConstruct(String ransomNote, String magazine) {
    var charMap = new HashMap<Character, Integer>();

    for (char c : magazine.toCharArray()) {
      if (charMap.get(c) == null) {
        charMap.put(c, 1);
      } else {
        charMap.compute(c, (k, v) -> v+1);
      }
    }
    for (char c : ransomNote.toCharArray()) {
      var mChar = charMap.get(c);

      if (mChar == null || mChar == 0) {
        return false;
      }
      charMap.put(c, --mChar);
    }

    return true;
  }
}
