import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P104_MaximumDepthOfBinaryTreeTest {
    
    @Test
    public void testMaxDepthExample() {
        P104_MaximunDepthOfBinaryTree principal = new P104_MaximunDepthOfBinaryTree();
        
        // Test for tree with multiple nodes
        Integer[] values = { 3, 9, 20, null, null, 15, 7 };
        TreeNode root = principal.buildTree(values);
        assertEquals(3, principal.maxDepth(root), "Maximum depth of the given tree should be 3");
    }
    
    @Test
    public void testMaxDepthForEmptyTree() {
        P104_MaximunDepthOfBinaryTree principal = new P104_MaximunDepthOfBinaryTree();
        assertEquals(0, principal.maxDepth(null), "Maximum depth of an empty tree should be 0");
    }
    
    @Test
    public void testMaxDepthForSingleTreeNode() {
        P104_MaximunDepthOfBinaryTree principal = new P104_MaximunDepthOfBinaryTree();
        assertEquals(1, principal.maxDepth(new TreeNode(1)), "Maximum depth of a tree with a single node should be 1");
    }
    
}
