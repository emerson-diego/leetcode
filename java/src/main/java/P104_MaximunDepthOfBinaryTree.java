import java.util.LinkedList;
import java.util.Queue;

public class P104_MaximunDepthOfBinaryTree {
    
    public static void main(String args[]) {
        
        var principal = new P104_MaximunDepthOfBinaryTree();
        
        Integer[] values = { 3, 9, 20, null, null, 15, 7 };
        TreeNode root = principal.buildTree(values);
        System.out.println(principal.maxDepth(root));
        
    }
    
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        
    }
    
    public TreeNode buildTree(Integer[] values) {
        if (isEmpty(values))
            return null;
        
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> nodesToProcess = new LinkedList<>();
        nodesToProcess.offer(root);
        
        populateTreeNodes(values, nodesToProcess);
        
        return root;
    }
    
    private boolean isEmpty(Integer[] values) {
        return values == null || values.length == 0;
    }
    
    private void populateTreeNodes(Integer[] values, Queue<TreeNode> nodesToProcess) {
        for (int i = 1; i < values.length; i++) {
            TreeNode currentNode = nodesToProcess.poll();
            
            i = addLeftChild(values, i, currentNode, nodesToProcess);
            i = addRightChild(values, i, currentNode, nodesToProcess);
        }
    }
    
    private int addLeftChild(Integer[] values, int index, TreeNode parent, Queue<TreeNode> nodesToProcess) {
        if (values[index] != null) {
            parent.left = new TreeNode(values[index]);
            nodesToProcess.offer(parent.left);
        }
        return index;
    }
    
    private int addRightChild(Integer[] values, int index, TreeNode parent, Queue<TreeNode> nodesToProcess) {
        if (++index < values.length && values[index] != null) {
            parent.right = new TreeNode(values[index]);
            nodesToProcess.offer(parent.right);
        }
        return index;
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
