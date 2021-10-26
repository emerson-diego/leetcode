class ClimbingStairs {

    public static void main(String args[]) {
        int n = 4;

        System.out.println(calculate(n));

    }

    public static int calculate(int n) {

        /*
         * if (n <= 1) return n; else if (n == 2) { return 2; } else { return
         * calculate(n - 1) + calculate(n - 2); }
         */

        if (n <= 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return n;
        }

        int[] s = new int[n + 1];

        s[0] = 0;
        s[1] = 1;
        s[2] = 2;

        for (int i = 3; i <= n; i++) {
            s[i] = s[i - 1] + s[i - 2];
        }
        return s[n];

    }
}