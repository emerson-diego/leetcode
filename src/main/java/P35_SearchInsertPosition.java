public class P35_SearchInsertPosition {

    public static void main(String args[]) {
        int nums[] = { 1, 3, 5, 6 };

        System.out.println(new P35_SearchInsertPosition().searchInsert(nums, 2));

    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;

            } else if (nums[mid] < target) {
                left = mid + 1;

            }
        }

        return left;

    }

}
