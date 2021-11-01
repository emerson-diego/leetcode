public class PlusOne {

    public static void main(String args[]) {
        int digits[] = { 1, 2, 9 };

        int digits2[] = new PlusOne().plusOne(digits);

        for (int digit : digits2) {
            System.out.println(digit);
        }

    }

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;

    }

}
