class Solution {

    public static void main(String args[]){
        int[] nums = {3,2,3};
        int target = 6;
        for(int i: new Solution().twoSum(nums, target))
            System.out.println(i);

    }

    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length -1; i++){
           
            for(int j=i+1; j<nums.length; j++){

                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};

                }

            }
           
        }
        throw new IllegalArgumentException("No two sum solution");

        
    }
}