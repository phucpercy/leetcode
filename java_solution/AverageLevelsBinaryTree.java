package java_solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

public class AverageLevelsBinaryTree {

  public List<Double> averageOfLevels(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    List<Double> result = new ArrayList<>();

    queue.add(root);

    while(!queue.isEmpty()) {
      int size = queue.size();
      int sum = 0;

      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        sum += node.val;

        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      result.add((double)sum / (double)size);
    }

    return result;
  }

}
