public class P344_ReverseString {

    public static void main(String args[]) {

        char[] s = { 'h', 'e', 'l', 'l', 'o' };

        new P344_ReverseString().reverseString(s);

    }

    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;
        char[] w = reverse(s, start, end);
        System.out.println(w);

    }

    static char[] reverse(char[] s, int start, int end) {
        if (start >= end)
            return s;
        else {
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            return reverse(s, start + 1, end - 1);
        }
    }

}
