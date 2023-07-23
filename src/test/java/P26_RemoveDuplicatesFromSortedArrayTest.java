import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P26_RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void testRemoveDuplicates() {
        P26_RemoveDuplicatesFromSortedArray solution = new P26_RemoveDuplicatesFromSortedArray();

        int[] nums1 = { 1, 1, 2 };
        assertEquals(2, solution.removeDuplicates(nums1));
        assertArrayEquals(new int[] { 1, 2, 2 }, nums1);

    }

}
