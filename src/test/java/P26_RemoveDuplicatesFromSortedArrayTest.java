import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P26_RemoveDuplicatesFromSortedArrayTest {
    
    @Test
    public void testRemoveDuplicates() {
        P26_RemoveDuplicatesFromSortedArray solution = new P26_RemoveDuplicatesFromSortedArray();
        
        int[] nums1 = { 1, 1, 2 };
        assertEquals(2, solution.removeDuplicates(nums1));
        assertArrayEquals(new int[] { 1, 2, 2 }, nums1);
        
    }
    
}
