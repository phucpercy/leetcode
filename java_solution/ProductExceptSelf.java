package java_solution;

public class ProductExceptSelf {

  public int[] productExceptSelf(int[] nums) {
    int[] pre = new int[nums.length];
    pre[0] = nums[0];
    int[] post = new int[nums.length];
    post[nums.length - 1] = nums[nums.length - 1];
    pre[0] = nums[0];

    for (int i = 1; i < nums.length; ++i) {
      pre[i] = pre[i - 1] * nums[i];
    }
    for (int i = nums.length - 2; i >= 0; --i) {
      post[i] = post[i + 1] * nums[i];
    }
    for (int i = 0; i < nums.length; ++i) {
      if (i == 0) {
        nums[i] = post[i + 1];
      } else if (i == nums.length - 1) {
        nums[i] = pre[i - 1];
      } else {
        nums[i] = pre[i - 1] * post[i + 1];
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    ProductExceptSelf productExceptSelf = new ProductExceptSelf();

    System.out.println(productExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}));


  }
}
