import java.util.HashMap;
import java.util.Map;

public class P3259_Two_Sneaky_Numbers {

    public static void main(String args[]) {
        var instance = new P3259_Two_Sneaky_Numbers();
        int[] nums = { 0, 1, 1, 0 };

        for (int i : instance.getSneakyNumbers(nums)) {
            System.out.println(i);
        }

    }

    public int[] getSneakyNumbers(int[] nums) {

        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }

        int[] result = map.entrySet().stream().filter(entry -> entry.getValue() == 2).mapToInt(Map.Entry::getKey)
                .toArray();
        return result;
    }

}
