import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P88_MergeSortedArrayTest {
    
    @Test
    public void testMergeExample1() {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        int[] expected = { 1, 2, 2, 3, 5, 6 };
        
        new P88_MergeSortedArray().merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }
    
    @Test
    public void testMergeExample2() {
        int[] nums1 = { 1 };
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = { 1 };
        
        new P88_MergeSortedArray().merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }
    
    @Test
    public void testMergeExample3() {
        int[] nums1 = { 0 };
        int m = 0;
        int[] nums2 = { 1 };
        int n = 1;
        int[] expected = { 1 };
        
        new P88_MergeSortedArray().merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }
    
    @Test
    public void testMergeArrays() {
        // Dados de entrada
        int[] nums1 = { -1, 0, 0, 3, 3, 3, 0, 0, 0 };
        int m = 6;
        int[] nums2 = { 1, 2, 2 };
        int n = 3;
        
        // Chamada do método que deve ser testado
        new P88_MergeSortedArray().merge(nums1, m, nums2, n);
        
        // Resultado esperado
        int[] expected = { -1, 0, 0, 1, 2, 2, 3, 3, 3 };
        
        // Verificação
        assertArrayEquals(expected, nums1);
    }
    
}
