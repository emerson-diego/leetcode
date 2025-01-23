import java.util.HashMap;
import java.util.Map;

public class P1512_Number_Good_Pairs {

    public static void main(String args[]) {

        int[] nums = { 1, 2, 3, 1, 1, 3 };
        P1512_Number_Good_Pairs instance = new P1512_Number_Good_Pairs();
        int result = instance.numIdenticalPairs(nums);

        System.out.println(result);
    }

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums) {
            if (frequencyMap.containsKey(num)) {
                int count = frequencyMap.get(num);
                goodPairs += count; 
                frequencyMap.put(num, count + 1);
            } else {
                frequencyMap.put(num, 1); 
            }
        }

        return goodPairs;
    }
}