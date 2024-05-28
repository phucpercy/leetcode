package java_solution;

import java.util.HashMap;

public class RansomNote {

  // Time complexity: O(n+m)
  // Space complexity: O(1)
  public boolean canConstruct(String ransomNote, String magazine) {
    var alphabet = new int[26];

    for (char c : magazine.toCharArray()) {
      ++alphabet[c-'a'];
    }
    for (char c : ransomNote.toCharArray()) {
      if (alphabet[c-'a'] == 0) {
        return false;
      } else {
        --alphabet[c-'a'];
      }
    }

    return true;
  }
}
