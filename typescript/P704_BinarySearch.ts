export class P704_BinarySearch {


    search(nums: number[], target: number) : number {
        if (nums.length == 0)
            return -1;

        let left = 0;
        let right = nums.length - 1;

        while (left <= right) {
            let midPoint = left + (right - left) / 2;
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
