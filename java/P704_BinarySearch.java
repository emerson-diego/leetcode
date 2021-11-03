public class P704_BinarySearch {

    public static void main(String args[]) {
        int nums[] = { -1, 0, 3, 5, 9, 12 };

        System.out.println(new P704_BinarySearch().search(nums, 9));

    }

    public int search(int[] nums, int target) {
        if (nums.length == 0)
            return -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int midPoint = left + (right - left) / 2;
            if (nums[midPoint] == target)
                return midPoint;
            else if (nums[midPoint] > target)
                right = midPoint - 1;
            else
                left = left + 1;

        }

        return -1;

    }

}
