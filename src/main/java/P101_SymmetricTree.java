public class P101_SymmetricTree {

    public static void main(String args[]) {
        TreeNodeT t3 = new TreeNodeT(3);
        TreeNodeT t4 = new TreeNodeT(4);
        TreeNodeT t2_L = new TreeNodeT(2, t3, t4);
        TreeNodeT t2_R = new TreeNodeT(2, t4, t3);
        TreeNodeT t = new TreeNodeT(1, t2_L, t2_R);

        System.out.println(new P101_SymmetricTree().isSymmetric(t));

    }

    public boolean isSymmetric(TreeNodeT root) {

        return isMirror(root, root);

    }

    public boolean isMirror(TreeNodeT t1, TreeNodeT t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;

        return (t1.val == t2.val) && isMirror(t1.left, t2.right);

    }

}

class TreeNodeT {
    int val;
    TreeNodeT left;
    TreeNodeT right;

    TreeNodeT() {
    }

    TreeNodeT(int val) {
        this.val = val;
    }

    TreeNodeT(int val, TreeNodeT left, TreeNodeT right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}