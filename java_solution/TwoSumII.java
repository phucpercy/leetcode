package java_solution;

public class TwoSumII {

  public static int[] twoSum(int[] numbers, int target) {
    int[] res = new int[2];
    int i = 0;
    int j = numbers.length - 1;
    while (i < j) {
      if (numbers[i] + numbers[j] < target) {
        ++i;
      } else if (numbers[i] + numbers[j] > target) {
        ++j;
      } else {
        res[0] = i+1;
        res[1] = j+1;
        return res;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    var res = TwoSumII.twoSum(new int[]{-1,-1,1,1,1,1,}, -2);

    System.out.println(res[0]);
    System.out.println(res[1]);
  }
}
