import java.util.Arrays;

public class RemoveElement {

    public static void main(String args[]) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        System.out.println(new RemoveElement().removeElement(nums, val));

    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        int indice = 0;

        for (int num : nums) {
            if (num == val) {
                count++;
                nums[indice] = Integer.MAX_VALUE;
            }
            indice++;

        }
        Arrays.sort(nums);

        return nums.length - count;

    }
}
