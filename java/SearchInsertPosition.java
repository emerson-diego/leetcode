public class SearchInsertPosition {

    public static void main(String args[]) {
        int[] array = {1,3,5,6};
        System.out.println(new SearchInsertPosition().searchInsert(array, 0));

    }

    public int searchInsert(int[] nums, int target) {

        int result = -1;
        for(int i=0; i< nums.length; i++){
            if(target > nums[i]){
                result = i;
            }
            else if(target< nums[i]){
                break;
            }
        }
        result++;
        return result;
        
    }
    
}
