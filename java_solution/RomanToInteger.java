package java_solution;

public class RomanToInteger {

  public static int romanToInt(String s) {
    int res = 0;
    int i;
    int length = s.length();
    char[] sArr = s.toCharArray();

    for (i = 0; i < length; ++i) {
      switch (sArr[i]) {
        case 'I': {
          res += 1;
          break;
        }
        case 'V': {
          if (i > 0 && sArr[i - 1] == 'I') {
            res += 3;
          } else {
            res += 5;
          }
          break;
        }
        case 'X': {
          if (i > 0 && sArr[i - 1] == 'I') {
            res += 8;
          } else {
            res += 10;
          }
          break;
        }
        case 'L': {
          if (i > 0 && sArr[i - 1] == 'X') {
            res += 30;
          } else {
            res += 50;
          }
          break;
        }
        case 'C': {
          if (i > 0 && sArr[i - 1] == 'X') {
            res += 80;
          } else {
            res += 100;
          }
          break;
        }
        case 'D': {
          if (i > 0 && sArr[i - 1] == 'C') {
            res += 300;
          } else {
            res += 500;
          }
          break;
        }
        case 'M': {
          if (i > 0 && sArr[i - 1] == 'C') {
            res += 800;
          } else {
            res += 1000;
          }
          break;
        }
      }
    }

    return res;
  }
}
