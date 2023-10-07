public class P2873_MaximumValueOfAnOrderedTripletI {
    
    public static void main(String args[]) {
        int[] nums = { 1000000, 1, 1000000 };
        
        var principal = new P2873_MaximumValueOfAnOrderedTripletI();
        
        var result = principal.maximumTripletValue(nums);
        System.out.println(result);
        
    }
    
    public long maximumTripletValue(int[] nums) {
        
        long maxValue = 0;
        long result = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    
                    result = ((long) nums[i] - (long) nums[j]) * (long) nums[k];
                    
                    if (result > maxValue)
                        maxValue = result;
                }
                
            }
        }
        
        return maxValue;
        
    }
    
}
