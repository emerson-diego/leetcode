public class P1920_Build_Array_from_Permutation {

    public static void main(String args[]) {
        var principal = new P1920_Build_Array_from_Permutation();

        var n = new int[] { 0, 2, 1, 5, 3, 4 };

        var ans = principal.buildArray(n);

        System.out.println("");

        for (int number : ans)
            System.out.println(number);
    }

    public int[] buildArray(int[] nums) {

        var finalArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            finalArray[i] = nums[nums[i]];
        }

        return finalArray;

    }

}
