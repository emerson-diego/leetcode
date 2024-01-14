import java.util.ArrayList;
import java.util.List;

public class P94_BinaryTreeInorderTraversal {
    
    public List<Integer> inorderTraversal(TreeNodeP94 root) {
        
        List<Integer> listResult = new ArrayList<>();
        
        listResult = inorderTraversalRecursive(root, listResult);
        
        return listResult;
    }
    
    public List<Integer> inorderTraversalRecursive(TreeNodeP94 root, List<Integer> list) {
        
        if (root == null)
            return list;
        
        if (root.left != null)
            inorderTraversalRecursive(root.left, list); //3
        
        list.add(root.val); //1
        
        if (root.right != null)
            inorderTraversalRecursive(root.right, list); //2
        
        return list;
    }
    
}

class TreeNodeP94 {
    int val;
    TreeNodeP94 left;
    TreeNodeP94 right;
    
    TreeNodeP94() {
    }
    
    TreeNodeP94(int val) {
        this.val = val;
    }
    
    TreeNodeP94(int val, TreeNodeP94 left, TreeNodeP94 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
}
