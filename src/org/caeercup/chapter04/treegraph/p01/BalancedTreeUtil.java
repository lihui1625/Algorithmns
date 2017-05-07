package org.caeercup.chapter04.treegraph.p01;

import java.util.HashMap;
import java.util.Map;

import org.caeercup.chapter04.treegraph.TreeNode;

public class BalancedTreeUtil {

  public static boolean isBalanced(TreeNode root) {
    Map<TreeNode, Integer> nodeHeight = new HashMap<>();
    return isBalanced(root, nodeHeight);
  }

  private static boolean isBalanced(TreeNode root,
      Map<TreeNode, Integer> nodeHeight) {
    if (root == null) {
      return true;
    }
    int leftLen = getTreeHeight(root.getLeft(), nodeHeight);
    int rightLen = getTreeHeight(root.getRight(), nodeHeight);
    if (Math.abs(leftLen - rightLen) > 1) {
      return false;
    }
    return isBalanced(root.getLeft(), nodeHeight) && isBalanced(root.getRight(), nodeHeight);
  }

  private static int getTreeHeight(TreeNode root,
      Map<TreeNode, Integer> nodeHeight) {
    if (root == null) {
      return 0;
    }
    if (nodeHeight.containsKey(root)) {
      return nodeHeight.get(root);
    }
    int leftLen = getTreeHeight(root.getLeft(), nodeHeight);
    int rightLen = getTreeHeight(root.getRight(), nodeHeight);
    int len = Math.max(leftLen, rightLen) + 1;
    nodeHeight.put(root, len);
    return len;
  }

  public static void main(String[] args) {

  }

}
