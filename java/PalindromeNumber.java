class PalindromeNumber {

    public static void main(String args[]) {
        int x = -101;
        System.out.println(new PalindromeNumber().isPalindrome(x));

    }

    public boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i))
                return false;
        }

        return true;

    }
}