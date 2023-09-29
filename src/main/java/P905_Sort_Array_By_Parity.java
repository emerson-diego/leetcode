public class P905_Sort_Array_By_Parity {


    public static void main(String args[]) {
        var principal = new P905_Sort_Array_By_Parity();

        var array = new int[]{3, 1, 2, 4};

        var arrayResult = principal.sortArrayByParity(array);
        
        System.out.println(arrayResult);
    }


    public int[] sortArrayByParity(int[] nums) {

        int[] result = new int[nums.length];
        int evenIndex = 0, oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }

        return result;
    }
}
