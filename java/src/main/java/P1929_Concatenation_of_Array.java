public class P1929_Concatenation_of_Array {

    public static void main(String args[]) {
        var principal = new P1929_Concatenation_of_Array();

        var n = new int[] { 1,2,1};

        var ans = principal.getConcatenation(n);

        for(int number : ans)
            System.out.println(number);
    }

    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];


        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];       // First half
            ans[i + n] = nums[i];   // Second half
        }

        return ans;

    }

}
