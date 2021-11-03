public class BalancerdBinaryTree {

    public static void main(String args[]) {
        TreeNode a = new TreeNode(9);
        TreeNode b = new TreeNode(15);
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(20, b, c);
        TreeNode e = new TreeNode(3, a, d);

        System.out.println(new BalancerdBinaryTree().isBalanced(e));

    }

    public boolean isBalanced(TreeNode root) {

        if (root == null)
            return true;

        if (Math.abs(height(root.left) - height(root.right)) > 1)
            return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);

    }

    private int height(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;

    }

}

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
