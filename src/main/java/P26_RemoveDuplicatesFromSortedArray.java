import java.util.HashSet;
import java.util.Set;

public class P26_RemoveDuplicatesFromSortedArray {

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
