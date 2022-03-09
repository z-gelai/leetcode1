import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

    }

    public class TreeNode {
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
    public static TreeNode prev;
    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (prev != null && prev.val>=root.val) {
            return false;
        }
        prev=root;
        if (!isValidBST(root.right)) {
            return false;
        }
        return true;
    }



//     if (root==null) {
//        return true;
//    }
//        if (root.left!=null && root.val<=root.left.val || root.right!=null && root.val>=root.right.val) {
//        return false;
//    }
//
//        return isValidBST(root.left) && isValidBST(root.right);

}
