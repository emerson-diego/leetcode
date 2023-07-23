import java.util.HashSet;
import java.util.Set;

public class P26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] nums = { 1, 1, 2 }; // Input array
        int[] expectedNums = { 1, 2, 0 }; // The expected answer

        int k = new P26_RemoveDuplicatesFromSortedArray().removeDuplicates(nums); // Calls your implementation

    }

    public int removeDuplicates(int[] nums) {

        Set<Integer> uniques = new HashSet<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!uniques.contains(nums[i])) {
                uniques.add(nums[i]);
                nums[count] = nums[i];
                count++;
            }
        }

        return count;

    }

}
