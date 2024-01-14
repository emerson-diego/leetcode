import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class P94_BinaryTreeInorderTraversalTest {
    
    @Test
    public void testInorderTraversal() {
        TreeNodeP94 root1 = new TreeNodeP94(1);
        root1.right = new TreeNodeP94(2);
        root1.right.left = new TreeNodeP94(3);
        
        P94_BinaryTreeInorderTraversal traversal = new P94_BinaryTreeInorderTraversal();
        List<Integer> result1 = traversal.inorderTraversal(root1);
        
        // Verifique se a travessia inorder é correta para o primeiro exemplo
        assertIterableEquals(List.of(1, 3, 2), result1);
        
        TreeNodeP94 root2 = null;
        List<Integer> result2 = traversal.inorderTraversal(root2);
        
        // Verifique se a travessia inorder é correta para o segundo exemplo (árvore vazia)
        assertTrue(result2.isEmpty());
        
        TreeNodeP94 root3 = new TreeNodeP94(1);
        List<Integer> result3 = traversal.inorderTraversal(root3);
        
        // Verifique se a travessia inorder é correta para o terceiro exemplo (apenas um nó)
        assertIterableEquals(List.of(1), result3);
    }
}
